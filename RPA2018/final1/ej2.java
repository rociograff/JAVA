/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.final1;

import RPA2018.utiles.*;

/**
 *
 * @author usuario
 */

/**
 * Levamisol Gotas es un desparasitante oral para perros o gatos. 
 * Se recomienda administrar una dosis de 10 gotas (10 mg de Levamisol) por cada kg de peso vivo a caninos o 5 gotas 
 * (5 mg de Levamisol) por cada kg de peso vivo a felinos.  
 *  a)Diseñe un módulo que recibe por parámetro el tipo (perro o gato) y peso del animal. 
 *   Devuelve la dosis recomendada para ese animal expresada en gotas.
 *  b)Diseñe un algoritmo principal que invoque al módulo desarrollado en el inciso a) para determinar 
 *  la dosis recomendada para cada animal de un grupo de mascotas. 
 *  c)Realice una traza (sencilla, clara y completa) de su algoritmo para el siguiente grupo de mascotas: 
 *   perro de 4kg, perro de 8kg, gato de 1k y perro de 2 kg.
 */
public class ej2 {
    
    public static double dosis (char tipo, double peso) {
        /**
         * Este modulo devuelve la dosis recomendada expresado en gotas
         * tipo: se recibe el parametro como caracter
         * peso: se recibe el parametro como real
         */
        
        //Declaracion de variables
        double gotas;
        
        gotas = 0;
        
        if (tipo == 'p'){
            gotas = peso * 10;
        }
        else{
            if (tipo == 'g'){
                gotas = peso * 5;
            }else {
                if (tipo != 'p' && tipo != 'g'){
                    System.out.println("Error");
                }
            }
        }
        
        return gotas;    
    }
    
    //Algoritmo principal
    public static void main (String [] args){
        //Este algoritmo determina la dosis recomendada para un grupo de animales
        
        //Declaracion de variables
        char tipo, seguir;
        double peso, cantGotas;
         
        do {
            System.out.println("Ingrese el tipo del animal");
            tipo = TecladoIn.readLineNonwhiteChar();      
            System.out.println("Ingrese el peso del animal");
            peso = TecladoIn.readLineDouble();
            
            cantGotas = dosis(tipo, peso);      //Invoco el modulo
            
            System.out.println("Se necesitan "+cantGotas+" gotas");
            
            System.out.println("Desea continuar?, responder con s/n");
            seguir = TecladoIn.readLineNonwhiteChar();
        }
        while(seguir == 's');
            
    }
    
}
