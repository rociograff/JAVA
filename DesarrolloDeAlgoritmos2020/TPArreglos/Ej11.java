package TPArreglos;
import java.util.Scanner;

/*Diseñar dos módulos en pseudocódigo que dado un arreglo de caracteres y un caracter:
a. Verifique si el caracter ingresado se encuentra en el arreglo. ¿Puede optimizar
el algoritmo?
b. Cuente cuántas veces aparece el caracter en el arreglo . ¿Puede optimizar el
algoritmo?
Implementar el algoritmo llamador que invoque a los módulos. */

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arreglo;
        char caracter, buscado;
        int longitud;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = sc.nextInt();
        arreglo = new char[longitud];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un caracter: ");
            caracter = sc.next().charAt(0);
            arreglo[i] = caracter;
        }

        System.out.println("Ingrese el caracter que desea buscar: ");
        buscado = sc.next().charAt(0);

        if (buscarCaracter(arreglo, buscado)) {
            System.out.println("El caracter '" + buscado + "' se encuentra en el arreglo");
            System.out.println("El caracter '" + buscado + "' se encuentra " + contarOcurrencias(arreglo, buscado) + " veces");
        }
    }

    public static boolean buscarCaracter(char[] arreglo, char buscado) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado) {
            if (arreglo[i] == buscado) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }

    public static int contarOcurrencias(char[] arreglo, char buscado) {
        int ocurrencias = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == buscado) {
                ocurrencias++;
            }
        }
        return ocurrencias;
    }
}
