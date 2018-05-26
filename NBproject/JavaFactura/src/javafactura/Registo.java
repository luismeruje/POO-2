
package javafactura;

import java.time.LocalDateTime;

/**
 *
 * @author treishy
 */
public class Registo {
    private String descricao;
    private int oldValue;
    private int newValue;
    private LocalDateTime dataAlteracao;

    public Registo(String descricao, int oldValue, int newValue) {
        this.descricao = descricao;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.dataAlteracao = LocalDateTime.now();
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getOldValue() {
        return oldValue;
    }

    public void setOldValue(int oldValue) {
        this.oldValue = oldValue;
    }

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
    }

    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Descricao: "); sb.append(descricao);
        sb.append("\nValor Antigo: "); sb.append(oldValue);
        sb.append("\nValor Novo: "); sb.append(newValue);
        return sb.toString();
    }
}
