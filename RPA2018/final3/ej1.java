/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final3;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */

/**
 * Multiplicar m por n es equivalente a sumar m por sí mismo n veces. 
 * Diseñe un algoritmo en pseudocódigo para llevar a cabo la multiplicación de la forma mencionada. 
 * Modularice convenientemente. Diseñe un algoritmo principal que solicite al usuario dos números enteros
 * e invoque al modulo desarrollado.
*/
public class ej1 {
    
    public static int producto(int m, int n){
        int op = 0, i;
        for (i = 0; i < n; i++){
            op = op + m;
        }
        return op;
    }
    
    
      public static void main(String[] args) {
        int m, n;
        System.out.println("Ingrese el valor de m");
        m = TecladoIn.readLineInt();
        System.out.println("Ingrese el valor de n");
        n = TecladoIn.readLineInt();
        
        System.out.println("El resultado es "+producto(m, n));
    }
}
