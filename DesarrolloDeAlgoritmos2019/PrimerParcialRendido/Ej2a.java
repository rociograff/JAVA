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
Un algoritmo sumaValores que reciba como parametro un arreglo de n valores enteros, y devuelva la suma de sus valores
*/
public class Ej2a {
    
    public static int sumaValores(int [] arreglo) {
        int i, contador;
        
        contador = 0;
        
        for (i = 0; i < arreglo.length; i++) {
            contador = contador + arreglo[i];
        }
        return contador;
    }
    
    public static void main(String[] args) {
        int [] arreglo = {1, 2, 3, 4};
        
        System.out.println("El suma del arreglo es: "+sumaValores(arreglo));
    }
    
}
