/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaSimulacro;

/**
 *
 * @author usuario
 */
public class Salon {
    //Clase que determina las siguientes especificaciones
    
    //Atributos
    //Estructura que tiene los objetos en la clase Salon
    private String nombre;
    private int capacidad;
    private boolean musica;
    private String direccion;
    private String telefono;
    
    //Metodos Constructores
    public Salon (String nombre) {
        this.nombre = nombre;
    }
    
    public Salon (String nom, int cap, boolean music, String dire, String tel) {
        nombre = nom;
        capacidad = cap;
        musica = music;
        direccion = dire;
        telefono = tel;
    }
    
    //Metodos Modificadores
    public void setNombre (String nom) {
        nombre = nom;
    }
    
    public void setCapacidad (int cap) {
        capacidad = cap;
    }
    
    public void setMusica (boolean music) {
        musica = music;
    }
    
    public void setDireccion (String dire) {
        direccion = dire;
    }
    
    public void setTelefono (String tel) {
        telefono = tel;
    }
    
    //Metodos Observadores
    public String getNombre () {
        return nombre;
    }
    
    public int getCapacidad () {
        return capacidad;
    }
    
    public boolean getMusica () {
        return musica;
    }
    
    public String getDireccion () {
        return direccion;
    }
    
    public String getTelefono () {
        return telefono;
    }
    
    public String toString () {
        return "Nombre: "+nombre
                +" Capacidad: "+capacidad
                +" Permite Musica: "+musica
                +" Direccion: "+direccion
                +" Telefono: "+telefono;
    }
    
    //Propias del Tipo
    public boolean equals (Salon s) {
        return this.nombre.equalsIgnoreCase(s.getNombre()) && 
                this.direccion.equalsIgnoreCase(s.getDireccion()) &&
                this.telefono.equalsIgnoreCase(s.getTelefono());
    }
   
}
