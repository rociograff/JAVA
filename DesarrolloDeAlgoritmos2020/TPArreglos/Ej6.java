package DesarrolloDeAlgoritmos2020.TPArreglos;
import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que permita encontrar el valor más grande y el más
pequeño almacenado en un arreglo de números.
*/

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo;
        int num, longitud, mayor, menor;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = sc.nextInt();
        arreglo = new int[longitud];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            arreglo[i] = num;
        }
        mayor = arreglo[0];
        menor = arreglo[0];

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= mayor) {
                mayor = arreglo[i];
            }
            if (arreglo[i] <= menor) {
                menor = arreglo[i];
            }
        }
        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);
    }
    
}
