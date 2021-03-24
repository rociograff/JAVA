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
Realizar un modulo recursivo que verifique si un numero que ingresa por parametro es binario. 
Un numero es binario si esta compuesto solo por 0 y 1. El modulo debera retornar el resultado booleano.
Por ej. el numero 110101 es binario, el numero 13101 no es binario.
*/
public class Ej3b2016 {
    public static void main(String[] args) {
        int num = 13101;
        boolean verificar;
        
        verificar = verificarBinario(num);
        
        System.out.println(verificar);
    }
    public static boolean verificarBinario(int n) {
        boolean retorno = false;
        
        if(n/10 == 0) {
            if(n%10 == 0 || n%10 == 1) {
                retorno = true;
            }
        } else {
            if(n%10 == 0 || n%10 == 1) {
                retorno = true && verificarBinario(n/10);
            } else {
                retorno = false;
            }
        }
        return retorno;
    }
}
