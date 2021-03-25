/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocio Graff
 */
package DesarrolloDeAlgoritmos2019.TPTDA;
public class Especie {

    //Atributos
    private String nombre;
    private int poblacion;
    private double tasaDeCrecimiento;

    //Metodos Modificadores
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setPoblacion(int nuevaPoblacion) {
        poblacion = nuevaPoblacion;
    }

    public void setTasaDeCrecimiento(double nuevaTasaDeCrecimiento) {
        tasaDeCrecimiento = nuevaTasaDeCrecimiento;
    }

    //Metodos Observadores
    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getTasaDeCrecimiento() {
        return tasaDeCrecimiento;
    }

    public String toString() {
        return "Nombre: " + getNombre() + " Poblacion: " + getPoblacion() + " Tasa de crecimiento: " + getTasaDeCrecimiento();
    }

    public boolean equals(Especie otroObjeto) {
        return nombre.equalsIgnoreCase(otroObjeto.nombre) && poblacion == otroObjeto.poblacion && tasaDeCrecimiento == otroObjeto.tasaDeCrecimiento;
    }

    //Propias del tipo
    public int poblacionProyectada(int anios) {
        double poblacionXAnio = poblacion;
        double porcentaje = (tasaDeCrecimiento / 100) + 1;
        for (int i = 0; i < anios; i++) {
            poblacionXAnio = poblacionXAnio * porcentaje;
        }
        return (int) poblacionXAnio;
    }
}
