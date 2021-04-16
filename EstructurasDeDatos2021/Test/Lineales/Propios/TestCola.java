package EstructurasDeDatos2021.Test.Lineales.Propios;

import EstructurasDeDatos2021.Lineales.Estaticas.*;

/**
 * Se pedia que los estudiantes hagan su propio testCola
 * @author Rocio Graff
 */

public class TestCola {

    static String sOk = "OK!", sErr = "ERROR";

    public static void main(String[] args) {
        testCola();
    }

    public static void testCola() {

        System.out.println("Comienzo del test cola dinamica");
        Cola cola1 = new Cola();

        System.out.println("\nVerifica si es vacia: " + ((cola1.esVacia()) ? sOk : sErr));
        System.out.println("Obtengo el frente de la cola: " + cola1.obtenerFrente());
        System.out.println("Se agregan elementos a la Cola");
        System.out.println("Agregar el elemento 0: " + ((cola1.poner(0)) ? sOk : sErr));
        System.out.println("Agregar el elemento 1: " + ((cola1.poner(1)) ? sOk : sErr));
        System.out.println("Agregar el elemento 2: " + ((cola1.poner(2)) ? sOk : sErr));
        System.out.println("Agregar el elemento 3: " + ((cola1.poner(3)) ? sOk : sErr));
        System.out.println("Verifica si la cola esta vacia debe dar ERROR: " + ((cola1.esVacia()) ? sOk : sErr));
        System.out.println("Obtengo el frente de la cola: " + cola1.obtenerFrente());
        System.out.println("\nMuestro la cola: " + cola1.toString());

        System.out.println("\nComienzo a sacar los elementos de la cola uno por uno");
        System.out.println("Saco un elemento: " + ((cola1.sacar()) ? sOk : sErr));
        System.out.println("Saco un elemento: " + ((cola1.sacar()) ? sOk : sErr));
        System.out.println("Verifica si la cola esta vacia debe dar ERROR: " + ((cola1.esVacia()) ? sOk : sErr));
        System.out.println("\nMuestro la cola: " + cola1.toString());
        System.out.println("Obtengo el frente de la cola: " + cola1.obtenerFrente());

        System.out.println("\nAgregar el elemento 4: " + ((cola1.poner(4)) ? sOk : sErr));
        System.out.println("Agregar el elemento 5: " + ((cola1.poner(5)) ? sOk : sErr));
        System.out.println("Agregar el elemento 6: " + ((cola1.poner(6)) ? sOk : sErr));
        System.out.println("Agregar el elemento 7: " + ((cola1.poner(7)) ? sOk : sErr));
        System.out.println("Agregar el elemento 8: " + ((cola1.poner(8)) ? sOk : sErr));
        System.out.println("Agregar el elemento 9: " + ((cola1.poner(9)) ? sOk : sErr));
        System.out.println("Agregar el elemento 10: " + ((cola1.poner(10)) ? sOk : sErr));
        System.out.println("Verifica si la cola esta vacia debe dar ERROR: " + ((cola1.esVacia()) ? sOk : sErr));
        System.out.println("Obtengo el frente de la cola: " + cola1.obtenerFrente());

        System.out.println("\nMuestro la cola: " + cola1.toString());
        System.out.println("Agregar el elemento 0: " + ((cola1.poner(0)) ? sOk : sErr));
        System.out.println("Obtengo el frente de la cola: " + cola1.obtenerFrente());

        System.out.println("\nMuestro la cola: " + cola1.toString());
        System.out.println("Se vacía la estructura:");
        cola1.vaciar();
        System.out.println("Obtengo el frente de la cola: " + cola1.obtenerFrente());
        System.out.println("Muestro la cola: " + cola1.toString());

        System.out.println("\nSe cargan 10 elementos nuevamente, y se clona la misma");

        System.out.println("Agregar el elemento 0: " + ((cola1.poner(0)) ? sOk : sErr));
        System.out.println("Agregar el elemento 1: " + ((cola1.poner(1)) ? sOk : sErr));
        System.out.println("Agregar el elemento 2: " + ((cola1.poner(2)) ? sOk : sErr));
        System.out.println("Agregar el elemento 3: " + ((cola1.poner(3)) ? sOk : sErr));
        System.out.println("Agregar el elemento 4: " + ((cola1.poner(4)) ? sOk : sErr));
        System.out.println("Agregar el elemento 5: " + ((cola1.poner(5)) ? sOk : sErr));
        System.out.println("Agregar el elemento 6: " + ((cola1.poner(6)) ? sOk : sErr));
        System.out.println("Agregar el elemento 7: " + ((cola1.poner(7)) ? sOk : sErr));
        System.out.println("Agregar el elemento 8: " + ((cola1.poner(8)) ? sOk : sErr));
        System.out.println("Agregar el elemento 9: " + ((cola1.poner(9)) ? sOk : sErr));

        System.out.println("\nAgregar el elemento 10: espera false en estatica true en dinamica:\t" + cola1.poner(10));
        if ((int) cola1.obtenerFrente() == 11) {
            System.out.println("si pongo el 11, lo saca para continuar");
            cola1.sacar();
        }
        System.out.println("Obtengo el frente de la cola: " + cola1.obtenerFrente());

        Cola cola2 = new Cola(); // Creación de una nueva estructura de tipo Cola

        System.out.println("\nClono la estructura previamente cargada con elementos");
        cola2 = cola1.clone();
        System.out.println("Muestro la cola original: " + cola1.toString());
        System.out.println("Muestro la cola clon: \t  " + cola2.toString());
    }
}
