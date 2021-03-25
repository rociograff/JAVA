/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.SegundoParcial;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */
/*
Especificar un algoritmo recursivo que dada una secuencia de enteros ingresada por teclado y finalizada en 0
(el 0 no se considera parte de la secuencia), devuelva el menor elemento.
 */
public class Ej3b2019 {

    public static void main(String[] args) {
        int menor;

        menor = buscarMenor();
        
        System.out.println(menor);
    }

    public static int buscarMenor() {
        int num, retorno, menor;

        System.out.println("Ingrese un numero: ");
        num = TecladoIn.readLineInt();

        if (num == 0) {
            menor = 0;
        } else {
            retorno = buscarMenor();
            if (retorno == 0) {
                menor = num;
            } else {
                if (retorno <= num) {
                    menor = retorno;
                } else {
                    menor = num;
                }
            }
        }
        return menor;
    }

}
