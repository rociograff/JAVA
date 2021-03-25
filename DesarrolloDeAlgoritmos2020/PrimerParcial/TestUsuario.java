package DesarrolloDeAlgoritmos2020.PrimerParcial;

import java.util.Scanner;

public class TestUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario[] arreglo;
        boolean terminar = false, cargado = false;
        int cantUsuarios, opcion, numero = 2;

        System.out.println("Ingrese la cantidad de usuarios que quiere cargar: ");
        cantUsuarios = sc.nextInt();

        arreglo = new Usuario[cantUsuarios];

        while (!terminar) {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarDatos(arreglo);
                    cargado = true;
                    break;
                case 2:
                    mostrarDatosPreferenciales(arreglo, cargado);
                    break;
                case 3:
                    mostrarNombres(arreglo, cargado, 2);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }

    }

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Cargar Datos.");
        System.out.println("(2) Mostrar Datos de usuarios preferenciales y no preferenciales.");
        System.out.println("(3) Mostrar Datos de usuarios cuyos nombres tengan menos de dos vocales.");
    }

    public static void cargarDatos(Usuario[] a) {
        Scanner sc = new Scanner(System.in);
        Usuario u;
        String nombre, clave, tipo;
        int duracionPermanencia;
        boolean esPreferencial;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el nombre del usuario: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese la clave del usuario: ");
            clave = sc.nextLine();
            System.out.println("Ingrese el tipo del usuario('A': visitante, 'B': colaborador, 'C': asistente): ");
            tipo = sc.nextLine();
            System.out.println("Ingrese la duracion en horas de la permanencia del usuario: ");
            duracionPermanencia = sc.nextInt();
            System.out.println("¿El usuario es preferencial? (True/False): ");
            esPreferencial = sc.nextBoolean();

            u = new Usuario(nombre, clave, tipo, duracionPermanencia, esPreferencial);
            a[i] = u;
        }
    }

    public static void preferenciales(Usuario[] a, int pref) {
        // dado el arreglo de usuarios y el numero de usuarios preferenciales creo un arreglo, lo guardo con los preferenciales y lo muestro
        Usuario[] preferencial = new Usuario[pref];
        int j = 0, i;
        for (i = 0; i < a.length; i++) {
            if (a[i].getEsPreferencial()) {
                preferencial[j] = a[i];
                j++;
            }
        }
        System.out.println("Los usuario preferenciales: ");
        for (i = 0; i < preferencial.length; i++) {
            System.out.println(preferencial[i].toString());
            System.out.println("---------");
        }
    }

    public static void noPreferenciales(Usuario[] a, int noPref) {
        // dado el arreglo de usuarios y el numero de usuarios no preferenciales creo un arreglo, lo guardo con los preferenciales y lo muestro
        Usuario[] noPreferencial = new Usuario[noPref];
        int j = 0, i;
        for (i = 0; i < a.length; i++) {
            if (a[i].getEsPreferencial() == false) {
                noPreferencial[j] = a[i];
                j++;
            }
        }
        System.out.println("Los usuario no preferenciales: ");
        for (i = 0; i < noPreferencial.length; i++) {
            System.out.println(noPreferencial[i].toString());
            System.out.println("---------");
        }
    }

    public static void mostrarDatosPreferenciales(Usuario[] a, boolean cargado) {
        // este modulo lo que hace es contar cuantos pref y noPref hay, con eso voy a hacer 2 arreglos
        Scanner sc = new Scanner(System.in);
        int pref = 0, noPref = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getEsPreferencial() == true) {
                pref++;
            } else {
                noPref++;
            }
        }
        preferenciales(a, pref);
        noPreferenciales(a, noPref);
    }

    public static void mostrarNombres(Usuario[] a, boolean cargado, int num) {
        boolean retorno;
        int contador = 0;
        if (cargado) {
            for (int i = 0; i < a.length; i++) {
                String nombre = a[i].getNombre();
                retorno = true;
                for (int j = 0; j < nombre.length() && retorno; j++) {
                    char aux = nombre.charAt(i);
                    if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u' || aux == 'A' || aux == 'E'
                            || aux == 'I' || aux == 'O' || aux == 'U') {
                        contador++;
                    }
                    if (contador >= num) {
                        retorno = false;
                        System.out.println(a[i].toString());
                    }

                }
            }
        }
    }

}
