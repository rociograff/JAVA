package DesarrolloDeAlgoritmos2020.TPMatrices;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matriz;
        int orden;

        System.out.println("Ingrese el orden de la matriz:");
        orden = sc.nextInt();

        matriz = new char[orden][orden];

        cargarMatriz(matriz);
        System.out.println("La diagonal de la matriz es: ");
        mostrarDiagonal(matriz);
    }

    public static void cargarMatriz(char[][] m) {
        Scanner sc = new Scanner(System.in);
        char caracter;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Ingrese un caracter:");
                caracter = sc.next().charAt(0);
                m[i][j] = caracter;
            }
        }
    }

    public static void mostrarDiagonal(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }
    }
}
