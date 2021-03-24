/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPTDA;

/**
 *
 * @author Rocio Graff
 */
public class Auto {
    
    //Atributos
    private String patente;
    private int cuentaKm;
    private String modelo;
    private boolean disponible;
    
    //Metodos Constructores
    public Auto(String pat) {
        this.patente = pat;
    }
    
    public Auto(String pat, int km, String mod, boolean dispo) {
        this.patente = pat;
        this.cuentaKm = km;
        this.modelo = mod;
        this.disponible = dispo;
    }
    
    //Metodos Modificadores
    public void setCuentaKm(int km){
        this.cuentaKm = km;
    }
    
    public void setModelo (String mod) {
        this.modelo = mod;
    }
    
    public void setDisponible (boolean disp) {
        this.disponible = disp;
    }
    
    //Metodos Observadores
    public String getPatente() {
        return this.patente;
    }
    
    public int getCuentaKm() {
        return this.cuentaKm;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public boolean getDisponible() {
        return this.disponible;
    }
    
    public String toString() {
        return "Patente: " + getPatente() + " Cuenta de km: " + getCuentaKm() + " Modelo: " + getModelo() + " Disponibilidad: " + getDisponible();
    }
    
    public boolean equals (Auto a) {
        return this.patente.equals(a.patente);
    }
}
