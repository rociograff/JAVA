/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPString;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
/**
 * Desarrollar un algoritmo que, dada una frase u oración, cuente la cantidad de
 * veces que aparece una determinada vocal
 *
 */
public class Ej1 {

    public static void main(String[] args) {
        //Declaracion de variables
        String oracion;
        char vocal;
        boolean esVocal = true;
        int cantVocal;

        System.out.println("Ingrese una oracion: ");
        oracion = TecladoIn.readLine();

        do {
            System.out.println("Ingrese la vocal que quiera buscar: ");
            vocal = TecladoIn.readLineNonwhiteChar();

            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                esVocal = true;
            } else {
                esVocal = false;
            }
        } while (esVocal != true);

        cantVocal = contarVocales(oracion, vocal);

        System.out.println("La vocal " + vocal + " aparece " + cantVocal + " veces.");
    }

    public static int contarVocales(String oracion, char vocal) {
        int i, cantVocales = 0;
        int longitud = oracion.length();

        for (i = 0; i < longitud - 1; i++) {
            if (vocal == oracion.charAt(i)) {
                cantVocales++;
            }
        }
        return cantVocales;
    }

}
