/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final22062017;

/**
 *
 * @author Rocio Graff
 */
public class Planta {
    
    //Atributos
    private int codigo;
    private int alturaMaxima;
    private int temperaturaMinima;
    private char lugarIdeal;
    private String color;
    
    //Constructores
    public Planta(int cod) {
        this.codigo = cod;
    }
    
    public Planta (int cod, int altMax, int tempMin, char lugar, String col) {
        this.codigo = cod;
        this.alturaMaxima = altMax;
        this.temperaturaMinima = tempMin;
        this.lugarIdeal = lugar;
        this.color = col;
    }
    
    //Metodos Modificadores
    public void setCodigo(int cod) {
        this.codigo = cod;
    }
    
    public void setAlturaMaxima(int altMax) {
        this.alturaMaxima = altMax;
    }
    
    public void setTemperaturaMinima(int tempMin) {
        this.temperaturaMinima = tempMin;
    }
    
    public void setLugarIdeal(char lugar) {
        this.lugarIdeal = lugar;
    }
    
    public void setColor(String col) {
        this.color = col;
    }
    
    //Metodos Observadores
    public int getCodigo() {
        return this.codigo;
    }
    
    public int getAlturaMaxima() {
        return this.alturaMaxima;
    }
    
    public int getTemperaturaMinima() {
        return this.temperaturaMinima;
    }
    
    public char getLugarIdeal() {
        return this.lugarIdeal;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String toString () {
        return "Codigo de la planta: "+getColor()+" Altura Maxima: "+getAlturaMaxima()
                +" Temperatura Minima: "+getTemperaturaMinima()+" Lugar ideal: "+getLugarIdeal()+" Color: "+getColor();
    }
    
    public boolean equals (Planta p) {
        return this.codigo == p.codigo;
    }
     
}
