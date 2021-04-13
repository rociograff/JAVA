/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPA2018.piramides;
import RPA2018.utiles.*;

/**
 *
 * @author usuario
 */
public class piramideString {
    public static void main(String []args){
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = TecladoIn.readLine();
        for(int i=0;i<=palabra.length()-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(palabra.charAt(i));
            }
            System.out.println(" ");
        }
    }
}