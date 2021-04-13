/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPArreglos;

/**
 *
 * @author usuario
 */
public class Ej4bis {

    public static int fibonacci(int[] arr, int longitud, long[] secFibonacci) {
        //Declaracion de variables
        int i, j, cantIguales = 0;

        //Verifico elemento por elemento si hay alguno parecido al arreglo de Fibonacci
        for (i = 0; i < longitud; i++) {
            for (j = 0; j < longitud; j++) {
                if (arr[i] == secFibonacci[j]) {
                    cantIguales++;
                }
            }
        }
        return cantIguales;
    }

    public static void main(String[] args) {
        //Declaracion e inicializacion de variables
        int[] arreglo = {1, 6, 10, 24, 35, 80, 143};  //Arreglo predefinido de numeros enteros        
        int longitud = arreglo.length;    //Defino la longitud del arreglo
        //La secuencia de Fibonacci va a compartir la misma longitud que el arreglo. No importa el largo del mismo, siempre va a poder comparar con la secuencia  
        long[] secuenciaFibonaccci = new long[arreglo.length];    
        int cantNum, i;
        boolean hayNum;
        secuenciaFibonaccci[0] = 0;
        secuenciaFibonaccci[1] = 1;

        // Armo el arreglo con la secuencia de Fibonacci
        for (i = 2; i < longitud; i++) {
            secuenciaFibonaccci[i] = secuenciaFibonaccci[i - 1] + secuenciaFibonaccci[i - 2];
        }

        cantNum = fibonacci(arreglo, longitud, secuenciaFibonaccci);   //Invoco el modulo

        //Verifico si hay numeros de la sucesion de Fibonacci
        if (cantNum > 0) {
            hayNum = true;
            System.out.println("Hay numeros de la sucesion de Fibonacci? " + hayNum);
        } else {
            hayNum = false;
            System.out.println("Hay numeros de la sucesion de Fibonacci? " + hayNum);
        }

    }

}
