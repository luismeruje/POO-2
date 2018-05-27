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
public class ComparatorValorDesc implements Comparator<Float> {
    
    @Override
    public int compare(Float v1, Float v2){
        if(v1 == v2) return 0;
        if(v1 > v2) return -1;
        return 1;
    }

}
