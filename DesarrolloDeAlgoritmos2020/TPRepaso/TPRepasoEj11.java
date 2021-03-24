package TPRepaso;
import java.util.Scanner;

/* En algunos sistemas informáticos solo se aceptan contraseñas que cumplan con cierto
requerimientos a fin de mejorar el nivel de seguridad de las mismas.
Diseñe un algoritmo que dada una contraseña verifique si cumple con las siguientes
condiciones:
a. Tiene exactamente 8 caracteres
b. Tiene al menos 1 letra
c. Tiene al menos 1 número
d. Tiene al menos 1 caracter: '*' '/' '-' '$' '%' '#'  */

public class TPRepasoEj11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valida = false, longitud = false, letra = false, numero = false, caracter = false;
        String contrasenia;

        while (!valida) { // Itera mientras que la cadena no sea valida
            System.out.println("Ingrese su contrasenia: ");
            contrasenia = sc.next();

            if (contrasenia.length() == 8) { // Si la cadena es de exactamente 8 caracteres, la longitud es correcta
                longitud = true;
                letra = verificarLetra(contrasenia); //Llama al modulo que verifica si hay alguna letra
                numero = verificarNumero(contrasenia); //Llama al modulo que verifica si hay algun numero
                caracter = verificarCaracter(contrasenia); //Llama al modulo que verifica si hay algun simbolo
            }

            if (longitud && letra && numero && caracter) { //En caso de cumplir todas las condiciones, es correcta
                valida = true;
            }
        }
        System.out.println("La contrasenia ingresada es valida");
    }

    private static boolean verificarLetra(String contrasenia) { 
        //Modulo que verifica que haya al menos una letra en la cadena
        boolean retorno = false;
        int i = 0;
        char caracter;

        while (!retorno && i < contrasenia.length()) { //Itera mientras que no encuentre ninguna letra y siga dentro de la cadena
            caracter = contrasenia.charAt(i);
            if (Character.isLetter(caracter)) { //En caso de encontrar una letra corta
                retorno = true;
            } else {
                i++;
            }
        }
        return retorno;
    }

    private static boolean verificarNumero(String contrasenia) { 
        //Modulo que verifica que haya al menos un numero en la cadena
        boolean retorno = false;
        int i = 0;
        char caracter;

        while (!retorno && i < contrasenia.length()) { //Itera mientras que no encuentre ningun numero y siga dentro de la cadena
            caracter = contrasenia.charAt(i);
            if (Character.isDigit(caracter)) { //En caso de encontrar un numero corta
                retorno = true;
            } else {
                i++;
            }
        }
        return retorno;
    }

    private static boolean verificarCaracter(String contrasenia) {
         //Modulo que verifica que haya al menos un simbolo en la cadena
        boolean retorno = false;
        String caracter;
        int i = 0;

        while (!retorno && i < contrasenia.length()) { //Itera mientras que no encuentre ningun simbolo y siga dentro de la cadena
            caracter = "";
            caracter += contrasenia.charAt(i);
            if ("*/-$%#".contains(caracter)) { //En caso de encontrar un simbolo corta
                retorno = true;
            } else {
                i++;
            }
        }
        return retorno;
    }

}
