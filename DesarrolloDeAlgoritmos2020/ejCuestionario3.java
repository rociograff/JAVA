package DesarrolloDeAlgoritmos2020;

public class ejCuestionario3 {
    public static void main (String [] args) {
        int numero = 2111;
        verificarDigitos(numero);
    }

    public static boolean verificarDigitos (int num) {
        boolean verificar = true;
        int unidad, decena;
        if (num < 10) {
            verificar = true;
        }else {
            unidad = num % 10;
            decena = (num % 100 - unidad) / 10;
            if(!(unidad == decena && verificarDigitos(num/10))) {
                verificar = false;
            }
        }   
        return verificar;
    }
}
