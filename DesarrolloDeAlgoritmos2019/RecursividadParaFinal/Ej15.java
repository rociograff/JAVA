/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursividadParaFinal;

/**
 *
 * @author Rocio Graff
 */

/*
Calcular el cuadrado de un número n entero positivo como la sumatoria de los n primeros números impares.
Por ejemplo 32= 1+3+5=9.
*/
public class Ej15 {
    
    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println(cuadrado(numero, 1, 1));
            
    }
    
    public static int cuadrado(int num, int aux, int indice) {
        int retorno;
        
        if(indice == num) {
            retorno = aux;
        }else {
            retorno = aux + cuadrado(num, aux + 2, indice + 1);
        }
        return retorno;
    }
    
}
