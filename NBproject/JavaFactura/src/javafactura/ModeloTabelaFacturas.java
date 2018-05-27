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
    
    public ModeloTabelaFacturas(List<Factura> facturas, String[] cabecalhoArray){
        this.cabecalhoArray = cabecalhoArray;
        this.facturas = facturas;
    }
 
    @Override
    public int getColumnCount() {
        return this.cabecalhoArray.length;
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
            factura = facturas.get(linha);
            switch (this.cabecalhoArray[coluna]) {

                case "ID":
                    return factura.getId();

                case "NIF do cliente":
                    return factura.getNifCliente();

                case "NIF do emissor":
                    return factura.getNifEmitente();

                case "Valor da despesa":
                    return factura.getValor();

                case "Valor deduzido":
                    return factura.getValorDeduzido();

                case "Data":
                    return factura.getDataDespesa();

                case "Atividade económica":
                    return CommonVariables.getString(factura.getAtividade());

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

