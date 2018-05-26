/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactura;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LuisFerreira
 */
public class ModeloTabelaFacturas extends AbstractTableModel{
    String cabecalhoArray[] = new String[]{"ID","NIF do cliente","NIF do emissor","Valor da despesa","Valor deduzido","Data","Atividade económica"};
    List<Factura> facturas;
    
    public ModeloTabelaFacturas(List<Factura> facturas){
        this.facturas = facturas;
    }
 
    @Override
    public int getColumnCount() {
        return 7;
    }
 
  
 
@Override
public int getRowCount() {
    return facturas.size();
}
 
// this method is called to set the value of each cell
@Override
public Object getValueAt(int linha, int coluna) {
    Factura factura = null;
    try{
        factura= facturas.get(linha);
        switch (coluna) {

            case 0:
                return factura.getId();

            case 1:
                return factura.getNifCliente();

            case 2:
                return factura.getNifEmitente();
            
            case 3:
                return factura.getValor();

            case 4:
                return factura.getValorDeduzido();

            case 5:
                return factura.getDataDespesa();

            case 6:
                return factura.getAtividade();

            default :
                return "";
        }
    } catch(IndexOutOfBoundsException e){
        return "";
    }

}
 
 
 //This method will be used to display the name of columns
public String getColumnName(int col) {
    return cabecalhoArray[col];
}
}

