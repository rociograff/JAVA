/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPArreglosBidimensionales;

import java.util.Random;

/**
 *
 * @author usuario
 */

/*
Diseñar un algoritmo que cargue una matriz a partir de un arreglo de 150 caracteres. 
La matriz debe ser de tamaño 10x15, y se debe llenar por fila, una vez completa la primera fila
se debe continuar por la segunda y así sucesivamente.
 */
public class Ej5 {

    public static void main(String[] args) {
        char[] arreglo;
        char[][] matriz;
        arreglo = crearArreglo();

        matriz = crearMatriz(arreglo);
        mostrarMatriz(matriz);
    }

    public static char[] crearArreglo() {
        char[] arreglo = new char[150];
        Random r = new Random();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = alfabeto.charAt(r.nextInt(alfabeto.length()));
        }
        return arreglo;
    }

    public static char[][] crearMatriz(char[] arreglo) {
        int contador = 0;
        char[][] matriz = new char[10][15];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = arreglo[contador];
                contador++;
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
