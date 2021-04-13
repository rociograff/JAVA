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
public class ej1 {
    
    public static void main (String [] args) {
        //Este algoritmo imprime una tabla de multiplicar hasta el numero 10
        
        //Declaracion de variable
        int n, i, calculo;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese un numero");
        n = TecladoIn.readLineInt();
        
        //Incializacion de variable
        i = 0;
        
        while (i <=10) {
            calculo = n*i;
            System.out.println(n+" x "+i+" = "+calculo);
            i++;       //Suma de a uno para hacer la tabla
        }
    }
    
    
    
}
