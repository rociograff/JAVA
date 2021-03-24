/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursividadParaFinal;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Contar la cantidad de dígitos pares de un número entero positivo N. Por ejemplo si N=23025, el resultado debe ser 3. 
*/
public class Ej12 {
    
    public static void main(String[] args) {
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = TecladoIn.readLineInt();
        
        System.out.println("La cantidad de digitos es: "+contarPares(numero));
    }
    
    public static int contarPares(int num) {
        int contador = 0;
        
        if(num <= 9) {
            if(num % 2 == 0) {
                contador = 1;
            }
        }else {
            if((num % 10) % 2 == 0) {
                contador = 1 + contarPares(num / 10);
            }else {
                contador = contarPares(num / 10);
            }
        }
        return contador;
    }
}
