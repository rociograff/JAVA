/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPArreglos;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej6 {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Mostrar la ciudad que presenta la menor temperatura del pais.");
        System.out.println("(2) Calcular y mostrar el promedio de temperaturas minimas del pais.");
        System.out.println("(3) Mostrar todas las ciudades que tienen temperaturas minimas bajo 0 grados.");
        System.out.println("(4) Mostrar todas las ciudades que tienen temperaturas minimas mayores de 7 grados.");
    }

    public static void main(String[] args) {
        //Declaracion e inicializacion de variables
        boolean terminar = false;
        int opcion, longitud1, longitud2;
        String[] arregloCiudades;    //Declaracion del arreglo de Ciudades
        int[] arregloTemperaturas;   //Declaracion del arreglo de Temperaturas

        System.out.println("Ingrese la longitud del arreglo de Ciudades: ");
        longitud1 = TecladoIn.readLineInt();

        arregloCiudades = new String[longitud1];  //Creacion del arreglo de Ciudades

        cargarArregloCiudad(arregloCiudades, longitud1);  //Invoco el modulo para cargar los elementos del arreglo de Ciudades

        System.out.println("Ingrese la longitud del arreglo de Temperaturas: ");
        longitud2 = TecladoIn.readLineInt();

        arregloTemperaturas = new int[longitud2];  //Creacion del arreglo de Temperaturas

        cargarArregloTemp(arregloTemperaturas, longitud2);  //Invoco el modulo para cargar los elementos del arreglo de Temperaturas

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();
            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    mostrarTempMinima(arregloCiudades, arregloTemperaturas);
                    break;
                case 2:
                    promTempMinimas(arregloTemperaturas);
                    break;
                case 3:
                    temp0Grados(arregloTemperaturas, arregloCiudades);
                    break;
                case 4:
                    temp7Grados(arregloTemperaturas, arregloCiudades);
                    break;
            }
        }
    }

    public static void cargarArregloCiudad(String[] arreglo, int longitud1) {
        //Modulo para cargar elemento por elemento en el arreglo de Ciudades
        String ciudad;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una ciudad: ");
            ciudad = TecladoIn.readLine();
            arreglo[i] = ciudad;
        }
    }

    public static void cargarArregloTemp(int[] arreglo, int longitud2) {
        //Modulo para cargar elemento por elemento en el arreglo de Temperaturas
        int temperatura;
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("Ingrese la temperatura: ");
            temperatura = TecladoIn.readLineInt();
            arreglo[j] = temperatura;
        }
    }

    public static void mostrarTempMinima(String[] ciudad, int[] temperatura) {
        //Modulo para mostrar la ciudad con la menor temperatura del pais
        //Declaracion e inicializacion de variables
        int menorTemperatura = temperatura[0];
        String ciudadMenorTemperatura = "";

        //Estructura repetitiva que recorre el arreglo
        for (int i = 0; i < temperatura.length; i++) {
            if (menorTemperatura >= temperatura[i]) { //Verifica si hay una temperatura menor a la ya señalada
                menorTemperatura = temperatura[i]; //Se asigna el nuevo valor de menor temperatura
                ciudadMenorTemperatura = ciudad[i]; //Se asigna el nombre de la ciudad que posee la menor temperatura
            }
        }
        System.out.println("La menor temperatura (" + menorTemperatura + ") se registro en " + ciudadMenorTemperatura);
    }

    public static void promTempMinimas(int[] temperatura) {
        //Modulo para calcular y mostrar el promedio de las temperaturas minimas del pais
        //Declaracion e inicializacion de variables
        int contador = 0, cantPosiciones = 0;
        double promedio;

        //Estructura repetitiva que recorre el arreglo
        for (int i = 0; i < temperatura.length; i++) {
            contador = contador + temperatura[i];
            cantPosiciones++;
        }
        //Calculo del promedio
        promedio = contador / cantPosiciones;
        System.out.println("La temperatura promedio del pais es de: " + promedio + "ºC");
    }

    public static void temp0Grados(int[] temperatura, String[] ciudad) {
        //Modulo para mostrar todas las ciudades con temperaturas minimas de 0 grados
        //Estructura repetitiva que recorre el arreglo
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] < 0) { //Verifica que la temperatura sea menor a 0
                System.out.println("La ciudad " + ciudad[i] + " tiene temperaturas menores a 0ºC");
            }
        }
    }

    public static void temp7Grados(int[] temperatura, String[] ciudad) {
        //Modulo para mostrar todas las oiudades con temperaturas minimas mayores de 7 grados
        //Estructura repetitiva que recorre el arreglo
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > 7) { //Verifica que la temperatura sea mayor a 7
                System.out.println("La ciudad " + ciudad[i] + " tiene temperaturas superiores a 7ºC");
            }
        }
    }
}
