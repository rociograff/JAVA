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
public class ej2 {
    
    //Modulo 1
    public static int esLetra (String oracion) {
        //Este modoulo verifica la cantidad de letras
        
        //Declaracion de variables
        int cantLetras = 0, i;
        
        for (i = 0; i <= oracion.length() - 1; i++) {
            if (Character.isLetter(oracion.charAt(i))) {
                cantLetras++;
            }
        }
        return cantLetras;
    }
    
    //Modulo 2
    public static int esDigito (String oracion) {
        //Este modulo verifica la cantidad de digitos
        
        //Declaracion de variables
        int cantDigitos = 0, i;
        
        for (i = 0; i <= oracion.length() - 1; i++) {
            if (Character.isDigit(oracion.charAt(i))) {
                cantDigitos++;
            }
        }
        return cantDigitos;
    }
    
    
    public static void main (String [] args) {
        //Este algoritmo permite contar la cantidad de letras y digitos 
        
        //Declaracion de variables
        String oracion;
        
        //Entrada y lectura de datos
        System.out.println("Ingrese la oracion");
        oracion = TecladoIn.readLine(); 
        
        //Devolucion de datos
        System.out.println("La cantidad de letras que tiene la oracion son "+esLetra(oracion));
        System.out.println("La cantidad de digitos que tiene la oracion son "+esDigito(oracion));
        
    }
    
}
