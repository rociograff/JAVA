/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final17122019;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
public class TestLibro {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiete: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Cargar Datos.");
        System.out.println("(2) Mostrar si existe algun libro sin ejemplares.");
        System.out.println("(3) Formar matriz con los autores del libro.");
        System.out.println("(4) Ordenar la matriz por el metodo insercion.");
    }

    public static void main(String[] args) {
        Libro[] arregloLibro;
        String[][] matriz;
        int opcion, longitud, posicion = 0;
        boolean terminar = false;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arregloLibro = new Libro[longitud];

        arregloLibro[0] = new Libro("asd", "El Avocado", "Ramirez; Joaquin", 2);
        arregloLibro[1] = new Libro("ads", "La Palta", "Rozas; Laura", 1);
        arregloLibro[2] = new Libro("das", "EL Aguacate", "Rodriguez Mesa; Pablo Andres", 0);
        arregloLibro[3] = new Libro("dsa", "La Mantequilla Silvestre", "Sanchez Pal; Lautaro", 3);
        arregloLibro[4] = new Libro("sad", "Las Cronicas de los Sinonimos", "Lopez; Julian", 4);

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarLibros(arregloLibro, posicion);
                    posicion++;
                    break;
                case 2:
                    System.out.println("Libros sin ejemplares: " + sinEjemplaresSala(arregloLibro));
                    break;
                case 3:
                    matriz = formarMatriz(arregloLibro);

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[0].length; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    insercion(arregloLibro);
                    matriz = formarMatriz(arregloLibro);

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[0].length; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }

    public static void cargarLibros(Libro[] arreglo, int pos) {
        Libro l;
        String isbn, nombre, autor;
        int ejemplares;

        System.out.println("Ingrese el ISBN: ");
        isbn = TecladoIn.readLine();
        System.out.println("Ingrese el nombre: ");
        nombre = TecladoIn.readLine();
        System.out.println("Ingrese el autor: ");
        autor = TecladoIn.readLine();
        System.out.println("Ingrese la cantidad de ejemplares: ");
        ejemplares = TecladoIn.readLineInt();

        l = new Libro(isbn, nombre, autor, ejemplares);
        arreglo[pos] = l;
    }

    public static boolean sinEjemplaresSala(Libro[] arreglo) {
        boolean ejemplares = false;
        int i = 0;

        while (i < arreglo.length && !ejemplares) {
            if (arreglo[i].getEjemplares() == 0) {
                ejemplares = true;
            }
            i++;
        }
        return ejemplares;
    }

    public static String[][] formarMatriz(Libro[] arreglo) {
        String[][] matriz;
        int i, j, fila, col;

        fila = arreglo.length;
        col = 2;
        matriz = new String[fila][col];

        for (i = 0; i < fila; i++) {
            for (j = 0; j < col; j++) {
                if (j == 0) {
                    matriz[i][j] = convertir(arreglo[i].getAutor());
                } else {
                    matriz[i][j] = arreglo[i].getAutor();
                }
            }
        }
        return matriz;
    }

    public static String convertir(String autor) {
        String aux, retorno;
        boolean espacios = true;
        int pos, espacio;

        pos = autor.lastIndexOf(";");
        retorno = autor.substring(0, pos) + ", ";
        aux = autor.substring(pos + 2);

        while (espacios) {
            espacio = aux.indexOf(" ");

            if (espacio == -1) {
                retorno += aux.charAt(0) + ". ";
                espacios = false;
            } else {
                retorno += aux.charAt(0) + ". ";
                aux = aux.substring(espacio + 1);
            }
        }
        retorno = retorno.toUpperCase();
        return retorno;
    }
/*
    public static void insercion(String[][] matriz) {
        //Metodo de ordenamiento (disminuye y venceras)
        int flag;
        int i, j, largo;
        String aux, aux2;

        largo = matriz.length;

        for (i = 1; i < largo; i++) {
            aux = matriz[i][0];
            aux2 = matriz[i][1];
            j = i;
            flag = aux.compareTo(matriz[j - 1][0]);
            while (j > 0 && flag < 0) {
                matriz[j][0] = matriz[j - 1][0];
                matriz[j][1] = matriz[j - 1][1];
                j--;
            }
            matriz[j][0] = aux;
            matriz[j][1] = aux2;
        }
    }
*/
    public static void insercion(Libro[] a) {
        //Metodo de ordenamiento (disminuye y venceras)

        int i, j, largo;
        Libro aux;
        largo = a.length;
        String aux2;

        for (i = 1; i < largo; i++) {
            aux = a[i];
            j = i;
            aux2 = aux.getAutor();
            while (j > 0 && (aux2.compareTo(a[j - 1].getAutor()) < 0)) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }

}
