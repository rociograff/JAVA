/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.TPString;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */
/**
 * Desarrollar un algoritmo que, dada una frase u oración y una palabra, cuente
 * la cantidad de veces que aparece esa palabra en la frase.
 *
 */
public class Ej2 {

    public static void main(String[] args) {
        //Declaracion de variables
        String oracion, palabraBuscada;
        int cantPalabras;

        System.out.println("Ingrese una oracion: ");
        oracion = TecladoIn.readLine();

        System.out.println("Ingrese la palabra que quiera buscar: ");
        palabraBuscada = TecladoIn.readLine();

        cantPalabras = contarPalabra(oracion, palabraBuscada);

        System.out.println("La palabra " + palabraBuscada + " se repite " + cantPalabras + " veces.");
    }

    public static int contarPalabra(String oracion, String palabraBuscada) {
        int cantPalabras = -1, posF = 0;
        String nuevaOracion = oracion;

        while (posF != -1) { 
            /**Hago que se repita mientras posF sea diferente a -1 porque el lastIndexOf() retorna ese valor cuando
             * no encuentra una ocurrencia de la palabra buscada. Inicializo el contador de palabras en -1 porque cada vez que
             * se repita el while sumara al contador hasta en la ultima repeticion que no encuentre la palabra buscada
             * ya que este no esta dentro de una condicion.
             */
            posF = nuevaOracion.lastIndexOf(palabraBuscada);
            cantPalabras++;
            nuevaOracion = nuevaOracion.substring(0, posF+1);
            /**A posF le sumo 1 porque en la ultima repeticion me retorna el valor -1, al hacerlo estaria creando un substring
             * desde la posicion 0 a la posicion -1 (que es imposible), asi que sumando el 1 queda (0,0).
             */
        }
        return cantPalabras;
    }

}
