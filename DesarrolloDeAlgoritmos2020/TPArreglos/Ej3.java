package DesarrolloDeAlgoritmos2020.TPArreglos;

import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que:
a. Cargue un arreglo de caracteres a partir del contenido de un String de longitud 10 que
ingresa el usuario.
b. Permita al usuario elegir si lo quiere ver en el orden ingresado o invertido (Modularice
apropiadamente)
*/

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arreglo = new char[10];
        String cadena = "";
        boolean valida = false, continuar = true;
        int opcion;

        while (!valida) {
            System.out.println("Ingrese una cadena de 10 caracteres: ");
            cadena = sc.nextLine();
            if (cadena.length() == 10) {
                valida = true;
            }
        }

        cargarArreglo(arreglo, cadena);

        while (continuar) {
            menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    mostrarOrdenado(arreglo);
                    break;
                case 2:
                    mostrarInvertido(arreglo);
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }

    }

    public static void menu() {
        System.out.println("Seleccione la accion que desea realizar: ");
        System.out.println("0: Terminar.");
        System.out.println("1: Mostrar cadena en orden.");
        System.out.println("2: Mostrar cadena invertida.");
    }

    public static void cargarArreglo(char[] arreglo, String cadena) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = cadena.charAt(i);
        }
    }

    public static void mostrarOrdenado(char[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);

        }
        System.out.println();
    }

    public static void mostrarInvertido(char[] arreglo) {
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i]);
        }
        System.out.println();
    }

}
