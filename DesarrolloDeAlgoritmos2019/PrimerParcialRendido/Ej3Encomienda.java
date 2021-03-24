/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerParcialRendido;

/**
 *
 * @author Rocio Graff
 */
public class Ej3Encomienda {
    
    //Atributos
    private int codigo;
    private int codAgencia;
    private String direccion;
    private double peso;
    private int kilometros;
    private boolean fragil;
    
    //Metodos Constructores
    public Ej3Encomienda (int cod) {
        codigo = cod;
    }
    
    public Ej3Encomienda (int cod, int codAg, String dir, double p, int kil, boolean fr) {
        codigo = cod;
        codAgencia = codAg;
        direccion = dir;
        peso = p;
        kilometros = kil;
        fragil = fr;
    }
    
    //Metodos Modificadores
    public void setCodAgencia(int codAg) {
        this.codAgencia = codAg;
    }
    
    public void setDireccion(String dir) {
        this.direccion = dir;
    }
    
    public void setPeso(double p) {
        this.peso = p;
    }
    
    public void setKilometros(int k) {
        this.kilometros = k;
    }
    
    public void setFragil(boolean fr) {
        this.fragil = fr;
    }
    
    //Metodos Observadores
    public int getCodigo() {
        return this.codigo;
    }
    
    public int getCodAgencia() {
        return this.codAgencia;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public int getKilometros() {
        return this.kilometros;
    }
    
    public boolean getFragil() {
        return this.fragil;
    }
    
    public String toString () {
        return "Codigo: "+getCodigo()+" Codigo Agencia: "+getCodAgencia()+" Direccion: "+getDireccion()+" Peso: "+getPeso()+" Kilometros: "+getKilometros()+" Fragil: "+getFragil();
    }
    
    public boolean equals(Ej3Encomienda e) {
        return this.codigo == e.codigo;
    }
    
}
