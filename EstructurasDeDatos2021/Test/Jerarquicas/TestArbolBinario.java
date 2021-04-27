package Test.Jerarquicas;

import Jerarquicas.ArbolBin;
import Lineales.Dinamicas.*;

/**
 * @author Rocio Graff
 */

public class TestArbolBinario {
    static String sOk = "OK!", sErr = "ERROR";
    public static void main(String [] args){
        ArbolBin arbol = new ArbolBin();
        ArbolBin clon = new ArbolBin();
        Lista lisPre, lisIn, lisPos, lisNiv;
        Lista lisPreClon, lisInClon, lisPosClon, lisNivClon;
        Lista lisAncestrosClon;

        System.out.println("---------------Comienzo de carga del arbol binario---------------");

        System.out.println("\nVerifico si el arbol esta vacio: " + (arbol.esVacio() ? sOk : sErr));

        System.out.println("\nAgregar la raiz A: " + (arbol.insertar("A","A", 'I') ? sOk : sErr));

        System.out.println("Agregar el nodo izquierdo B al nodo A: " + (arbol.insertar("B","A", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo derecho C al nodo A: " + (arbol.insertar("C","A", 'D') ? sOk : sErr));
        System.out.println("Agregar el nodo izquierdo D al nodo B: " + (arbol.insertar("D","B", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo izquierdo E al nodo C: " + (arbol.insertar("E","C", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo derecho F al nodo C: " + (arbol.insertar("F","C", 'D') ? sOk : sErr));
        System.out.println("Agregar el nodo izquierdo G al nodo E: " + (arbol.insertar("G", "E", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo derecho H al nodo E: " + (arbol.insertar("H","E", 'D') ? sOk : sErr));

        System.out.println("\nMuestro el arbol binario: " + arbol.toString());

        System.out.println("\nBusco el padre del nodo A: " + arbol.padre("A"));
        System.out.println("Busco el padre del nodo B: " + arbol.padre("B"));
        System.out.println("Busco el padre del nodo C: " + arbol.padre("C"));
        System.out.println("Busco el padre del nodo D: " + arbol.padre("D"));


        System.out.println("\n------Comienzo a listar el arbol en diferentes recorridos------");

        System.out.println("\nMuestro el arbol binario: " + arbol.toString());

        System.out.println("\nListar en preorden");
        lisPre = arbol.listarPreorden();
        System.out.println("Muestro la lista en preorden: " + lisPre.toString());

        System.out.println("\nListar en inorden");
        lisIn = arbol.listarInorden();
        System.out.println("Muestro la lista en inorden: " + lisIn.toString());

        System.out.println("\nListar en posorden");
        lisPos = arbol.listarPosorden();
        System.out.println("Muestro la lista en posorden: " + lisPos.toString());

        System.out.println("\nListar por niveles");
        lisNiv = arbol.listarPorNiveles();
        System.out.println("Muestro la lista en niveles: " + lisNiv.toString());


        System.out.println("\n------Determino la altura del arbol binario------");

        System.out.println("\nMuestro el arbol binario: " + arbol.toString());

        System.out.println("\nLa altura del arbol binario es: " + arbol.altura());

        System.out.println("\nVacio el arbol");
        arbol.vaciar();

        System.out.println("\nVerifico si el arbol esta vacio: " + (arbol.esVacio() ? sOk : sErr));

        System.out.println("\nMuestro el arbol: " + arbol.toString());

        System.out.println("\nLa altura del arbol binario vacio es: " + arbol.altura());

        System.out.println("\nAgregar la raiz A: " + (arbol.insertar("A","A", 'I') ? sOk : sErr));

        System.out.println("\nVerifico si el arbol esta vacio: " + (arbol.esVacio() ? sOk : sErr));

        System.out.println("\nMuestro el arbol: " + arbol.toString());

        System.out.println("\nLa altura del arbol binario solamente con la raiz es: " + arbol.altura());

        System.out.println("\n------Determino el nivel de diferentes elementos sobre el arbol------");

        System.out.println("\nCargo nuevamente el arbol");
        System.out.println("\nAgregar el nodo izquierdo B al nodo A: " + (arbol.insertar("B","A", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo derecho C al nodo A: " + (arbol.insertar("C","A", 'D') ? sOk : sErr));
        System.out.println("Agregar el nodo izquierdo D al nodo B: " + (arbol.insertar("D","B", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo izquierdo E al nodo C: " + (arbol.insertar("E","C", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo derecho F al nodo C: " + (arbol.insertar("F","C", 'D') ? sOk : sErr));
        System.out.println("Agregar el nodo izquierdo G al nodo E: " + (arbol.insertar("G", "E", 'I') ? sOk : sErr));
        System.out.println("Agregar el nodo derecho H al nodo E: " + (arbol.insertar("H","E", 'D') ? sOk : sErr));

        System.out.println("\nVerifico si el arbol esta vacio: " + (arbol.esVacio() ? sOk : sErr));

        System.out.println("\nMuestro el arbol: " + arbol.toString());

        System.out.println("\nEl nivel del nodo raiz A es: " + arbol.nivel("A"));

        System.out.println("\nEl nivel del nodo B es: " + arbol.nivel("B"));

        System.out.println("\nEl nivel del nodo D es: " + arbol.nivel("D"));

        System.out.println("\nEl nivel del nodo H es: " + arbol.nivel("H"));

        System.out.println("\nEl nivel del nodo Z no existente es: " + arbol.nivel("Z"));

        System.out.println("\n------Creo un arbol clon y trabajo sobre el------");

        System.out.println("\nMuestro el arbol original: " + arbol.toString());

        System.out.println("\nClono la estructura de tipo Arbol");

        clon = arbol.clone();

        System.out.println("\nMuestro el arbol clonado: " + clon.toString());

        System.out.println("\nVerifico si el arbol clon esta vacio: " + (clon.esVacio() ? sOk : sErr));

        System.out.println("\nLa altura del arbol binario clon es: " + clon.altura());

        System.out.println("\n------Comienzo a listar el arbol clonado en diferentes recorridos------");

        System.out.println("\nMuestro el arbol binario clon: " + clon.toString());

        System.out.println("\nListar en preorden");
        lisPreClon = clon.listarPreorden();
        System.out.println("Muestro la lista en preorden: " + lisPreClon.toString());

        System.out.println("\nListar en inorden");
        lisInClon = clon.listarInorden();
        System.out.println("Muestro la lista en inorden: " + lisInClon.toString());

        System.out.println("\nListar en posorden");
        lisPosClon = clon.listarPosorden();
        System.out.println("Muestro la lista en posorden: " + lisPosClon.toString());

        System.out.println("\nListar por niveles");
        lisNivClon = clon.listarPorNiveles();
        System.out.println("Muestro la lista en niveles: " + lisNivClon.toString());


        System.out.println("\n------ Busco los ancestros de elementos existentes y no existentes en arbol clon------");

        System.out.println("\nAncestros del nodo raiz A");
        lisAncestrosClon = arbol.obtenerAncestros("A");
        System.out.println("\nMuestro la lista que contiene los ancestros de A: " + lisAncestrosClon.toString());

        System.out.println("\nAncestros del nodo B");
        lisAncestrosClon = arbol.obtenerAncestros("B");
        System.out.println("\nMuestro la lista que contiene los ancestros de B: " + lisAncestrosClon.toString());

        System.out.println("\nAncestros del nodo Z no existente");
        lisAncestrosClon = arbol.obtenerAncestros("Z");
        System.out.println("\nMuestro la lista que contiene los ancestros de Z: " + lisAncestrosClon.toString());
    }
}
