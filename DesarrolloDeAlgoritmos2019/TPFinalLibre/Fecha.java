/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPFinalLibre;

/**
 *
 * @author Rocio Graff
 */
public class Fecha {
    
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    
    //Constructores
    public Fecha (int d, int m, int a) {
        dia = d;
        mes = m;
        anio = a;
    }
    
    public Fecha(int a) {
        this.anio = a;
    }
    
    //Metodos Observadores
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public String toString() {
        return getDia()+"/"+getMes()+"/"+getAnio();
    }
    
    //Propias del Tipo
    public boolean equals(Fecha f) {
        return this.dia == f.dia && this.mes == f.mes && this.anio == f.anio;
    }
    
    public boolean esAnioBisiesto() {
        return this.anio % 4 == 0;
    }
    
}
