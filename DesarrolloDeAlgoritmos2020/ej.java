public class ej {

    public static void main(final String[] args) {
        final int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        final int fil = matriz.length;
        int suma;
        suma = diagonal(matriz, 1);

        System.out.println(suma);
    }

    public static int diagonal(final int[][] matriz, final int fil) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
}
