/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final07082019;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
public class TestPerro {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Cargar Datos.");
        System.out.println("(2) Mostrar Datos.");
        System.out.println("(3) Calcular el Importe a Cobrar.");
        System.out.println("(4) Mostrar los nombres comprimidos.");
    }

    public static void main(String[] args) {
        boolean terminar = false;
        int opcion, longitud, posicion = 10;
        String nombre = "", apellido = "";

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        Perro[] guarderia = new Perro[longitud];
        guarderia[0] = new Perro("Max", "Gonzalez", "Golden Retriever", 2010, 150, true);
        guarderia[1] = new Perro("Odin", "Rodriguez Gonzalez", "Husky Siberiano", 2015, 100, true);
        guarderia[2] = new Perro("Thor", "Gomez", "Caniche", 2011, 100, false);
        guarderia[3] = new Perro("Toby", "Fernandez", "Pastor Aleman", 2017, 200, false);
        guarderia[4] = new Perro("Tayson", "Lopez", "Yorkshier Terrier", 2015, 200, true);
        guarderia[5] = new Perro("Simba", "Diaz", "Dalmata", 2011, 300, false);
        guarderia[6] = new Perro("Loki", "Martinez", "Boxer", 2014, 100, false);
        guarderia[7] = new Perro("Timon", "Perez", "Chihuahua", 2017, 300, true);
        guarderia[8] = new Perro("Pumba", "Garcia", "Bulldog Ingles", 2012, 300, true);
        guarderia[9] = new Perro("Pafuera", "Sanchez", "Beagle", 2014, 350, true);

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarDatos(guarderia, posicion);
                    posicion++;
                    break;
                case 2:
                    mostrarDatos(guarderia, posicion);
                    break;
                case 3:
                    importeCobrar(guarderia, posicion);
                    break;
                case 4:
                    mostrarNombres(guarderia, posicion);
                    break;
            }

        }
    }

    public static void cargarDatos(Perro[] guarderia, int pos) {
        Perro p;
        String nombre, apellido, raza;
        int añoNacimiento, importeDiario;
        boolean cuidados;

        System.out.println("Ingrese el nombre del perro: ");
        nombre = TecladoIn.readLineWord();
        System.out.println("Ingrese el apellido del dueño: ");
        apellido = TecladoIn.readLineWord();
        System.out.println("Ingrese la raza del perro: ");
        raza = TecladoIn.readLineWord();
        System.out.println("Ingrese el año de nacimiento del perro: ");
        añoNacimiento = TecladoIn.readLineInt();
        System.out.println("Ingrese el importe diario: ");
        importeDiario = TecladoIn.readLineInt();
        cuidados = cargarCuidadosEspeciales();

        p = new Perro(nombre, apellido, raza, añoNacimiento, importeDiario, cuidados);

        guarderia[pos] = p;
    }

    public static boolean cargarCuidadosEspeciales() {
        //Modulo para cargar la disponibilidad de una vivienda
        //Declaracion e inicializacion de varaibles
        boolean continuar = true;
        char cuidados;
        boolean cuidadosEspeciales = false;

        while (continuar != false) {
            System.out.println("¿El perro tiene cuidados especiales? s/n");
            cuidados = TecladoIn.readNonwhiteChar();

            //Si esta disponible devuelve true, caso contrario devuelve false
            switch (cuidados) {
                case 's':
                    cuidadosEspeciales = true;
                    continuar = false;
                    break;
                case 'n':
                    cuidadosEspeciales = false;
                    continuar = false;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return cuidadosEspeciales;
    }

    public static void mostrarDatos(Perro[] guarderia, int pos) {
        for (int i = 0; i < pos; i++) {
            System.out.println(guarderia[i].toString());
        }
    }

    public static void importeCobrar(Perro[] guarderia, int pos) {
        boolean tuvoCuidados;
        int precioPorDia, cantDias, añoActual = 2019;
        double costoTotal;

        System.out.println("Ingrese la cantidad de dias que estuvo el perro: ");
        cantDias = TecladoIn.readLineInt();

        for (int i = 0; i < pos; i++) {
            tuvoCuidados = guarderia[i].getCuidadoEspecial();
            precioPorDia = guarderia[i].getImporteDiario();

            if (tuvoCuidados) {
                costoTotal = ((precioPorDia * cantDias) * guarderia[i].getPorcIncremento()) / 100;
                if (añoActual - guarderia[i].getAñoNacimiento() <= 2) {
                    costoTotal = costoTotal + 400;
                }
                System.out.println("Total con cuidados especiales " + costoTotal);
            } else {
                costoTotal = precioPorDia * cantDias;
                System.out.println("Total sin cuidados especiales " + costoTotal);
            }
        }
    }

    public static void mostrarNombres(Perro[] guarderia, int pos) {
        for (int i = 0; i < pos; i++) {
            System.out.println(nombreComprimido(guarderia[i].getNombre(), guarderia[i].getApellido()));
        }
    }

    public static String nombreComprimido(String nombre, String apellido) {
        boolean tieneEspacios = false;
        String comprimido = "";
        String subApellido = "";

        if (apellido.lastIndexOf(" ") != -1) {
            tieneEspacios = true;
        } else {
            comprimido = apellido;
        }

        while (tieneEspacios) {
            if (apellido.lastIndexOf(" ") != -1) {
                subApellido = apellido.substring(0, apellido.lastIndexOf(" "));
                comprimido = comprimido + subApellido;
                apellido = apellido.substring(apellido.lastIndexOf(" ") + 1);
            } else {
                comprimido = subApellido + apellido;
                tieneEspacios = false;
            }
        }
        comprimido = nombre + comprimido;

        return comprimido;
    }

}
