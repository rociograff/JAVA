/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final20022018;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Dado un arreglo de N caracteres, donde cada cadena contiene una sola palabra, especificar en Java
a) la cantidad de palabras del arreglo que no son palindromas(una cadena es palindroma si es igual a su cadena inversa)
b) la longitud de aquella palabra que contenga mas vocales
c) la palabra palindroma que tenga mas vocales
d) un algoritmo que cargue al arreglo e invoque a las anteriores funcionalidades
*/
public class Ej1 {
    
    public static void menu () {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Cargar arreglo.");
        System.out.println("(2) Contar las palabras palindromas.");
        System.out.println("(3) Longitud de la palabra con mas vocales.");
        System.out.println("(4) Mostrar la palabra palondroma con mas vocales.");
    }
    
    public static void main(String[] args) {
        String[] arreglo;
        boolean terminar = false;
        int opcion, longitud;
        
        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();
        
        arreglo = new String[longitud];
        
        while(!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();
            
            switch(opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarArreglo(arreglo);
                    break;
                case 2:
                    System.out.println("Hay "+cantidadPalindromas(arreglo, longitud)+" palabras palindromas");
                    break;
                case 3:
                    mayorLongitud(arreglo, longitud);
                    break;
                case 4:
                    palindromaMasVocales(arreglo, longitud);
                    break;
            }   
        }
    }
    
    public static void cargarArreglo(String[] arreglo) {
        for(int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una palabra para el arreglo en la posicion "+i);
            arreglo[i] = TecladoIn.readLineWord();
        }
    }
    
    public static int cantidadPalindromas(String[] arreglo, int longitud) {
        int cant = 0;
        
        for (int i = 0; i < longitud; i++) {
            if(esPalindroma(arreglo[i])) {
                cant++;
            }
        }
        return cant;
    }
    
    public static boolean esPalindroma(String cadena) {
        boolean esPalindroma = true;
        int derecha = cadena.length() - 1;
        int izquierda = 0;
        
        while(esPalindroma && izquierda != derecha) {
            if(cadena.charAt(derecha) == cadena.charAt(izquierda)) {
                izquierda++;
                derecha--;
            }else {
                esPalindroma = false;
            }
        }
        return esPalindroma;
    }
    
    public static void mayorLongitud(String[] arreglo, int longitud) {
        String palabraMasVocales = "";
        int aux = 0;
        
        for(int i = 0; i < longitud; i++) {
            if(contarVocales(arreglo[i]) >= aux) {
                palabraMasVocales = arreglo[i];
                aux = contarVocales(arreglo[i]);
            }
        }
        System.out.println("La palabra con mas vocales es "+palabraMasVocales);
    }
    
    public static int contarVocales(String cadena) {
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }
    
    public static void palindromaMasVocales(String[] arreglo, int longitud) {
        int aux = 0;
        String palindroma = "";
        
        for(int i = 0; i < longitud; i++) {
            if(esPalindroma(arreglo[i])) {
                if(contarVocales(arreglo[i]) >= aux) {
                    palindroma = arreglo[i];
                    aux = contarVocales(arreglo[i]);
                }
            }
        }
        System.out.println("La palabra palindroma con mas vocales es: "+palindroma);
    }
    
}
