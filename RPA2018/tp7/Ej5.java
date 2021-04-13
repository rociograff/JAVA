/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.tp7;

import RPA2018.utiles.*;

/**
 *
 * @author usuario
 */
public class Ej5 {
    
    //Modulo 1
    public static double calculoSuperficie(double altura, double radio) {
        //Modulo que calcula la superficie de un cilindro
        
        //Declaracion de variable
        double pi;
        double sup;
        
        //Inicializacion de variable
        pi = 3.14;
        sup = 0;
        
        //Aplicacion de la formula
        sup = 2*pi*radio*radio+2*pi*radio*altura;
        
        return sup;
    }
    
    //Modulo 2
    public static double calculoCantPintura (double rendimiento, double superficie){
        //Modulo que calcula la cantidad de pintura
        
        //Zona declaracion de variable
        double cantPintura;
        
        //Inicializacion de variable
        cantPintura = superficie/rendimiento;
        
        return cantPintura;
    }
    
    public static void main (String [] args) {
        //Este algoritmo determina la cantidad de pintura necesaria
        
        //Zona declaracion de variables
        double superficie, rendimiento, altura, radio;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese las dimensiones del tanque");
        System.out.println("Ingrese la altura");
        altura = TecladoIn.readLineDouble();
        System.out.println("Ingrese el radio");
        radio = TecladoIn.readLineDouble();
        
        System.out.println("Ingrese el rendimiento de la pintura");
        rendimiento = TecladoIn.readLineDouble();
        
        //Determinar la cantidad de pintura necesaria
        System.out.println("La cantidad de pintura es: "+calculoCantPintura(rendimiento, calculoSuperficie(altura, radio))+" lts");
        
        
        
    }
    
}
