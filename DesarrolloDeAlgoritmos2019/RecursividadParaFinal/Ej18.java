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
Calcular el n-esimo término de la sucesión de Fibonacci. 
 */
public class Ej18 {
    
    public static void main(String[] args) {
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = TecladoIn.readLineInt();
        
        System.out.println(fibonaci(numero));
    }

    public static int fibonaci(int n) {
        int serie;
        
        if (n == 1 || n == 2) {
            serie = 1;
        } else {
            serie = fibonaci(n - 1) + fibonaci(n - 2);
        }
        return serie;
    }
}
