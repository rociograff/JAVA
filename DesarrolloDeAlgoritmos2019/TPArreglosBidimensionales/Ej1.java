/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPArreglosBidimensionales;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */

/*
Diseñar un algoritmo que declare una matriz de enteros com las dimensiones de la misma ingresadas por teclado. 
Luego debe presentar un menú de opciones para realizar las siguientes tareas: 
a) Cargar la fila i-esima de la matriz 
b) Cargar la matriz completa haciendo uso del módulo anterior 
c) Mostrar la columna i-ésima de la matriz 
d) Mostrar la matriz entera haciendo uso del módulo anterior
e) El programa debe invocar los módulos en forma adecuada para poder probarlos a todos. 
 */
public class Ej1 {

    public static void main(String[] args) {
        //Declaracion de variables
        int[][] matriz;   //Declaracion del arreglo Matriz
        int fila, columna;

        System.out.print("Ingrese la cantidad de filas: ");
        fila = TecladoIn.readInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columna = TecladoIn.readInt();

        matriz = new int[fila][columna];   //Creacion del arreglo Matriz

        cargarMatriz(matriz, fila, fila);
        
        mostrarMatriz(matriz);

    }

    public static void cargarMatriz(int[][] matriz, int fil, int col) {
        //Modulo para cargar los elementos de una matriz
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Ingrese un elemento: ");
                matriz[i][j] = TecladoIn.readInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        //Modulo para mostrar los elementos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
