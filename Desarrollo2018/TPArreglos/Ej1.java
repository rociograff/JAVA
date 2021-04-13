/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPArreglos;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */

/**
 * Diseñar una solución que:
 * a. Permita leer N números enteros, los almacene en un arreglo y retorne el arreglo.
 * b. Dado un arreglo, muestre los números que ocupan posiciones pares.
 * c. Dado un arreglo, cambie los números impares por el doble correspondiente.
 * d. Dado un arreglo, retorne el promedio de los números ingresados. 
 * e. Dado un arreglo, indique si los valores están ordenados de forma creciente.
 * 
 */

public class Ej1 {

    // (b) Dado un arreglo, muestre los números que ocupan posiciones pares.
    public static void posicionesPares(int[] arreglo, int longitud) {
        //Declaracion de variables
        int i;

        //Verifico la posicion de los elementos pares
        for (i = 0; i < arreglo.length; i = i + 2) {
            System.out.print(arreglo[i] + " ");
        }
    }

    // (c) Dado un arreglo, cambie los números impares por el doble correspondiente.
    public static void dobleImpar(int[] arreglo, int longitud) {
        //Declaracion de variables
        int i;

        //Cambio los elementos impares por el doble de los mismos
        for (i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 1) {
                arreglo[i] = arreglo[i] * 2;
            }
        }

        //Muestro los nuevos elementos del arreglo
        for (i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }   
    }

    // (d) Dado un arreglo, retorne el promedio de los números ingresados.
    public static int promedioArreglo(int[] arreglo, int longitud) {
        //Declaracion de variables
        int i, promedio = 0;

        //Recorro la longitud del arreglo y sumo los elementos
        for (i = 0; i < longitud; i++) {
            promedio = promedio + arreglo[i];
        }
        
        promedio = promedio / longitud;    //Saco el promedio
        
        return promedio;
    }

    // (e) Dado un arreglo, indique si los valores están ordenados de forma creciente.
    public static boolean ordenado(int[] arregloNumero, int longitud) {
        //Declaracion de variables
        int i = 0;
        boolean estaOrdenado = true;

        //Verifico si el arreglo esta ordenado elemento por elemento 
        while (estaOrdenado && (i < longitud)) {
            if (arregloNumero[i] > arregloNumero[i + 1]) {
                estaOrdenado = false;
            }
            i++;    //Incremento en uno
        }
        return estaOrdenado;
    }
    
    public static void cargarArreglo (int [] arreglo, int longitud) {
        //Declaracion de variables
        int i; 
        
        //Ingreso elemento por elemento en el arreglo de numeros enteros
        for (i = 0; i < longitud; i++) {
            System.out.print("Ingrese un elemento para el arreglo en la posicion " + i + " : ");
            arreglo[i] = TecladoIn.readLineInt();
        }  
    }

    public static void main(String[] args) {
        // (a) Permita leer N números enteros, los almacene en un arreglo y retorne el arreglo.
        //Declaracion de variables
        int[] arregloNumero;   //Declaracion del arreglo de Numeros Enteros
        int i, longitud;

        System.out.print("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arregloNumero = new int[longitud];  //Creacion de arreglo con la longitud que deseo
        
        cargarArreglo(arregloNumero, longitud);  //Invoco el modulo cargar elementos del arreglo

        //Muestro el arreglo original
        System.out.println("Muestro arreglo original: ");
        for (i = 0; i < arregloNumero.length; i++) {
            System.out.print(arregloNumero[i] + " ");
        }
        
        System.out.println(" ");
        System.out.println("Posiciones Pares: ");
        posicionesPares(arregloNumero, longitud);    //Invoco el modulo de las posiciones pares de los elementos del arreglo
        System.out.println(" ");
        System.out.println("Promedio del arreglo: "+promedioArreglo(arregloNumero, longitud));
        System.out.println("Dobles de Impares: ");
        dobleImpar(arregloNumero, longitud);    //Invoco el modulo de los dobles de los impares de los elementos del arreglo
        System.out.println(" ");
        System.out.println("¿Esta ordenado? "+ordenado(arregloNumero, longitud));
    }
}
