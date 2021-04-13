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
public class piramide {
   public static void main (String [] args){
   int fila,columna,matriz;
   char simbolo;
   
   System.out.println("Ingrese el orden de la mtriz");
   matriz=TecladoIn.readLineInt();
   
   System.out.println("Ingrese un simbolo");
   simbolo=TecladoIn.readLineNonwhiteChar();
   
   for (fila=1;fila<=matriz;fila++){
   
       for (columna=1;columna<=fila;columna++){
       
           System.out.print(simbolo+" ");
       }
   System.out.println(" ");
   }
   
   }
    
}
