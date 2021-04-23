package Lineales.Dinamicas;

public class Pila {
    // Constructor
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    // Modificadora
    public boolean apilar(Object nuevoElem) {
        // Crea un nuevo nodo delante de la antigua cabecera
        Nodo nuevo = new Nodo(nuevoElem, this.tope);

        // Actualiza el tope para que apunte al nodo nuevo
        this.tope = nuevo;

        // Nunca hay error de pila llena , entonces devuelve true
        return true;
    }

    public boolean desapilar() {
        boolean exito;

        if (this.tope == null) {
            exito = false;
        } else {
            this.tope = this.tope.getEnlace();
            exito = true;
        }
        return exito;
    }

    // Observadora
    public boolean esVacia() {
        return (this.tope == null);
    }

    public Object obtenerTope() {
        Object elTope;

        if (this.tope == null) {
            elTope = null;
        } else {
            elTope = this.tope.getElem();
        }
        return elTope;
    }

    // No basicas
    public void vaciar() {
        this.tope = null; // Le asigna null al tope, y el garbage collector elimina el resto de la pila
    }

    public Pila clone() {
        // Clonar de pila sin utilizar recursion
        Pila clon = new Pila();

        if (this.tope != null) {
            this.clonePasoRecursivo(clon, this.tope);
        }
        return clon;
    }

    private void clonePasoRecursivo(Pila clon, Nodo enlace) {
        if (enlace != null) { // Mientras que no este en la primera posicion de la pila hace el llamado recursivo  
            Nodo enlaceTope = enlace.getEnlace(); // Toma el enlace del tope
            clonePasoRecursivo(clon, enlaceTope); // Hace el llamado recursivo pero ahora el enlace es el siguiente al del tope
            clon.tope = new Nodo(enlace.getElem(), clon.tope); // Apila una vez llega al final de la pila
        }
    }

    @Override
    public String toString() {
        String retorno;

        if (this.tope != null) { // Mientras que la pila no sea vacia, la recorre de forma recursiva
            retorno = "[" + toStringRecursivo(this.tope) + "]"; // Hace el llamado recursivo recorriendo desde el tope hasta el principio de la pila                                              
        } else {
            retorno = "Pila Vacia!";
        }
        return retorno;
    }

    private String toStringRecursivo(Nodo actual) {
        String elemento;
        if (actual.getEnlace() != null) {
            // Obtenemos el valor del nodo
            // Concatenamos el llamado con el elemento del siguiente
            elemento = this.toStringRecursivo(actual.getEnlace()) + "," + actual.getElem().toString();
        } else {
            elemento = actual.getElem().toString(); // Retorna el primer elemento de la pila
        }
        return elemento;
    }
}
