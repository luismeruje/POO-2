package javafactura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class JavaFactura implements Serializable
{
    
    private Map<Integer,Contribuinte> contribuintes;
    private Map<Integer,Factura> facturas;
    private Admin admin;
    private Map<Integer,Float> coefs;
    private Contribuinte contribuinteAt = null;
    private Map<String, Float> concelhosInterior;
    
    public JavaFactura() {
        this.admin = new Admin("admin");
        this.contribuintes = new HashMap<>();
        this.facturas = new HashMap<>();
        this.coefs = new HashMap<>();
        this.concelhosInterior = new HashMap<>();
        this.inicializaCoefs();
        this.inicializaConcelhos();
    }
    
    public JavaFactura(JavaFactura jf){
        this.admin = jf.getAdmin();
        this.contribuintes = jf.getContribuintes();
        this.facturas = jf.getFacturas();
        this.coefs= jf.getCoefs();
    }
    
    public void inicializaCoefs() {
        this.coefs.put(1, (float) 0.15);
        this.coefs.put(2, (float) 0.3);
        this.coefs.put(3, (float) 0.15);
        this.coefs.put(4, (float) 0.15);
        this.coefs.put(5, (float) 0.35);
    }
    
    public void inicializaConcelhos() {
        this.concelhosInterior.put("Évora", (float) 0.1);
        this.concelhosInterior.put("Lousã", (float) 0.12);
        this.concelhosInterior.put("Aljezur", (float) 0.11);
        this.concelhosInterior.put("Ourém", (float) 0.15);
        this.concelhosInterior.put("Vinhais", (float) 0.14);
        this.concelhosInterior.put("Vila Real", (float) 0.13);
        this.concelhosInterior.put("Miranda do Douro", (float) 0.17);
    }
    
    public Admin getAdmin() { return this.admin; }
    public Map<Integer,Float> getCoefs() { return this.coefs; }
    public Map<Integer,Contribuinte> getContribuintes() { return this.contribuintes; }
    public Map<Integer,Factura> getFacturas() { return this.facturas; }
    
    public Float getCoef(int atividade){
        float coef;
        if (!coefs.containsKey(atividade)) coef = 0;
        else coef = coefs.get(atividade);
        return coef;
    }
    
    public void setAdmin(Admin adm) { this.admin = adm; }
    public void setContribuintes(Map<Integer,Contribuinte> contribuinte){ this.contribuintes = contribuinte; }
    public void setFactura(Map<Integer, Factura> factura) { this.facturas = factura; }
    
    public void addCoef(int atividade, float coef){
        this.coefs.put(atividade, coef);
    }
   
    public Contribuinte login(int nifC,String password) {
        boolean encontrado = false;
        Contribuinte logado = null, c;
        
        if (this.contribuintes.containsKey(nifC)) {
            c = this.contribuintes.get(nifC);
            if(c.getPassword().equals(password))
                logado = c;
        }
            
        return logado;
    }
    
    public Admin loginAdmin(String Password){
        Admin adminlog = null;
        
        if (this.admin.getPassword().equals(Password))
            adminlog=this.admin;
        
        return adminlog;
    }

    public List<Factura> getFacturasWithNIF(int NIF) {
       List<Factura> facc = new ArrayList<>();
       List<Integer> faccids = this.contribuintes.get(NIF).getFacturas();
       Factura f;
       
       for(int i: faccids){
           f = this.facturas.get(i);
           facc.add(f);
       }
       
       return facc;
    }
    
    public Map<Integer,Float> getDespesasPorAtividade(int NIF){
        List<Factura> facc = getFacturasWithNIF(NIF);
        Map<Integer,Float> despesasAtiv = new HashMap<>();
        List<Integer> faccids = this.contribuintes.get(NIF).getFacturas();
        Factura f;
        int atividade;
        float valor, valorAntigo;
        
        for(int i : faccids){
           f = this.facturas.get(i);
           atividade = f.getAtividade();
           valor = f.getValor();
           if(despesasAtiv.containsKey(atividade))
               valorAntigo=despesasAtiv.get(atividade);
           else
               valorAntigo=0;
           despesasAtiv.put(atividade,valor + valorAntigo);
        }
        
        return despesasAtiv;
    }
         
    
    //Facturas para Validar Movimento
    public List<Factura> getFacturasPorConfirmar(int NIF){
       List<Factura> facc = new ArrayList<Factura>();
       List<Integer> faccids = this.contribuintes.get(NIF).getFacturas();
       Factura f;
       for(int i: faccids){
           f = this.facturas.get(i);
           if (!f.getConfirmado())
              facc.add(f);
       }
       return facc;
    }
    
    public List<Factura> getFacturasConfirmadas(int NIF){
        List<Factura> facc = new ArrayList<>();
        List<Integer> faccids = this.contribuintes.get(NIF).getFacturas();
        Factura f;
       
        for(int i : faccids) {
            f = this.facturas.get(i);
            if (f.getConfirmado())
                facc.add(f);
        }
        
        return facc;
    }
    
    public boolean associarFacturaAtividade(int idFactura, int atividade){
        boolean flag = false;
        Factura f = this.facturas.get(idFactura);
        int nifE = f.getNifEmitente();
        Registo registo;
        
        ContribuinteColetivo cc = (ContribuinteColetivo) this.contribuintes.get(nifE);
        List<Integer> atividades = cc.getAtividades();
        
        if (atividades.contains(atividade)) {
            flag = true;
            int atividadeAntiga = f.getAtividade();
            f.setAtividade(atividade);
            f.setConfirmado(true);
            f.setValorDeduzido(getValorDeduzido(nifE, atividade, f.getValor(), cc.getFactorEmpresarial(), f.getNifCliente()));
            f.addRegisto(new Registo("Atividade Económica alterada", atividadeAntiga, atividade));
        }
        
        return flag;
    }
    
    public ContribuinteColetivo emitirFactura(ContribuinteColetivo emp, int NIF, int year, int month, int day, int hour, int minute, String descricaoDesp, float valorDesp){
        
        if (this.contribuintes.containsKey(NIF) && (this.contribuintes.get(NIF) instanceof ContribuinteIndividual)) { 
            int id = this.facturas.size();
            int nifEmitente = emp.getNif();
            float coefEmp = emp.getFactorEmpresarial();
            String designacao = emp.getNome(); 
            LocalDateTime dataDespesa = LocalDateTime.of(year, month, day, hour, minute);
            int nifCliente = NIF;
            String descricao = descricaoDesp;
            int atividade;
            float valorDeduzido;
            float valor = valorDesp;
            boolean confirmado = false;
            List<Integer> atividadesemp = emp.getAtividades();
                
            if (atividadesemp.size() == 1) {
                atividade = atividadesemp.get(0);
                valorDeduzido = getValorDeduzido(nifEmitente, atividade, valor, coefEmp, nifCliente);
            }
            else {
                atividade = -1;
                valorDeduzido = 0;
            }
            
            Factura f = new Factura(id,nifEmitente,designacao,dataDespesa,nifCliente, descricao, atividade, valor, confirmado, valorDeduzido);
            f.addRegisto(new Registo("A fatura foi criada.", -1, -1));

            ContribuinteColetivo newEmp = (ContribuinteColetivo) this.contribuintes.get(nifEmitente);
            this.facturas.put(id, f);
            List<Integer> facturasci = this.contribuintes.get(nifCliente).getFacturas();
            List<Integer> facturascc = this.contribuintes.get(nifEmitente).getFacturas();
            facturasci.add(f.getId());
            facturascc.add(f.getId());
            return newEmp.clone(); 
        }
        
        else return null;
    }
    
    public float getValorDeduzidoAnual(int nifC, int ano) {
        
        float valorTotal = 0;
        
        if (this.contribuintes.containsKey(nifC)) {
            List<Factura> facc = this.getFacturasWithNIF(nifC);
            for (Factura f: facc)
                if (f.getDataDespesa().getYear() == ano) 
                    valorTotal += f.getValorDeduzido(); 
        }
        
        return valorTotal;
    }
    
    public float getValorGastoAnual(int nifC, int ano) {
        
        float valorTotal = 0;
        
        if (this.contribuintes.containsKey(nifC)) {
            
            List<Factura> facc = this.getFacturasWithNIF(nifC);
            for (Factura f: facc)
                if (f.getDataDespesa().getYear() == ano) valorTotal += f.getValor(); 
        }
        return valorTotal;
    }
    
    public float getValorDeduzido(int nifEmitente, int atividade, float valor, float coefEmp, int nifCliente) {
        float valorDeduzido = 0;
        ContribuinteIndividual ci = (ContribuinteIndividual) this.contribuintes.get(nifCliente);
        ContribuinteColetivo cc = (ContribuinteColetivo) this.contribuintes.get(nifEmitente);
        float coefFiscal = ci.getCoefFiscal();
        int nrFilhos = ci.getNrFilhos();
        float bonusConcelho = 0;
        
        if (this.concelhosInterior.containsKey(cc.getConcelho()))
            bonusConcelho = this.concelhosInterior.get(cc.getConcelho());
        if (nrFilhos <= 4)
            nrFilhos = 0;
        
        float reducao = 1 + reducaoImposto(nrFilhos, bonusConcelho);
        if (this.coefs.containsKey(atividade)) {
            valorDeduzido= valor* coefEmp * coefFiscal * this.coefs.get(atividade) * reducao;
        }
        
        return valorDeduzido;
    }
    
    public float reducaoImposto(int nrFilhos, float bonusConcelho){
        return (float) (nrFilhos * 0.05 + bonusConcelho);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contribuintes:\n");
        
        for (Contribuinte cont: this.contribuintes.values()){
            sb.append(cont.toString());
            sb.append("\n");
        }
        
        sb.append("Admin :\n"); sb.append(admin.toString());
        sb.append("Facturas:\n");
        
        for (Factura fac: this.facturas.values()){
            sb.append(fac.toString());
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        
        JavaFactura jf = (JavaFactura) o;
        return (this.admin.equals(jf.getAdmin()) && this.contribuintes.equals(jf.getContribuintes())
                && this.facturas.equals(jf.getFacturas())
                );
    }
     
    @Override
    public JavaFactura clone(){
        return new JavaFactura(this);
    }
     
     
    public boolean registaContribuinteIndividual(int nif, String email, String nome, String morada, String password,List<Integer> nifAgregado,float coefFiscal, List<Integer> atividades, int nrfilhos){
        boolean notRegistado = false;
        ContribuinteIndividual ind;
        
        if (notRegistado = !this.contribuintes.containsKey(nif)) {
            ind = new ContribuinteIndividual(coefFiscal, nif, email, nome,morada, password, nrfilhos);

            List <Integer> agregado = ind.getAgregadoFamiliar();
            List <Integer> atividade = ind.getAtividades();
            
            for (Integer i : nifAgregado)
                agregado.add(i);
            
            for (Integer i : atividades)
                atividade.add(i);
            
            this.contribuintes.put(nif, ind);
        }
        
        return notRegistado;
    }
     
    public boolean registaContribuinteColetivo(int nif, String email, String nome, String morada, String password, float factorEmpresarial, List<Integer> atividades, String concelho){
        boolean notRegistado=false;
        ContribuinteColetivo emp;
         
        if (notRegistado = !this.contribuintes.containsKey(nif)){
            emp = new ContribuinteColetivo(factorEmpresarial, nif, email, nome, morada, password, concelho);
            List <Integer> atividade = emp.getAtividades();
            
            for (Integer i : atividades)
                atividade.add(i);
            
            this.contribuintes.put(nif, emp);
         }
         
         return notRegistado;
     }
     
    public float getDeduzidoAgregado(ContribuinteIndividual ind, int ano) {
        int nif = ind.getNif();
        List<Integer> agregado = ind.getAgregadoFamiliar();
        float deduzido = this.getValorDeduzidoAnual(nif,ano);
        
        for (Integer i : agregado)
             deduzido += getValorDeduzidoAnual(i,ano);
        
        return deduzido;
    }
     
    public List<Factura> getFacturasEmpresaOrdenadaPorData(int NIF) {
        List<Factura> facturas = getFacturasWithNIF(NIF);
        Collections.sort(facturas, new ComparatorFacturasData());
        
        return facturas;
    }
     
    public List<Factura> getFacturasEmpresaOrdenadaPorDespesa(int NIF, boolean ascendente) {
        List<Factura> facturas = getFacturasWithNIF(NIF);
        Collections.sort(facturas,new ComparatorFacturasValor());

        if (!ascendente)
            Collections.reverse(facturas);
         
        return facturas;
    }
     
    public List<Factura> getFacturasEmpresaEntreDatas(int NIF, LocalDateTime dataMenor, LocalDateTime dataMaior) {
        List<Factura> facc = new ArrayList<>();
        Contribuinte emp = this.contribuintes.get(NIF);       
        List<Integer> faccids = this.contribuintes.get(NIF).getFacturas();
        Factura f;
       
        for(int i : faccids) {
           f = this.facturas.get(i);
           if ((f.getDataDespesa().isAfter(dataMenor)) && (f.getDataDespesa().isBefore(dataMaior)))
              facc.add(f);
        }
        
        return facc;
    }
     
    public float getFacturadoEntreDatas(int NIF, LocalDateTime dataMenor, LocalDateTime dataMaior){
        float faturado = 0;
        List<Factura> facc = getFacturasEmpresaEntreDatas(NIF, dataMenor,dataMaior);
        
        for (Factura f : facc)
             faturado += f.getValor();
        
        return faturado;
     }
     
    public float getDeduzidoEntreDatas(int NIF, LocalDateTime dataMenor, LocalDateTime dataMaior) {
        float faturado = 0;
        List<Factura> facc = getFacturasEmpresaEntreDatas(NIF, dataMenor,dataMaior);
        
        for (Factura f : facc)
             faturado += f.getValor();
         
        return faturado;
    }
      
    public Map<Contribuinte,Float> getTop10Contribuintes() {
        Map<Contribuinte,Float> topContribuintes = new HashMap<>();
        float contribuicao = 0;
        int ano;
        
        for (Contribuinte c: this.contribuintes.values())
            if (c instanceof ContribuinteIndividual) {
                ano = LocalDateTime.now().getYear();
                contribuicao = this.getValorGastoAnual(c.getNif(),ano);
                topContribuintes.put(c.clone(), contribuicao);
            }
       
        LinkedHashMap<Contribuinte,Float> topContribuintesOrdenado = topContribuintes.entrySet().stream()
                                                             .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                                                             .limit(10)
                                                             .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
         
        return topContribuintesOrdenado;
    }
    
    public List<Contribuinte> getTopXEmpresasComMaisFacturas(int x) {
        Map<Contribuinte,Integer> topEmpresas = new HashMap<>();
        int facturasCount = 0;
        List<Factura> facturas;
          
        for (Contribuinte c : this.contribuintes.values())
            if (c instanceof ContribuinteColetivo) {
                facturasCount = c.getFacturas().size();
                topEmpresas.put(c.clone(), facturasCount);
            }
          
        LinkedHashMap<Contribuinte,Integer> topContribuintesOrdenado = topEmpresas.entrySet().stream()
                                                             .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                                                             .limit(x)
                                                             .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
          
        return topContribuintesOrdenado.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
    }
       
    public Map<Contribuinte,Float> getTopXEmpresasFaturadoras(int x) {
        List<Contribuinte> topxEmpresas = this.getTopXEmpresasComMaisFacturas(x); 
        int ano;
        Map<Contribuinte,Float> topEmpresas = new LinkedHashMap<>();
        
        for(Contribuinte c : topxEmpresas) {
            ano = LocalDateTime.now().getYear();
            float deducoes= this.getValorDeduzidoAnual(c.getNif(),ano);
            topEmpresas.put(c, deducoes);
        }
        
        return topEmpresas;
    }
      
    public void guardaEstado(String filename) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.flush();
        oos.close();
    }
      
    public static JavaFactura carregaEstado(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        JavaFactura jf = (JavaFactura) ois.readObject();
        ois.close();
        return jf;
    }
}