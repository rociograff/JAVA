/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.RecursividadParaFinal;

/**
 *
 * @author Rocio Graff
 */

/*
Generar un número entero positivo M a partir de los dígitos en orden inverso de otro número entero positivo N.
Por ejemplo si N=123, se debe obtener M=321. 
 */
public class Ej3 {

    public static void main(String[] args) {
        int numero = 123;
        int numCifras = String.valueOf(numero).length();

        System.out.println(invertirNumero(numero, numCifras - 1));
    }

    public static int invertirNumero(int num, int pos) {
        int invertir;

        if (num < 10) {
            invertir = num;
        } else {
            invertir = num % 10 * (int) Math.pow(10, pos) + invertirNumero(num / 10, pos - 1);
        }
        return invertir;
    }

    private static int invertirNumero1(int numero) {
        //Modulo de invertir un numero iterativo
        int cifra, inverso = 0;
        while (numero != 0) {
            cifra = numero % 10;
            inverso = (inverso * 10) + cifra;
            numero /= 10;
        }
        return inverso;
    }

}
