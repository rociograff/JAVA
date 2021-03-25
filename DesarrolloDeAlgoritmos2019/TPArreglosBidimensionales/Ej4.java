/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.TPArreglosBidimensionales;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */

/*
Diseñar un algoritmo para recorrer matrices de nxn de enteros previamente cargadas 
y mostrar su contenido recorriendo las filas pares desde la columna 0 a la n-1 y las filas impares desde la columna n-1 a la 0. 
*/
public class Ej4 {

    public static void main(String[] args) {
        int[][] matriz;
        int fila, columna, matrizRecorrida;

        System.out.println("Ingrese la cantidad de filas: ");
        fila = TecladoIn.readLineInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columna = TecladoIn.readInt();

        matriz = new int[fila][columna];

        cargarMatriz(matriz, fila, fila);
       
        recorrerMatriz(matriz);
    }

    public static void cargarMatriz(int[][] matriz, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Ingrese un numero: ");
                matriz[i][j] = TecladoIn.readInt();
            }
        }
    }

    public static void recorrerMatriz(int[][] matriz) {
        // mostrar su contenido recorriendo las filas pares desde la columna 0 a la n-1 y las filas impares desde la columna n-1 a la 0.
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
            } else {
                for (int j = matriz.length - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}

