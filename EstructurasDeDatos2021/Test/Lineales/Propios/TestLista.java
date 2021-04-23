package Test.Lineales.Propios;

import Lineales.Dinamicas.*;

/**
 * @author Rocio Graff
 */

public class TestLista {

    static String sOk = "OK!", sErr = "ERROR";

    public static void main(String[] args) {
        testLista();
    }

    public static void testLista() {
        Lista lista1 = new Lista();
        Lista clon1 = new Lista();
        int pos = 0, longitud;
        Object elem = null;

        System.out.println("\n" + "------------------Comienzo del test lista dinamica------------------");

        System.out.println("\nVerifica si es vacia (debe mostrar OK!): " + ((lista1.esVacia()) ? sOk : sErr));
        System.out.println("\nMuestro la lista (debe mostrar Lista vacia): " + lista1.toString());
        System.out.println("\nObtengo la longitud de la lista (debe mostrar 0): " + lista1.longitud());
        elem = lista1.recuperar(2);
        System.out.println("Recupero el elemento de la posicion 2 (debe mostrar null): " + elem);
        System.out.println("\nSe agregan elementos a la Lista");
        System.out.println("Agregar el elemento 0 en la posicion 0 (debe mostrar ERROR): "
                + ((lista1.insertar(0, 0)) ? sOk : sErr));
        System.out.println("Agregar el elemento 1 en la posicion 1: " + ((lista1.insertar(1, 1)) ? sOk : sErr));
        System.out.println("Agregar el elemento 2 en la posicion 2: " + ((lista1.insertar(2, 2)) ? sOk : sErr));
        System.out.println("Agregar el elemento 3 en la posicion 3: " + ((lista1.insertar(3, 3)) ? sOk : sErr));
        System.out.println("Agregar el elemento 4 en la posicion 4: " + ((lista1.insertar(4, 4)) ? sOk : sErr));
        System.out.println("Agregar el elemento 10 en la posicion 10 (debe mostrar ERROR): "
                + ((lista1.insertar(10, 10)) ? sOk : sErr));
        System.out.println("\nClono la estructura lista");
        clon1 = lista1.clone();
        System.out.println("\nMuestro la lista original: " + lista1.toString());
        System.out.println("\nMuestro la lista clon: " + clon1.toString());
        System.out.println("\nLocalizo el elemento 3 (debe mostrar 3)");
        pos = lista1.localizar(3);
        if (pos > 0) {
            System.out.println("Posicion: " + pos);
        } else {
            System.out.println("El elemento no se encuentra en la lista.");
        }
        elem = lista1.recuperar(1);
        System.out.println("Recupero el elemento de la posicion 1 (debe mostrar 1): " + elem);
        System.out.println("Agregar el elemento 5 en la posicion 5: " + ((lista1.insertar(5, 5)) ? sOk : sErr));
        System.out.println("Agregar el elemento 7 en la posicion 7 (debe mostrar ERROR): "
                + ((lista1.insertar(7, 7)) ? sOk : sErr));
        elem = lista1.recuperar(3);
        System.out.println("Recupero el elemento de la posicion 3 (debe mostrar 3): " + elem);
        System.out
                .println("Verifica si la lista esta vacia (debe mostrar ERROR): " + ((lista1.esVacia()) ? sOk : sErr));
        System.out.println("\nObtengo la longitud de la lista (debe mostrar 5): " + lista1.longitud());
        System.out.println("\nMuestro la lista completa: " + lista1.toString());
        System.out.println("Vacio la lista");
        lista1.vaciar();
        System.out.println("\nMuestro la lista (debe mostrar Lista vacia): " + lista1.toString());
        System.out.println("Localizo el elemento 3 en la lista");
        pos = lista1.localizar(3);
        if (pos > 0) {
            System.out.println("Posicion: " + pos);
        } else {
            System.out.println("El elemento 3 no se encuentra en la lista.");
        }
        elem = lista1.recuperar(2);
        System.out.println("Recupero el elemento de la posicion 2 (debe mostrar null): " + elem);

        System.out.println("\n------------Trabajo sobre la estructura clonada------------");

        System.out.println("\nMuestro la lista clonada: " + "| 1 | 2 | 3 | 4 | \t\t---->\t " + clon1.toString());

        System.out.println("\nVerifica si la lista esta vacia (debe dar ERROR): " + ((clon1.esVacia()) ? sOk : sErr));

        longitud = clon1.longitud();
        System.out.println("\nObtengo la longitud de la lista clonada (debe mostrar 4): " + longitud);
        System.out.println("\nRecupero el elemento de la posicion indicada por longitud (debe mostrar el elemento 4): "
                + clon1.recuperar(longitud));
        System.out.println("\nMuestro la lista clonada: " + clon1.toString());
        System.out.println("\nElimino el elemento indicando la posicion con el valor de longitud: " + longitud);
        clon1.eliminar(longitud);
        System.out.println("\nMuestro la lista clonada: " + clon1.toString());

        System.out.println("\nElimino todos los elementos restantes uno por uno");
        System.out.println("Elimino el elemento de la posicion 3: " + (clon1.eliminar(3) ? sOk : sErr));
        System.out.println("\nMuestro la lista clonada: " + clon1.toString());
        System.out.println("Elimino el elemento de la posicion 2: " + (clon1.eliminar(2) ? sOk : sErr));
        System.out.println("\nMuestro la lista clonada: " + clon1.toString());
        System.out.println("Elimino el elemento de la posicion 1: " + (clon1.eliminar(1) ? sOk : sErr));
        System.out.println("\nMuestro la lista clonada: " + clon1.toString());

        System.out.println("\nVerifica si la lista esta vacia (debe mostrar Ok!): " + ((clon1.esVacia()) ? sOk : sErr));
    }
}
