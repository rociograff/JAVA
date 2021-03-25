/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.TPArreglos;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej3 {
    public static void main(String[] args) {
        //Declaracion de variables
        String[] arregloPalabras;    //Declaracion del arreglo de Palabras
        int longitud;
        
        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();
        
        arregloPalabras = new String[longitud];   //Creacion del arreglo de Palabras
        
        cargarArreglo(arregloPalabras, longitud);  //Invoco modulo para cargar elementos en el arreglo de Palabras
        mostrarPalabra(arregloPalabras);          //Invoco modulo para mostrar la palabra que esta en una posicion determinada
    }
    
    public static void cargarArreglo(String[] arreglo, int longitud) {
        //Declaracion de variable
        String palabra;
        
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese una palabra en la posicion "+i+": ");
            palabra = TecladoIn.readLineWord();
            arreglo[i] = palabra;
        }
    }
    
    public static void mostrarPalabra(String [] arreglo) {
        //Modulo para mostrar la palabra en cierta posicion 
        //Declaracion de variables
        int posicion;
        
        System.out.println("Ingrese la posicion a verificar: ");
        posicion = TecladoIn.readLineInt();
        
        if(posicion < 0 || posicion >= arreglo.length) {
            System.out.println("La posicion ingresada no es valida");
        }else {
            System.out.println("La palabra en la posicion "+posicion+" es: "+arreglo[posicion]);
        }
    }  
}
