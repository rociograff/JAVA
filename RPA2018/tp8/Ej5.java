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
public class Ej5 {
    
  public static void main (String [] args) {
      //Este modulo muestra cual es el numero mayor
      
     //Declaracion de variables
     int cant, mayor, i, n;
     
     //Inicializacion de variable
     mayor = 0;
     
     //Zona de entrada y lectura de datos
     System.out.println("Ingrese la cantidad de numero enteros");
     cant = TecladoIn.readLineInt();
     
     for (i = 0; i < cant; i++) {
         System.out.println("Ingrese un numero");
         n = TecladoIn.readLineInt();
         
         if (n > mayor) {
             mayor = n;
         }
        }
     System.out.println("El valor ingresado mas grande es: "+mayor);
    }
    
}
