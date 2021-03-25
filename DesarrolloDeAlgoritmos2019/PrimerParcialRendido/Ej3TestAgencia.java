/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.PrimerParcialRendido;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
public class Ej3TestAgencia {

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Listar Datos.");
        System.out.println("(2) Verificar Destino.");
        System.out.println("(3) Verificar Peso.");
        System.out.println("(4) Calcular Importe.");
    }

    public static void main(String[] args) {
        Ej3Encomienda e1;
        boolean terminar = false;
        int opcion;
        
        e1 = cargarDatos();

        while (!terminar) {
            menu();
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    listarDatos(e1);
                    break;
                case 2:
                    verificarDestino(e1);
                    break;
                case 3:
                    verificarPeso(e1);
                    break;
                case 4:
                    calcularImporte(e1);
                    break;
            }
        }
    }

    public static Ej3Encomienda cargarDatos() {
        Ej3Encomienda e;
        int codigo, codAgencia, kilometros;
        String direccion;
        boolean fragil;
        double peso;
        
        System.out.println("Ingrese el codigo: ");
        codigo = TecladoIn.readLineInt();
        System.out.println("Ingrese el codigo de la agencia: ");
        codAgencia = TecladoIn.readLineInt();
        System.out.println("Ingrese la direccion: ");
        direccion = TecladoIn.readLine();
        System.out.println("Ingrese el peso: ");
        peso = TecladoIn.readLineDouble();
        System.out.println("Ingrese la cantidad de kilometros: ");
        kilometros = TecladoIn.readLineInt();
        System.out.println("¿Es fragil? true/false");
        fragil = TecladoIn.readLineBoolean();
        
        e = new Ej3Encomienda(codigo, codAgencia, direccion, peso, kilometros, fragil);
        
        return e;
    }

    public static void listarDatos(Ej3Encomienda e1) {
        System.out.println(e1.toString());
    }
    
    public static void verificarDestino(Ej3Encomienda e1) {
        int agencia;
        
        System.out.println("Ingrese el codigo de la agencia a verificar: ");
        agencia = TecladoIn.readLineInt();
        
        if(e1.getKilometros() > 1000 && e1.getCodAgencia() == agencia) {
            System.out.println(e1.toString());
        }else {
            System.out.println("No hay una encomieda con esas caracteristicas.");
        }
    }
    
    public static void verificarPeso(Ej3Encomienda e1) {
        if(e1.getPeso()> 15 && e1.getFragil()) {
            System.out.println(e1.toString());
        }else {
            System.out.println("No hay una encomienda con esas caracteristicas.");
        }
    }
    
    public static void calcularImporte (Ej3Encomienda e1) {
        int precioBase = 0, importeTotal, kilometros;
        double peso;
        boolean fragil;
        
        peso = e1.getPeso();
        kilometros = e1.getKilometros();
        fragil = e1.getFragil();
        
        if(peso <= 5 && fragil) {
            precioBase = 40;
        }else {
            if (peso <= 5 && !fragil) {
                precioBase = 30;
            }
        }
        
        if(peso > 5 && peso <= 10 && fragil) {
            precioBase = 60;
        }else {
            if(peso > 5 && peso <= 10 && !fragil) {
                precioBase = 50;
            }
        }
        
        if(peso > 10 && peso <= 15 && fragil) {
            precioBase = 80;
        }else {
            if(peso > 10 && peso <= 15 && !fragil) {
                precioBase = 65;
            }
        }
        
        if(peso > 15 && fragil) {
            precioBase = 100;
        }else{
            if(peso > 15 && !fragil) {
                precioBase = 75;
            }
        }
        
        importeTotal = (precioBase * kilometros)/ 100;
        
        System.out.println("El total a pagar es de: "+importeTotal);
    }
}
