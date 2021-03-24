/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPTDA;
import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

public class TestRacional {

    public static void main(String[] args) {
        boolean continuar = true;
        int opcion;

        while (continuar != false) {
            menu();
            opcion = TecladoIn.readInt();
            switch (opcion) {
                case 1:
                    racionalADecimal();
                    break;
                case 2:
                    compararRacional();
                    break;
                case 3:
                    sumarRacional();
                    break;
                case 4:
                    restarRacional();
                    break;
                case 5:
                    multiplicarRacional();
                    break;
                case 6:
                    dividirRacional();
                    break;
                case 7:
                    simplificarRacional();
                    break;
                case 0:
                    continuar = false;
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Ingrese la opcion que desea realizar");
        System.out.println("1: pasar un racional a decimal");
        System.out.println("2: ver si un racional es igual a otro");
        System.out.println("3: sumar");
        System.out.println("4: restar");
        System.out.println("5: multiplicar");
        System.out.println("6: dividir");
        System.out.println("7: simplificar");
        System.out.println("0: finalizar");
    }

    public static Racional crearRacional() {
        int numerador, denominador;
        Racional numero;

        System.out.println("Ingrese el numerador");
        numerador = TecladoIn.readInt();
        System.out.println("Ingrese el denominador");
        denominador = TecladoIn.readInt();

        numero = new Racional(numerador, denominador);

        return numero;
    }

    public static void racionalADecimal() {
        Racional num;
        num = crearRacional();

        System.out.println("El numero en decimal es: " + num.pasarADouble());
    }

    public static void compararRacional() {
        Racional num1, num2;
        num1 = crearRacional();
        num2 = crearRacional();
        
        if (num1.equals(num2)){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros no son iguales");
        }
    }
    
    public static void sumarRacional(){
        Racional num1, num2;
        num1 = crearRacional();
        num2 = crearRacional();
        
        System.out.println("La suma es de: " + num1.sumar(num2));
    }
    
    public static void restarRacional(){
        Racional num1, num2;
        num1 = crearRacional();
        num2 = crearRacional();
        
        System.out.println("La resta es de: " + num1.restar(num2));
    }
    
    public static void multiplicarRacional(){
        Racional num1, num2;
        num1 = crearRacional();
        num2 = crearRacional();
        
        System.out.println("La multiplicacion es de: " + num1.multiplicar(num2));
    }
    
    public static void dividirRacional(){
        Racional num1, num2;
        num1 = crearRacional();
        num2 = crearRacional();
        
        System.out.println("La division es de: " + num1.dividir(num2));
    }
    
    public static void simplificarRacional(){
        Racional num1;
        num1 = crearRacional();
        
        num1.simplificar(num1);
    }
}
