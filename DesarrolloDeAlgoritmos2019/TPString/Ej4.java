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
 * Desarrollar un algoritmo que, dada una frase u oración, devuelva la palabra
 * en la que aparezca más veces una determinada vocal.
 *
 */
public class Ej4 {

    public static void main(String[] args) {
        String oracion, palabra, palabraMasVocales;

        System.out.println("Ingrese una oracion: ");
        oracion = TecladoIn.readLine();
        
        palabraConMasVocales(oracion);
    }

    public static void palabraConMasVocales(String oracion) {
        int contador = 0, masVocales = 0, cont = 0;
        String aux = "", ayuda = "", palabraMasVocales = "";

        for (int i = 0; i < oracion.length(); i++) {
            char caract = oracion.charAt(i);
            aux = aux + caract;
            if (caract == ' ') {
                ayuda = aux;
                aux = "";
            }
            for (int p = 0; p < ayuda.length(); p++) {
                if (ayuda.charAt(p) == 'a' || ayuda.charAt(p) == 'e' || ayuda.charAt(p) == 'i' || ayuda.charAt(p) == 'o' || ayuda.charAt(p) == 'u') {
                    contador++;
                    if (contador > masVocales) {
                        palabraMasVocales = ayuda;
                        masVocales = contador;
                    }
                }
            }
            contador = 0;
        }
        for (int x = 0; x < aux.length(); x++) {
            if (aux.charAt(x) == 'a' || aux.charAt(x) == 'e' || aux.charAt(x) == 'i' || aux.charAt(x) == 'o' || aux.charAt(x) == 'u') {
                cont++;
                if (cont > masVocales) {
                    palabraMasVocales = aux;
                    masVocales = cont;
                }
            }
        }
        System.out.println("La palabra " + palabraMasVocales + " tiene " + masVocales + " vocales");
    }

}
