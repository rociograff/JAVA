/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.Final20022018;

/**
 *
 * @author Rocio Graff
 */
public class Producto {
    
    //Atributos
    private String nombre;
    private int codigo;
    private String mesVencimiento;
    private int añoVencimiento;
    private double precio;
    private char categoria;
    private double porcentajeIncremento;
    
    //Constructoras
    public Producto(int cod) {
        this.codigo = cod;
    }
    
    public Producto(String nom, int cod, String mesV, int añoV, double pre, char cat) {
        this.nombre = nom;
        this.codigo = cod;
        this.mesVencimiento = mesV;
        this.añoVencimiento = añoV;
        this.precio = pre;
        this.categoria = cat;
    }
    
    //Metodos Modificadores
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setCodigo(int cod) {
        this.codigo = cod;
    }
    
    public void setMesVencimiento(String mesV) {
        this.mesVencimiento = mesV;
    }
    
    public void setAñoVencimiento(int añoV) {
        this.añoVencimiento = añoV;
    }
    
    public void setPrecio(double pre) {
        this.precio = pre;
    }
    
    public void setCategoria(char cat) {
        this.categoria = cat;
    }
    
    public void setPorcentajeIncremento(double porcIncr) {
        this.porcentajeIncremento = porcIncr;
    }
    
    
}
