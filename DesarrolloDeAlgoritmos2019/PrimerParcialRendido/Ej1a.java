/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcialRendido;

/**
 *
 * @author Rocio Graff
 */

/*
Un algoritmo contarLetras que reciba como parametro una frase u oracion, y que devuelva la cantidad de letras en dicha frase
 */
public class Ej1a {

    public static void main(String[] args) {
        String frase;
        int cantLetras;
        
        frase = "Hola como estas";
        cantLetras = contarLetras(frase);
        
        System.out.println("La frase tiene "+cantLetras+" letras");
    }
    public static int contarLetras(String frase) {
        int i, contador;
        char letra;

        contador = 0;

        for (i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if(Character.isLetter(letra)) {
                contador++;
            }
        }
        return contador;
    }

}
