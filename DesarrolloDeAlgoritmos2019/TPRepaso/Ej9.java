/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPRepaso;

import Utiles.TecladoIn;

/**
 *
 * @author usuario
 */
public class Ej9 {
    
     public static void main(String[] args) {
        //Declaracion de variables
        String patente, marca, color, anoFabricacion, mayorMarca = "";
        int capacidad, cont = 0, capPromedio;
        int sumaCap = 0;
        int cantRojos = 0;
        int mayorCant = 0, cantPeugeot = 0, cantChevrolet = 0, cantFiat = 0, cantFord = 0, cantVW = 0, cantRenault = 0;
        char siONo;
        boolean repetir = true;
        
        while (repetir != false){
            System.out.println("Ingrese la patente del auto");
            patente = TecladoIn.readLine();
            System.out.println("Ingrese el año de fabricación (DD/MM/AAAA)");
            anoFabricacion = TecladoIn.readLine();
            System.out.println("Ingrese la marca del vehiculo (en minusculas)");
            marca = TecladoIn.readLine();
            System.out.println("Ingrese el color del vehiculo");
            color = TecladoIn.readLine();
            System.out.println("Ingrese la capacidad del vehiculo");
            capacidad = TecladoIn.readInt();
            
            sumaCap = sumaCap + capacidad;
            
            switch (marca){
                case "peugeot":
                    cantPeugeot++;
                case "chevrolet":
                    cantChevrolet++;
                case "fiat":
                    cantFiat++;
                case "ford":
                    cantFord++;
                case "volkswagen":
                    cantVW++;
                case "renault":
                    cantRenault++;
            }
            if (cantPeugeot > mayorCant){
                mayorCant = cantPeugeot;
                mayorMarca = "Peugeot";
            }else if (cantChevrolet > mayorCant){
                mayorCant = cantChevrolet;
                mayorMarca = "Chevrolet";
            }else if (cantFiat > mayorCant){
                mayorCant = cantFiat;
                mayorMarca = "Fiat";
            }else if (cantFord > mayorCant){
                mayorCant = cantFord;
                mayorMarca = "Ford";
            }else if (cantVW > mayorCant){
                mayorCant = cantVW;
                mayorMarca = "Volkswagen";
            }else if (cantRenault > mayorCant){
                mayorCant = cantRenault;
                mayorMarca = "Renault";
            }
            if (color == "rojo"){
                cantRojos++;
            }
            
            cont++;
            
            System.out.println("¿Desea ingresar otro vehiculo? s/n");
            siONo = TecladoIn.readChar();
            
            if (siONo == 's'){
                repetir = true;
            } else if (siONo == 'n'){
                repetir = false;
            }
        }
        
        capPromedio = sumaCap/cont;
        
        System.out.println("La marca que mas vehiculos expuestos tiene es " + mayorMarca + " con " + mayorCant+ " unidades");
        System.out.println("La capacidad promedio es de " + capPromedio + " pasajeros");
        System.out.println("Hay " + cantRojos + " vehiculos rojos");
    }
}

