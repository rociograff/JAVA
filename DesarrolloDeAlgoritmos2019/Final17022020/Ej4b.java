/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final17022020;

/**
 *
 * @author Rocio Graff
 */

/*
Especificar un algoritmo recursivo para determinar si un numero es mellizo. Se considera que un numero es mellizo si al menos dos digitos
adyacentes del mismo son iguales.
Ej: 677892 es mellizo, ya que existen dos digitos adyacentes iguales (77)
 */
public class Ej4b {
    
    public static void main(String[] args) {
        int num = 677892;
        
        System.out.println("Es mellizo: "+contieneMellizos(num));
    }

    static boolean contieneMellizos(int n) {
        boolean mellizos;
        
        if (n <= 9) {
            mellizos = false;
        } else {
            mellizos = (dosUltIguales(n) || contieneMellizos(n / 10));
        }
        return mellizos;
    }

    private static boolean dosUltIguales(int x) {
        boolean retorno;
        
        if ((x % 10) == ((x / 10) % 10)) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }
}
