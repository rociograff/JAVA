/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.tp8;

import RPA2018.utiles.*;

/**
 *
 * @author usuario
 */
public class Ej3bis {
    
      public static void main (String [] args) {
        //Este algoritmo permite desactivar una alarma
        
        //Declaracion de variable
        int numero, clave, contador;
        
        //Inicializacion de variable
        clave = 690105;
        contador = 0;
        
        //Zona de entrada y lectura de datos
        System.out.print("Ingrese el numero para desactivar la alarma: ");
        numero = TecladoIn.readLineInt();
        contador ++;                                 //Contador de la cantidad de intentos
        
        while (numero != clave) {
            System.out.println("Clave Incorrecta");
            System.out.print("Vuelva a ingresar el numero para desactivar la alarma: ");
            numero = TecladoIn.readLineInt();
            contador ++;                             //Contador de la cantidad de intentos
        }
        
        //Devolucion de datos
        System.out.println("Alarma Desactivada");
        System.out.println("Cantidad de intentos: "+contador);
        
    }  
    
}
