/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final17122019;

/**
 *
 * @author usuario
 */
public class Ej4 {

    public static void main(String[] args) {
        int num = 255;
        String numBinario;

        numBinario = pasarBinario(num);
        System.out.println("El numero es: " + numBinario);
    }

    public static String pasarBinario(int num) {
        String retorno = "";

        if (num / 2 == 0) {
            retorno = retorno + 1;
        } else {
            if (num % 2 == 0) {
                retorno = retorno + pasarBinario(num / 2) + 0;
            } else {
                retorno = retorno + pasarBinario(num / 2) + 1;
            }
        }
        return retorno;
    }

}
