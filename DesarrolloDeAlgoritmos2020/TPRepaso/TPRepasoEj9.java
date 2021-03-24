package TPRepaso;

import java.util.Scanner;

/*Diseñar en pseudocódigo un algoritmo que permita ingresar una cierta cantidad de palabras
(N) y en base a ellas muestre:
a) Si existen palabras capicúas
b) La cantidad de palabras con más de dos vocales
c) La palabra de mayor longitud.*/

public class TPRepasoEj9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantP, contCapicua = 0, cantMas2Vocales = 0;
        String palabra, masLarga = "";

        System.out.println("Ingrese la cantidad de palabras a cargar: ");
        cantP = sc.nextInt();

        for (int i = 0; i < cantP; i++) { // Itera segun la cantidad de palabras que se vayan a ingresar
            System.out.println("Ingrese una palabra: ");
            palabra = sc.next();

            if (capicua(palabra)) { // Llama al modulo que verifica si es capicua
                contCapicua++;
            }

            if (mas2Vocales(palabra)) { // Llama al modulo que cuenta la cantidad de vocales
                cantMas2Vocales++;
            }

            /*Verifica si la palabra actual es mas larga que la mas larga actual*/
            if (palabra.length() >= masLarga.length()) { 
                masLarga = palabra;
            }
        }

        System.out.println("Se ingresaron " + contCapicua + " palabras capicua");
        System.out.println("Se ingresadon " + cantMas2Vocales + " palabras con mas de dos vocales");
        System.out.println("La palabra mas larga es: " + masLarga);
    }

    private static boolean capicua(String palabra) { // Modulo que verifica si una palabra ingresada es capicua
        boolean esCapicua = true;
        int i = 0, j = palabra.length() - 1; // i empieza desde la primera posicion y j desde la ultima

        /*Itera mientras que el valor de verdad sea true, y j e i esten en posiciones diferentes*/
        while (esCapicua && i != j) { 
            /*En caso de ser diferentes cambia el valor de verdad a false y corta*/
            if (palabra.charAt(i) != palabra.charAt(j)) { 
                esCapicua = false;
            } else { // En caso de ser iguales, aumenta va a la siguiente posicion segun corresponda
                i++;
                j--;
            }
        }
        return esCapicua;
    }

    private static boolean mas2Vocales(String palabra) {
        // Modulo que cuenta si la palabra tiene mas de 2 vocales
        boolean masDos = false;
        int i = 0, contVocales = 0;

        /*Itera mientras que el valor de verdad sea false y no se salga de la cadena*/
        while (!masDos && i < palabra.length()) { 
            String letra = "";
            letra += palabra.charAt(i);
            if ("aeiouAEIOUáéíóúÁÉÍÓÚ".contains(letra)) { // Verifica que la letra actual sea una vocal
                contVocales++;
            }
            i++;

            if (contVocales > 2) { // Si hay mas de 2 vocales corta
                masDos = true;
            }
        }
        return masDos;
    }

}
