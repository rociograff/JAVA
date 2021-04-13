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
public class Ej3 {
    
    public static void main (String [] args) {
        //Este algoritmo permite desactivar una alarma
        
        //Declaracion de variable
        int numero, clave, contador;
        
        //Inicializacion de variable
        clave = 690105;
        contador = 0;
        
        do  {
            System.out.print("Ingrese el numero para desactivar la alarma: ");
            numero = TecladoIn.readLineInt();
            contador ++;                                //Contador de la cantidad de intentos
        }
        while (numero != clave);
        
        //Devolucion de datos
        System.out.println("Alarma Desactivada");
        System.out.println("Cantidad de intentos: "+contador);
    }
       
}
   
