/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo2018.TPArreglos;

/**
 *
 * @author usuario
 */

/**
 * Dado un arreglo de enteros, indicar si alguno de los números contenidos pertenece a la sucesión de fibonacci. 
 */

public class Ej4 {
    
    public static int fibonacci (int [] arr, int longitud) {
        //Declaracion de variables
        int i, j, esIgual = 0;
        int [] arrFibonacci = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};   //Declaracion del arreglo de Fibonacci ya pedefinido
        int longitudFibonacci = arrFibonacci.length;   //Defino la longitud del arreglo
        
        //Verifico elemento por elemento si hay alguno parecido al arreglo de Fibonacci
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitudFibonacci; j++) {
                if (arr[i] == arrFibonacci[j]) {
                    esIgual++;
                }
            }
        }
        return esIgual;
    }
    
    public static void main (String [] args) {
        //Declaracion de variables
        int [] arreglo = {4, 6, 10, 24, 35, 80, 143};  //Declaracion del arreglo de numeros ya predefinido
        int longitud = arreglo.length;    //Defino la longitud del arreglo
        int cantNum;
        boolean hayNum;
        
        //Invoco el modulo
        cantNum = fibonacci(arreglo, longitud);
        
        //Verifico si hay numeros de la sucesion de Fibonacci
        if (cantNum > 0) {
            hayNum = true;
            System.out.println("¿Hay numeros de la sucesion de Fibonacci? "+hayNum);
        }else {
            hayNum = false;
            System.out.println("¿Hay numeros de la sucesion de Fibonacci? "+hayNum);
        }
            
    }
    
}
