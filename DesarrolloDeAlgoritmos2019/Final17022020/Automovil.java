/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final17022020;

/**
 *
 * @author Rocio Graff
 */
public class Automovil {

    //Atributos
    private String patente;
    private int DNI;
    private String marca;
    private int modelo;
    private int cantAccidentes;
    private char tipoSeguro;
    private double monto;
    private boolean franquicia;

    //Constructores
    public Automovil(String pat) {
        this.patente = pat;
    }

    public Automovil(String pat, int dni, String mar, int mod, int cantA, char seguro, double mon, boolean fran) {
        this.patente = pat;
        this.DNI = dni;
        this.marca = mar;
        this.modelo = mod;
        this.cantAccidentes = cantA;
        this.tipoSeguro = seguro;
        this.monto = mon;
        this.franquicia = fran;
    }

    //Metodos Observadores
    public String getPatente() {
        return this.patente;
    }
    
    public int getDni() {
        return this.DNI;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public int getModelo() {
        return this.modelo;
    }
    
    public int getCantAccidentes() {
        return this.cantAccidentes;
    }
    
    public char getTipoSeguro() {
        return this.tipoSeguro;
    }
    
    public double getMonto() {
        return this.monto;
    }
    
    public boolean getFranquicia() {
        return this.franquicia;
    }
    
    public String toString() {
        return "Patente: "+getPatente()+" DNI del dueño: "+getDni()+" Marca: "+getMarca()+" Modelo: "+getModelo()
                +" Cantidad de Accidentes: "+getCantAccidentes()+" Tipo de Seguro: "+getTipoSeguro()+" Monto: "+getMonto()
                +" Tiene franquicia? "+getFranquicia();
    }
    
    public boolean equals(Automovil a) {
        return this.patente.equals(a.patente);
    }
    
    //Metodos Modificadores
    public void setPatente(String pat) {
        this.patente = pat;
    }
    
    public void setDni(int dni) {
        this.DNI = dni;
    }
    
    public void setMarca(String mar) {
        this.marca = mar;
    }
    
    public void setModelo(int mod) {
        this.modelo = mod;
    }
    
    public void setCantAccidentes(int cantA) {
        this.cantAccidentes = cantA;
    }
    
    public void setTipoSeguro(char seguro) {
        this.tipoSeguro = seguro;
    }
    
    public void setMonto(double mon) {
        this.monto = mon;
    }
    
    public void setFranquicia(boolean fran) {
        this.franquicia = fran;
    }
}
