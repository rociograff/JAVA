package DesarrolloDeAlgoritmos2020.TPRepaso;
import java.util.Scanner;

/*Diseñar un módulo en pseudocódigo que dado un número que ingresa por un parámetro
entero y verifique si dicho número es un número binario. Los números binarios son aquellos
que están formados únicamente por ceros y unos. Por ejemplo 100, 1011, 1, etc. 
*/

public class TPRepasoEj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, copia;
        boolean esBinario = true;
        System.out.println("Ingrese un número binario");
        num = sc.nextInt();
        copia = num; // Creo el int copia para no perder el valor original del numero ingresado para
                     // despues mostrarlo

        while (esBinario && copia != 0) { // Itera mientras que sea binario y todavia queden digitos para verificar
            if (copia % 10 != 1 && copia % 10 != 0) { // Si el ultimo digito es diferente de 1 y 0, entonces no es
                                                      // binario
                esBinario = false;
            } else {
                copia = copia / 10; // Si el ultimo digito era 1 o 0, entonces pasa al siguiente
            }
        }

        if (esBinario) { // Verifica el valor de verdad luego de la iteracion, ya que no se sabe si corto
                         // por ese valor o porque se consumio todo el numero
            System.out.println("El numero " + num + " es binario");
        } else {
            System.out.println(("El numero " + num + " no es binario"));
        }
    }
}
