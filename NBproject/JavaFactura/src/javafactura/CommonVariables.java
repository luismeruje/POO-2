/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactura;

import java.io.Serializable;

/**
 *
 * @author treishy
 */
public class CommonVariables {
    public static final int RESTAURACAO = 1;
    public static final int EDUCACAO = 2;
    public static final int SAUDE = 3;
    public static final int HABITACAO = 4;
    public static final int DESPESAS_FAMILIARES = 5;
    
    public static int getInt(String atividadeEconomica) {
        switch (atividadeEconomica) {
            case "Restauração":
                return 1;
            case "Educação":
                return 2;
            case "Saúde":
                return 3;
            case "Habitação":
                return 4;
            case "Despesas Familiares":
                return 5;
            default:
                return -1;
        }
    }
}
