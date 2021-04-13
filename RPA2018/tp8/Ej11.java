/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.tp8;
import RPA2018.utiles.*;

public class Ej11 {
    
    public static int calculoTarifa (int hora, int precioHora) {
        //Modulo para calcular el monto a cobrar
        int total;
        total = hora * precioHora;
        return total;
    }
    
    public static void main (String [] args) {
        //Este algoritmo determina el monto a cobrar
        
        //Declaracion de variable
        String patente, patenteAcum;
        int dia, i, precioHora, cantVehiculo, hora, total, monto, acum=0, acumVehiculo;
        
        patenteAcum = " ";
        
        //Entrada y lectura de datos
        System.out.println("Ingrese la cantidad de vehiculos");
        cantVehiculo = TecladoIn.readLineInt();
        
        System.out.println("Ingrese el dia de la semana");
        dia = TecladoIn.readLineInt();
        
        //Determino precio por hora
        if (dia >= 1 && dia <= 5) {
            precioHora = 30;
        }else {
            precioHora = 50;
        }
        
        for (i = 1; i <= cantVehiculo; i++){
        System.out.println("Ingrese la patente del vehiculo "+i);
        patente = TecladoIn.readLine();
        
        System.out.println("Ingrese la cantidad de hora de estadia");
        hora = TecladoIn.readLineInt();
        
        monto = calculoTarifa(hora, precioHora);  //Invoco el modulo
        System.out.println("El monto de este vehiculo es "+monto);
        
        if (monto > acum) {  //Determino cual vehiculo tuvo la mayor estadia con su precio total
            acum = monto;
            patenteAcum = patente;
        }
        }
        System.out.println("El vehiculo "+patenteAcum+" tuvo la mayor estadia con "+acum+" $ ");
    }
}