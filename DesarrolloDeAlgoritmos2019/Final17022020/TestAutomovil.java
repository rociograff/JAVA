/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final17022020;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
public class TestAutomovil {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Cargar Datos.");
        System.out.println("(2) Mostrar los autos que tengan tipo de seguro contra todo riesgo con franquicia.");  //Forma recursiva
    }

    public static void main(String[] args) {
        Automovil[] arregloAuto;
        int longitud, posicion = 0, opcion;
        boolean terminar = false;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arregloAuto = new Automovil[longitud];

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarDatos(arregloAuto, posicion);
                    posicion++;
                    break;
                case 2:
                    mostrarAutos(arregloAuto, posicion - 1, 0);
                    break;
            }
        }
    }

    public static void cargarDatos(Automovil[] arreglo, int pos) {
        Automovil a;
        String patente, marca;
        int dni, modelo, cantAccidentes;
        char tipoSeguro;
        double monto;
        boolean franquicia;

        System.out.println("Ingrese la petente del auto: ");
        patente = TecladoIn.readLine();
        System.out.println("Ingrese el DNI del dueño: ");
        dni = TecladoIn.readLineInt();
        System.out.println("Ingrese la marca del auto: ");
        marca = TecladoIn.readLine();
        System.out.println("Ingrese el modelo del auto: ");
        modelo = TecladoIn.readLineInt();
        System.out.println("Ingrese la cantidad de accidentes que tuvo: ");
        cantAccidentes = TecladoIn.readLineInt();
        System.out.println("Ingrese el tipo de seguro del auto: s/r"); //S = Seguro que no cubre todo R = Seguro contra todo riesgo
        tipoSeguro = TecladoIn.readLineNonwhiteChar();
        System.out.println("Ingrese el monto del auto: ");
        monto = TecladoIn.readLineDouble();
        franquicia = cargarFranquicia();

        a = new Automovil(patente, dni, marca, modelo, cantAccidentes, tipoSeguro, monto, franquicia);
        arreglo[pos] = a;
    }

    public static boolean cargarFranquicia() {
        //Modulo para cargar si el seguro tiene franquicia
        //Declaracion e inicializacion de varaibles
        boolean continuar = true;
        char fran;
        boolean tieneFranquicia = false;

        while (continuar != false) {
            System.out.println("¿El seguro tiene franquicia? s/n");
            fran = TecladoIn.readNonwhiteChar();

            //Si esta disponible devuelve true, caso contrario devuelve false
            switch (fran) {
                case 's':
                    tieneFranquicia = true;
                    continuar = false;
                    break;
                case 'n':
                    tieneFranquicia = false;
                    continuar = false;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return tieneFranquicia;
    }

    public static void mostrarAutos(Automovil[] arreglo, int pos, int indice) {
        if (indice == pos) {
            if (arreglo[indice].getTipoSeguro() == 'r' && arreglo[indice].getFranquicia()) {
                System.out.println(arreglo[indice].toString());
            }
        }else {
            if (arreglo[indice].getTipoSeguro() == 'r' && arreglo[indice].getFranquicia()) {
                System.out.println(arreglo[indice].toString());
                mostrarAutos(arreglo, pos, indice + 1);
            }else {
                mostrarAutos(arreglo, pos, indice + 1);
            }
        }
    }
}
