/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej2 {
    
    public static String saludo (int hs){
        //Modulo que imprime un saludo segun la hora del dia
        
        //Declaracion de variable
        String hola;
        
        //Inicializacion de variable
        hola = "";
        
        if ((hs > 0) && (hs < 12)){
            System.out.println("Hola, buenos dias. ¿Como te va?");
        }else {
            if ((hs > 12)&&(hs < 21)){
                System.out.println("Hola, buenas tardes. ¿Como te va?");
            }else {
                if ((hs > 21)&&(hs <=24)) {
                    System.out.println("Hola, buenas noches. ¿Como te va?");
                }else{
                    System.out.println("Hora incorrecta");
                }            
            }
        }    
       return hola;
    }
    
    public static void main (String [] args) {
        //Este algoritmo muestra el saludo adecuaco a un momento del dia 
        
        //Zona declaracion de variable
        int hora;
        
        //Zona de entrada y lectura de datos
        System.out.println("Ingrese la hora actual en formato 24 hs sin minutos");
        hora = TecladoIn.readLineInt();
        
        //Devolucion de datos
        System.out.println(saludo(hora));
    }
    
}
