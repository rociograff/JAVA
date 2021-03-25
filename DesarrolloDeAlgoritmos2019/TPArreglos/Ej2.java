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
public class Ej2 {

    public static void menu() {
        System.out.println("Ingrese la opcion que corresponda: ");
        System.out.println("(0) Terminar");
        System.out.println("(1) Contar cuantos de los numeros almacenados son pares.");
        System.out.println("(2) Realizar la sumatoria de los valores del arreglo.");
        System.out.println("(3) Verificar si un numero dado se encuentra en el arreglo.");
        System.out.println("(4) Indicar la posicion del menor valor almacenado.");
        System.out.println("(5) Indicar el mayor valor almacenado.");
        System.out.println("(6) Calcular el promedio de los valores del arreglo.");
        System.out.println("(7) Calcular el promedio de la primera mitad del arreglo por un lado y de la segunda mitad del arreglo por otro.");
    }

    public static void main(String[] args) {
        //Declaraciones de variables
        int[] arregloNumero;    //Declaracion de un arreglo de Numeros Enteros
        int i, longitud, opcion;
        boolean terminar = false;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arregloNumero = new int[longitud]; //Creacion del arreglo de Numeros Enteros

        cargarArreglo(arregloNumero, longitud);   //Invoco el modulo de cargar arreglo 

        while (!terminar) {
            menu();         //Menu de opciones 
            opcion = TecladoIn.readLineInt();
            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    contarNumPares(arregloNumero);
                    break;
                case 2:
                    sumatoria(arregloNumero);
                    break;
                case 3:
                    buscarNumero(arregloNumero);
                    break;
                case 4:
                    posMenorValor(arregloNumero);
                    break;
                case 5:
                    mayorValor(arregloNumero);
                    break;
                case 6:
                    promedioArreglo(arregloNumero);
                    break;
                case 7:
                    promedioPorMitades(arregloNumero);
                    break;
            }
        }
    }

    public static void cargarArreglo(int[] arreglo, int longitud) {
        //Modulo para cargar elemento por elemento en el arreglo de Numeros Enteros
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese un elemento en la posicion " + i + ": ");
            arreglo[i] = TecladoIn.readLineInt();
        }
    }

    public static void contarNumPares(int[] arreglo) {
        //Declaracion de variables
        int contador = 0;

        //Estructura repetitiva que recorre el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) { //Verifica si hay numeros pares dentro del arreglo
                contador++;
            }
        }
        System.out.println("Hay " + contador + " numeros pares");
    }

    public static void sumatoria(int[] arreglo) {
        //Declaracion e inicializacion de variables
        int contador = 0;

        //Estructura repetitiva que recorre el arreglo y suma todos los valores
        for (int i = 0; i < arreglo.length; i++) {
            contador = contador + arreglo[i];
        }
        System.out.println("La sumatoria de los numeros es de: " + contador);
    }

    public static void buscarNumero(int[] arreglo) {
        //Declaracion e inicializacion de variables
        int numero, i = 0;
        boolean continuar = true;
        boolean numeroEncontrado = false;

        System.out.println("Ingrese el numero que desea verificar");
        numero = TecladoIn.readInt();

        //Estructura repetitiva que recorre el arreglo buscando el valor ingresado hasta encontrarlo o verificar que no existe
        while (i < arreglo.length && continuar != false) {
            if (numero == arreglo[i]) { //Compara el numero a verificar con los numeros en cada posicion
                System.out.println("El numero " + numero + " se encuentra en la posicion " + i);
                continuar = false; //Si encuentra el numero termina la busqueda
                numeroEncontrado = true;
            } else {
                i++;
                numeroEncontrado = false;
            }
        }
        if (numeroEncontrado == false) { //Si no encuentra el numero imprime un cartel avisando que no existe en el arreglo
            System.out.println("El numero no se encuentra dentro del arreglo");
        }
    }

    public static void posMenorValor(int[] arreglo) {
        //Declaracion e inicializacion de variables
        int menorValor, posicionMenorValor = 0;
        int i = 0;
        menorValor = arreglo[i];

        //Estructura repetitiva que recorre el arreglo buscando el menor valor
        for (i = 0; i < arreglo.length; i++) {
            if (menorValor > arreglo[i]) { //Verifica si hay un numero menor al ya existente
                menorValor = arreglo[i]; //Asigna el valor menor
                posicionMenorValor = i; //Guarda la posicion en la que se encuentra el menor valor
            }
        }
        System.out.println("El menor valor " + menorValor + " se encuentra en la posicion " + posicionMenorValor);
    }

    public static void mayorValor(int[] arreglo) {
        //Declaracion e inicializacion de variables
        int mayorValor, i = 0;
        mayorValor = arreglo[i];

        for (i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > mayorValor) {
                mayorValor = arreglo[i];
            }
        }
        System.out.println("El mayor valor es: " + mayorValor);
    }

    public static void promedioArreglo(int[] arreglo) {
        //Declaracion e inicializacion de variables
        int contador = 0, cantPosiciones = 0, promedio;

        //Estructura repetitiva que suma los valores del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            contador = contador + arreglo[i];
            cantPosiciones++;
        }
        promedio = contador / cantPosiciones; //Se calcula el promedio total del arreglo
        System.out.println("El numero promedio del arreglo es: " + promedio);
    }

    public static void promedioPorMitades(int[] arreglo) {
        //Declaracion e inicializacion de variables
        int contador = 0, contador2 = 0, cantPosiciones = 0, cantPosiciones2 = 0;
        double promedio1, promedio2;

        //Estructura repetitiva que suma los valores de la primera mitad del arreglo
        for (int i = 0; i < arreglo.length / 2; i++) {
            contador = contador + arreglo[i];
            cantPosiciones++;
        }

        //Estructura repetitiva que suma los valores de la segunda mitad del arreglo
        for (int j = arreglo.length / 2; j < arreglo.length; j++) {
            contador2 = contador2 + arreglo[j];
            cantPosiciones2++;
        }
        promedio1 = contador / cantPosiciones; //Se calcula el promedio de la primera mitad del arreglo
        promedio2 = contador2 / cantPosiciones2; //Se calcula el promedio de la segunda mitad del arreglo

        if (promedio1 > promedio2) { //Verifica que mitad tiene el promedio mas alto o, en su defecto, si son iguales
            System.out.println("El promedio de la primera mitad (" + promedio1 + ") es mayor al de la segunda (" + promedio2 + ")");
        } else if (promedio2 > promedio1) {
            System.out.println("El promedio de la segunda mitad (" + promedio2 + ") es mayor al de la primera (" + promedio1 + ")");
        } else {
            System.out.println("Los promedios son iguales");
        }
    }
}
