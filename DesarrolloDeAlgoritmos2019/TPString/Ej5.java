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
 * Desarrollar un algoritmo que, dada una oración, ordene alfabéticamente las
 * palabras
 *
 */
public class Ej5 {

    public static void main(String[] args) {
        ordenarAlfabeticamente();
    }

    public static void ordenarAlfabeticamente() {
        String palabra1 = "", palabra2 = "", palabra3 = "", palabra4 = "", oracion, pal = "", aux = "", oracionFinal = "";
        int posInicial = 0, posFinal, cont = 0;

        System.out.println("Ingrese una oracion de 4 palabras: ");
        oracion = TecladoIn.readLine();

        for (int i = 0; i < oracion.length(); i++) {
            char caract = oracion.charAt(i);
            pal = pal + caract;
            if (oracion.charAt(i) == ' ') {
                cont++;
                aux = pal;
                pal = "";
            }
            if (cont == 1) {
                palabra1 = aux;
                System.out.println(palabra1 + " 1");
            } else {
                if (cont == 2) {
                    palabra2 = aux;
                    System.out.println(palabra2 + " 2");
                } else {
                    if (cont == 3) {
                        palabra3 = aux;
                        System.out.println(palabra3 + " 3");
                        cont++;
                    } else {
                        if (cont == 4) {
                            palabra4 = pal;
                            System.out.println(palabra4 + " 4");
                        }
                    }
                }
            }
        }
        if (palabra1.compareTo(palabra2) <= 0 && palabra1.compareTo(palabra3) <= 0 && palabra1.compareTo(palabra4) <= 0) {
            oracionFinal = oracionFinal + palabra1;
        } else {
        }
        if (palabra2.compareTo(palabra3) <= 0 && palabra2.compareTo(palabra4) <= 0) {
            oracionFinal = oracionFinal + palabra2;
        }
        if (palabra3.compareTo(palabra4) <= 0) {
            oracionFinal = oracionFinal + palabra3 + palabra4;
        }
        System.out.println(oracionFinal);
    }

}
