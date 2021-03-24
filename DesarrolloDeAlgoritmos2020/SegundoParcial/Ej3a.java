package SegundoParcial;
import java.util.Scanner;

public class Ej3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
        System.out.println("La cantidad de digitos es: "+contarImpares(numero));
    }
    
    public static int contarImpares(int num) {
        int contador = 0;
        
        if(num <= 9) {
            if(num % 2 != 0) {
                contador = 1;
            }
        }else {
            if((num % 10) % 2 != 0) {
                System.out.println(num);
                contador = 1 + contarImpares(num / 10);
            }else {
                contador = contarImpares(num / 10);
            }
        }
        return contador;
    }
}

