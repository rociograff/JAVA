package DesarrolloDeAlgoritmos2020.TPRepaso;

import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que dado número cuente cuantos dígitos pares tiene
y cuantos impares tiene.
*/

public class TPRepasoEj4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, pares = 0, impares = 0, n;

        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        int copia = num; // Creo el int copia para no perder el valor original del numero ingresado para
                         // despues mostrarlo

        while (copia != 0) { // Itera hasta que se consuma todo el numero
            n = copia % 10; // Obtengo el ultimo digito del numero

            if (n % 2 == 0) { // Si el resto al dividir por 2 es 0, entonces es par
                pares++;
            } else { // Sino, es impar
                impares++;
            }
            copia = copia / 10; // Consumo el ultimo digito y paso al siguiente
        }

        System.out.println("El numero " + num + " tiene " + pares + " digitos pares y " + impares + " digitos impares");
    }
}
