package TPRepaso;
import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que permita ingresar una frase por teclado, y en base
a ella busque y muestre la palabra más larga. Suponga que entre las palabras hay un único
espacio en blanco. 
*/

public class TPRepasoEj6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String palabraLarga, ultimaPalabra;
        palabraLarga = " ";
        ultimaPalabra = " ";

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        frase = frase + " ";

        for (i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) != ' ') {
                palabraLarga = palabraLarga + frase.charAt(i);
            }else {
                if(ultimaPalabra.length() < palabraLarga.length()) {
                    ultimaPalabra = palabraLarga;
                    palabraLarga = "";
                }else {
                    palabraLarga = "";
                }
            }
        }

        System.out.println("La palablar mas larga es: " + ultimaPalabra);

    }
}
