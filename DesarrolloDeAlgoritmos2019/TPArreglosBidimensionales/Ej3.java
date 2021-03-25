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
Diseñar un algoritmo que declare dos matrices de nxn de enteros. 
Luego debe presentar un menú de opciones para realizar las siguientes tareas:
a) Cargar los elementos de la matriz.
b) Realizar la suma de dos matrices.
c) Realizar el productos de dos matrices.
 */
public class Ej3 {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Realizar la suma de dos matrices.");
        System.out.println("(2) Realizar el producto de dos matrices.");
    }

    public static void main(String[] args) {
        int[][] matriz1;
        int[][] matriz2;
        int fila1, columna1, fila2, columna2, opcion;
        boolean terminar = false;

        System.out.println("Ingrese la cantidad de filas de la matriz 1: ");
        fila1 = TecladoIn.readInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz 1: ");
        columna1 = TecladoIn.readInt();

        matriz1 = new int[fila1][columna1];

        cargarMatriz1(matriz1, fila1, columna1);

        System.out.println("Ingrese la cantidad de filas de la matriz 2: ");
        fila2 = TecladoIn.readInt();
        System.out.println("Ingrese la cantidad de columnad de la matriz 2: ");
        columna2 = TecladoIn.readInt();

        matriz2 = new int[fila2][columna2];

        cargarMatriz2(matriz2, fila2, columna2);

        while (!terminar) {
            menu();
            opcion = TecladoIn.readInt();
            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    sumaMatrices(matriz1, matriz2);
                    break;
                case 2:
                    multiplicacionMatrices(matriz1, matriz2);
                    break;
            }
        }
    }

    public static void cargarMatriz1(int[][] matriz1, int fil1, int col1) {
        for (int i = 0; i < fil1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.println("Ingrese un numero: ");
                matriz1[i][j] = TecladoIn.readLineInt();
            }
        }
    }

    public static void cargarMatriz2(int[][] matriz2, int fil2, int col2) {
        for (int i = 0; i < fil2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Ingrese un numero: ");
                matriz2[i][j] = TecladoIn.readInt();
            }
        }
    }

    public static void sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matrizSumada;
        matrizSumada = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matrizSumada.length; i++) {
            for (int j = 0; j < matrizSumada[0].length; j++) {
                matrizSumada[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("La suma de las matrices es: ");
        for (int i = 0; i < matrizSumada.length; i++) {
            for (int j = 0; j < matrizSumada[0].length; j++) {
                System.out.print(matrizSumada[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void multiplicacionMatrices(int[][] matriz1, int[][] matriz2) {
        int suma = 0;
        int[][] matrizMultiplicada = null;
        
        if (matriz1[0].length != matriz2.length) {
            System.out.println("No se puede realizar la multiplicacion");
        } else {
            matrizMultiplicada = new int[matriz1.length][matriz2[0].length];
        }
        
        for (int i = 0; i < matrizMultiplicada.length; i++) {
            for (int j = 0; j < matrizMultiplicada[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    suma = suma + (matriz1[i][k] * matriz2[k][j]);
                }
                matrizMultiplicada[i][j] = suma;
                suma = 0;
            }
        }
        
        System.out.println("La multiplicacion de las matrices es: ");
        for (int i = 0; i < matrizMultiplicada.length; i++) {
            for (int j = 0; j < matrizMultiplicada[0].length; j++) {
                System.out.print(matrizMultiplicada[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
