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
 * Diseñe un algortimo para leer letras y trabajar sobre el número que representa su correspondiente código ASCII
 * y en base a ello muestre: 
 * Se debe mostrar un cartel si la cadena ingresada es válida, y otro cartel mostrando la cadena original y la cadena encriptada.
 */
public class Ej6 {

    /**
     * Se desea encriptar un mensaje, ingresado en una cadena de caracteres que sólo puede contener letras. 
     * El método consiste en cambiar las vocales por los siguientes símbolos: *, /, +, - y #
     * @param ch
     * @return el nuevo caracter modificado con los simbolos
     */
    public static char encriptar(char ch) {
        //Declaracion e inicializacion de variables
        char nuevoCh = 0;

        switch (ch) {
            case 'A':
                nuevoCh = '*';
                break;
            case 'E':
                nuevoCh = '/';
                break;
            case 'I':
                nuevoCh = '+';
                break;
            case 'O':
                nuevoCh = '-';
                break;
            case 'U':
                nuevoCh = '#';
                break;
        }
        return nuevoCh;
    }
    
    // (a) Promedio general.
    public static int promedioGeneral(char[] arreglo, char ch, int longitud) {
        //Declaracion e inicializacion de variables
        int i, cantElem = 0, promedio;

        for (i = 0; i < longitud; i++) {
            if (Character.isLetter(ch)) {    //Me interesan los numeros
                cantElem++;   //Sumo los elementos
            }
        }
        promedio = cantElem / longitud;
        return promedio;
    }

    // (b) el caracter que representa el primer código ASCII par.
    public static char primerCodPar(char[] arreglo,int longitud) {
        int numAscii, i = 0;
        boolean codPar = false;
        char ch = 0;

        while (!codPar && i < longitud) {
            numAscii = arreglo[i];
            if (esPar(numAscii)) {   //Si el cod ascii del caracter del arreglo en la posicion i es par retorna true
                codPar = true;
                ch = arreglo[i];
            }
            i++;
        }
        return ch;
    }

    // (c) una cadena de caracteres formada por todos los ASCII pares.
    public static String pares(char[] arreglo, int longitud) {
        int numAscii, i = 0;
        boolean codPar = false;
        String cadena = null;

        while (!codPar && i < longitud) {
            numAscii = arreglo[i];
            if (esPar(numAscii)) {   //Si el cod ascii del caracter del arreglo en la posicion i es par retorna true
                codPar = true;
                cadena = cadena + arreglo[i];
            }
            i++;
        }
        return cadena;
    }

    // (d) una cadena de caracteres formada por todos los ASCII impares.
    public static String impares(char[] arreglo, int longitud) {
        int numAscii, i = 0;
        boolean codPar = false;
        String cadena = null;

        while (!codPar && i < longitud) {
            numAscii = arreglo[i];
            if (!esPar(numAscii)) {   //Si el cod ascii del caracter del arreglo en la posicion i  no es par retorna true
                codPar = true;
                cadena = cadena + arreglo[i];
            }
            i++;
        }
        return cadena;
    }

    // (e) qué porcentaje de letras respecto del total de letras ingresadas, tienen código ASCII par.
    public static double porcentajePar(char[] arreglo, int longitud) {
        int i, cantPares = 0, cantNumeros = 0;
        double porcentPares;

        for (i = 0; i < longitud; i++) {
            if (Character.isLetter(arreglo[i])) {
                cantPares = cantPares + 0;
            } else {
                if ((arreglo[i] % 2) == 0) {
                    cantPares++;
                    cantNumeros++;
                } else {
                    cantNumeros++;
                }
            }
        }

        porcentPares = (cantPares * 100) / cantNumeros;

        return porcentPares;
    }

    // (f) qué porcentaje de letras respecto del total de letras ingresadas, tienen código ASCII impar.
    public static double porcentajeImpar(char[] arreglo, int longitud) {
        int i, cantImpares = 0, cantNumeros = 0;
        double porcentImpares;

        for (i = 0; i < longitud; i++) {
            if (Character.isLetter(arreglo[i])) {
                cantImpares = cantImpares + 0;
            } else {
                if ((arreglo[i] % 2) == 1) {
                    cantImpares++;
                    cantNumeros++;
                } else {
                    cantNumeros++;
                }
            }
        }

        porcentImpares = (cantImpares * 100) / cantNumeros;

        return porcentImpares;
    }

    public static void main(String[] args) {
        //Declaracion de variables
        char[] arregloCaracter = null;
        char ch = 0;
        int i, cantElem;

        System.out.print("Ingrese la cantidad de elementos: ");
        cantElem = TecladoIn.readLineInt();

        for (i = 0; i <= cantElem - 1; i++) {
            System.out.print("Ingrese un elemento para la posicion " + i+": ");
            ch = TecladoIn.readLineNonwhiteChar();
        }
        
        //Invoco los modulos
        System.out.println("Cartel encriptado "+encriptar(ch));
        System.out.println("El promedio general es: "+promedioGeneral(arregloCaracter, ch, cantElem));
        System.out.println("El primer caracter que representa el cod ASCII par es: "+primerCodPar(arregloCaracter, cantElem));
        System.out.println("Cdena formada por todos los ASCII pares: "+pares(arregloCaracter, cantElem));
        System.out.println("Cadena formada por todos los ASCII impares: "+impares(arregloCaracter, cantElem));
        System.out.println("Porcentaje de los ASCII pares: "+porcentajePar(arregloCaracter, cantElem));
        System.out.println("Porcentaje de los ASCII impares: "+porcentajeImpar(arregloCaracter, cantElem));

    }

    public static boolean esPar(int numAscii) {
        //Este modulo verifica si un numero es par o impar
        boolean par;
        par = numAscii % 2 == 0;
        return par;
    }

}
