/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursividadParaFinal;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Sumar a con b, ambos enteros positivos, usando las primitivas sucesor y predecesor 
(se le suma 1 a a tantas veces como se le resta 1 a b)
*/
public class Ej17 {
    
    public static void main(String[] args) {
        int a, b;
        
        System.out.println("Ingrese el primer numero: ");
        a = TecladoIn.readLineInt();
        System.out.println("Ingrese el segundo numero: ");
        b = TecladoIn.readLineInt();
        
        System.out.println("El resultado es: "+sumar(a, b));
    }
    
    public static int sumar(int a, int b) {
        
        if(b == 0) {
        }else {
            a = 1 + sumar(a, b - 1);
        }
        return a;
    }
    
}
