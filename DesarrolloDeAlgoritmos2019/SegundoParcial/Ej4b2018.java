/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoParcial;

/**
 *
 * @author usuario
 */
/*
Especificar un algoritmo RECURSIVO que reciba por parametro una cadena de caracteres, y la muestre reemplazando sus vocales
de la siguiente manera:
Mostrar la cadena original con un * en el lugar de las vocales, un guion ("-") y luego mostrar la cadena inversa con un # en 
el lugar de las consonantes.
Por ej. si la cadena es "informatica" debera salir por pantalla *nf*rm*t*c* - a#i#a##o##i
 */
public class Ej4b2018 {

    public static void main(String[] args) {
        String palabra, cambiada;
        int i = 0, n, j;
        palabra = "informatica";
        n = palabra.length() - 1;
        j = n;

        cambiada = cambiar(palabra, n, i, j);
        System.out.println(cambiada);
    }

    public static String cambiar(String palabra, int n, int i, int j) {
        String cambiada = "";
        char letra, let;
        let = palabra.charAt(j);

        if (i <= n) {
            letra = palabra.charAt(i);
            if (i == n) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    cambiada = cambiada + '*' + " - " + cambiar(palabra, n, i + 1, j);
                } else {
                    cambiada = letra + " - " + cambiar(palabra, n, i + 1, j);
                    i++;
                }
            } else {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    cambiada = cambiada + '*' + cambiar(palabra, n, i + 1, j);
                } else {
                    cambiada = cambiada + letra + cambiar(palabra, n, i + 1, j);
                }
            }
        } else {
            if (j == 0) {
                if (let != 'a' && let != 'e' && let != 'i' && let != 'o' && let != 'u') {
                    cambiada = cambiada + '#';
                } else {
                    cambiada = cambiada + let;
                }
            } else {
                if (let != 'a' && let != 'e' && let != 'i' && let != 'o' && let != 'u') {
                    cambiada = cambiada + '#' + cambiar(palabra, n, i, j - 1);
                } else {
                    cambiada = cambiada + let + cambiar(palabra, n, i, j - 1);
                }
            }
        }
        return cambiada;
    }

}
