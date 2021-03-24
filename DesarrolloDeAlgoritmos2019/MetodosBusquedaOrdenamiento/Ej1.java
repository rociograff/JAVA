/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBusquedaOrdenamiento;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
/*
Realizar la implementación en Java de un método que reciba un arreglo de números enteros y
verifique si los elementos del arreglo respetan un orden creciente o no. Realizar la traza y calcular su tiempo de ejecución.
*/
public class Ej1 {
    public static void main(String[] args) {
        
        boolean continuar = true;
        int[]arregloEntero;
        
        arregloEntero = cargarArreglo(); 
        
        while (continuar != false) {
            menu();
            continuar = opciones(arregloEntero);
        }
    }
    
    public static int[] cargarArreglo() {
        Scanner pufu = new Scanner(System.in);
        int[]arr;
        int longitud, num;
        
        System.out.println("Ingrese la longitud del arreglo");
        longitud = pufu.nextInt();
        
        arr = new int [longitud];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese un numero");
            num = pufu.nextInt();
            
            arr[i] = num;
        }
        
        return arr;
    }
    
    public static void menu() {
        System.out.println("Ingrese la opcion");
        System.out.println("1: Ordenamiento por seleccion");
        System.out.println("2: Ordenamiento de burbuja");
        System.out.println("3: Ordenamiento de burbuja mejorado");
        System.out.println("4: Ordenamiento por insercion");
        System.out.println("0: Finalizar");
    }
    
    public static boolean opciones(int[] a) {
        Scanner pufu = new Scanner (System.in);
        int opcion;
        boolean continuar = true;
        opcion = pufu.nextInt();
        
        switch (opcion) {
            case 1:
                seleccion(a);
                break;
            case 2:
                burbuja(a);
                break;
            case 3:
                burbujaMejorado(a);
                break;
            case 4:
                insercion(a);
                break;
            case 0:
                continuar = false;
                break;
            default:
                System.out.println("Ingresa una opcion correcta la concha de tu madre");
        }
        return continuar;
    }
    
    public static void seleccion(int[]a) {
        int min, temp;
        
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j]<a[min]) {
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
    
    public static void burbuja (int[] a) {
        int temp;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
    public static void burbujaMejorado (int[] a) {
        int aux, n = a.length, i = 0;
        boolean sinCambio = false;
        
        while (i<n && !sinCambio) {
            sinCambio = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                    sinCambio = false;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(a));
    }
    
    public static void insercion (int[] a) {
        int temp, j;
        
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;
            while(j > 0 && temp < a[j-1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}