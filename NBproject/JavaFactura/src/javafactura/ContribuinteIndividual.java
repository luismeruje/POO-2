package javafactura;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class ContribuinteIndividual here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContribuinteIndividual extends Contribuinte implements Serializable
{
    // instance variables - replace the example below with your own
    private List<Integer> nifAgregado; //nifFilhos
    private int nrFilhos;
    private float coefFiscal;
    private List<Integer> atividades;

    
    public ContribuinteIndividual(float coefFiscal,int nif, String email, String nome, String morada, String password, int nrFilhos) {
        super(nif, email, nome, morada, password);
        this.nifAgregado = new ArrayList<>();
        this.coefFiscal = coefFiscal;
        this.atividades = new ArrayList<>();
        this.nrFilhos=nrFilhos;
    }
    
    public ContribuinteIndividual(ContribuinteIndividual i){
        super(i);
        this.nifAgregado=i.getAgregadoFamiliar();
        this.coefFiscal= i.getCoefFiscal();
        this.atividades = i.getAtividades();
    }

    
    
   //existsAgregado?
    public List<Integer> getAgregadoFamiliar(){
        return this.nifAgregado;
    }

    public void setAgregado(Integer agregado) {
        this.nifAgregado.add(agregado);
    }

    public float getCoefFiscal() {
        return coefFiscal;
    }

    public void setCoefFiscal(float coefFiscal) {
        this.coefFiscal = coefFiscal;
    }

    public List<Integer> getAtividades(){
        return this.atividades;
    }

    public void setAtividade(Integer atividade) {
        this.atividades.add(atividade);
    }

    public int getNrFilhos() {
        return nrFilhos;
    }

    public void setNrFilhos(int nrFilhos) {
        this.nrFilhos = nrFilhos;
    }
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Agregado familiar: \n");
        for(Integer agre: this.nifAgregado)
            sb.append(agre + "\n");
        
        sb.append("Coeficiente Fiscal: "); sb.append(this.coefFiscal);
        sb.append("Atividades : \n");
        for(Integer ati: this.atividades)
            sb.append(ati + "\n");
        return sb.toString();
    }
    public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        ContribuinteIndividual ind = (ContribuinteIndividual) o;
        return (this.nifAgregado.equals(ind.getAgregadoFamiliar()) && this.coefFiscal == ind.getCoefFiscal() 
                && this.atividades.equals(ind.getAtividades())
                ) ;
        
    }
    
    public ContribuinteIndividual clone(){
         return new ContribuinteIndividual(this);
     }
    
}
