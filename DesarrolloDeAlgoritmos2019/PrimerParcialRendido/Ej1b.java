/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcialRendido;

/**
 *
 * @author Rocio Graff
 */
/*
Un algoritmo que dado un arreglo de frases, recibido por parametro, devuelva la palabra mas larga del arreglo
Este algoritmo debera hacer uso del algoritmo anterior
 */
public class Ej1b {

    public static int contarLetras(String frase) {
        int i, contador;
        char letra;

        contador = 0;

        for (i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if(Character.isLetter(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public static String palabraMasLarga(String[] arreglo) {
        int i, masLarga, longitud;
        String palabra, palabraMasLarga = " ";

        masLarga = 0;

        for (i = 0; i < arreglo.length; i++) {
            palabra = arreglo[i];
            longitud = contarLetras(palabra);
            
            if (longitud > masLarga) {
                masLarga = longitud;
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }
    
    public static void main(String[] args) {
        String [] arreglo = {"como", "estasss"};
        
        System.out.println("La palabra mas larga es: "+palabraMasLarga(arreglo));
        
    }

}
