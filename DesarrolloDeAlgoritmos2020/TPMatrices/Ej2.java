package TPMatrices;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        int fil, col;

        System.out.println("Ingrese la cantidad de filas de la matriz:");
        fil = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz:");
        col = sc.nextInt();

        matriz = new int[fil][col];

        cargarMatriz(matriz);
        mostrarMatriz(matriz);
    }

    public static void cargarMatriz(int[][] m) {
        Scanner sc = new Scanner(System.in);
        int num;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Ingrese un numero:");
                num = sc.nextInt();
                m[i][j] = num;
            }
        }
    }

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
