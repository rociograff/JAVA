/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo2018.TPArregloBidimensionales;

import Desarrollo2018.utiles.*;

/**
 *
 * @author usuario
 */
public class Rugby_cantidades {

    public static void cargarArreglo(int[][] arreglo) {
        // Modulo que se encarga de cargar elementos al arreglo
        int fila, col;

        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                System.out.println("Ingrese un elemento para la posicion [" + fila + "," + col + "]: ");
                arreglo[fila][col] = TecladoIn.readLineInt();
            }
        }
    }

    public static String categorias(int pos) {
        // Modulo que almacena las categorias de rugby
        String texto = "";

        // Segun la posicion que recibe el modulo va a ser la categoria que corresponda. 
        switch (pos) {
            case 0:
                texto = "M4";
                break;
            case 1:
                texto = "M6";
                break;
            case 2:
                texto = "M7";
                break;
            case 3:
                texto = "M8";
                break;
            case 4:
                texto = "M10";
                break;
        }
        return texto;
    }

    public static String escuelas(int pos) {
        // Modulo que almacena las escuelas de rugby
        String texto = "";

        // Segun la posicion que recibe el modulo va a ser la escuela que corresponda. 
        switch (pos) {
            case 0:
                texto = "Los Patos";
                break;
            case 1:
                texto = "Marabunta";
                break;
            case 2:
                texto = "Roca Rugby Club";
                break;
            case 3:
                texto = "Neuquen Rugby Club";
                break;
            case 4:
                texto = "Allen Rugby Club";
                break;
        }
        return texto;
    }

    public static void gruposDeSiete(int[][] arreglo) {
        // Modulo que muestra el porcentaje de grupos de 7 chicos sobre el total
        int fila, col, total, totalGrupos = 0, cantMayores = 0;

        // Recorro el arreglo contando la cantidad total de equipos + la cantidad de equipos mayores a 7 personas
        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                if (arreglo[fila][col] > 0) {
                    totalGrupos++;
                }
                if (arreglo[fila][col] >= 7) {
                    cantMayores++;
                }
            }
        }
        // Calculo de porcentaje de grupos mayores a 7 niños
        total = (cantMayores * 100) / totalGrupos;

        // Devolucion de datos
        System.out.println("Cantidad de grupos mayores a 7 niños: " + cantMayores);
        System.out.println("Porcentaje que representan del total de grupos: " + total + "%");
    }

    public static int totalAlumnos(int[][] arreglo) {
        // Modulo que muestra el total de alumnos de todas las escuelas
        int fila, col, totalAlumnos = 0;

        // Recorro el arreglo contando la cantidad total de alumnos
        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                if (arreglo[fila][col] > 0) {
                    totalAlumnos = totalAlumnos + arreglo[fila][col]; // Son 217 alumnos en total
                }
            }
        }
        return totalAlumnos;
    }

    public static void porcentajeEscuelas(int[][] arreglo) {
        // Modulo que muestra el total de alumnos por escuela y el porcentaje
        int fila, col, total, alumnosLosPatos = 0, alumnosMarabunta = 0, alumnosRRC = 0, alumnosNRC = 0, alumnosARC = 0;

        // Recorro el arreglo contando la cantidad correspondiente a la escuela + el porcentaje que representan
        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                switch (fila) {
                    case 0:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            alumnosLosPatos = alumnosLosPatos + (arreglo[fila][col]);
                        }
                        System.out.println("Cantidad de alumnos de Los Patos: " + alumnosLosPatos);
                        total = (alumnosLosPatos * 100) / totalAlumnos(arreglo);
                        System.out.println("Porcentaje que representan del total: " + total + "%");
                        break;
                    case 1:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            alumnosMarabunta = alumnosMarabunta + (arreglo[fila][col]);
                        }
                        System.out.println("Cantidad de alumnos de Marabunta: " + alumnosMarabunta);
                        total = (alumnosMarabunta * 100) / totalAlumnos(arreglo);
                        System.out.println("Porcentaje que representan del total: " + total + "%");
                        break;
                    case 2:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            alumnosRRC = alumnosRRC + (arreglo[fila][col]);
                        }
                        System.out.println("Cantidad de alumnos de Roca Rugby Club: " + alumnosRRC);
                        total = (alumnosRRC * 100) / totalAlumnos(arreglo);
                        System.out.println("Porcentaje que representan del total: " + total + "%");
                        break;
                    case 3:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            alumnosNRC = alumnosNRC + (arreglo[fila][col]);
                        }
                        System.out.println("Cantidad de alumnos de Neuquen Rugby Club: " + alumnosNRC);
                        total = (alumnosNRC * 100) / totalAlumnos(arreglo);
                        System.out.println("Porcentaje que representan del total: " + total + "%");
                        break;
                    case 4:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            alumnosARC = alumnosARC + (arreglo[fila][col]);
                        }
                        System.out.println("Cantidad de alumnos de Allen Rugby Club: " + alumnosARC);
                        total = (alumnosARC * 100) / totalAlumnos(arreglo);
                        System.out.println("Porcentaje que representan del total: " + total + "%");
                        break;
                }
            }
        }
    }

    public static void noHayEquipo(int[][] arreglo) {
        // Modulo que muestra que escuela y categoria no llega a armar un equipo
        int fila, col, posFila, posCol;
        String categ, escuela;

        // Recorro el arreglo buscando las categorias jugadores, almaceno la posicion y se lo manda al modulo para decir a que escuela y categoria corresponde
        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                if (arreglo[fila][col] < 7) {
                    posFila = fila;
                    posCol = col;
                    categ = categorias(posCol);
                    escuela = escuelas(posFila);
                    System.out.println("La categoria " + categ + " de " + escuela + " no tiene jugadores suficientes para armar equipo.");
                }
            }
        }
    }

    public static void promedioCategorias(int[][] arreglo) {
        // Modulo que muestra el promedio de alumnos por categoria
        int fila, col, total, catM4 = 0, catM6 = 0, catM7 = 0, catM8 = 0, catM10 = 0;

        // Recorro el arreglo contando la cantidad total de alumnos que hay en cada categoria y el porcentaje que representan
        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                switch (fila) {
                    case 0:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            catM4 = catM4 + (arreglo[col][fila]);
                        }
                        System.out.println("La categoria M4 tiene: " + catM4 + " alumnos.");
                        total = (catM4 * 100) / totalAlumnos(arreglo);
                        System.out.println("Representan el: " + total + "% de todas las categorias.");
                        break;
                    case 1:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            catM6 = catM6 + (arreglo[col][fila]);
                        }
                        System.out.println("La categoria M6 tiene: " + catM6 + " alumnos.");
                        total = (catM6 * 100) / totalAlumnos(arreglo);
                        System.out.println("Representan el: " + total + "% de todas las categorias.");
                        break;
                    case 2:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            catM7 = catM7 + (arreglo[col][fila]);
                        }
                        System.out.println("La categoria M7 tiene: " + catM7 + " alumnos.");
                        total = (catM7 * 100) / totalAlumnos(arreglo);
                        System.out.println("Representan el: " + total + "% de todas las categorias.");
                        break;
                    case 3:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            catM8 = catM8 + (arreglo[col][fila]);
                        }
                        System.out.println("La categoria M8 tiene: " + catM8 + " alumnos.");
                        total = (catM4 * 100) / totalAlumnos(arreglo);
                        System.out.println("Representan el: " + total + "% de todas las categorias.");
                        break;
                    case 4:
                        for (col = 0; col < arreglo[fila].length; col++) {
                            catM10 = catM10 + (arreglo[col][fila]);
                        }
                        System.out.println("La categoria M10 tiene: " + catM10 + " alumnos.");
                        total = (catM4 * 100) / totalAlumnos(arreglo);
                        System.out.println("Representan el: " + total + "% de todas las categorias.");
                        break;
                }
            }
        }
    }

    public static void grupoMasGrande(int[][] arreglo) {
        // Modulo que muestra el grupo mas grande junto a su categoria y escuela
        int fila, col, grupoMayor = 0, posFila = 0, posCol = 0;
        String categ = "", escuela = "";

        //Recorro el arreglo buscando al mayor numero, luego almaceno la posicion donde se lo encontro y son mandadas a sus respectivos modulos
        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                if (arreglo[fila][col] > grupoMayor) {
                    grupoMayor = arreglo[fila][col];
                    posFila = fila;
                    posCol = col;
                }
                categ = categorias(posCol);
                escuela = escuelas(posFila);
            }
        }
        System.out.println("El grupo con mayor cantidad de chicos corresponde a la categoria " + categ + " de " + escuela + " con: " + grupoMayor + " chicos.");
    }

    public static void grupoMasPequeno(int[][] arreglo) {
        // Modulo que muestra el grupo mas chico junto a su categoria y escuela
        int fila, col, grupoMenor = 9999, posFila = 0, posCol = 0;
        String categ = "", escuela = "";

        //Recorro el arreglo buscando al menor numero, luego almaceno la posicion donde se lo encontro y son mandadas a sus respectivos modulos
        for (fila = 0; fila < arreglo.length; fila++) {
            for (col = 0; col < arreglo[fila].length; col++) {
                if (arreglo[fila][col] < grupoMenor) {
                    grupoMenor = arreglo[fila][col];
                    posFila = fila;
                    posCol = col;
                }
                categ = categorias(posCol);
                escuela = escuelas(posFila);
            }
        }
        System.out.println("El grupo con menor cantidad de chicos corresponde a la categoria " + categ + " de " + escuela + " con: " + grupoMenor);
    }

    public static void main(String[] args) {

        int arreglo[][] = new int[5][5];   //Declaracion y creacion de la matriz Rugby

        // Carga de elementos en el arreglo
        cargarArreglo(arreglo);

        // Invocacion de modulos y devolucion de datos
        System.out.println("Grupos mayores a 7 niños");
        gruposDeSiete(arreglo);
        System.out.println(" ");
        System.out.println("Cantidad de alumnos por escuela con sus respectivos porcentajes");
        porcentajeEscuelas(arreglo);
        System.out.println(" ");
        System.out.println("Categorias y escuelas que no llegan a armar el equipo");
        noHayEquipo(arreglo);
        System.out.println(" ");
        System.out.println("Promedio de alumnos por categoria");
        promedioCategorias(arreglo);
        System.out.println(" ");
        System.out.println("Grupo mas grande");
        grupoMasGrande(arreglo);
        System.out.println(" ");
        System.out.println("Grupo mas chico");
        grupoMasPequeno(arreglo);
    }
}
