/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactura;

import java.util.Comparator;

/**
 *
 * @author treishy
 */
public class ComparatorFacturasValor implements Comparator<Factura> {
    public int compare(Factura f1, Factura f2){
        float despesa1 = f1.getValor();
        float despesa2 = f2.getValor();
        
        if(despesa1 == despesa2) return 0;
        if(despesa1 > despesa2) return 1;
        return -1;
    }
    
}
