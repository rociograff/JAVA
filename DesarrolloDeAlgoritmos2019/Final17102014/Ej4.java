/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final17102014;

/**
 *
 * @author Rocio Graff
 */

/*
Escribir un algoritmo que dado un texto retorne un texto similar pero con aquellas palabras de más de 5 letras cortadas con un punto.
Ejemplo:  Acuerdo con todos totalmente -  retornaría:  Acuer. con todos total. 
 */
public class Ej4 {

    public static void main(String[] args) {
        String texto = "Acuerdo con todos totalmente";
        String concatenada;

        concatenada = textoSimilar(texto);

        System.out.println(concatenada);
    }

    public static String textoSimilar(String texto) {
        String concatenado = "", partida, aux = "";

        while (texto.lastIndexOf(" ") != -1) {
            aux = "";
            partida = texto.substring(texto.lastIndexOf(" ") + 1);  //Ultima palabra
            texto = texto.substring(0, texto.lastIndexOf(" "));
            if (partida.length() > 5) {
                for (int i = 0; i < 5; i++) {
                    aux = aux + partida.charAt(i);
                }
                aux = aux + '.';
                concatenado = aux + " " + concatenado;
            } else {
                concatenado = partida + " " + concatenado;
            }
        }
        if (texto.length() > 5) {   //Cuando ya tengo una palabra 
            for (int i = 0; i < 5; i++) {
                aux = aux + texto.charAt(i);
            }
            aux = aux + '.';
            concatenado = aux + concatenado;
        } else {
            concatenado = texto + concatenado;
        }
        return concatenado;
    }

}
