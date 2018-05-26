package javafactura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
/**
 * Write a description of class JavaFactura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class JavaFactura implements Serializable
{
    private Map<Integer,Contribuinte> contribuintes;
    private Map<Integer,Factura> facturas;
    private Admin admin;
    private Map<Integer,Float> coefs;
    private Contribuinte contribuinteAt = null;
    

    public JavaFactura()
    {
    this.admin = null;
    this.contribuintes = new HashMap<Integer,Contribuinte>();
    this.facturas = new HashMap<Integer,Factura>();
    this.coefs = new HashMap<Integer,Float>();
    }
    
    public JavaFactura(JavaFactura jf){
        this.admin = jf.getAdmin();
        this.contribuintes = jf.getContribuintes();
        this.facturas = jf.getFacturas();
        this.coefs= jf.getCoefs();
    }
    
    public Admin getAdmin(){
        return this.admin;
    }
    
    public void setAdmin(Admin adm){
        this.admin = adm;
    }
    
    
    public Map<Integer,Contribuinte> getContribuintes()  {
        return this.contribuintes;
    }
    
    public void setContribuintes(Map<Integer,Contribuinte> contribuinte){
        this.contribuintes = contribuinte;
    }
    
    public Map<Integer,Factura> getFacturas()  {
        return this.facturas;
    }
    
    public void setFactura(Map<Integer,Factura> factura){
        this.facturas = factura;
    }
    public Map<Integer,Float> getCoefs() {
        return this.coefs;
    }
    
    public void addCoef(int atividade, float coef){
        this.coefs.put(atividade, coef);
    }
    
    public Float getCoef(int atividade){
        float coef;
        if (!coefs.containsKey(atividade)) coef=0;
        else coef= coefs.get(atividade);
        return coef;
    }
    
    //Devolve se conta foi encontrada ou nao
    public Contribuinte login(int nifC,String Password){
        boolean encontrado=false;
        Contribuinte logado = null;
        Contribuinte c;
        if (this.contribuintes.containsKey(nifC)){
            c= this.contribuintes.get(nifC);
            if(c.getPassword().equals(Password)){
                logado=c;
            }
        }
            
        return logado;
    }

    
    //Procura todas as faturas com o NIF do Contribuinte
    public List<Factura> getFacturasWithNIF(int NIF){
       List<Factura> facc = new ArrayList<Factura>();
       List<Integer> faccids = this.contribuintes.get(NIF).getFacturas();
       Factura f;
       for(int i: faccids){
           f = this.facturas.get(i);
           facc.add(f);
       }
       /*
       facturas.stream().filter((f) -> (f.getNifCliente() == NIF || f.getNifEmitente() == NIF )).forEach((f) -> {
           facc.add(f);
        });
        */
       return facc;
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
    
    public void ValidarMovimento(Factura f){
        f.setConfirmado(true);
    }
    
    //Funcao que emite factura de uma empresa para um individuo
    public void emitirFactura(ContribuinteColetivo emp, int NIF, int year, int month, int day, int hour, int minute, String descricaoDesp, int tipoAtividade, int valorDesp){
        int id = this.facturas.size();
        int nifEmitente = emp.getNif();
        float coefEmp = emp.getFactorEmpresarial();
        String designacao = emp.getNome(); 
        LocalDateTime dataDespesa = LocalDateTime.of(year,month,day,hour,minute);
        int nifCliente = NIF;
        String descricao = descricaoDesp;
        int atividade;
        float valorDeduzido;
        float valor= valorDesp;
        boolean confirmado=false;
            if(emp.getAtividades().size()==1) {atividade = tipoAtividade;
                valorDeduzido=getValorDeduzido(nifEmitente, atividade, valor, coefEmp); //fazerAlgoritmo
            }
            else {atividade = -1;
                valorDeduzido=0;
            }
        Factura f = new Factura(id,nifEmitente,designacao,dataDespesa,nifCliente, descricao, atividade,
                                valor, confirmado, valorDeduzido);
    
    this.facturas.put(id,f);
    }
    
    public float getValorDeduzidoAnual(int nifC){
        List<Factura> facc = this.getFacturasWithNIF(nifC);
        float valorTotal =0;
        for (Factura f: facc) {
            valorTotal+= f.getValorDeduzido();
        }
        return valorTotal;
    }
    
    public float getValorDeduzido(int nifEmitente,int atividade,float valor, float coefEmp){
        float valorDeduzido=0;
        if(this.coefs.containsKey(atividade)){
            valorDeduzido= valor* coefEmp * this.coefs.get(atividade);
        }
        return valorDeduzido;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Contribuintes:\n");
        for(Contribuinte cont: this.contribuintes.values()){
            sb.append(cont.toString());
            sb.append("\n");
        }
        sb.append("Admin :\n"); sb.append(admin.toString());
        sb.append("Facturas:\n");
        for(Factura fac: this.facturas.values()){
            sb.append(fac.toString());
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
     public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        JavaFactura jf = (JavaFactura) o;
        return (this.admin.equals(jf.getAdmin()) && this.contribuintes.equals(jf.getContribuintes())
                && this.facturas.equals(jf.getFacturas())
                );
        
    }
     
     public JavaFactura clone(){
         return new JavaFactura(this);
     }
     
     
     public boolean registaContribuinteIndividual( int nif,String email,String nome,String morada,String password,List<Integer> nifAgregado,float coefFiscal, List<Integer> atividades, int nrfilhos){
         boolean notRegistado=false;
        
         ContribuinteIndividual ind;
         if (notRegistado = !this.contribuintes.containsKey(nif)){
            ind = new ContribuinteIndividual(coefFiscal, nif, email, nome,morada, password, nrfilhos);

            List <Integer> agregado = ind.getAgregadoFamiliar();
            List <Integer> atividade = ind.getAtividades();
            for(Integer i: nifAgregado){
                agregado.add(i);
            }
            for(Integer i: atividades){
                atividade.add(i);
            } 
            this.contribuintes.put(nif,ind);
         }
         return notRegistado;
     }
     
     public boolean registaContribuinteColetivo( int nif,String email,String nome,String morada,String password,float factorEmpresarial, List<Integer> atividades){
         boolean notRegistado=false;
         
         ContribuinteColetivo emp;
         if (notRegistado = !this.contribuintes.containsKey(nif)){
            emp = new ContribuinteColetivo(factorEmpresarial, nif, email, nome,morada, password);

            List <Integer> atividade = emp.getAtividades();
            for(Integer i: atividades){
                atividade.add(i);
            } 
            this.contribuintes.put(nif,emp);
         }
         return notRegistado;
     }
     
     public float getDeduzidoAgregado(ContribuinteIndividual ind){
         int nif = ind.getNif();
         List<Integer> agregado = ind.getAgregadoFamiliar();
         float deduzido=0;
         deduzido += this.getValorDeduzidoAnual(nif);
         for (Integer i: agregado){
             deduzido += getValorDeduzidoAnual(i);
         }
         return deduzido;
     }
     
     public List<Factura> getFacturasEmpresaOrdenadaPorData(int NIF){
         List<Factura> facturas = getFacturasWithNIF(NIF);
         Collections.sort(facturas,new ComparatorFacturasData());
         return facturas;
     }
     
     public List<Factura> getFacturasEmpresaOrdenadaPorDespesa(int NIF, boolean ascendente){
         List<Factura> facturas = getFacturasWithNIF(NIF);
         Collections.sort(facturas,new ComparatorFacturasValor());
         
         
         if (!ascendente)
             Collections.reverse(facturas);
         return facturas;
     }
     
     public List<Factura> getFacturasEmpresaEntreDatas(int NIF, LocalDateTime dataMenor, LocalDateTime dataMaior){
       List<Factura> facc = new ArrayList<Factura>();
       Contribuinte emp = this.contribuintes.get(NIF);       
       List<Integer> faccids = this.contribuintes.get(NIF).getFacturas();
       Factura f;
       for(int i: faccids){
           f = this.facturas.get(i);
           if ((f.getDataDespesa().compareTo(dataMenor) == 1) && (f.getDataDespesa().compareTo(dataMaior) == -1))
              facc.add(f);
       }
       return facc;
     }
     
     public float getFacturadoEntreDatas(int NIF, LocalDateTime dataMenor, LocalDateTime dataMaior){
         float faturado=0;
         List<Factura> facc = getFacturasEmpresaEntreDatas(NIF, dataMenor,dataMaior);
         for (Factura f: facc)
             faturado += f.getValor();
         return faturado;
     }
     
      public float getDeduzidoEntreDatas(int NIF, LocalDateTime dataMenor, LocalDateTime dataMaior){
         float faturado=0;
         List<Factura> facc = getFacturasEmpresaEntreDatas(NIF, dataMenor,dataMaior);
         for (Factura f: facc)
             faturado += f.getValor();
         return faturado;
     }
      
      public List<Contribuinte> getTop10Contribuintes(){
          Map<Contribuinte,Float> topContribuintes= new HashMap<Contribuinte,Float>();
          float contribuicao=0;
          Contribuinte l = null;
          for (Contribuinte c: this.contribuintes.values()){
              l = c;
              contribuicao=this.getValorDeduzidoAnual(l.getNif());
              topContribuintes.put(l, contribuicao);
          }
          HashMap<Contribuinte,Float> topContribuintesOrdenado = topContribuintes.entrySet().stream()
                                                             .sorted(Entry.comparingByValue())
                                                             .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
          
          return topContribuintesOrdenado.entrySet().stream().map(Map.Entry::getKey).limit(10).collect(Collectors.toList());
      }
      
      public List<Contribuinte> getTopXEmpresasComMaisFacturas(int x){
          Map<Contribuinte,Integer> topEmpresas= new HashMap<Contribuinte,Integer>();
          int facturasCount=0;
          List<Factura> facturas;
          Contribuinte l = null;
          for (Contribuinte c: this.contribuintes.values()){
              if (c instanceof ContribuinteColetivo){
              l = c.clone();
              facturas=this.getFacturasWithNIF(l.getNif());
              facturasCount += facturas.size();
              topEmpresas.put(l, facturasCount);
              }
          }
          HashMap<Contribuinte,Integer> topContribuintesOrdenado = topEmpresas.entrySet().stream()
                                                             .sorted(Entry.comparingByValue())
                                                             .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
          
          return topContribuintesOrdenado.entrySet().stream().map(Map.Entry::getKey).limit(x).collect(Collectors.toList());
      }
       // verificar se esta por ordem esta...
      public Map<Contribuinte,Float>getTopXEmpresasFaturadoras(int x){
          List<Contribuinte> topxEmpresas= this.getTopXEmpresasComMaisFacturas(x);
          Contribuinte l;
          Map<Contribuinte,Float> topEmpresas = new HashMap<Contribuinte,Float>();
          for(Contribuinte c: topxEmpresas){
              l=c.clone();
              float deducoes= this.getValorDeduzidoAnual(l.getNif());
              topEmpresas.put(l, deducoes);
          }
          return topEmpresas;
      }
      
      public void guardaEstado(String filename) throws FileNotFoundException, IOException{
          FileOutputStream fos= new FileOutputStream(filename);
          ObjectOutputStream oos= new ObjectOutputStream(fos);
          oos.writeObject(this);
          oos.flush();
          oos.close();
      }
      
      public static JavaFactura carregaEstado(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
          FileInputStream fis= new FileInputStream(filename);
          ObjectInputStream ois = new ObjectInputStream(fis);
          JavaFactura jf = (JavaFactura) ois.readObject();
          ois.close();
          return jf;
      }
}
