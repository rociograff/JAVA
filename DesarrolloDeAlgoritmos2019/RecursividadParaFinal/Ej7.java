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
Calcular la sumatoria de los n primeros números Naturales.
 */
public class Ej7 {

    public static void main(String[] args) {
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = TecladoIn.readLineInt();
        
        System.out.println(sumatoria(numero));

    }

    public static int sumatoria(int num) {
        int sumatoriaN;
        
        if (num == 1) {
            sumatoriaN = 1;
        } else {
            sumatoriaN = num + sumatoria(num - 1);
        }
        return sumatoriaN;
    }
}
