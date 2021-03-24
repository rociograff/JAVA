/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final20022018;

/**
 *
 * @author Rocio Graff
 */

/*
Implemente un metodo recursivo codigoValido() que retorne verdadero si el codigo es creciente, y falso en caso contrario.
Un numero natural n es creciente si cada digito de n es menor o igual que el que esta a su derecha. 
Por ejemplo n = 2349 es creciente mientras que n = 3492 no lo es.
Un numero natural con un solo digito, es decir, menor o igual que 9, se considera creciente.
Diseñar un metodo recursivo que reciba por parametro un numero entero n y que determine si n es creciente.
*/
public class Ej4 {
    
    public static void main (String[] args) {
        int codigo = 2349;
        
        System.out.println("¿El codigo es creciente? "+codigoValido(codigo));
        
    }
    
    public static boolean codigoValido(int cod) {
        boolean esCreciente = true;
        int derecha, izquierda;
        
        if(cod > 0) {
            izquierda = cod / 10;
            derecha = cod % 10;
            
            if(izquierda % 10 < derecha) {
                esCreciente = codigoValido(izquierda);
            }else {
                esCreciente = false;
            }
        }
        return esCreciente;
    }
    
}
