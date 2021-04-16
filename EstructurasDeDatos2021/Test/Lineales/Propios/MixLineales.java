package EstructurasDeDatos2021.Test.Lineales.Propios;

import EstructurasDeDatos2021.Lineales.Dinamicas.*;

public class MixLineales {
    public static void main(String[] args) {
        // Declaracion de variables
        Cola c1, nuevaCola;
        // Inicializacion de variables
        c1 = new Cola();

        inicializarCola(c1); // Invocacion del metodo que inicializa una Cola

        System.out.println("Muestro la cola original: " + c1.toString());

        nuevaCola = generarOtraCola(c1);

        System.out.println("Muestro la cola generada: " + nuevaCola.toString());
    }

    public static void inicializarCola(Cola c1) {
        // Metodo que dada una estructura de tipo Cola, la inicializa con valores predefinidos
        System.out.println("Agregar el elemento A: " + c1.poner('A'));
        System.out.println("Agregar el elemento B: " + c1.poner('B'));
        System.out.println("Agregar el elemento $: " + c1.poner('$'));
        System.out.println("Agregar el elemento C: " + c1.poner('C'));
        System.out.println("Agregar el elemento $: " + c1.poner('$'));
        System.out.println("Agregar el elemento D: " + c1.poner('D'));
        System.out.println("Agregar el elemento E: " + c1.poner('E'));
        System.out.println("Agregar el elemento F: " + c1.poner('F'));
    }

    /**
     * Metodo que recibe por parametro una estructura de tipo Cola c1 con elementos
     * de tipo Char con el formato a1$a2$a3$a4$...$an, donde cada ai es la secuencia
     * de letras mayusculas y a partir de la Cola c1 se debe generar como salida una
     * Cola de la forma: a1$a2$a3$a4$...$an donde cada ai es la secuencia de letras
     * de ai invertida. Ejemplo: Si c1 es AB$C$DEF, el metodo devolvera una Cola con
     * el formato ABBA$CC$DEFFED
     * 
     * @param c1
     * @return clon
     */
    public static Cola generarOtraCola(Cola c1) {
        // Zona de declaracion de variable
        Pila p1;
        Cola clon, aux;
        Object frente;
        // Zona de inicializacion de variable
        p1 = new Pila();
        aux = c1.clone(); // Utilizo una estructura auxiliar para no trabajar sobre la original
        clon = new Cola();

        while (!aux.esVacia()) {
            frente = aux.obtenerFrente(); // Obtengo el frente
            if (frente.equals('$')) {
                // Si me encuentro con el caracter '$' entonces desapilo los elementos de la Pila(con el metodo 'apilarInverso')
                // Por lo que tendría los elementos de la Cola antes del caracter '$' pero invertidos
                apilarInverso(clon, p1);
                clon.poner(frente);
                aux.sacar();
            }else { // Sino apilo en la Pila el frente, y coloco en la Cola el frente.
                p1.apilar(frente);    
                clon.poner(frente);
                aux.sacar();
            }
        }
        apilarInverso(clon, p1); 
        return clon;
    }

    public static void apilarInverso(Cola clon, Pila p1) {
        /**
         * Mientras que la Pila no este vacia, coloco los elementos en la Cola clon enlazando con el tope de la Pila
         * mientras que desapilo los elementos de la Pila
         */
        while (!p1.esVacia()) {
            clon.poner(p1.obtenerTope());
            p1.desapilar();
        }
    }
}
