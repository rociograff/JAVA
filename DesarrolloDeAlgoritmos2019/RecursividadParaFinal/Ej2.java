/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.RecursividadParaFinal;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Mostrar por pantalla las letras de las posiciones pares de una palabra dada en orden inverso.
Por ejemplo si la palabra es diciembre, se debe mostrar ebecd, ya que el primer carácter está en la posición 0 que es par.
*/
public class Ej2 {
    
    public static void main(String[] args) {
        String cadena;
        
        System.out.println("Ingrese una cadena: ");
        cadena = TecladoIn.readLineWord();
        
        System.out.println(invertida(cadena, cadena.length() - 1));
        
        //mostrarPos(cadena, cadena.length() - 1);
    }
    
    
    public static void mostrarPos (String cadena, int aux) {
        int div = aux % 2;
        
        if (aux >= 0) {
            if(div == 0) {
                System.out.println(cadena.charAt(aux));
            }
            mostrarPos(cadena, aux - 1);
        }
    }
    
    public static String invertida(String cadena, int n) {
        String pal = "";
        
        if (n == 0) {
            pal = pal + cadena.charAt(0);
        }else {
            if(n % 2 == 0) {
                pal = cadena.charAt(n) + invertida(cadena, n - 1);
            }else {
                pal = "" + invertida(cadena, n - 1);
            }
        }
        return pal;
    }
    
}
