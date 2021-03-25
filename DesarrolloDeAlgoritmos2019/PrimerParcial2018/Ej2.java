/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcial2018;

/**
 *
 * @author Rocio Graff
 */
/*
Diseñar un algoritmo que verifique si una matriz de enteros satisface la condicion que para todas las filas se cumple
que la suma de los elementos de la fila i es mayor o igual que la suma de los elementos de la respectiva columna i
*/
public class Ej2 {
    
    public static void main(String[] args) {
        int[][] matriz = {{2, 0, 1}, {0, 1, 1}};
        boolean seVerifica;
        
        seVerifica = verificar(matriz);
        
        System.out.println(seVerifica);
    
    }
    
    public static int sumarFila(int[][] m, int k) {
        int j, resultado = 0;
        
        for(j = 0; j < m[0].length; j++) {
            resultado = resultado + m[k][j];
        }
        return resultado;
    }
    
    public static int sumarCol(int[][] m, int k) {
        int i, resultado = 0;
        
        for (i = 0; i < m.length; i++) {
            resultado = resultado + m[i][k];
        }
        return resultado;
    }
    
    public static boolean verificar (int[][] m) {
        //la suma de los elementos de la fila i es mayor o igual que la suma de los elementos de la respectiva columna i
        boolean verificar = true;
        int i = 0;
        
        if(m.length <= m[0].length) {
            while(i < m.length && verificar) {
                if(sumarFila(m, i) <= sumarCol(m, i)) {
                    verificar = false;
                }
                i++;
            }
        }
        return verificar;
    }
    
}
