/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcialRendido;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;
import java.util.Arrays;

/**
 *
 * @author Rocio Graff
 */
/*
Un algoritmo que dada una matriz nxn, obtenga y devuelva un arreglo con los valores correspondientes a la suma de las filas
Este algoritmo debera hacer uso del algoritmo anterior
 */
public class Ej2b {

    public static int sumaValores(int[] arreglo) {
        int i, contador;

        contador = 0;

        for (i = 0; i < arreglo.length; i++) {
            contador = contador + arreglo[i];
        }
        return contador;
    }

    public static int[] sumaMatriz(int[][] matriz) {
        int[] arreglo1;
        int[] arreglo2;

        int i, j;

        arreglo1 = new int[matriz.length];
        arreglo2 = new int[matriz.length];

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                arreglo1[j] = matriz[i][j];
            }
            arreglo2[i] = sumaValores(arreglo1);
        }
        return arreglo2;
    }


    public static void main(String[] args) {
        int[][] matriz = {{4, 9, 1}, {2, 3, 5}, {1, 6, 0}};
        int[] arreglo;
        
        arreglo = sumaMatriz(matriz);
        System.out.println(Arrays.toString(arreglo));
        
    }

}
