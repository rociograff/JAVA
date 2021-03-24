/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPRepaso;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej7 {

    public static void main(String[] args) {
        //Declaracion de variables
        double grado2, grado1, terminoIndependiente;

        System.out.println("Ingrese el valor del término de grado 2: ");
        grado2 = TecladoIn.readDouble();
        System.out.println("Ingrese el valor del término de grado 1: ");
        grado1 = TecladoIn.readDouble();
        System.out.println("Ingrese el valor del término independiente: ");
        terminoIndependiente = TecladoIn.readDouble();

        System.out.println("Las raices de la funcion son: " + raiz1(grado2, grado1, terminoIndependiente) + " y " + raiz2(grado2, grado1, terminoIndependiente));
    }

    public static double raiz1(double a, double b, double c) {
        double raiz;

        raiz = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        return raiz;
    }

    public static double raiz2(double a, double b, double c) {
        double raiz;

        raiz = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        System.out.println(Math.sqrt((b * b) - (4 * a * c)));
        System.out.println(raiz);

        return raiz;
    }
}
