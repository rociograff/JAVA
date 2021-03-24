/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursividadParaFinal;

/**
 *
 * @author Rocio Graff
 */

/*
Sumar los elementos de un vector de enteros. 
 */
public class Ej13 {

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4};
        int longitud;
        
        longitud = v.length - 1;
        
        System.out.println(sumar(v, longitud));
    }
    
    public static int sumar(int[] v, int n) {
        int suma;
        
        if(n == 0) {
            suma = v[n];
        }else {
            suma = sumar(v, n - 1) + v[n];
        }
        
        return suma;
    }

}
