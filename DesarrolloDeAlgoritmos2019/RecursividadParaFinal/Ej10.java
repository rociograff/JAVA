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
Dado un arreglo de enteros, verificar si el arreglo está ordenado en forma ascendente.
 */
public class Ej10 {

    public static void main(String[] args) {
        int[] v = {12, 5, -1, 8, 6};
        boolean creciente;
        int longitud;
        
        longitud = v.length - 1; 
        
        creciente = esCreciente(v, longitud);
        System.out.println(creciente);
    }
    
    public static boolean esCreciente(int[] v, int longitud) {
        boolean creciente;
        //Caso Base
        if (longitud == 0) {
            creciente = true;
        } else {
            creciente = v[longitud] > v[longitud - 1] && esCreciente(v, longitud - 1);
        }
        return creciente;
    }
}
