/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPRepaso;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej4 {

    public static void main(String[] args) {
        palabraConMasVocales();
    }

    public static void palabraConMasVocales() {

        int contador = 0, masVocales = 0, cont = 0;
        String oracion, aux = "", ayuda = "", palabraMasVocales = "";

        System.out.println("Ingrese una oracion");
        oracion = TecladoIn.readLine();

        for (int i = 0; i < oracion.length(); i++) {

            char caract = oracion.charAt(i);
            aux = aux + caract;
            if (caract == ' ') {
                ayuda = aux;
                aux = "";
            }
            System.out.println(aux);

            for (int p = 0; p < ayuda.length(); p++) {

                if (ayuda.charAt(p) == 'a' || ayuda.charAt(p) == 'e' || ayuda.charAt(p) == 'i' || ayuda.charAt(p) == 'o' || ayuda.charAt(p) == 'u') {
                    contador++;
                    if (contador > masVocales) {
                        palabraMasVocales = ayuda;
                        masVocales = contador;
                        System.out.println(palabraMasVocales);
                        System.out.println(ayuda);
                    }
                }
            }
            contador = 0;
        }
        for (int x = 0; x < palabraMasVocales.length(); x++) {
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



