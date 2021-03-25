package DesarrolloDeAlgoritmos2020.TPRepaso;

import java.util.Scanner;

/*Diseñar un módulo en pseudocódigo que dada una frase y una palabra, cuente cuántas
veces aparece la palabra en la frase.
Piense una implementación usando solo las operaciones longitud (length) y posicion
(charAt) y otra usando todas las operaciones de String (las que usted crea convenientes).
*/

public class TPRepasoEj8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean valida = false;

        System.out.println("Ingrese la forma de hacer el ejercicio: ");
        System.out.println("1: Usando operacion length y charAt");
        System.out.println("2: Usando las operaciones de String necesarias");
        opcion = sc.nextInt();

        while (!valida) { // Verifica que la opcion ingresada sea alguna de las propuestas
            switch (opcion) { // Se tienen en consideracion ambas resoluciones propuestas en el ejercicio
                case 1:
                    opcion1();
                    valida = true;
                    break;
                case 2:
                    opcion2();
                    valida = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void opcion1() { // Modulo que realiza el ejercicio haciendo uso de charAt y length
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int contador;

        System.out.println("Ingrese una frase");
        frase = sc.nextLine();
        System.out.println("Ingrese una palabra a buscar");
        palabra = sc.next();

        /*Llama al modulo que cuenta la cantidad de ocurrencias de la palabra ingresada*/
        contador = contarOcurrenciasPalabra(frase, palabra); 

        System.out.println("La palabra ''" + palabra + "'' aparece " + contador + " veces en la frase");
    }

    private static int contarOcurrenciasPalabra(String frase, String palabra) { 
        /*Este modulo cuenta la cantidad de
            veces que se repite la palabra en la frase*/
        int contador = 0;
        String pNueva = "";
        boolean igual;
        char letra;

        for (int i = 0; i < frase.length(); i++) { // Empiezo a recorrer toda la cadena
            igual = false;
            letra = frase.charAt(i);
            if (letra == ' ') { // Si la posicion actual es un espacio, la cadena se vacia
                pNueva = "";
            } else { //Si la posicion no es un espacio, concatena el caracter en esa posicion a la nueva palabra
                pNueva += letra;
                /*Si i se encuentra en la ultima posicion o si la siguiente es un espacio, llama
                  al modulo que compara las palabras*/
                if (i == frase.length() - 1 || frase.charAt(i + 1) == ' ') { 
                    igual = compararPalabras(pNueva, palabra);
                }
            }
            if (igual) { // En caso de ser iguales aumenta el contador
                contador++;
            }
        }
        return contador;
    }

    private static boolean compararPalabras(String pNueva, String palabra) { 
        /* Modulo que compara 2 palabras
            recorriendolas caracter por caracter*/
        boolean iguales = true;
        int i = 0;

        /*// Itera mientras que el valor de verdad sea
            true, y que i no se salga de ninguna cadena*/
        while (iguales && i < pNueva.length() && i < palabra.length()) { 
            if (pNueva.charAt(i) != palabra.charAt(i)) { // En caso de ser diferentes cambia el valor de verdad a false
                iguales = false;
            } else { // Si los caracteres son iguales pasa a la siguien posicion en ambas cadenas
                i++;
            }
        }
        return iguales;
    }

    private static void opcion2() { // Modulo que realiza el ejercicio haciendo uso de los metodos necesarios
        Scanner sc = new Scanner(System.in);
        String frase, palabra, pNueva;
        int contador = 0;

        System.out.println("Ingrese una frase");
        frase = sc.nextLine();
        System.out.println("Ingrese una palabra a buscar");
        palabra = sc.next();

        while (frase.contains(" ")) { // Itera mientras que queden espacios en la cadena
            pNueva = frase.substring(0, frase.indexOf(" ")); // Hace un substring separando la primer palabra del resto
                                                             // de la cadena
            frase = frase.substring(frase.indexOf(" ") + 1); // Hace un substring con el resto de la cadena

            if (palabra.equals(pNueva)) { // Verifica si las cadena son iguales
                contador++;
            }
        }

        if (frase.equals(palabra)) { // Verifica una ultima vez ya que queda una palabra sin espacios al final
            contador++;
        }

        System.out.println("La palabra ''" + palabra + "'' aparece " + contador + " veces en la frase");
    }

}
