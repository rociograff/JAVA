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
public class Ej5bis {
    
    public static void main (String [] args) {
        //Este algoritmo muestra cual es el numero menor
        
        //Declaracion de variable
        int cant, menor, n, i;
        
        //Inicializacion de variable
        menor = 100;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese la cantidad de numeros enteros");
        cant = TecladoIn.readLineInt();
        
        for (i = 0; i < cant; i++) {
            System.out.println("Ingrese un numero");
            n = TecladoIn.readLineInt();
            
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("El numero mas chico es: "+menor);
    }
    
}
