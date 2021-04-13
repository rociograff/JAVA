/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class ej3 {
    
    public static boolean contraSegura (String contra) {
        //Este modulo verifica si la contraseña es segura
        
        //Declaracion de variables
        int cantCarac;
        boolean res = false;
        
        cantCarac = contra.length();      //Cuenta los caracteres de la contraseña
        System.out.println(cantCarac);   
        
        if (contra.matches("[-A Z0-9]+") || cantCarac < 6) {         //Indica las letras desde la "a" a la "z" y los digitos del 0 al 9
            res = true;
        }else {
            if (contra.matches("[-A Z0-9]-") && cantCarac >= 6) {
                res = false;
            }
        }
        return res;
    }
    
    public static void main (String [] args) {
        //Este algoritmo pide y verifica que una contraseña sea segura
        
        //Declaracion de variables
        String contrasena, confirmar;
        boolean segura, iguales, confirmada;
        
        do {
            System.out.println("Ingrese su contraseña");
            contrasena = TecladoIn.readLine();
            segura = contraSegura(contrasena);   //Invoco el modulo
        }while (segura != false);
        
        do {
            System.out.println("Confirme su contraseña");
            confirmar = TecladoIn.readLine();
            iguales = confirmar.equals(contrasena);   //Confirma si la contraseña es igual
        }while (iguales != true);
        
        //Devolucion de datos
        System.out.println("Su contraseña "+confirmar+" es segura");
    }
    
}
