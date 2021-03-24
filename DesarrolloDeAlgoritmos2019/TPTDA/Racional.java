/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocio Graff
 */
package TPTDA;
public class Racional {

    //Atributos
    private int numerador;
    private int denominador;

    //Constructor
    public Racional(int n, int d) {
        numerador = n;
        denominador = d;
    }

    //Metodos Modificadores
    public void setNumerador(int nuevoNumerador) {
        numerador = nuevoNumerador;
    }

    public void setDenominador(int nuevoDenominador) {
        denominador = nuevoDenominador;
    }

    //Metodos Observadores
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public double pasarADouble() {
        double num;
        return num = (double) numerador / (double) denominador;
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

    public boolean equals(Racional r) {
        return (pasarADouble() == r.pasarADouble());
    }

    //Propias del tipo
    public Racional sumar(Racional r) {
        Racional nuevoRacional;
        int nuevoDen = denominador * r.getDenominador();
        int nuevoNum = ((numerador * r.getDenominador()) + (denominador * r.getNumerador()));
        nuevoRacional = new Racional(nuevoNum, nuevoDen);
        return (Racional) nuevoRacional;
    }

    public Racional restar(Racional r) {
        Racional nuevoRacional;
        int nuevoDen = denominador * r.getDenominador();
        int nuevoNum = ((numerador * r.getDenominador()) - (denominador * r.getNumerador()));
        nuevoRacional = new Racional(nuevoNum, nuevoDen);
        return (Racional) nuevoRacional;
    }

    public Racional multiplicar(Racional r) {
        Racional nuevoRacional;
        int nuevoDen = denominador * r.getDenominador();
        int nuevoNum = numerador * r.getNumerador();
        nuevoRacional = new Racional(nuevoNum, nuevoDen);
        return (Racional) nuevoRacional;
    }

    public Racional dividir(Racional r) {
        Racional nuevoRacional;
        int nuevoDen = denominador * r.getNumerador();
        int nuevoNum = numerador * r.getDenominador();
        nuevoRacional = new Racional(nuevoNum, nuevoDen);
        return (Racional) nuevoRacional;
    }
    
    public void simplificar(Racional r){
        int a = r.getNumerador(), b = r.getDenominador(), resto;
        Racional nuevoRacional;
        
        do{
            resto = a%b;
            a = b;
            b = resto;
        }while (resto != 0);
        nuevoRacional = new Racional (r.getNumerador()/a,r.getDenominador()/a);
        System.out.println(nuevoRacional);
    }
}
