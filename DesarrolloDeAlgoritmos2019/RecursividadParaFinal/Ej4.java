/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.RecursividadParaFinal;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Dado un arreglo de enteros, verificar si un número dado se encuentra en él.
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
    }

    public static boolean buscarNumero(int[] v, int numBuscado, int longitud) {
        boolean encontrado;
        //Caso Base
        if (longitud == 0 && v[longitud] != numBuscado) {
            encontrado = false;
        } else {
            if (v[longitud] == numBuscado) {
                encontrado = true;
            } else {
                encontrado = buscarNumero(v, numBuscado, longitud - 1);
            }
        }
        return encontrado;
    }

}
