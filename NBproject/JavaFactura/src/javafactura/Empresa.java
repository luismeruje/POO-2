package javafactura;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Empresa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Empresa extends Contribuinte
{
    // instance variables - replace the example below with your own
    private List<Integer> atividades;
    private float factorEmpresarial;
    private String designacao;
    

    public Empresa(float factorEmpresarial, int nif, String email, String nome, String morada, String password) {
        super(nif, email, nome, morada, password);
        this.atividades = new ArrayList<Integer>();
        this.factorEmpresarial = factorEmpresarial;
    }
    
    public Empresa(Empresa emp){
        super(emp);
        this.atividades= emp.getAtividades(); // confirm
        this.factorEmpresarial = emp.getFactorEmpresarial();
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

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
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
        Empresa emp = (Empresa) o;
        return (this.factorEmpresarial == emp.getFactorEmpresarial() && this.atividades.equals(emp.getAtividades())); //confirmar
    }

     public Empresa clone(){
         return new Empresa(this);
     }
    
}
