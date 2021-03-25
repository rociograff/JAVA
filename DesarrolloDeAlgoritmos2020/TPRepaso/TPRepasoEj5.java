package DesarrolloDeAlgoritmos2020.TPRepaso;
import java.util.Scanner;

/*. Diseñar en pseudocódigo un algoritmo que permita leer números positivos hasta ingresar un
valor negativo, y en base a ellos muestre:
a) Cantidad de números pares
b) Mayor número leído 
*/

public class TPRepasoEj5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, pares = 0, mayor = 0;

        while (num >= 0) { // Itera mientras que el numero ingresado sea positivo
            System.out.println("Ingrese un numero");
            num = sc.nextInt();

            if (num >= 0) { // Verifica que el numero ingresado sea positivo porque sino sumaria uno de mas
                            // en caso de ser un negativo par
                if (num % 2 == 0) {
                    pares++;
                }
                if (num >= mayor) { // Verifica si el numero ingresado es mayor al ya existente
                    mayor = num;
                }
            }
        }

        System.out.println("Cantidad de numeros pares: " + pares);
        System.out.println("Mayor numero ingresado: " + mayor);
    }
}
