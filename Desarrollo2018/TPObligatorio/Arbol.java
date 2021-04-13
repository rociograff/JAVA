/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollo2018.TPObligatorio;

/**
 *
 * @author Rocio Graff
 */
public class Arbol {
    //Clase que determina las siquientes especificaciones
    
    //Atributos
    //Estructura que tiene los objetos de la clase Arbol
    private String nombre;
    private int altura;
    private int profRaices;
    private boolean frutos;
    private int tempMinima;
    
    //Metodos constructores
    public Arbol (String nombre) {
        this.nombre = nombre;
    }
    
    public Arbol (String nom, int alt, int pRaices, boolean fr, int tMin) {
        nombre = nom;
        altura = alt;
        profRaices = pRaices;
        frutos = fr;
        tempMinima = tMin;
    }
    
    //Modificadores
    public void setAltura (int alt){
        altura = alt;
    }
    
    public void setProfR (int pRaices){
        profRaices = pRaices;
    }
    
    public void setFrutos (boolean fr) {
        frutos = fr;
    }
    
    public void setTempMin (int tMin) {
        tempMinima = tMin;
    }
    
    //Metodos Observadores
    public String getNombre () {
        return nombre;
    }
    
    public int getAltura () {
        return altura;
    }
    
    public int getProfR () {
        return profRaices;
    }
    
    public boolean getFrutos () {
        return frutos;
    }
    
    public int getTempMin () {
        return tempMinima;
    }
    
    public String toString () {
        return "Nombre: "+nombre+" Altura: "+altura+" Raices: "+profRaices+" Frutos: "+frutos+" Temperatura Minima: "+tempMinima;
    }
    
    //Operaciones Propias del Tipo
    public boolean equals (Arbol a) {
        return this.tempMinima == a.getTempMin() && this.nombre.equals(a.getNombre()) && this.altura == a.getAltura() && 
                this.profRaices == a.getProfR () && a.getFrutos() == this.frutos;
    }
    
    
}
