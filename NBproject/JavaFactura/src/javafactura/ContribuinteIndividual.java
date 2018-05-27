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
    
    private List<Integer> nifAgregado; 
    private int nrFilhos;
    private float coefFiscal;
    private List<Integer> atividades;

    
    public ContribuinteIndividual(float coefFiscal,int nif, String email, String nome, String morada, String password, int nrFilhos, List<Integer> nifAgregado, List<Integer> atividades) {
        super(nif, email, nome, morada, password);
        this.nifAgregado = new ArrayList<>(nifAgregado);
        this.coefFiscal = coefFiscal;
        this.atividades = new ArrayList<>(atividades);
        this.nrFilhos=nrFilhos;
    }
    
    public ContribuinteIndividual(ContribuinteIndividual i){
        super(i);
        this.nifAgregado=i.getNifAgregado();
        this.coefFiscal= i.getCoefFiscal();
        this.atividades = i.getAtividades();
    }

    
    public List<Integer> getNifAgregado(){
        return this.nifAgregado;
    }

    public void setNifAgregado(List<Integer> nifAgregado) {
        this.nifAgregado = new ArrayList<>();
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

    public void setAtividades(List<Integer> atividades) {
        this.atividades = new ArrayList<>(atividades);
    }

    public int getNrFilhos() {
        return nrFilhos;
    }

    public void setNrFilhos(int nrFilhos) {
        this.nrFilhos = nrFilhos;
    }
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nif: "); sb.append(nif);
        sb.append("Agregado familiar: \n");
        for(Integer nif: this.nifAgregado)
            sb.append(nif + "\n");
        
        sb.append("Coeficiente Fiscal: "); sb.append(this.coefFiscal);
        sb.append("Atividades : \n");
        for(Integer ati: this.atividades)
            sb.append(ati + "\n");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        ContribuinteIndividual contr = (ContribuinteIndividual) o;
        return (this.nif == contr.getNif());
        
    }
    
    @Override
    public ContribuinteIndividual clone(){
         return new ContribuinteIndividual(this);
     }
    
}
