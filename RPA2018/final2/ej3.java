/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.final2;

import RPA2018.utiles.*;

/**
 *
 * @author usuario
 */
public class ej3 {
    
    public static void main (String [] args){
        
        int i, tiros, mejorJugador = 0;
        double mayor = 0, lanzamiento;
        
        for (i = 1; i <= 8; i++) {
            for (tiros = 1; tiros <= 6; tiros++) {
                System.out.println("Tiro "+tiros);
                System.out.println("Puntaje del lanzamiento");
                lanzamiento = TecladoIn.readLineDouble();
                System.out.println("Tiro "+tiros+": "+lanzamiento);
                
                if (lanzamiento > mayor){             //Verifico cual fue el mayor lanzamiento 
                    mayor = lanzamiento;
                    mejorJugador = i;
                }
            }
        }
        System.out.println("La mayor distancia de lanzamiento fue del atleta "+mejorJugador);
    }
    
}
