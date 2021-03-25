/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.RecursividadParaFinal;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Calcular la potencia Xn, para X y n enteros positivos. 
 */
public class Ej16 {
    
    public static void main(String[] args) {
        int m, n;
        
        System.out.println("Ingrese la base: ");
        m = TecladoIn.readLineInt();
        System.out.println("Ingrese el exponete: ");
        n = TecladoIn.readLineInt();
        
        System.out.println("El resultado es: "+potencia(m, n));
    }

    public static int potencia(int m, int n) {
        //m es la base de la potencia
        //n es el exponente de la potencia

        int pot;

        if (n == 0) {
            pot = 1;
        }else {
            pot = m * potencia(m, n - 1);
        }
        
        return pot;
    }

}
