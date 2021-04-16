package EstructurasDeDatos2021.Test.LinealesPropios;
import EstructurasDeDatos2021.Lineales.Estaticas.*;

public class TestPila {
    public static void main(String [] args){

        Pila p1 = new Pila();
        boolean exito = false;
        int longitud;
        // La secuencia va a ser: 1 2 3 4 5 4 3 2 1

        System.out.println("Apilo elementos entre el 0 y el 9");
        System.out.println("Apila 1: " + p1.apilar(1));
        System.out.println("Apila 2: " + p1.apilar(2));
        System.out.println("Apila 3: " + p1.apilar(3));
        System.out.println("Apila 4: " + p1.apilar(4));
        System.out.println("Apila 5: " + p1.apilar(5));
        System.out.println("Apila 4: " + p1.apilar(4));
        System.out.println("Apila 3: " + p1.apilar(3));
        System.out.println("Apila 2: " + p1.apilar(2));
        System.out.println("Apila 4: " + p1.apilar(1));

        System.out.println("Muestro la pila cargada con elementos: " + p1.toString());

        longitud = 10;
        exito = esCapicua(p1, longitud);

        if(exito){
            System.out.println("La secuencia de elementos de la pila es capicua");
        } else{
            System.out.println("La secuencia de elementos de la pila no es capicua");
        }
    }

    /**
     * Metodo que recibe por parametro una estructura de tipo Pila cargada con dígitos del 0 al 9, 
     * y verifica si la secuencia forma un número capicuo o no. Retorna un valor booleano
     * @param p1
     * @param longitud
     * @return boolean exito
     */
    public static boolean esCapicua(Pila p1, int longitud){
        Pila clon, aux;
        boolean exito = true;
        
        clon = p1.clone();
        aux = new Pila();

        while(clon.obtenerTope() != null){
            aux.apilar(clon.obtenerTope());
            clon.desapilar();
        }
        while(exito && !aux.esVacia()){
            if(!aux.obtenerTope().equals(p1.obtenerTope())){
                exito = false;
            }
            aux.desapilar();
            p1.desapilar();
        }
        return exito;
    }
}
