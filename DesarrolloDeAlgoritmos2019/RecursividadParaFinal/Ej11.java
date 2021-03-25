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
Dado un número N y un dígito T, contar la cantidad de veces que aparece T en N.
Por ejemplo si N=13234 y T=3, el resultado debe ser 2.
 */
public class Ej11 {

    public static void main(String[] args) {
        int numero, numBuscado;

        System.out.println("Ingrese un numero: ");
        numero = TecladoIn.readLineInt();
        System.out.println("Ingrese el numero que busca: ");
        numBuscado = TecladoIn.readLineInt();
        
        System.out.println("El numero "+numBuscado+" aparece "+contarN(numero, numBuscado)+" veces.");
    }

    public static int contarN(int num, int digito) {
        int cantN = 0;
        //Caso Base
        if (num > 0) {
            if (num % 10 == digito) {
                cantN = 1 + contarN(num / 10, digito);   //Paso Recursivo
            } else {
                cantN = contarN(num / 10, digito);
            }
        }
        return cantN;
    }

}
