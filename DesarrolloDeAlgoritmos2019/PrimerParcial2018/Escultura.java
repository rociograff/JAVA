/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcial2018;

/**
 *
 * @author Rocio Graff
 */
public class Escultura {
    //Atributos
    private String nombre;
    private int codigo;
    private double altura;
    private double precio;
    private boolean disponibleParaVenta;
    private int categoria;
    
    //Constructoras
    public Escultura(String nombre) {
        this.nombre = nombre;
    }
    
    public Escultura(String nom, int cod, double alt, double pre, boolean dis, int cat) {
        this.nombre = nom;
        this.codigo = cod;
        this.altura = alt;
        this.precio = pre;
        this.disponibleParaVenta = dis;
        this.categoria = cat;
    }
    
    //Metodos Observadores
    public String getNombre() {
        return this.nombre;
    }    
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public boolean getDisponibleParaVenta() {
        return this.disponibleParaVenta;
    }
    
    public int getCategoria() {
        return this.categoria;
    }
    
    public boolean equals(Escultura x) {
        return this.codigo == x.codigo;
    }
    
    public String toString() {
        return "Nombre: "+getNombre()+" Codigo: "+getCodigo()+" Altura: "+getAltura()+" Precio: "+getPrecio()+" Disponibilidad para venta: "+getDisponibleParaVenta()+" Categoria: "+getCategoria();
    }
    
    //Metodos Modificadores
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setCodigo(int cod) {
        this.codigo = cod;
    }
    
    public void setAltura(double alt) {
        this.altura = alt;
    }
    
    public void setPrecio(double pre) {
        this.precio = pre;
    }
    
    public void setDisponibleParaVenta(boolean dis) {
        this.disponibleParaVenta = dis;
    }
    
    public void setCategoria(int cat) {
        this.categoria = cat;
    }
    
    //Propias del Tipo
    public boolean mayorImporte(Escultura b) {
        boolean resp;
        
        if (this.getPrecio() > b.getPrecio()) {
            resp = true;
        }else {
            resp = false;
        }
        
        return resp;
    }
    
}
