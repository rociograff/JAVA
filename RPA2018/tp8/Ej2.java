/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej2 {
    
    public static void main (String [] args) {
        //Este algoritmo imprime los numeros ordenados de manera decreciente
        
        //Declaracion de variable
        int n;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese un numero");
        n = TecladoIn.readLineInt();
        
        while (n >= 1) {
            System.out.print(n+" ");
            n = n - 1;
      
        }
    }
    
}
