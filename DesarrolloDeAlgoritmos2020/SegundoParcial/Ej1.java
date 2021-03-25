package DesarrolloDeAlgoritmos2020.SegundoParcial;

public class Ej1 {
    public static void burbuja(int [] a) {
        int i, j, n, aux;
        n = a.length;
        for(i = 0; i < n; i++) {
            for(j = 0; j < n - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }
}
