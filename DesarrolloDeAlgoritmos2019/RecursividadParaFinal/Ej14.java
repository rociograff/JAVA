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
Calcular el Máximo Común Divisor de dos números usando el algoritmo de Euclides. Realice la traza con 65 y 22.
 */
public class Ej14 {

    public static void main(String[] args) {
        int a, b;

        System.out.println("Ingrese el primero numero: ");
        a = TecladoIn.readLineInt();
        System.out.println("Ingrese el segundo numero: ");
        b = TecladoIn.readLineInt();
        
        System.out.println("El maximo comun divisor entre a y b es: "+maximoComunDivisor(a, b));

    }

    public static int maximoComunDivisor(int a, int b) {
        //Modulo para calcular el maximo comun divisor por algoritmo de euclides
        int mcd;
        
        if (b == 0) {
            mcd = a;
        } else {
            mcd = maximoComunDivisor(b, a % b);
        }
        
        return mcd;
    }
    
}
