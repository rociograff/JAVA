/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.tp10;

import RPA2018.utiles.*;

/**
 *
 * @author usuario
 */
public class ej1 {
        
    public static void main (String [] args) {
        //Este algoritmo verifica si una oracion tiene un determinado caracter
        
        //Declaracion de variables
        String oracion, oracion2;
        char caracter, caracter2;
        int i = 0, letrasOracion;
        
        //Entrada y lectura de datos
        System.out.println("Ingrese una oracion");
        oracion = TecladoIn.readLine();
    
        System.out.println("Ingrese el caracter a verificar");
        caracter = TecladoIn.readLineNonwhiteChar();
        
        oracion2 = oracion.trim();   //Remueve los espacios
        letrasOracion = oracion.length();   //Longitud de la oracion 
    
        while (i <= letrasOracion - 1){
            caracter2 = oracion.charAt(i);  //Determina la posicion del caracter
            if (caracter2 == caracter) {
               System.out.println("El caracter existe en la oracion");
            }else {
               System.out.println("El caracter no existe");
            }
            i = i + 1;  //verificando letra por letra
        }
    }
}
