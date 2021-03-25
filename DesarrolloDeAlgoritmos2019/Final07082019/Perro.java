/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final07082019;

/**
 *
 * @author Rocio Graff
 */
public class Perro {
    
    //Atributos
    private String nombre;
    private String apellidoDueño;
    private String raza;
    private int añoNacimiento;
    private int importeDiario;
    private boolean cuidadoEspecial;
    private double porcentajeIncremento = 10;
    
    //Constructores
    public Perro(String nom) {
        this.nombre = nom;
    }
    
    public Perro(String nom, String ape, String raza, int añoNac, int impD, boolean cuidado) {
        this.nombre = nom;
        this.apellidoDueño = ape;
        this.raza = raza;
        this.añoNacimiento = añoNac;
        this.importeDiario = impD;
        this.cuidadoEspecial = cuidado;
    }
    
    //Metodos Modificadores
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setApellido(String ape) {
        this.apellidoDueño = ape;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void setAñoNacimiento(int añoNac) {
        this.añoNacimiento = añoNac;
    }
    
    public void setImporteDiario(int impD) {
        this.importeDiario = impD;
    }
    
    public void setCuidadoEspecial(boolean cuidado) {
        this.cuidadoEspecial = cuidado;
    }
    
    public void setPorcIncremento(double porcIncremento) {
        this.porcentajeIncremento = porcIncremento;
    }
    
    //Metodos Observadores
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellidoDueño;
    }
    
    public String getRaza() {
        return this.raza;
    }
    
    public int getAñoNacimiento() {
        return this.añoNacimiento;
    }
    
    public int getImporteDiario() {
        return this.importeDiario;
    }
    
    public boolean getCuidadoEspecial() {
        return this.cuidadoEspecial;
    }
    
    public double getPorcIncremento() {
        return this.porcentajeIncremento;
    }
    
    public String toString() {
        return "Nombre del perro: "+getNombre()+" Apellido del Dueño: "+getApellido()+" Raza del perro: "+getRaza()
                +" Año de nacimiento del perro: "+getAñoNacimiento()+" Importe Diario: "+getImporteDiario()
                +" ¿Tiene cuidados especiales? "+getCuidadoEspecial();
                         
    }
    
    public boolean equals(Perro p) {
        return this.nombre.equals(p.nombre) && this.apellidoDueño.equals(p.apellidoDueño);
    }
}
