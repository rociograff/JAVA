package DesarrolloDeAlgoritmos2020.TPArreglos;
import java.util.Scanner;

/*Diseñar los siguientes módulos/algoritmos en pseudocódigo:
a. cargarArreglo: lee palabras y las almacena en un arreglo de string que es
retornado.
b. armarCadena: Genera una cadena con las palabras almacenadas en el
arreglo separándolas por un espacio en blanco y la retorna.
c. cadenaInversa: Genera una cadena con las palabras almacenadas en el
arreglo en orden inverso separándolas por un guión ( '-' ) y la retorna
d. Algoritmo principal, invoca a los tres módulos anteriores y muestra por
pantalla las cadenas retornadas por armarCadena y por cadenaInvertida
*/

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arreglo;
        int longitud;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = sc.nextInt();
        arreglo = new String[longitud];

        cargarArreglo(arreglo);

        System.out.println("Cadena con las palabras: " + armarCadena(arreglo));
        System.out.println("Cadena inversa con las palabras: " + cadenaInversa(arreglo));
    }

    public static void cargarArreglo(String[] arreglo) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una palabra: ");
            cadena = sc.next();
            arreglo[i] = cadena;
        }
    }

    public static String armarCadena(String[] arreglo) {
        String retorno = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (i + 1 != arreglo.length) {
                retorno += arreglo[i] + " ";
            } else {
                retorno += arreglo[i];
            }
        }
        return retorno;
    }

    public static String cadenaInversa(String[] arreglo) {
        String retorno = "";
        for (int i = arreglo.length - 1; i >= 0; i--) {
            if(i != 0) {
                retorno += arreglo[i] + " - ";
            } else {
                retorno += arreglo[i];
            }
        }
        return retorno;
    }
    
}
