package TPArreglos;
import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que calcule el promerio de los valores almacenados
en un arreglo de números
*/

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo;
        int num, promedio, longitud, suma = 0;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = sc.nextInt();
        arreglo = new int[longitud];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            arreglo[i] = num;
        }

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        promedio = suma / longitud;
        System.out.println("El promedio de los valores almacenados es: " + promedio);
    }
}
