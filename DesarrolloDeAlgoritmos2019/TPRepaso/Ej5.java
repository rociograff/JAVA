/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.TPRepaso;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej5 {

    public static void main(String[] args) {

        String frase;

        System.out.println("ingrese una frase o texto");
        frase = TecladoIn.readLine();
        System.out.println("La palabra mas larga es " + palabraMasLarga(frase));
        
        palabraRepetida(frase);
       
    }

    public static String palabraMasLarga(String g) {

        int Larga = 0;
        String aux = "", ayuda = "", palabraLarga = "";
        for (int i = 0; i < g.length(); i++) {

            char Caract = g.charAt(i);
            aux = aux + Caract;

            if (Caract == ' ') {
                ayuda = aux;
                aux = "";
            }
            if (ayuda.length() > Larga) {
                Larga = ayuda.length();
                palabraLarga = ayuda;
            }

        }
        if (ayuda.length() < aux.length()) {
            palabraLarga = "" + aux;
        }

        return palabraLarga;
    }

    public static int palabraRepetida(String h) {
        int contador = 0;
        String palabra, aux;

        System.out.println("Ingrese la palabra que desea averiguar");
        palabra = TecladoIn.readLine();
        aux = "";

        for (int x = 0; x < h.length(); x++) {

            char Caract = h.charAt(x);
            if (Caract == ' ') {
                aux = "";
                continue;
            }

            aux = aux + Caract;

            if (palabra.length() == aux.length() && aux.equalsIgnoreCase(palabra)) {
                contador++;

            }

        }
        return contador;
    }
}
