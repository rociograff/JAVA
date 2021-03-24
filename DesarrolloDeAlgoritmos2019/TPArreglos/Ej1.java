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
 * Diseñar un algoritmo que lea un arreglo de caracteres solicitando al usuario
 * que ingrese letras. El algoritmo deberá verificar que los caracteres
 * ingresados son letras. Luego diseñar módulos que realicen las siguientes
 * tareas a las cuales se pueda acceder mediante un menú de opciones: a) Mostrar
 * por pantalla los caracteres de las posiciones pares del arreglo. b) Mostrar
 * por pantalla los caracteres del arreglo en orden inverso. c) Contar cuántas
 * veces aparece un carácter dado ingresado por teclado.
 */
public class Ej1 {

    public static void main(String[] args) {
        //Declaracion de variables
        char[] arregloCaracter;  //Declaracion del arreglo de Caracteres
        int longitud, i;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arregloCaracter = new char[longitud];  //Creacion del arreglo de Caracteres con la longitud que deseo

        cargarArreglo(arregloCaracter, longitud);   //Invoco el modulo para cargar los elementos del arreglo de Caracteres

        //Muestro el arreglo original
        System.out.println("Muestro arreglo original: ");
        for (i = 0; i < arregloCaracter.length; i++) {
            System.out.print(arregloCaracter[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Posiciones pares: ");
        posicionesPares(arregloCaracter, longitud);  //Invoco el modulo para mostrar las posiciones pares de los elementos
        System.out.println(" ");
        System.out.println("El arreglo invertido queda: ");
        invertirArreglo(arregloCaracter);           //Invoco el modulo para mostrar el arreglo invertido
        System.out.println(" ");
        contarLetras(arregloCaracter);              //Invoco el modulo para contar las letras

    }

    public static void cargarArreglo(char[] arreglo, int longitud) {
        //Modulo para cargar los elementos del arreglo de Caracteres
        boolean continuar = true, esValido;
        int i = 0;

        while (continuar != false) {
            esValido = true;
            //Ingreso elemento por elemento en el arreglo de numeros enteros
            while (esValido != false && i < arreglo.length) {
                System.out.print("Ingrese un elemento para el arreglo en la posicion " + i + ": ");
                arreglo[i] = TecladoIn.readLineNonwhiteChar();
                //Verifica que el caracter ingresado sea una letra
                if (!Character.isLetter(arreglo[i])) {
                    System.out.println("El caracter ingresado no es valido");
                    i = 0;
                    esValido = false;
                    continuar = true;
                } else {
                    i++;
                    continuar = false;
                }
            }
        }
    }

    public static void posicionesPares(char[] arreglo, int longitud) {
        //Modulo para verificar la posicion de los elementos pares
        for (int i = 0; i < arreglo.length; i = i + 2) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static void invertirArreglo(char[] arreglo) {
        //Declaracion e inicializacion de variables
        int longitud = arreglo.length;
        char[] letrasInvertidas = new char[longitud];
        char letra;
        int j = 0;

        //Estructura repetitiva que recorre el arreglo de atras hacia adelante invirtiendo el orden de las letras
        for (int i = arreglo.length - 1; i >= 0; i--) {
            letra = arreglo[i];
            letrasInvertidas[j] = letra;
            j++;
        }
        System.out.println(letrasInvertidas + " ");
    }

    public static void contarLetras(char[] arreglo) {
        //Declaracion e inicializacion de variables
        char letra;
        int contador = 0;

        System.out.println("Ingrese una letra a verificar: ");
        letra = TecladoIn.readNonwhiteChar();

        //Estructura repetitiva que recorre el arreglo buscando la letra a verificar
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == letra) { //Verifica si las letras en las posiciones del arreglo son iguales a la letra ingresada
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' se repite " + contador + " veces");
    }
}
