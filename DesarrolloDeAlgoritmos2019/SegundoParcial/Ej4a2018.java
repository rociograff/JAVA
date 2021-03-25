/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.SegundoParcial;

/**
 *
 * @author usuario
 */
/*
Especificar un algoritmo RECURSIVO para que dado en un numero entero determine la suma de sus digitos.
Por ej. la suma de los digitos del numero 43212 es 12
*/
public class Ej4a2018 {
    
    public static void main(String[] args) {
        int num = 43212;
        int suma = sumaDigitos(num);
        System.out.println(suma);
    }
    
    public static int sumaDigitos (int num) {
        int suma;
        
        if (num < 10) {
            suma = num;
        }else {
            suma = sumaDigitos(num / 10) + (num % 10);
        }
        return suma;
    }
    
}
