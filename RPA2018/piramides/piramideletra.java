/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramides;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class piramideletra {
    
    public static char transformar (int col) {
        
        char res;
        
        res = ' ';
        
        switch (col){
            case 1: res = 'A';
            break;
            case 2: res = 'B';
            break;
            case 3: res = 'C';
            break;
            case 4: res = 'D';
            break;
        }
        return res;
        
    }
    
    public static void main (String [] args) {
        
        int fila, col, n;
        char trans;
        
        System.out.println("Ingrese la dimension de la matriz");
        n = TecladoIn.readLineInt();
        
        for (fila = 1; fila <= n; fila++){
            for (col = 1; col <= fila; col++) {
                trans = transformar(col);
                System.out.print(trans);
            }
            System.out.println(" ");
        }
    }
    
}
