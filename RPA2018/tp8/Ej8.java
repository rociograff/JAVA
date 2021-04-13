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
public class Ej8 {
    
    public static boolean vocal (char letra) {
        //Este modulo determina si un caracter es una vocal
        
        //Declaracion de variables
        boolean res;
        
        switch (letra) {
            case 'a':
                res = true;
                break;
                
            case 'e':
                res = true;
                break;
                
            case 'i':
                res = true;
                break;
                
            case 'o':
                res = true;
                break;
                
            case 'u':
                res = true;
                break;
                
            default:
                res = false;
        }
        return res;
    }
    
    public static void main (String [] args) {
        //Este algoritmo determina si se trata de una consonante o vocal
        
        //Declaracion de variables
        char carac, seguir;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese el primer caracter");
        carac = TecladoIn.readLineNonwhiteChar();
        
        do {
            if (vocal(carac)) {
                System.out.println("Es una vocal");
            }else {
                System.out.println("Es una consonante");
            }
            
            System.out.println("Desea seguir?, responder con s/n");
            seguir = TecladoIn.readLineNonwhiteChar();
            System.out.println("Ingrese otro caracter");
            carac = TecladoIn.readLineNonwhiteChar();
           
        }while (seguir == 's');
        
    }
    
    
    
}
