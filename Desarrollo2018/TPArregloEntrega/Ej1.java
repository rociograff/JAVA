/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPArregloEntrega;

import Utiles.TecladoIn;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Ej1 {

    public static int verificarPrimos(int[] codigo) {
        // Modulo que verifica si el codigo ingresado tiene al menos 2 numeros primos
        int cantidad = 0, i, j;
        int longitud = codigo.length;
        boolean esPrimo = false;

        for (i = 0; i < longitud; i++) {    // Recorro el arreglo elemento por elemento
            if (codigo[i] == 1) {
                esPrimo = false;
            } else {
                for (j = 2; j <= codigo[i] / 2; j++) {     // Busco si tiene divisores desde 2 hasta si mismo 
                    if (codigo[i] % j == 0) {
                        esPrimo = true;
                        break;
                    }
                }
            }

            if (esPrimo) {
                cantidad = cantidad + 0;
            } else {
                cantidad++;
            }

        }
        return cantidad;
    }

    public static int[] conversionCN(int[] codigoNuevo) {
        // Modulo que convierte un codigo en uno mas codificado codificadamente con una codificacion codificable
        int i, calculo;
        int longitudNueva = codigoNuevo.length;

        // Recorro el arreglo buscando a los elementos en posiciones impares
        for (i = 1; i < longitudNueva; i = i + 2) {
            calculo = (codigoNuevo[i - 1] + 5) * 3;   // Para los elementos en las posiciones impares realizo la operacion correspondiente al ejercicio
            codigoNuevo[i] = calculo;
        }

        return codigoNuevo;
    }

    public static int[] asignarArrNuevo(int[] codigo) {
        // Modulo que asigna los elementos del codigo viejo al nuevo arreglo de codigos en las posiciones pares
        int i, j = 0, aux;
        int longitud = codigo.length;
        int longitudCodigoNuevo = (longitud * 2);
        int[] codigoNuevo;   //Declaracion del arreglo nuevo de codigos 
        codigoNuevo = new int[longitudCodigoNuevo];   //Creacion del nuevo arreglo de codigos con la nueva longitud 

        // Asignacion de los elementos viejos al arreglo nuevo en las posiciones pares
        for (i = 0; i < longitud; i++) {
            aux = codigo[i];
            codigoNuevo[j] = aux;
            j = j + 2;
        }

        return conversionCN(codigoNuevo);
    }

    public static int intervalo(int[] codigoNuevo) {
        // Modulo que busca a los elementos en el codigo nuevo que estan dentro del intervalo entre 20 y 40
        int i, numerosIntervalo = 0;
        int longitudNueva = codigoNuevo.length;

        // Busqueda y conteo de los elementos dentro del intervalo
        for (i = 0; i < longitudNueva; i++) {
            if (codigoNuevo[i] > 20 && codigoNuevo[i] < 40) {
                numerosIntervalo++;
            }
        }
        return numerosIntervalo;
    }

    public static void cargarArreglo(int[] codigo) {
        // Modulo que carga elemento por elemento al arreglo Codigo
        int i;
        int longitud = codigo.length;

        for (i = 0; i < longitud; i++) {
            System.out.print("Ingrese un elemento para la posicion " + i + ": ");
            codigo[i] = TecladoIn.readLineInt();
        }
    }

    public static void main(String[] args) {
        // Algoritmo principal donde esta el codigo de usuario original
        int[] arregloCodigo;  //Declaracion del arreglo Codigo
        int primos, longitud;

        System.out.print("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readInt();

        arregloCodigo = new int[longitud];   //Creacion del arreglo Codigo con la longitud deseada

        cargarArreglo(arregloCodigo); //Invoco el modulo de carga de los elementos del arreglo

        // Asigno el modulo de verificacion a la variable para luego utilizarla como demostracion de cuantos primos hay en el arreglo original
        primos = verificarPrimos(arregloCodigo);

        // Muestro el codigo original
        System.out.println("Codigo usuario: " + Arrays.toString(arregloCodigo));

        // Serie de prints donde se muestra cada una de las operaciones que se realizaron
        if (primos >= 2) {
            System.out.println("Codigo nuevo: " + Arrays.toString(asignarArrNuevo(arregloCodigo)));
            System.out.println("Cantidad de numeros primos: " + primos);
            System.out.println("Cantidad de numeros entre 20 y 40: " + intervalo(asignarArrNuevo(arregloCodigo)));
        } else {
            System.out.println("No hay suficientes numeros primos en el arreglo.");
        }

    }

}
