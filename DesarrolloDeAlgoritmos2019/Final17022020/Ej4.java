/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final17022020;

/**
 *
 * @author Rocio Graff
 */

/*
Especificar un algoritmo recursivo para que dado en un numero entero, determine cuantos de sus digitos (numeros entre 0 y 9)
son iguales a 2 o 3. Por ej. el numero 43212 tiene 3 digitos igual a 2 o 3.
 */
public class Ej4 {

    public static void main(String[] args) {
        int numero = 43212;

        System.out.println("El numero tiene " + contarIguales(numero));

    }

    public static int contarIguales(int num) {
        int contador = 0;

        if (num < 10 && num > -10) {
            if (num == 2 || num == 3) {
                contador++;
            }
        } else {
            if (num % 10 == 2 || num % 10 == 3) {
                contador = contarIguales(num / 10) + 1;
            } else {
                contador = contarIguales(num / 10);
            }
        }
        return contador;
    }

}
