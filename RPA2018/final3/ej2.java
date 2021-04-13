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
 * m elevado a la n es equivalente a multiplicar m por sí mismo n veces. 
 * Diseñe un algoritmo para llevar a cabo la potencia de la forma mencionada. 
 * Modularice convenientemente. Reúse el código del módulo anterior. 
 * Diseñe un algoritmo principal que invoque a este módulo. 
 * No se puede usar el operador *
 */
public class ej2 {
    //Se reutiliza el modulo del ej1
    public static int producto(int m, int n){
        int op = 0, i;
        for (i = 0; i < n;i++){
            op = op+m;
        }
        return op;
    }
    
    public static int potencia(int m, int n){
        //Este modulo retorna la potencia de base m y exponente n
        
        //Desclaracion de variables
        int op, aux, i;
        
        //Inicializacion de variables
        op = 0;
        aux = m;
       
        //Sea m = 9
        //Se suma 9 veces 9 si 9*9
        //Se suma (9*9) veces 9 si 9*9*9
        //Se suma (9*9*9) vecess 9 si 9*9*9*9
        //Se suma (9*9*9*9) veces 9 si 9*9*9*9*9
        for (i = 1; i < n; i++){
            op = producto(m, aux);
            aux = op;
        } 
        
        if (op == 0) {
            op = m;
        }
        return op;
    }
    
  
    public static void main(String[] args) {
        int m, n;
        System.out.println("Ingrese el valor de m");
        m = TecladoIn.readLineInt();
        System.out.println("Ingrese el valor de n");
        n = TecladoIn.readLineInt();
        
        System.out.println("El resultado es "+potencia(m, n));
        
    }
    
}
