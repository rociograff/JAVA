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
public class pareimpar {
    
    public static int esPar(int numeros) {
        //Modulo que determina si es par
        
        int res;
        
        res = 0;
        
        if ((numeros % 2) == 0){
            res = res + 1;
        }else {
            res = res + 0;
        }
        return res;
    }
    
    public static int esImpar (int numeros) {
        //Modulo que determina si es impar
        
        int res1;
        
        res1 = 0;
        
        if (numeros % 2 != 0) {
            res1 = res1 + 1;
        }else {
            res1 = res1 + 0;
        }
        return res1;
    }
    public static void main (String [] argas) {
        //Este algoritmo determina si un numero es par o impar
        
        int numeros, n, i, contadorPar, contadorImpar, acumPar, acumImpar;
        
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        n = TecladoIn.readLineInt();
        
        contadorPar = 0;
        contadorImpar = 0;
        acumPar = 0;
        acumImpar = 0;
       
        
        for (i = 1; i <= n; i++){
            System.out.println("Ingrese un numero");
            numeros = TecladoIn.readLineInt();
            
            contadorPar = esPar(numeros);
            contadorImpar = esImpar(numeros);
            
            acumPar = acumPar + contadorPar;
            acumImpar = acumImpar + contadorImpar;
        }
        
        System.out.println("De los "+n+" numero que ingreso "+acumPar+" son pares y "+acumImpar+" son impares");
        
    }
    
}
