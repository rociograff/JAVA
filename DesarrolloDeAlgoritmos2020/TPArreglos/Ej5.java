package DesarrolloDeAlgoritmos2020.TPArreglos;
import java.util.Scanner;

/*. Diseñar un algoritmo en pseudocódigo que dado un valor entero N y un arreglo de enteros,
reemplace los valores en las posiciones pares del arreglo por el valor N.
*/

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, longitud;
        int[] arreglo;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = sc.nextInt();
        arreglo = new int[longitud];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            arreglo[i] = num;
        }

        System.out.println("Ingrese N: ");
        n = sc.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            if (i % 2 != 0) {
                arreglo[i] = n;
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (i + 1 != arreglo.length) {
                System.out.print(arreglo[i] + " - ");
            } else {
                System.out.println(arreglo[i]);
            }
        }
    }
}
