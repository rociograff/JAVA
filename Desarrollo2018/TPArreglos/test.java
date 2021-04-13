/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo2018.TPArreglos;

/**
 *
 * @author usuario
 */
public class test {
    public static void main(String[] args) {
        // prueba de tincho y juanma para Hornero ej4
        String [] asd = {"hola", "asd", "bcd"};
        String mensaje = "";
                
                for (int i = 0 ; i < asd.length; i++) {
                    mensaje = mensaje + asd[i].substring(0,1);
                }
                
        System.out.println(mensaje);
    }
    
}
