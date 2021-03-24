/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final17122019;

/**
 *
 * @author Rocio Graff
 */
public class Libro {

    //Atributos
    private String ISBN;
    private String nombre;
    private String autor;
    private int ejemplares;

    //Constructores
    public Libro(String isbn) {
        this.ISBN = isbn;
    }

    public Libro(String isbn, String nom, String aut, int ejem) {
        this.ISBN = isbn;
        this.nombre = nom;
        this.autor = aut;
        this.ejemplares = ejem;
    }

    //Metodos Observadores
    public String getIsbn() {
        return this.ISBN;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public String toString() {
        return "ISBN: " + getIsbn() + " Nombre: "+getNombre()+" Autor: "+getAutor()+" Ejemplares: "+getEjemplares();
    }
    
    public boolean equals(Libro l) {
        return this.ISBN.equals(l.ISBN);
    }
    
    //Metodos Modificadores
    public void setIsbn(String isbn) {
        this.ISBN = isbn;
    }
    
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setAutor(String aut) {
        this.autor = aut;
    }
    
    public void setEjemplares(int ejem) {
        this.ejemplares = ejem;
    }

}
