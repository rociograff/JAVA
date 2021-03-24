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
Diseñar algoritmos recursivos para:
a) Contar la cantidad de dígitos de un número entero positivo n.Realizar la traza para n=32154. 
b) Dado un número entero positivo n y un dígito t, contar la cantidad de veces que aparece el dígito t en el 
número n. Por ejemplo si n = 13234 y t = 3, el resultado debe ser 2. Realizar la traza para los valores del ejemplo.
 */
public class Ej3 {

    public static void main(String[] args) {
        boolean terminar = false;
        int opcion;

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    incisoA();
                    break;
                case 2:
                    incisoB();
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar");
        System.out.println("(1) Inciso A");
        System.out.println("(2) Inciso B");
    }

    public static int cargarNum() {
        int num;

        System.out.println("Ingrese un numero");
        num = TecladoIn.readLineInt();

        return num;
    }

    public static boolean esPositivo(int num) {
        boolean esPositivo;

        if (num > 0) {
            esPositivo = true;
        } else {
            esPositivo = false;
        }
        return esPositivo;
    }

    public static void incisoA() {
        int num = 0, cantDigitos = 0;
        boolean positivo = false;

        while (positivo != true) {
            num = cargarNum();
            positivo = esPositivo(num);
        }
        System.out.println("El numero " + num + " tiene " + contarDigitos(num, cantDigitos) + " digitos.");
    }

    public static int contarDigitos(int num, int cantD) {
        //Caso Base
        if (num / 10 == 0) {
            cantD = 1;
        } else {
            //Paso Recursivo
            cantD = contarDigitos(num / 10, cantD);
            cantD++;
        }
        return cantD;
    }

    public static void incisoB() {
        int num = 0, digito;
        boolean positivo = false;

        while (positivo != true) {
            num = cargarNum();
            positivo = esPositivo(num);
        }
        System.out.println("Ingrese el numero que quiere buscar: ");
        digito = TecladoIn.readLineInt();

        System.out.println("El numero " + digito + " se repite " + contarN(num, digito) + " veces.");

    }

    public static int contarN(int num, int digito) {
        int cantN = 0;
        //Caso Base
        if (num > 0) {
            if (num % 10 == digito) {
                cantN = 1 + contarN(num / 10, digito);   //Paso Recursivo
            } else {
                cantN = contarN(num / 10, digito);
            }
        }
        return cantN;
    }

}
