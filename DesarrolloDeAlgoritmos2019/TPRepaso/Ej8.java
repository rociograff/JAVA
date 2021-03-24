/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPRepaso;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej8 {

    public static void main(String[] args) {
        //Declaracion de variables
        String nombre, apellido, nombreCompleto = "";
        int edad, paises, acum = 0, i, n, mayor = 0;
        char estCivil, soltero;
        double prom = 0;
        boolean comprueba;

        System.out.println("Ingrese la cantidad de personas encuestadas: ");
        n = TecladoIn.readLineInt();

        for (i = 1; i <= n; i++) {
            System.out.println("Ingrese el nombre: ");
            nombre = TecladoIn.readLine();
            System.out.println("Ingrese el apellido: ");
            apellido = TecladoIn.readLine();
            System.out.println("Ingrese la edad: ");
            edad = TecladoIn.readLineInt();
            acum = acum + edad;
            System.out.println("Ingrese la cantidad de paises visitados: ");
            paises = TecladoIn.readLineInt();

            if (paises > mayor) {
                mayor = paises;
                nombreCompleto = nombre + " " + apellido;
            }

            System.out.println("Ingrese la inicial del estado civil: ");
            estCivil = TecladoIn.readLineNonwhiteChar();
            comprueba = requisitos(estCivil, edad);
            if (comprueba == true) {
                System.out.println("la persona " + nombre + " " + apellido + " puede participar del sorteo");
            } else {
                System.out.println("La persona " + nombre + " " + apellido + " no cumple los requisitos para participar");
            }
        }

        System.out.println("El promedio de edad es " + edadPromedio(n, acum));
        System.out.println("La persona que mas paises visitó es: " + nombreCompleto);
    }

    public static double edadPromedio(int personas, int edad) {

        double prom;

        prom = edad / personas;
        return prom;
    }

    public static boolean requisitos(char estCivil, int edad) {
        boolean puede;
        int rangoMa, rangoMe;
        rangoMa = 62;
        rangoMe = 45;
        char comp = 's';
        
        if ((estCivil == comp) && (edad > rangoMe && edad < rangoMa)) {
            puede = true;
        } else {
            puede = false;
        }
        return puede;
    }
}

