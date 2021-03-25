package DesarrolloDeAlgoritmos2020;
import java.util.Scanner;

public class contar {
    public static void main(String[] args) {
        Scanner pufu = new Scanner(System.in);
        int num, contador = 0;
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero");
            num = pufu.nextInt();
            arreglo[i] = num;
        }

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " numeros pares en el arreglo");
    }
}
