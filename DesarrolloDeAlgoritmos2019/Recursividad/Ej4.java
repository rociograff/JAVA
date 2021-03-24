/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
 Escribir módulos recursivos en Java, realizando las respectivas trazas sobre el siguiente arreglo unidimensional
v = {12, 7, 0, -1, 8, 10} 
a) Dado un número entero n, devolver verdadero si n se encuentra en v y falso en caso contrario. Traza para n=8, n=6
b) Devolver el valor de verdad en una función que determine si los elementos del arreglo respetan un orden creciente o no.
 */
public class Ej4 {

    public static void main(String[] args) {
        int[] v = {12, 7, 0, -1, 8, 10};
        int numBuscado, longitud;
        boolean encontrado, creciente;

        longitud = v.length - 1;

        System.out.println("Ingrese el numero que desea buscar: ");
        numBuscado = TecladoIn.readLineInt();

        encontrado = buscarNumero(v, numBuscado, longitud);
        System.out.println(encontrado);

        creciente = esCreciente(v, longitud);
        System.out.println(creciente);
    }

    public static boolean buscarNumero(int[] v, int numBuscado, int longitud) {
        boolean encontrado;
        //Caso Base
        if (longitud == 0 && v[longitud] != numBuscado) {
            encontrado = false;
        }else {
            if (v[longitud] == numBuscado) {
                encontrado = true;
            }else {
                encontrado = buscarNumero(v, numBuscado, longitud - 1);
            }
        }
        return encontrado;
    }

    public static boolean esCreciente(int[] v, int longitud) {
        boolean creciente;
        //Caso Base
        if (longitud == 0) {
            creciente = true;
        }else {
            creciente = v[longitud] > v[longitud - 1] && esCreciente(v, longitud - 1);
        }
        return creciente;
    }

}
