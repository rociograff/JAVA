/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcial2018;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
/*
Un algoritmo que dado un arreglo de frases, y una vocal, recibidos ambos como parametros, cuente la cantidad
de veces que aparece esa determinada vocal en el arreglo. Su solucion debera hacer uno del algoritmo anterior
 */
public class Ej1b {

    public static void main(String[] args) {
        String[] arreglo = {"hola", "cama", "estas"};
        char vocal;
        int cantVocales;
        
        System.out.println("Ingrese la vocal que busca: ");
        vocal = TecladoIn.readLineNonwhiteChar();
        
        cantVocales = contarVocalArreglo(arreglo, vocal);
        System.out.println("La vocal aparece "+cantVocales+" veces.");

    }

    public static int contarVocal(String frase, char v) {
        int i, cantVocales = 0;

        for (i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == v) {
                cantVocales++;
            }
        }
        return cantVocales;
    }

    public static int contarVocalArreglo(String[] arreglo, char v) {
        int cantVocales = 0;
        int i;

        for (i = 0; i < arreglo.length; i++) {
            cantVocales = cantVocales + contarVocal(arreglo[i], v);
        }
        return cantVocales;
    }

}
