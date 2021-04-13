/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */

/**
 * El camping La Playa cuenta con un estacionamiento con capacidad para 25 automóviles, por decisión de la
 * administración se permite el ingreso de hasta 110 personas por día y sólo se puede acceder en automóvil. 
 * Para la temporada 2017 se determinó que la tarifa es de $120 por persona y 50 por automovil.
 * Es necesario diseñar en pseudocódigo e implementar en java un programa que permita solicitar la cantidad de 
 * personas que ingresa en cada vehículo y para cada uno calcular y mostrar el monto total a cobrar. 
 * El programa solo permitirá el ingreso de vehículos y personas  mientras no se superen las cantidades establecidas. 
 * Al finalizar la jornada se muestra la cantidad de personas y automóviles que han ingresado.
 */
public class ej4 {
    
    public static void main (String [] args) {
        //Este algoritmo imprime el monto total a cobrar por persona y vehiculo
        
        int cantPersonas, cantAutos = 0, montoP, montoA;
        
        for (cantPersonas = 1; cantPersonas <=110; cantPersonas++) {
            for (cantAutos = 1; cantAutos <=25; cantAutos++) {
                System.out.println("Ingrese la cantidad de personas que van en el auto");
                cantPersonas = TecladoIn.readLineInt();
                cantPersonas++;
            }
            montoP = cantPersonas*120;
            System.out.println("El monto por persona es de "+montoP);
        }
        System.out.println("La cantidad de personas fueron de "+cantPersonas);
        System.out.println("La cantidad de vehiculos fueron de "+cantAutos);
        
    }
    
}
