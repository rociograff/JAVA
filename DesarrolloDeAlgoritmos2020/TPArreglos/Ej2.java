package TPArreglos;
import java.util.Scanner;

/*Diseñar un algoritmo en pseudocódigo que llene un arreglo de 5 números con valores fijos y
luego escriba un cartel en pantalla que diga “Arreglo de números” y a continuacón muestre
los elementos del arreglo separados por un '-'. 
*/

public class Ej2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] arregloNum = new int[5];
        int num;

        for (int i = 0; i < arregloNum.length; i++) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            arregloNum[i] = num;
        }

        for (int i = 0; i < arregloNum.length; i++) {
            if (i + 1 != arregloNum.length) {
                System.out.print(arregloNum[i] + " - ");
            } else {
                System.out.println(arregloNum[i]);
            }
        }
    }
}