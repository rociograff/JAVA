/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final22062017;

/**
 *
 * @author Rocio Graff
 */

/*
Implemente en java un algoritmo que dado un texto almacenado en un String verifique si cada vocal aparece 
al menos una vez en el texto
Por ejemplo: murcielago debe retornar verdadero
             avioneta debe retornar falso
*/
public class Ej4 {
    
    public static void main(String[] args) {
        String cadena = "avioneta";
        boolean aparece;
        
        aparece = contarVocales(cadena);
        
        System.out.println(aparece);
      
    }
    
   public static boolean contarVocales(String cadena) {
        int a, e, i, o, u;
        boolean existe = false;
        
        a = cadena.indexOf("a");
        e = cadena.indexOf("e");
        i = cadena.indexOf("i");
        o = cadena.indexOf("o");
        u = cadena.indexOf("u");
        
        if (a != -1 && e != -1 && i != -1 && o != -1 && u != -1) {
            existe = true;
        }
        
        return existe;
    }
    
    
   /* public static boolean contarVocales(String cadena) {
        int i = 0, contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        boolean aparece = false;
        int posicion = cadena.length();
        
        while (i < posicion && !aparece) {
            if(cadena.charAt(i) == 'a') {
                 contA++;
            }
            
            if(cadena.charAt(i) == 'e') {
                contE++;
            }
            
            if (cadena.charAt(i) == 'i') {
                contI++;
            }
            
            if(cadena.charAt(i) == 'o') {
                contO++;
            }
            
            if(cadena.charAt(i) == 'u') {
                contU++;
            }
            i++;
        }
        
        if (contA > 0 && contE > 0 && contI > 0 && contO > 0 && contU > 0) {
            aparece = true;
        }else {
            aparece = false;
        } 
        return aparece;
    }*/
    
}
