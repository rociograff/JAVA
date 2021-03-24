/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoParcial;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
/*
b. Especificar un algoritmo RECURSIVO para determinar en un string que contiene digitos, cuantos de ellos son iguales a cero. 
 */
public class Ej3b2017 {

    public static void main(String[] args) {
        String cadena;
        int longitud, cant;

        System.out.println("Ingrese una cadena: ");
        cadena = TecladoIn.readLine();

        longitud = cadena.length() - 1;
        
        cant = contarString(cadena, longitud);
        
        System.out.println(cant);

    }

    public static int contarString(String cadena, int longitud) {
        int cont = 0;

        if (longitud == 0) {
            if (cadena.charAt(longitud) == '0') {
                cont++;
            }
        }else {
            if (cadena.charAt(longitud) == '0') {
                cont = 1 + contarString(cadena, longitud - 1);
            }else {
                cont = contarString(cadena, longitud - 1);
            }
        }
        return cont;
    }

}
