package javafactura;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class ContribuinteColetivo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContribuinteColetivo extends Contribuinte implements Serializable
{
    // instance variables - replace the example below with your own
    private List<Integer> atividades;
    private float factorEmpresarial;
    private String concelho;
    

    public ContribuinteColetivo(float factorEmpresarial, int nif, String email, String nome, String morada, String password, String concelho) {
        super(nif, email, nome, morada, password);
        this.atividades = new ArrayList<Integer>();
        this.factorEmpresarial = factorEmpresarial;
        this.concelho = concelho;
    }
    
    public ContribuinteColetivo(ContribuinteColetivo emp){
        super(emp);
        this.atividades= emp.getAtividades(); // confirm
        this.factorEmpresarial = emp.getFactorEmpresarial();
        this.concelho = emp.getConcelho();
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }
    
    
    public List<Integer> getAtividades () {
        return this.atividades;
    }
    public int getAtividade(int atividade) {
        int activity=-1;
        for(int i=0;i<atividades.size();i++){
            if(atividades.get(i)== atividade){
                activity = atividades.get(i);
                i = atividades.size();
            }
        }
        return activity;
    }

    public void setAtividade(int atividade) {
        this.atividades.add(atividade);
    }

    public float getFactorEmpresarial() {
        return factorEmpresarial;
    }

    public void setFactorEmpresarial(float factorEmpresarial) {
        this.factorEmpresarial = factorEmpresarial;
    }

    
    
    
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int i=0;
        for (Integer act: atividades){
            i++;
            sb.append("Atividade " + i + ": "); sb.append(act);
        }
        sb.append("Factor Empresarial: "); sb.append(this.factorEmpresarial);
        return sb.toString();
    }
    
    
    public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        ContribuinteColetivo emp = (ContribuinteColetivo) o;
        return (this.factorEmpresarial == emp.getFactorEmpresarial() && this.atividades.equals(emp.getAtividades())); //confirmar
    }

     public ContribuinteColetivo clone(){
         return new ContribuinteColetivo(this);
     }
    
}
