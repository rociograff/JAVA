package DesarrolloDeAlgoritmos2020.TPRepaso;
import java.util.Scanner;

/*Diseñar un módulo en pseudocódigo que dada una frase y un caracter, verifique si el
caracter ingresado se encuentra en la frase.
a. Implemente solo usando únicamente las operaciones longitud (length) y posicion (charAt)
Desarrollo de Algoritmos - Recursado 2020 Pág.1
b. Implemente usando las operaciones de String más adecuadas
*/

public class TPRepasoEj7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        char caracter;
        boolean encontrado = false;
        int i = 0;

        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        System.out.println("Ingrese el caracter que desea buscar: ");
        caracter = sc.next().charAt(0);

        while (!encontrado && i < frase.length()) { // Itera hasta encontrar el caracter elegido, o hasta que llegue al
                                                    // final de la cadena
            if (frase.charAt(i) == caracter) {
                encontrado = true; // En caso de coincidir cambia el valor de verdad y corta la iteracion
            } else {
                i++; // En caso de no coincidir aumenta el valor de i y pasa a la siguiente posicion
            }
        }

        if (encontrado) { // Verifica el valor de verdad porque no se sabe si termino la iteracion por
                          // encontrar o llegar al final de la cadena
            System.out.println("El caracter '" + caracter + "' se encuentra en la frase");
        } else {
            System.out.println("El caracter '" + caracter + "' no se encuentra en la frase");
        }
    }
}
