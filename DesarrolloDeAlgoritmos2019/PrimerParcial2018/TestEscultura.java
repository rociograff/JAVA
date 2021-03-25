/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcial2018;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
public class TestEscultura {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar. ");
        System.out.println("(1) Cargar Datos.");
        System.out.println("(2) Listar esculturas con altura inferior a 2 mts y disponibles para la venta.");
        System.out.println("(3) Listar esculturas con mayor precio y disponibles para la venta.");
    }

    public static void main(String[] args) {
        Escultura[] arreglo;
        boolean terminar = false;
        int opcion, longitud;

        System.out.println("Ingrese la longitud del arreglo: ");
        longitud = TecladoIn.readLineInt();

        arreglo = new Escultura[longitud];

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    cargarDatos(arreglo, longitud);
                    break;
                case 2:
                    mostrarEsculturas(arreglo, 0);
                    break;
                case 3:
                    Escultura esc = null;
                    mayorImporte(arreglo, esc);
                    break;
            }
        }
    }

    public static Escultura cargarDatos(Escultura[] arreglo, int longitud) {
        String nombre;
        int codigo, categoria;
        double altura, precio;
        boolean disponibilidad;
        Escultura e;

        System.out.println("Ingrese el nombre de la escultura: ");
        nombre = TecladoIn.readLine();
        System.out.println("Ingrese el codigo: ");
        codigo = TecladoIn.readLineInt();
        System.out.println("Ingrese la altura: ");
        altura = TecladoIn.readLineDouble();
        System.out.println("Ingrese el precio: ");
        precio = TecladoIn.readLineDouble();
        System.out.println("¿Esta disponible para la venta? true/false");
        disponibilidad = TecladoIn.readLineBoolean();
        System.out.println("Ingrese la categoria: ");
        categoria = TecladoIn.readLineInt();

        e = new Escultura(nombre, codigo, altura, precio, disponibilidad, categoria);

        return e;
    }

    public static void mostrarEsculturas(Escultura[] arreglo, int longitud) {
        int i;

        for (i = 0; i < longitud; i++) {
            if ((arreglo[i].getAltura() < 2)&& arreglo[i].getDisponibleParaVenta()) {
                System.out.println(arreglo[i].toString());
            }
        }

    }
    
    public static void mayorImporte(Escultura[] arreglo, Escultura esc) {
        int i;
        boolean verificar = true;

        if (verificar) {
            for (i = 0; i < arreglo.length; i++) {
                if (arreglo[i].getCategoria() == esc.getCategoria() && arreglo[i].mayorImporte(esc) && arreglo[i].getDisponibleParaVenta()) {
                    System.out.println(arreglo[i].toString());
                }
            }
        }
    }

}
