/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final22062017;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
Implementar en java la clase TestPlanta en la que se defina un metodo main que haga uso de la clase Planta.
Se debe definir un arreglo de plantas, el metodo que realiza la carga del arreglo y un metodo recursivo que recorra el arreglo
y muestre por pantalla los datos de todas las plantas que soportan temperaturas bajo cero.
 */
public class TestPlanta {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Cargar los datos de la planta.");
        System.out.println("(2) Mostrar los datos de las plantas que soportan temp bajo cero");
    }

    public static void main(String[] args) {
        Planta[] arreglo;
        int opcion, longitud, posicion = 0, contar;
        boolean terminar = false;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arreglo = new Planta[longitud];

        while (!terminar) {
            menu();

            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarDatos(arreglo, posicion);
                    posicion++;
                    break;
                case 2:
                    contar = contarPlantas(arreglo, posicion - 1);
                    if (contar > 0) {
                        System.out.println("Hay " + contar + " plantas que soportan temps bajo cero.");
                    } else {
                        System.out.println("No hay plantas.");
                    }
                    for(int i = 0; i < posicion; i++) {
                        System.out.println(arreglo[i].toString());
                    }
                    break;
            }
        }
    }

    public static void cargarDatos(Planta[] arreglo, int pos) {
        Planta p;
        int codigo, alturaMaxima, tempMinima;
        char lugarIdeal;
        String color;

        System.out.println("Ingrese el codigo de la planta: ");
        codigo = TecladoIn.readLineInt();
        System.out.println("Ingrese la altura maxima de la planta: ");
        alturaMaxima = TecladoIn.readLineInt();
        System.out.println("Ingrese la tempera minima que soporta: ");
        tempMinima = TecladoIn.readLineInt();
        System.out.println("Ingrese el lugar ideal para la planta: s/m/t");
        lugarIdeal = TecladoIn.readLineNonwhiteChar();
        System.out.println("Ingrese el color de la planta: ");
        color = TecladoIn.readLineWord();

        p = new Planta(codigo, alturaMaxima, tempMinima, lugarIdeal, color);

        arreglo[pos] = p;
    }

    public static int contarPlantas(Planta[] arreglo, int pos) {
        //Modulo recursivo para contar las plantas que soportan temperaturas bajo cero
        int contador = 0;

        if (pos == 0) {
            if (arreglo[pos].getTemperaturaMinima() < 0) {
                contador = 1;
            }
        } else {
            if (arreglo[pos].getTemperaturaMinima() < 0) {
                contador = 1 + contarPlantas(arreglo, pos - 1);
            } else {
                contador = contarPlantas(arreglo, pos - 1);
            }
        }

        return contador;
    }

}

