/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import Utiles.TecladoIn;


/**
 *
 * @author Rocio Graff
 */

/*
 Dada una secuencia S de números enteros positivos (finalizada en 0, que no se considera parte de la secuencia)
ingresados por teclado, escribir planteos recursivos, sus correspondientes métodos, y realizar la traza para
la secuencia  2 5 3 6 12 3 0 en los siguientes incisos:
a) Calcular cuántos enteros múltiplos de 4 hay en la secuencia.
b) Determinar el máximo entero perteneciente a la secuencia.
 */
public class Ej5 {

    public static void main(String[] args) {
        int cant;
        
        cant = contarMultiplo();
        
        System.out.println(cant);
        System.out.println(buscarMayor());

    }

    public static int contarMultiplo() {
        int num, cant = 0;

        System.out.println("Ingrese un numero: ");
        num = TecladoIn.readLineInt();

        if (num != 0) {
            if (num % 4 == 0) {
                cant = 1 + contarMultiplo();
            } else {
                cant = contarMultiplo();
            }
        }
        return cant;
    }
    
    public static int buscarMayor() {
        int num, retorno, mayor;
        
        System.out.println("Ingrese un numero: ");
        num = TecladoIn.readLineInt();
        
        if(num == 0) {
            mayor = 0;
        }else {
            retorno = buscarMayor();
            if(retorno == 0) {
                mayor = num;
            }else {
                if(retorno >= num) {
                    mayor = retorno;
                }else {
                    mayor = num;
                }
            }
        }
        return mayor;
    }

}
