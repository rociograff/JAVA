package DesarrolloDeAlgoritmos2020.TPRepaso;
import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que dado un valor entero de 3 cifras (debe verificarlo)
descomponga el número para mostrarlo a la inversa utilizando las operaciones MOD y DIV.
Por ejemplo si N=1234 debe mostrar 4321
*/

public class TPRepasoEj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valido = false;

        while (!valido) { // Va a iterar mientras que el numero ingresado no sea valido
            System.out.println("Ingrese un numero para invertir: ");
            num = sc.nextInt();

            if (num >= -999 && num <= 999 && (num >= 100 || num <= -100)) { // Verifico que el numero no tenga mas o
                                                                            // menos de 3 cifras
                valido = true;
            }
        }

        System.out.println("Numero invertido: " + invertir(num));
    }

    private static int invertir(int num) { // Este modulo invierte el numero ingresado
        int n, p = 100, retorno = 0;
        for (int i = 0; i < 3; i++) { // Sabiendo que el numero tiene 3 cifras, va a iterar 3 veces
            n = num % 10; // Saca el ultimo digito del numero
            retorno += n * p; // Lo multiplica por p, que se va reduciendo en 10 en cada iteracion
            num = num / 10; // Elimina el ultimo digito del numero
            p = p / 10; // Divide por 10 para poder seguir trabajando con la unidad siguiente
        }
        return retorno;
    }

}
