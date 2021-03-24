package TPArreglos;
import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que busque la palabra más larga almacenada en un
arreglo de String (cada posición guarda exactamente 1 palabra). */

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arreglo;
        String palabra, palabraMasLarga = "";
        int longitud, masLarga = 0;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = sc.nextInt();
        arreglo = new String[longitud];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una palabra: ");
            palabra = sc.next();
            arreglo[i] = palabra;
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].length() >= masLarga) {
                palabraMasLarga = arreglo[i];
                masLarga = palabraMasLarga.length();
            }
        }

        System.out.println("La palabra ''" + palabraMasLarga + "'' es la mas larga");
    }
}
