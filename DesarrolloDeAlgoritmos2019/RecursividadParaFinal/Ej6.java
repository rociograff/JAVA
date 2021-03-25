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
Determinar el menor número de una secuencia de dígitos leída por teclado y terminada en -1 (este número no debe considerarse).
*/
public class Ej6 {
    
    public static void main(String[] args) {
        int menor;
        
        System.out.println(buscarMenor());
    }
    
    public static int buscarMenor() {
        int numero, menor, aux;
        
        System.out.println("Ingrese un numero: ");
        numero = TecladoIn.readLineInt();
        
        if(numero == -1) {
            menor = -1;
        }else {
            aux = buscarMenor();
            if(aux == -1) {
                menor = numero;
            }else {
                if(aux <= numero) {
                    menor = aux;
                }else {
                    menor = numero;
                }
            }
        }
        return menor;
    }
    
}
