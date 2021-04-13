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
public class Ej9 {
    
      public static int calculoFactorial (int numero) {
        //Modulo que calculo el factorial de un numero
        
        //Declaracion de variable
        int i, factorial;
        
        //Inicializacion de variable
        factorial = 1;
        
        for (i = 1; i <= numero; i++) {           
            factorial = factorial * i;
        }
        return factorial;
    }
    
    public static void main (String [] args) {
        //Este algoritmo determina el factorial de un numero 
        
        //Declaracion de variable
        int numero, i, factorial;
        
        //Entrada y lectura de datos
        System.out.println("Ingrese un numero");
        numero = TecladoIn.readLineInt();
        
        //Devolucion de datos
        System.out.println("El resultado es: "+calculoFactorial(numero));
             
        
    }
    
}
