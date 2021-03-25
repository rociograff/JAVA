/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.TPRepaso;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej6 {

    public static void main(String[] args) {
        //Declaracion de variables 
        int numero;
        
        System.out.println("Ingrese un numero del 1 al 7 para determinar el dia de la semana");
        numero = TecladoIn.readInt();

        switch (numero) {
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("El dia es domingo");
                break;
            default:
                System.out.println("El numero ingresado es invalido");
        }
    }
}
