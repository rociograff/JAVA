/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.RecursividadParaFinal;

/**
 *
 * @author Rocio Graff
 */

/*
Dado un arreglo de enteros buscar y retornar el menor elemento que se encuentre.
 */
public class Ej5 {

    public static void main(String[] args) {
        int[] arreglo = {15, 10, 5, 9, 3};
        int menor;

        menor = buscarMenor(arreglo, 0, arreglo[0]);
        System.out.println("El menor es: " + menor);
    }

    public static int buscarMenor(int arreglo[], int indice, int min) {

        if (indice != arreglo.length) {
            if(arreglo[indice] < min) {
                min = buscarMenor(arreglo, indice + 1, arreglo[indice]);
            }else {
                min = buscarMenor(arreglo, indice + 1, min);
            }
        } 
        
        return min;
    }
    
}
