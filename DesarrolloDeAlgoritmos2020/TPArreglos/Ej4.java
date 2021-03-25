package DesarrolloDeAlgoritmos2020.TPArreglos;
import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que lea un valor entero (N) y genere un arreglo con
los 10 primeros múltiplos del mismo.
Por ejemplo para N=7 deberá guardar en el arreglo: 7 14 21 28 35 42 49 56 63 70
*/

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[] arreglo = new int[10];

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= arreglo.length; i++) {
            arreglo[i - 1] = num * i;
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (i + 1 != arreglo.length) {
                System.out.print(arreglo[i] + " ");
            } else {
                System.out.println(arreglo[i]);
            }
        }
    }
}
