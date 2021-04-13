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
public class Ej6 {
    
    public static int calculo (int nota) {
        //Modulo que calcula la calificacion de un examen
        
        //Declaracion de variable
        int total, resMal;
        
        //Incializacion de variable
        resMal = 5 - nota;
        total = (nota*2) - resMal;
        
        if (total < 0) {
            System.out.println("La nota es de 0");
            total = 0;
        }else {
            System.out.println("La nota es de "+total);
        }
        return total;
    }
    
    public static void main (String [] args) {
        //Este algoritmo muestra la calificacion obtenida de cada examen
        
        //Declaracion de variables
        int contador, calif;
        double promedio;
        char seguir;
        
        //Inicializacion de variables
        promedio = 0;
        contador = 0;
        
        do {
            System.out.println("Ingrese la cantidad de respuestas correctas");
            calif = TecladoIn.readLineInt();
            contador++;
            promedio = promedio + calculo(calif);
            System.out.println("Desea seguir? s/n");
            seguir = TecladoIn.readLineNonwhiteChar();
            
        }while (seguir == 's');
        
        //Calculo el promedio
        promedio = promedio/contador;
        
        //Devolucion de datos
        System.out.println("El promedio es de "+promedio);
        System.out.println("La cantidad de examenes entregados es "+contador);
    }
    
}
