package javafactura;
/**
 * Write a description of class Factura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.time.LocalDateTime;
public class Factura
{
    private String id;
    private int nifEmitente;
    private String designacao; 
    private LocalDateTime dataDespesa;
    private int nifCliente;
    private int descricao;
    private int atividade; //tipo 
    private float valor;
    private boolean confirmado;

    public Factura(String id, int nifEmitente, String designacao, LocalDateTime dataDespesa, int nifCliente, int descricao, int atividade, float valor, boolean confirmado) {
        this.id = id;
        this.nifEmitente = nifEmitente;
        this.designacao = designacao;
        this.dataDespesa = dataDespesa;
        this.nifCliente = nifCliente;
        this.descricao = descricao;
        this.atividade = atividade;
        this.valor = valor;
        this.confirmado = confirmado;
    }
    
    public Factura(Factura f){
        this.id = f.getId();
        this.nifEmitente = f.getNifEmitente();
        this.designacao = f.getDesignacao();
        this.dataDespesa = f.getDataDespesa();
        this.nifCliente = f.getNifCliente();
        this.descricao = f.getDescricao();
        this.atividade = f.getAtividade();
        this.valor = f.getValor();
        this.confirmado = f.getConfirmado(); 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNifEmitente() {
        return nifEmitente;
    }

    public void setNifEmitente(int nifEmitente) {
        this.nifEmitente = nifEmitente;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public LocalDateTime getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(LocalDateTime dataDespesa) {
        this.dataDespesa = dataDespesa;
    }

    public int getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(int nifCliente) {
        this.nifCliente = nifCliente;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public int getAtividade() {
        return atividade;
    }

    public void setAtividade(int atividade) {
        this.atividade = atividade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    public boolean getConfirmado() {
        return this.confirmado;
    }
   

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: "); sb.append(this.id);
        sb.append("\nNIF do Emissor: "); sb.append(this.nifEmitente);
        sb.append("\nDesignacao: "); sb.append(this.designacao);
        sb.append("\nData da Despesa: "); sb.append(this.dataDespesa);
        sb.append("\nNif do Cliente: "); sb.append(this.nifCliente);
        sb.append("\nDescricao: "); sb.append(this.descricao);
        sb.append("\nAtividade: "); sb.append(this.atividade);
        sb.append("\nValor da Despesa: "); sb.append(this.valor);
        sb.append("\nConfirmacao");
        if (this.confirmado) sb.append("Sim");
        else                 sb.append("Nao");
        return sb.toString();
    }
    
    public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if ((o==null) || (this.getClass() != o.getClass())) 
            return false;
        Factura fac = (Factura) o;
        return (this.id.equals(fac.getId()) && this.nifEmitente == fac.getNifEmitente() 
                && this.designacao.equals(fac.getDesignacao()) && this.dataDespesa.equals(fac.getDataDespesa())
                && this.nifCliente == fac.getNifCliente() && this.descricao == fac.getDescricao()
                && this.atividade == fac.getAtividade() && this.valor == fac.getValor()
                && this.confirmado == fac.getConfirmado()
                ) ;
        
    }
    public Factura clone(){
         return new Factura(this);
     }
}
