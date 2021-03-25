/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.SegundoParcial;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */
/*
Especificar un algoritmo recursivo que dado un arreglo de caracteres, devuelva la posicion de la primera apararicion
de un caracter dado. Por ejemplo, si el arreglo es [d,q,k,f,t,k,s,z,f,d] y el caracter es 'k', debe devolver 2,
correspondiente a la posicion de la primera aparicion de 'k'
*/
public class Ej3a2019 {
    public static void main(String[] args) {
        int pos;
        char buscado;
        char[] arreglo = {'d','q','k','f','t','k','s','z','f','d'};
        
        System.out.println("Ingrese un caracter a buscar: ");
        buscado = TecladoIn.readLineNonwhiteChar();
        
        pos = buscar(arreglo, arreglo.length - 1, 0, buscado);
        System.out.println(pos);
    }
    
    public static int buscar (char[] arreglo, int longitud, int n, char buscado) {
        int pos = -1;
        
        if(n == buscado){
            if(arreglo[n] == buscado) {
                pos = n;
            }
        }else {
            if(arreglo[n] == buscado) {
                pos = n;
            }else {
                pos = buscar(arreglo, longitud, n + 1, buscado);
            }
        }
        return pos;
    }
}
