/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPString;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
/**
 * Desarrollar un algoritmo que invierta una palabra
 *
 */
public class Ej3 {

    public static void main(String[] args) {
        String palabra, palabraInvertida;

        System.out.println("Ingrese una palabra: ");
        palabra = TecladoIn.readLine();

        palabraInvertida = invertirPalabra(palabra);

        System.out.println("La palabra invertida es: " + palabraInvertida);
    }

    public static String invertirPalabra(String palabra) {
        String palabraInvertida = "";
        int i, longitud;
        char caract;

        longitud = palabra.length();

        for (i = longitud - 1; i >= 0; i--) {
            caract = palabra.charAt(i);
            palabraInvertida = palabraInvertida + caract;
        }

        return palabraInvertida;
    }

    /* public static String invertirPalabra (String palabra) {
        String palabraInvertida = "";
        int i, longitud;
        char caract;
        
        longitud = palabra.length();
        for (i = longitud - 1; i >= 0; i--) {
            caract = palabra.charAt(i);
            palabraInvertida = palabraInvertida + caract;
        }
        return palabraInvertida;
    }*/
}
