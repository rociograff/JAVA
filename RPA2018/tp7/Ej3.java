/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.tp7;

import RPA2018.utiles.*;

/**
 *
 * @author usuario
 */
public class Ej3 {
    //Moodulo 2
    public static int calculoPrecioTotal(int cantBolsas, int diaMes) {
        //Modulo para calcular el precio total
        
        //Declaracion de variable
        int precio, descuento;
        
        if (cantBolsas > 3) {
            if(tieneDescuento(diaMes)){
                precio = 95; // Precio base
                descuento = (precio*25)/100; // Descuento
                
                // Aplicar descuento
                precio = precio-descuento;
            }else{
                precio = 95;
            }
        }else {
            if(tieneDescuento(diaMes)){
                precio = 110; // Precio base
                descuento = (precio*25)/100; // Descuento
                
                // Aplicar descuento
                precio = precio - descuento;
            }else{
                precio = 110;
            }
        }
        return precio;
        
    }
    
    //Modulo 1
    public static boolean tieneDescuento (int diaMes) {
        //Modulo para calcular el descuento
        
        //Declaracion de variable
        boolean descuento;
        
        //Inicialiazacion de variable
        descuento = false;
        
        
        if (diaMes <=10) {
            descuento = true;
        }
        
        return descuento;
    }
    

    public static void main (String [] args) {
        //Este algoritmo muestra cuanto debe pagar el cliente por el total de la compra
        
        //Zona declaracion de variable
        int cantBolsas, diaMes;
        double descuento;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese la cantidad de bolsas de leña");
        cantBolsas = TecladoIn.readLineInt();
        
        System.out.println("Ingrese el dia del mes");
        diaMes = TecladoIn.readLineInt();
        
        //Mostrar un cartel cuanto debe pagar el cliente por el total de la compra
        System.out.println("Usted debe pagar: $" + calculoPrecioTotal(cantBolsas, diaMes) + ".-");
    }
    
}
