/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Recursividad;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Dada una secuencia de caracteres (finalizada en “.”) ingresada por teclado, escribir planteos recursivos, 
desarrollar sus correspondientes métodos y realizar la traza de cada inciso: 
a) Mostrar en orden inverso todos los caracteres de la secuencia distintos a un caracter dado.
b) Determinar la cantidad de veces que aparece un carácter dado en la secuencia.
 */
public class Ej6 {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar");
        System.out.println("(1) Inciso A");
        System.out.println("(2) Inciso B");
    }

    public static void main(String[] args) {
        String palabra, palabraInvertida;
        boolean terminar = false;
        int opcion, longitud;
        char caracter, contCarac;

        System.out.println("Ingrese una palabra: ");
        palabra = TecladoIn.readLine();
        
        longitud = palabra.length() - 1;

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                /*
                case 1:
                    System.out.println("Ingrese la palabra");
                    palabra = TecladoIn.readLine();
                    System.out.println("Ingrese el caracter a buscar");
                    caract = TecladoIn.readLineNonwhiteChar();
                    if (palabra.charAt(palabra.length() - 1) == '.') {
                        n = palabra.length() - 1;
                        invertida = mostrarCaracteres(palabra, n, caract);
                    } else {
                        palabra = palabra + '.';
                        n = palabra.length() - 1;
                        invertida = mostrarCaracteres(palabra, n, caract);
                    }
                    System.out.println(invertida);
                    break;
                 */
                case 1:
                    palabraInvertida = secuenciaInvertida(palabra);
                    System.out.println(palabraInvertida);
                    break;
                case 2:
                    System.out.println("Ingrese el caracter buscado: ");
                    caracter = TecladoIn.readLineNonwhiteChar();
                    System.out.println(contarCaracter(palabra, caracter, longitud));
                    break;
                    
            }
        }
    }

    public static String secuenciaInvertida(String palabra) {
        String res;
        //Caso Base
        if (palabra.substring(0, 1).equals(".")) {
            res = "";
        } else {
            res = secuenciaInvertida(palabra.substring(1, palabra.length())) + palabra.substring(0, 1);   //Paso Recursivo
        }
        return res;
    }
    /*
    public static String mostrarCaracteres(String p, int n, char buscado) {
        String res = "";

        if (n == 0) {
            if (p.charAt(n) == buscado) {
                res = "";
            } else {
                res = res + p.charAt(n);
            }
        } else {
            if (p.charAt(n) == buscado) {
                res = mostrarCaracteres(p, n - 1, buscado);
            } else {
                res = p.charAt(n) + mostrarCaracteres(p, n - 1, buscado);
            }
        }
        return res;
    }
     */
    
    public static int contarCaracter(String palabra, char caracter, int longitud) {
        //Determinar cuantas veces aparece un caracter en la cadena
        int contador = 0;
        //Caso Base 
        if (longitud == 0) {
            if (palabra.charAt(longitud) == caracter) {
                contador = 1;
            }
        } else {
            //Paso Recursivo
            if (palabra.charAt(longitud) == caracter) {
                contador = 1 + contarCaracter(palabra, caracter, longitud - 1);
            } else {
                contador = contarCaracter(palabra, caracter, longitud - 1);
            }
        }
        return contador;
    }

}
