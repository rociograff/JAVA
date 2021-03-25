/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.RecursividadParaFinal;

/**
 *
 * @author Rocio Graff
 */

/*
Generar un número entero positivo M capicúa a partir de los dígitos del número entero positivo N. 
Por ejemplo si N=123, se debe obtener M=32123. 
 */
public class Ej8 {

    public static void main(String[] args) {
        int num = 123;
        
        System.out.println(capicua(num, 0));

    }

    public static int capicua(int nro, int capi) {
        int digito;
        if (nro < 10) {
            capi = capi * 10 + nro;
        } else {
            digito = nro % 10;
            capi = capi * 10 + digito;
            capi = capicua(nro / 10, capi);
            capi = capi * 10 + digito;
        }
        return capi;
    }

}
