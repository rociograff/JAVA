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
public class Ej4 {

    /*
    Diseñar un algoritmo que lea un arreglo de palabras y una cadena de caracteres. 
    El algoritmo debe mostrar la posición del arreglo en la cual se encuentra esa palabra,
    verificando que la misma exista en el arreglo. Por ejemplo, si el arreglo contiene [“que”,” lindo”,” día”] y
    la palabra leída es “día”, el algoritmo deberá mostrar el valor 2.
    Para el mismo arreglo, si la palabra leída es “fue”, se debe mostrar el valor -1.
     */
    public static void main(String[] args) {
        //Declaracion de variables
        String[] arregloPalabras;    //Declaracion del arreglo de Palabras
        int longitud;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arregloPalabras = new String[longitud];   //Creacion del arreglo de Palabras

        cargarArreglo(arregloPalabras, longitud);  //Invoco el modulo para cargar elementos en el arreglo de Palabras
        mostrarPosicion(arregloPalabras);
    }

    public static void cargarArreglo(String[] arreglo, int longitud) {
        //Declaracion de variable
        String palabra;

        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese una palabra en la posicion " + i + ": ");
            palabra = TecladoIn.readLineWord();
            arreglo[i] = palabra;
        }
    }

    public static void mostrarPosicion(String[] arreglo) {
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        int i = 0;
        String palabraAVerificar;
        boolean palabraEncontrada = false;

        System.out.println("Ingrese la palabra que desea verificar");
        palabraAVerificar = TecladoIn.readLine();

        //Estructura repetitiva que verifica si la palabra ingresada coincide con una dentro del arreglo
        while (continuar != false && i < arreglo.length) {
            if (arreglo[i].equalsIgnoreCase(palabraAVerificar)) { //Compara la palabra ingresada con la de la posicion actual
                System.out.println("La palabra " + palabraAVerificar + " se encuentra en la posicion " + i);
                continuar = false;
                palabraEncontrada = true;
            } else {
                palabraEncontrada = false;
                i++;
            }
        }
        if (palabraEncontrada == false) {
            System.out.println("La palabra " + palabraAVerificar + " no se encuentra en el arreglo");
        }
    }
}
