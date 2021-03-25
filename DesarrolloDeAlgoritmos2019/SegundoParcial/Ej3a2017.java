package DesarrolloDeAlgoritmos2019.SegundoParcial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
/*
a. Especificar un algoritmo RECURSIVO para que dado en un arreglo de digitos (números enteros entre 0 y 9) 
determine cuántos de ellos son iguales a 0.
 */
public class Ej3a2017 {

    public static void main(String[] args) {
        int[] arreglo = {0, 1, 0, 2};
        int longitud = arreglo.length - 1;
        int cont = contarCeros(arreglo, longitud);

        System.out.println(cont);

    }

    public static int contarCeros(int[] arreglo, int longitud) {
        int cont = 0;

        if (longitud == 0) {
            cont++;
        } else {
            if (arreglo[longitud] == 0) {
                cont = 1 + contarCeros(arreglo, longitud - 1);
            } else {
                cont = contarCeros(arreglo, longitud - 1);
            }
        }
        return cont;
    }

}
