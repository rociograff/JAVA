/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerParcial2018;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
/*
Un algoritmo contarVocal que reciba como parametro una frase u oracion y una vocal, y que cuente la cantidad
de veces que aparece esa determinana vocal en dicha frase
*/
public class Ej1a {
    public static void main(String[] args) {
        String frase;
        char vocal;
        int cantVocales;
        
        System.out.println("Ingrese una frase: ");
        frase = TecladoIn.readLine();
        
        System.out.println("Ingrese la vocal que busca: ");
        vocal = TecladoIn.readLineNonwhiteChar();
        
        cantVocales = contarVocal(frase, vocal);
        System.out.println("La vocal aparece "+cantVocales+" veces.");
        
    }
    
    public static int contarVocal(String frase, char v) {
        int i, cantVocales = 0;
        
        for(i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == v) {
                cantVocales++;
            }
        }
        return cantVocales;
    }
    
}
