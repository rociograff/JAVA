package DesarrolloDeAlgoritmos2020.TPRepaso;

import java.util.Scanner;

/*Para encriptar un mensaje se cambian las vocales por los siguientes símbolos: *, /, +, - y #
(correspondientes a la 'a', 'e', 'I', 'o' y 'u' respectivamente).
Diseñe un módulo que lea un mensaje (una cadena) y genere un mensaje encriptado.
Diseñe el algoritmo que luego de invocar al módulo muestre por pantalla mensaje final.*/

public class TPRepasoEj10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje, encriptado;

        System.out.println("Ingrese un mensaje: ");
        mensaje = sc.nextLine();

        encriptado = encriptarMensaje(mensaje); //Llama al modulo que se encarga de modificar las letras ingresadas

        System.out.println(encriptado);
    }

    private static String encriptarMensaje(String mensaje) { 
        // Modulo que realiza el cambio de vocales por simbolos
        String retorno = "";
        char letra;

        for (int i = 0; i < mensaje.length(); i++) { // Itera hasta llegar al final de la cadena
            letra = mensaje.charAt(i);

            switch (letra) { // Segun la letra actual, concatena el simbolo o no a la cadena encriptada
                case 'a':
                    retorno += '*';
                    break;
                case 'e':
                    retorno += '/';
                    break;
                case 'i':
                    retorno += '+';
                    break;
                case 'o':
                    retorno += '-';
                    break;
                case 'u':
                    retorno += '#';
                    break;
                case 'A':
                    retorno += '*';
                    break;
                case 'E':
                    retorno += '/';
                    break;
                case 'I':
                    retorno += '+';
                    break;
                case 'O':
                    retorno += '-';
                    break;
                case 'U':
                    retorno += '#';
                    break;
                default:
                    retorno += letra;
            }
        }
        return retorno;
    }

}
