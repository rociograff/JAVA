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
public class Perro {
    
    //Atributos
    private int codigo;
    private String nombre;
    private char genero;
    private String raza;
    private Fecha fechaIngreso;
    private int cantDias;
    private String nombreDuenio;
    private String telefonoDuenio;
    
    //Constructores
    public Perro (int cod) {
        codigo = cod;
    }
    
    public Perro (int cod, String nom, char gen, String raz, Fecha fechaIng, int cantD, String nomDuenio, String tel) {
        codigo = cod;
        nombre = nom;
        genero = gen;
        raza = raz;
        fechaIngreso = fechaIng;
        cantDias = cantD;
        nombreDuenio = nomDuenio;
        telefonoDuenio = tel;
    }
    
    //Metodos Observadores
    public int getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }
    
    public int getCantDias() {
        return cantDias;
    }
    
    public String getNombreDuenio() {
        return nombreDuenio;
    }
    
    public String getTelDuenio() {
        return telefonoDuenio;
    }
    
    public String toString() {
        return "Codigo: "+getCodigo()+" Nombre: "+getNombre()+" Genero: "+getGenero()+
                " Raza: "+getRaza()+" Fecha de Ingreso: "+getFechaIngreso()+" Cantidad de dias: "
                +getCantDias()+" Nombre del Dueño: "+getNombreDuenio()+" Telefono del Dueño: "+getTelDuenio();
    }
    
    public boolean equals(Perro p) {
        return this.codigo == p.codigo;
    }
    
    //Metodos Modificadores
    public void setNombre(String nom) {
        nombre = nom;
    }
    
    public void setGenero(char gen) {
        genero = gen;
    }
    
    public void setRaza(String raz) {
        raza = raz;
    }
    
    public void setFechaIngreso(Fecha fechaIng) {
        fechaIngreso = fechaIng;
    }
    
    public void setCantDias(int cantD) {
        cantDias = cantD;
    }
    
    public void setNombreDuenio(String nomDuenio) {
        nombreDuenio = nomDuenio;
    }
    
    public void setTelDuenio(String telDuenio) {
        telefonoDuenio = telDuenio;
    }
}
