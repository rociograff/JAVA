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
public class Ej4 {
    
    public static double calculoCosto (double kg) {
        //Modulo para calcular el costo total
        
        //Declaracion de variable
        double costoTotal, costoEnvio, costoSeguro;
        
        //Inicializacion de variable
        costoEnvio = 50;
        costoSeguro = 30;
        
        //Aplicar formula
        costoTotal = kg*costoEnvio+costoSeguro;
        
        return costoTotal;
    }
    
    public static void main (String [] args) {
        //Este algoritmo imprime el monto a cobrar de cada envio
        
        //Declaracion de variables
        double peso, costo, total;
        int cant;
        
        //Inicializacion de variable 
        total = 0;
        cant = 0;
        
        do {
            cant ++;                                    //Contador de la cantidad de envios
            System.out.println("Ingrese el peso");
            peso = TecladoIn.readDouble();
            costo = calculoCosto(peso);                 //Invoco el modulo
            total = total + costo;         
        }while (peso != 0);
        cant --;                                        //Contador de la cantidad de envios
        
        //Devlucion de datos
        System.out.println("El costo a abonar es de: "+total);
        System.out.println("La cantidad de envios fueron: "+cant);
        
    }
    
}
