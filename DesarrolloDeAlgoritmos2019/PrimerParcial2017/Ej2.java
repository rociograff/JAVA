/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcial2017;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej2 {
    public static void main(String[] args) {
        int[][] matriz;
        int fila, columna;
        
        System.out.println("Ingrese la cantidad de filas: ");
        fila = TecladoIn.readLineInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columna = TecladoIn.readInt();
        
        matriz = new int[fila][columna];
        
        cargarMatriz(matriz, fila, fila);
        System.out.println(esDiagonalSecundaria(matriz));
       
    }
    
    public static void cargarMatriz(int[][] matriz, int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for(int j = 0; j < col; j++) {
                System.out.println("Ingrese un numero: ");
                matriz[i][j] = TecladoIn.readInt();
            }
        }
    }
    
    public static boolean esDiagonalSecundaria (int[][] matriz) {
        int fila, cantCol, aux;
        boolean continuar = true;
        
        fila = 1;
        cantCol = matriz[0].length - 1;
        aux = matriz[0][cantCol];
        
        while(fila <= cantCol && continuar) {
            if(!(matriz[fila][cantCol - fila] == aux)) {
                continuar = false;
            }
            fila++;
        }
        return continuar;
    }
}
