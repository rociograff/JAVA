package DesarrolloDeAlgoritmos2020.TPRepaso;
import java.util.Scanner;


/* Diseñar un algoritmo en pseudocódigo que lea un valor entero (N) y genere por pantalla los
10 primeros múltiplos del mismo.
Por ejemplo para N=7 deberá salir por pantalla: 7 14 21 28 35 42 49 56 63 70
*/

public class TPRepasoEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i != 10) { // Va a imprimir comas siempre que no se encuentre en la ultima iteracion
                System.out.print(num * i + ", ");
            } else { // Si llega a la ultima iteracion no va a imprimir la coma
                System.out.println(num * i);
            }
        }
    }
}
