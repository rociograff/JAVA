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
Diseñar un algoritmo que declare una matriz de nxn de enteros y la inicialice. 
Luego debe presentar un menú de opciones para realizar las siguientes tareas: 
a) Mostrar todos los elementos de una matriz.
b) Verificar si la matriz es Triangular Superior.
c) Verificar si la matriz es Matriz Diagonal.
d) Producto por un escalar, se debe ingresar el valor correspondiente.
e) Transponer la matriz.
f) Sumar los elementos de una fila determinada
g) Sumar los elementos de una columna 
 */
public class Ej2 {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Mostrar todos los elementos de una matriz.");
        System.out.println("(2) Verificar si la matriz es Triangular Superior.");
        System.out.println("(3) Verificar si la matriz es Matriz Diagonal.");
        System.out.println("(4) Producto por un escalar.");
        System.out.println("(5) Trasponer la matriz.");
        System.out.println("(6) Sumar los elementos de una fila determinada.");
        System.out.println("(7) Sumar los elementos de una comlumna.");
        System.out.println("(8) Verificar si la matriz es Triangular Inferior.");
    }

    public static void main(String[] args) {
        //Declaracion de variables
        int[][] matriz;
        int opcion, fila, columna;
        boolean terminar = false;

        System.out.println("Ingrese la cantidad de filas: ");
        fila = TecladoIn.readInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columna = TecladoIn.readInt();

        matriz = new int[fila][columna];

        cargarMatriz(matriz, fila, fila);

        while (!terminar) {
            menu();
            opcion = TecladoIn.readInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    mostrarMatriz(matriz);
                    break;
                case 2:
                    esTriangularSuperior(matriz);
                    break;
                case 3:
                    esMatrizDiagonal(matriz);
                    System.out.println("La matris es Matriz Diagonal");
                    break;
                case 4:
                     productoEscalar(matriz);
                     break;
                case 5:
                    System.out.println("La matriz transpuesta es: "+trasponer(matriz, fila, fila));
                    break;
                case 6:
                    System.out.println(sumarFila(matriz, fila));
                    break;
                case 7:
                    System.out.println(sumarColumna(matriz, fila));
                    break;
                case 8:
                    esTriangularInferior(matriz);
                    break;
            }
        }
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

    public static boolean esCuadrada(int[][] matriz) {
        return matriz.length == matriz[0].length;
    }

    public static boolean esTriangularSuperior(int[][] matriz) {
        boolean continuar;
        int fil, col, cantFil, cantCol;

        continuar = true;
        fil = 0;
        cantFil = matriz.length - 1;
        cantCol = matriz[0].length - 1;

        if (!esCuadrada(matriz)) {
            continuar = false;
        } else {
            while (fil < cantFil && continuar) {
                col = 0;
                while (col < cantCol && continuar) {
                    if ((fil > col) && matriz[fil][col] != 0) {
                        continuar = false;
                    }
                    col++;
                }
                fil++;
            }
        }
        if (continuar) {
            System.out.println("La matriz es triangular superior.");
        } else {
            System.out.println("La matriz no es triangular superior.");
        }
        return continuar;
    }

    public static boolean esTriangularInferior(int[][] matriz) {
        boolean continuar;
        int fil, col, cantFil, cantCol;

        continuar = true;
        fil = 0;
        cantFil = matriz.length - 1;
        cantCol = matriz[0].length - 1;

        if (!esCuadrada(matriz)) {
            continuar = false;
        } else {
            while (fil < cantFil && continuar) {
                col = 1;
                while (col < cantCol && continuar) {
                    if ((fil < col) && matriz[fil][col] != 0) {
                        continuar = false;
                    }
                    col++;
                }
                fil++;
            }
        }
        if (continuar) {
            System.out.println("La matriz es triangular inferior.");
        } else {
            System.out.println("La matriz no es triangular inferior.");
        }
        return continuar;
    }

    public static boolean esMatrizDiagonal(int[][] matriz) {
        return esTriangularSuperior(matriz) && esTriangularInferior(matriz);
    }

    public static void productoEscalar(int[][] matriz) {
        int k;

        System.out.println("Ingrese el escalar por el que desea multiplicar a la matriz: ");
        k = TecladoIn.readInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matriz[i][j] * k;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static int[][] trasponer (int[][] matriz, int fil, int col) {
        int[][] matrizT;
        int cantFila, cantCol;
        
        cantFila = matriz.length;
        cantCol = matriz[0].length;
        matrizT = new int[cantCol][cantFila];
        
        for (fil = 0; fil < cantFila; fil++) {
            for (col = 0; col < cantCol; col++) {
                matrizT[col][fil] = matriz[fil][col];
            }
        }
        return matrizT;
    }
    
    public static int sumarFila(int[][] matriz, int fil) {
        int col, suma, cantCol;
        
        cantCol = matriz[0].length - 1;
        suma = 0;
        
        for(col = 0; col <= cantCol; col++) {
            suma =+ matriz[fil][col];
        }
        return suma;
    }
    
    public static int sumarColumna(int[][] matriz, int col) {
        int fila, suma, cantFila;
        
        cantFila = matriz.length;
        suma = 0;
        
        for(fila = 0; fila <= cantFila; fila++) {
            suma =+ matriz[col][fila];
        }
        return suma;
    }
    
}
