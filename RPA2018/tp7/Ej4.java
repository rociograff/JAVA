/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej4 {
    
    //Modulo 1
    public static double conversionACelsius (double gF) {
        //Modulo que convierte de grados Fahrenheit a Celsius
        
        //Declaracion de variable
        double gC;
        
        //Aplicar conversion 
        gC = (gF - 32)/1.8;
        
        return gC;
    }
    
    //Modulo 2
    public static double conversionAFahrenheit (double gC) {
        //Modulo que convierte de grados Celsius a Fahrenheit 
        
        //Declaracion de variable
        double gF;
        
        //Aplicar conversion 
        gF = 1.8*gC + 32;
        
        return gF;
    }
    
    public static void main (String [] args) {
        //Este algoritmo determina cual temperatura es mayor y muestra el resultado en las dos unidades
        
        //Zona declaracion de variable
        double gF, gC;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese la temperatura en grados Celsius");
        gC = TecladoIn.readLineDouble();
        
        System.out.println("Ingrese la temperatura en grados Fahrenheit");
        gF = TecladoIn.readLineDouble();
        
        //Determinar cual es mayor
        if (conversionACelsius(gF)>gC){
            System.out.println("El mayor es: "+conversionACelsius(gF));
        }else{
            System.out.println("El mayor es: "+gC);
        }
        
        //Mostrar el resultado
        System.out.println("De "+gC+" grados Celsius a Fahrenheit: "+conversionAFahrenheit(gC));
        System.out.println("De "+gF+" grados Fahrenheit a Celsius: "+conversionACelsius(gF));
        
    }
    
}
