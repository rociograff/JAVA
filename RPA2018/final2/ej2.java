/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class ej2 {
    
    public static double tarifa (char tipoVehiculo, int hora) {
        
        double total = 0;
        
        switch (tipoVehiculo) {
            case '1':
                if ((hora >= 7 && hora <=11) || (hora >=16 && hora <=20)) {
                    total = (8 * 100) / 20;
                }else {
                    total = 8;
                }
                break;
                
            case '2':
                if ((hora >= 7 && hora <=11) || (hora >=16 && hora <=20)) {
                    total = (15 * 100) / 20;
                }else {
                    total = 15;
                }
                break;
                
            case '3':
                if ((hora >= 7 && hora <=11) || (hora >=16 && hora <=20)) {
                    total = (30 * 100) / 20;
                }else {
                    total = 30;
                }
                break;      
        }
        return total;
    }
    
    public static void main (String [] args) {
        
        char tipoVehiculo, seguir;
        int hora, cantVehiculos = 0, cantMotos = 0, cantAutos = 0, cantCamiones = 0;
        double monto, recaudacion = 0;
       
        do {
             System.out.println("Ingrese el tipo de vehiculo");
             System.out.println("1: Moto");
             System.out.println("2: Auto");
             System.out.println("3: Camion");
             tipoVehiculo = TecladoIn.readLineNonwhiteChar();
             if (tipoVehiculo == '1'){
                 cantMotos++;
             }else{
                 if (tipoVehiculo == '2'){
                     cantAutos++;
                 }else{
                     if(tipoVehiculo == '3'){
                         cantCamiones++;
                     }
                 }
             }
             cantVehiculos++;
        
             System.out.println("Ingrese el horario en formato 24 hs");
             hora = TecladoIn.readLineInt();
             
             monto = tarifa(tipoVehiculo, hora);
             System.out.println("El monto total es "+monto);
             recaudacion = recaudacion + monto;
             
             System.out.println("Desea seguir?, responder con s/n");
             seguir = TecladoIn.readLineNonwhiteChar();
        }while (seguir == 's');
       
        System.out.println("La cantidad de vehiculos fueron "+cantVehiculos);
        System.out.println("La cantidad de motos fue de "+cantMotos);
        System.out.println("La cantidad de autos fue de "+cantAutos);
        System.out.println("La cantidad de camiones fue de "+cantCamiones);
        System.out.println("La recaudacion total fue de "+recaudacion);
        
    }
    
}
