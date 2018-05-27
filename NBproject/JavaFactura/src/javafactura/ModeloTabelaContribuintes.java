/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactura;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author utilizador
 */
public class ModeloTabelaContribuintes extends AbstractTableModel {
    String[] cabecalho;
    Map <Contribuinte, Float> contribuintes;
    
    public ModeloTabelaContribuintes(Map<Contribuinte, Float> contribuintes, String[] cabecalho){
        this.cabecalho = cabecalho;
        this.contribuintes = contribuintes;
    }
    
    @Override
    public int getColumnCount() {
        return this.cabecalho.length;
    }
    
    @Override
    public int getRowCount() {
        return contribuintes.size();
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        Contribuinte contribuinte = null;
        List<Contribuinte> contr = new ArrayList<>(contribuintes.keySet());
        
        try{
            contribuinte = contr.get(linha);
                
            switch (this.cabecalho[coluna]) {

                case "NIF":
                    return contribuinte.getNif();

                case "Nome":
                    return contribuinte.getNome();

                case "Morada":
                    return contribuinte.getMorada();

                case "Email":
                    return contribuinte.getEmail();

                case "Despesa":
                    return this.contribuintes.get(contribuinte);
                    
                case "Montante":
                    return this.contribuintes.get(contribuinte);
                    
                default :
                    return "";
            }
            
        } catch(IndexOutOfBoundsException e){
            return "";
        }

    }
 
    //This method will be used to display the name of columns
    @Override
    public String getColumnName(int col) {
        return cabecalho[col];
    }
}
