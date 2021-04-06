package EstructurasDeDatos2021.Lineales.Dinamicas;

public class Cola {
    // Atributos
    private Nodo frente;
    private Nodo fin;

    // Constructor
    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    // Modificadoras
    public boolean poner(Object elem) {
        boolean exito = true;

        Nodo nuevo = new Nodo(elem, null);

        if (this.fin != null) {
            this.fin.setEnlace(nuevo);
            this.fin = nuevo;
        } else {
            this.fin = nuevo;
            this.frente = nuevo;
        }

        return exito;
    }

    public boolean sacar() {
        boolean exito = false;

        if (this.frente != null) {
            // Quita el primer elemento y actualiza frente (y fin si queda vacia)
            this.frente = this.frente.getEnlace();
            exito = true;
            if (this.frente == null) {
                this.fin = null;
            }
        }

        return exito;
    }

    // Observadoras
    public boolean esVacia() {
        return (this.frente == this.fin);
    }

    public Object obtenerFrente() {
        Object retorno = null;

        if (this.frente != null) {
            retorno = this.frente.getElem();
        }

        return retorno;
    }

    // No Basicas
    public void vaciar() {
        this.frente = null;
        this.fin = null;
    }

    /*public Cola clone() { // Clonar iterativo
        Cola clon = new Cola();
        Nodo aux1 = this.frente;
        clon.frente = new Nodo(aux1.getElem(), null); // Creo el primer nodo de la cola auxiliar
        aux1 = aux1.getEnlace(); // Me muevo al segundo nodo de la cola original

        Nodo aux2 = clon.frente; // Me posiciono al frente del clon

        while (aux1 != aux2) {
            // Crea el nodo y lo enlaza a continuacion de aux2, se repite n - 1 veces
            aux2.setEnlace(new Nodo(aux1.getElem(), null));
            // Salta al siguiente nodo, moviendose en las dos colas a la par
            aux2 = aux2.getEnlace();
            aux1 = aux1.getEnlace();
        }

        clon.fin = aux2; // Enlazo el fin al ultimo nodo

        return clon;
    }*/

    public Cola clone() { // Clonar recursivo
        Cola colaClon = new Cola();

        if (!this.esVacia()) {
            colaClon.frente = clonador(this.frente, colaClon);
        }

        return colaClon;
    }

    private Nodo clonador(Nodo nodFrente, Cola clon) { 
        Nodo aux = new Nodo(null, null); 
        aux.setElem(nodFrente.getElem());
     
        if (nodFrente.getEnlace() != null) {
            aux.setEnlace(clonador(nodFrente.getEnlace(), clon)); 
        } else {
             clon.fin = aux; //Esta sentencia se encarga de asignar el fin de la cola 
        } 
        return aux;
    }

    public String toString() {
        String retorno;

        if (this.frente != null) {
            retorno = "[" + toStringRecursivo(this.frente) + "]";
        } else {
            retorno = "Cola vacia!";
        }
        return retorno;
    }

    public String toStringRecursivo(Nodo frente) {
        String retornoAux;

        if (frente.getEnlace() != null) {
            retornoAux = frente.getElem().toString() + "," + toStringRecursivo(frente.getEnlace());
        } else {
            retornoAux = frente.getElem().toString();
        }
        return retornoAux;
    }
}
