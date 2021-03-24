/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPTDA;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
public class TestAuto {

    public static void menu() {
        System.out.println("Ingrese el numero correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Ingresar un auto.");
        System.out.println("(2) Consultar por un auto.");
        System.out.println("(3) Alquiler por modelo.");
        System.out.println("(4) Devolucion de un auto.");
        System.out.println("(5) Mostrar Datos de la Agencia.");
        System.out.println("(6) Mostrar Disponibles.");
    }

    public static void main(String[] args) {
        Auto[] arreglo;
        int opcion, longitud, posicion = 0, kilometraje;
        boolean terminar = false;
        String patente, modelo;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arreglo = new Auto[longitud];

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarDatos(arreglo, posicion);
                    posicion++;
                    break;
                case 2:
                    System.out.println("Ingrese la patente que busca: ");
                    patente = TecladoIn.readLineWord();
                    buscarPorPatente(arreglo, patente, posicion);
                    break;
                case 3:
                    System.out.println("Ingrese el modelo del auto que busca: ");
                    modelo = TecladoIn.readLineWord();
                    alquilerPorModelo(arreglo, modelo, posicion);
                    break;
                case 4:
                    System.out.println("Ingrese la patente del auto que quiere devolver: ");
                    patente = TecladoIn.readLineWord();
                    System.out.println("Ingrese el kilometraje del auto: ");
                    kilometraje = TecladoIn.readLineInt();
                    devolverAuto(arreglo, patente, kilometraje, posicion);
                    break;
                case 5:
                    mostrarDatos(arreglo, posicion);
                    break;
                case 6:
                    mostrarDisponibles(arreglo, posicion);
                    break;
            }
        }
    }

    public static void cargarDatos(Auto[] arreglo, int pos) {
        Auto a;
        String patente, modelo;
        int cuentaKm;
        boolean disponibilidad;

        System.out.println("Ingrese la patente del auto: ");
        patente = TecladoIn.readLineWord();
        System.out.println("Ingrese la cuenta de kilomentros: ");
        cuentaKm = TecladoIn.readLineInt();
        System.out.println("Ingrese el modelo del auto: ");
        modelo = TecladoIn.readLineWord();
        disponibilidad = cargarDisponibilidad();

        a = new Auto(patente, cuentaKm, modelo, disponibilidad);
        arreglo[pos] = a;
    }

    public static boolean cargarDisponibilidad() {
        //Modulo para cargar la disponibilidad de un auto
        //Declaracion e inicializacion de varaibles
        boolean continuar = true;
        char disp;
        boolean disponibilidad = false;

        while (continuar != false) {
            System.out.println("¿El auto esta disponible? s/n");
            disp = TecladoIn.readNonwhiteChar();

            //Si esta disponible devuelve true, caso contrario devuelve false
            switch (disp) {
                case 's':
                    disponibilidad = true;
                    continuar = false;
                    break;
                case 'n':
                    disponibilidad = false;
                    continuar = false;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return disponibilidad;
    }

    public static void buscarPorPatente(Auto[] arreglo, String patente, int pos) {
        int i = 0, aux = - 1;
        boolean encontrado = false;
        Auto a = new Auto(patente);

        while (encontrado != true && i < pos) {
            if (arreglo[i].equals(a)) {
                encontrado = true;
                aux = i;
            } else {
                i++;
            }
        }

        if (aux != -1) {
            System.out.println(arreglo[aux].toString());
        } else {
            System.out.println("No se encontro la patente. ");
        }
    }

    public static void alquilerPorModelo(Auto[] arreglo, String modelo, int pos) {
        int i = 0, aux = - 1;
        boolean encontrado = false;
        Auto a;

        while (encontrado != true && i < pos) {
            if (arreglo[i].getModelo().equals(modelo) && arreglo[i].getDisponible()) {
                encontrado = true;
                aux = i;
            } else {
                i++;
            }
        }

        if (aux != -1) {
            System.out.println(arreglo[aux].toString());
            arreglo[aux].setDisponible(false);
            System.out.println(arreglo[aux].toString());
            /*a = new Auto(arreglo[aux].getPatente(), arreglo[aux].getCuentaKm(), arreglo[aux].getModelo(), false);
            arreglo[aux] = a;
            System.out.println(arreglo[aux].toString());
             */
        } else {
            System.out.println("No contamos con autos disponibles de ese modelo.");
        }
    }

    public static void devolverAuto(Auto[] arreglo, String patente, int kilometraje, int pos) {
        int i = 0, aux = - 1;
        boolean encontrado = false;
        Auto a = new Auto(patente);

        while (encontrado != true && i < pos) {
            if (arreglo[i].equals(a)) {
                encontrado = true;
                aux = i;
            } else {
                i++;
            }
        }

        if (aux != - 1) {
            System.out.println(arreglo[aux].toString());
            arreglo[aux].setDisponible(true);
            arreglo[aux].setCuentaKm(kilometraje);
            System.out.println(arreglo[aux].toString());
        }
    }

    public static void mostrarDatos(Auto[] arreglo, int pos) {
        for (int i = 0; i < pos; i++) {
            System.out.println(arreglo[i].toString());
        }
    }

    public static void mostrarDisponibles(Auto[] arreglo, int pos) {
        for (int i = 0; i < pos; i++) {
            if (arreglo[i].getDisponible()) {
                System.out.println(arreglo[i].toString());
            }
        }
    }
}
