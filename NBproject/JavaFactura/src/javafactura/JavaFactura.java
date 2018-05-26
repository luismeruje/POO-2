package javafactura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
/**
 * Write a description of class JavaFactura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class JavaFactura
{
    private List<Contribuinte> contribuintes;
    private List<Factura> facturas;
    private Admin admin;
    private Map<Integer,Float> coefs;
    private Contribuinte contribuinteAt = null;
    

    public JavaFactura(Admin admin)
    {
    this.admin = admin;
    this.contribuintes = new ArrayList<Contribuinte>();
    this.facturas = new ArrayList<Factura>();
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
    
    
    public List<Contribuinte> getContribuintes()  {
        return this.contribuintes;
    }
    
    public void setContribuintes(List<Factura> contribuinte){
        this.facturas = contribuinte;
    }
    
    public List<Factura> getFacturas()  {
        return this.facturas;
    }
    
    public void setFactura(List<Factura> factura){
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
    public Contribuinte login(String NIF,String Password){
        int nifC;
        boolean encontrado=false;
        Contribuinte logado = null;
        nifC= Integer.valueOf(NIF);
        for(Contribuinte c: this.contribuintes){
            if(c.getNif()==nifC){
                if(c.getPassword().equals(Password))
                    encontrado=true;
                    logado=c;
                break;
            } 
                
        }
        return logado;
    }

    
    //Procura todas as faturas com o NIF do Contribuinte
    public List<Factura> getFacturasWithNIF(int NIF){
       List<Factura> facc = new ArrayList<Factura>();
       facturas.stream().filter((f) -> (f.getNifCliente() == NIF || f.getNifEmitente() == NIF )).forEach((f) -> {
           facc.add(f);
        });
       return facc;
    }
    //Facturas para Validar Movimento
    public List<Factura> getFacturasPorConfirmar(int NIF){
       List<Factura> facc = new ArrayList<Factura>();
       facturas.stream().filter((f) -> (f.getNifCliente() == NIF && !f.getConfirmado())).forEach((f) -> {
           facc.add(f);
        });
       return facc;
    }
    
    public void ValidarMovimento(Factura f){
        f.setConfirmado(true);
    }
    
    //Funcao que emite factura de uma empresa para um individuo
    public void emitirFactura(ContribuinteColetivo emp, int NIF, int year, int month, int day, int hour, int minute, String descricaoDesp, int tipoAtividade, int valorDesp){
        String id = String.valueOf(this.facturas.size());
        int nifEmitente = emp.getNif();
        float coefEmp = emp.getFactorEmpresarial();
        String designacao = emp.getDesignacao(); 
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
    
    this.facturas.add(f);
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
        for(Contribuinte cont: this.contribuintes){
            sb.append(cont.toString());
            sb.append("\n");
        }
        sb.append("Admin :\n"); sb.append(admin.toString());
        sb.append("Facturas:\n");
        for(Factura fac: this.facturas){
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
     
     
     public boolean registaIndividuo( int nif,String email,String nome,String morada,String password,List<Integer> nifAgregado,float coefFiscal, List<Integer> atividades){
         boolean registado=false;
         Iterator it = this.contribuintes.listIterator();
         Contribuinte c;
         while(it.hasNext() && !registado){
             c= (Contribuinte) it.next();
             if (c.getNif() == nif) registado = true; 
         }
         ContribuinteIndividual ind;
         if (!registado){
            ind = new ContribuinteIndividual(coefFiscal, nif, email, nome,morada, password);

            List <Integer> agregado = ind.getAgregadoFamiliar();
            List <Integer> atividade = ind.getAtividades();
            for(Integer i: nifAgregado){
                agregado.add(i);
            }
            for(Integer i: atividades){
                atividade.add(i);
            } 
            this.contribuintes.add(ind);
         }
         return registado;
     }
     
     public boolean registaEmpresa( int nif,String email,String nome,String morada,String password,String designacao,float factorEmpresarial, List<Integer> atividades){
         boolean registado=false;
         Iterator it = this.contribuintes.listIterator();
         Contribuinte c;
         while(it.hasNext() && !registado){
             c= (Contribuinte) it.next();
             if (c.getNif() == nif) registado = true; 
         }
         ContribuinteColetivo emp;
         if (!registado){
            emp = new ContribuinteColetivo(factorEmpresarial,designacao, nif, email, nome,morada, password);

            List <Integer> atividade = emp.getAtividades();
            for(Integer i: atividades){
                atividade.add(i);
            } 
            this.contribuintes.add(emp);
         }
         return registado;
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
       facturas.stream().filter((f) -> ((f.getNifEmitente() == NIF ) && (f.getDataDespesa().compareTo(dataMenor) == 1) && (f.getDataDespesa().compareTo(dataMaior) == -1)))
               .forEach((f) -> {
                    facc.add(f);
                });
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
          for (Contribuinte c: this.contribuintes){
              l = c;
              contribuicao=this.getValorDeduzidoAnual(l.getNif());
              topContribuintes.put(l, contribuicao);
          }
          TreeMap = new TreeSet<String>(topContribuintes.values());
          return topContribuintes;
      }
}
