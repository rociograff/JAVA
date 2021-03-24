/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPRepaso;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej10 {

    public static void menu() {
        System.out.println("Ingrese una opcion: ");
        System.out.println("(0) Salir.");
        System.out.println("(1) Calcular el perimetro de un cuadrado.");
        System.out.println("(2) Calcular el perimetro de un rectangulo.");
        System.out.println("(3) Calcular el perimetro de un triangulo equilatero.");
        System.out.println("(4) Calcular el perimetro de un circulo.");
        System.out.println("(5) Calcular el area de un cuadrado.");
        System.out.println("(6) Calcular el area de un rectangulo.");
        System.out.println("(7) Calcular el area de un triangulo equilatero.");
        System.out.println("(8) Calcular el area de un circulo.");
    }

    public static void main(String[] args) {
        int opcion;
        double lado, lado1, lado2, radio;
        boolean salir = false;

        while (!salir) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    salir = true;
                    System.out.println("Ha finalizado.");
                    break;
                case 1:
                    System.out.println("Ingrese la medida de un lado: ");
                    lado = TecladoIn.readDouble();
                    System.out.println("El perimetro del cuadrado es: " + calcularPerimetroCuadrado(lado));
                    break;
                case 2:
                    System.out.println("Ingrese la medida de la base: ");
                    lado1 = TecladoIn.readDouble();
                    System.out.println("Ingrese la medida de la altura: ");
                    lado2 = TecladoIn.readDouble();
                    System.out.println("El perimetro del rectangulo es: " + calcularPerimetroRectangulo(lado1, lado2));
                    break;
                case 3:
                    System.out.println("Ingrese la medida de la base: ");
                    lado = TecladoIn.readDouble();
                    System.out.println("El perimetro del triangulo es: " + calcularPerimetroTriangulo(lado));
                    break;
                case 4:
                    System.out.println("Ingrese la medida del radio: ");
                    radio = TecladoIn.readDouble();
                    System.out.println("El perimetro del circulo es: " + calcularPerimetroCirculo(radio));
                    break;
                case 5:
                    System.out.println("Ingrese la medida de un lado: ");
                    lado = TecladoIn.readDouble();
                    System.out.println("El area del cuadrado es: " + calcularAreaCuadrado(lado));
                    break;
                case 6:
                    System.out.println("Ingrese la medida de la base: ");
                    lado1 = TecladoIn.readDouble();
                    System.out.println("Ingrese la medida de la altura: ");
                    lado2 = TecladoIn.readDouble();
                    System.out.println("El area del rectangulo es: " + calcularAreaRectangulo(lado1, lado2));
                    break;
                case 7:
                    System.out.println("Ingrese la medida de la base: ");
                    lado1 = TecladoIn.readDouble();
                    System.out.println("Ingrese la medida de la altura: ");
                    lado2 = TecladoIn.readDouble();
                    System.out.println("El area del triangulo es: " + calcularAreaRectangulo(lado1, lado2));
                    break;
                case 8:
                    System.out.println("Ingrese la medida del radio: ");
                    radio = TecladoIn.readDouble();
                    System.out.println("El area del circulo es: " + calcularAreaCirculo(radio));
                    break;
            }
        }
    }
    
    public static double calcularPerimetroCuadrado(double lado) {
        double resultado;
        resultado = 4*lado;
        return resultado;
    }
    
    public static double calcularPerimetroRectangulo(double lado1, double lado2) {
        double resultado;
        resultado = (2*lado1) + (2*lado2);
        return resultado;
    }
    
    public static double calcularPerimetroTriangulo(double lado) {
        double resultado;
        resultado = 3*lado;
        return resultado;
    }
    
    public static double calcularPerimetroCirculo(double radio) {
        double resultado, pi = 3.14159265359;
        resultado = pi*2*radio;
        return resultado;
    }
    
    public static double calcularAreaCuadrado(double lado) {
        double resultado;
        resultado = 2*lado;
        return resultado;
    }
    
    public static double calcularAreaRectangulo(double lado1, double lado2) {
        double resultado;
        resultado = lado1*lado2;
        return resultado;
    }
    
    public static double calcularAreaTriangulo(double lado1, double lado2) {
        double resultado;
        resultado = (lado1*lado2)/2;
        return resultado;
    }
    
    public static double calcularAreaCirculo(double radio) {
        double resultado, pi = 3.14159265359;
        resultado = pi*(radio*radio);
        return resultado;
    }
}
