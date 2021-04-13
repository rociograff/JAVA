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

    //Modificadoras
    public boolean poner(Object elem) {
        // Metodo que dado un elemento de tipo Object recibido por parametro, lo coloca en la estructura.
        Nodo nuevoNodo = new Nodo(elem, null);

        // Caso especial: Cola vacia --> frente == null
        if(this.frente == null){
            this.frente = nuevoNodo;
            this.fin = nuevoNodo;
        } else{
            this.fin.setEnlace(nuevoNodo);
            this.fin = nuevoNodo;
        }
        return true;    // Siempre se pueden agregar elementos a la estructura
    }

    public boolean sacar() {
        // Metodo que dada una estructura de tipo Cola, quita el elemento del frente de la misma. Retorna booleano.
        boolean exito = true;

        if(this.frente == null) {   // La cola esta vacia,
            exito = false;
        } else{ // Al menos posee un elemento
            // Saca el primer elemento de la cola y actualiza el frente
            this.frente = this.frente.getEnlace();
            if(this.frente == null){
                this.fin = null;
            }
        }
        return exito;
    }

    //Observadoras
    public Object obtenerFrente() {
        // Metodo que retorna el elemento que se encuentra en el frente de la cola
        Object elem = null;

        if(this.frente != null){
            elem = this.frente.getElem();
        }
        return elem;
    }

    public boolean esVacia() {
        // Metodo que verifica si el frente esta vacio, en caso afirmativo retorna true, caso contrario retorna false.
        return this.frente == null;
    }

    //No Basicas
    public void vaciar() {
        // Metodo que vacia la estructura, asignandole el valor null tanto al frente, como al fin
        if(!this.esVacia()){
            this.frente = null;
            this.fin = null;
        }
    }

    public Cola clone() {  //Clonar iterativo
        // Metodo que crea una estructura de tipo Cola auxiliar, y copia los nodos de la estructura original en la auxiliar.
        // Zona de declaracion de variables
        Cola clon;
        Nodo aux;
        // Zona de inicializacion de variables
        clon = new Cola();
        aux = new Nodo();

        if(!esVacia()){
            aux = this.frente;  // El nodo auxiliar apunta al frente
            clon.frente = aux;  // El frente de la cola apunta al nodo auxiliar
            clon.fin = aux;     // El fin de la cola apunta al nodo auxiliar
            aux = aux.getEnlace();  // Obtengo el enlace al siguiente nodo

            // Me muevo hacia los demás nodos
            while(aux != null){
                clon.fin = aux; // A fin le asigno el nodo actual
                aux = aux.getEnlace();  // Obtengo el enlace al siguiente nodo
            }
        }
        return clon;
    }

    /*public Cola clone() { // Clonar iterativo de la profe (NO ME FUNCIONA)
        Cola clon = new Cola();
        Nodo aux1 = this.frente;
        clon.frente = new Nodo(aux1.getElem(), null); // Creo el primer nodo de la cola auxiliar
        aux1 = aux1.getEnlace(); // Me muevo al segundo nodo de la cola original

        Nodo aux2 = clon.frente; // Me posiciono al frente del clon

        while (aux2 != aux1) {
            // Crea el nodo y lo enlaza a continuacion de aux2, se repite n - 1 veces
            aux2.setEnlace(new Nodo(aux1.getElem(), null));
            // Salta al siguiente nodo, moviendose en las dos colas a la par
            aux2 = aux2.getEnlace();
            aux1 = aux1.getEnlace();
        }

        clon.fin = aux2; // Enlazo el fin al ultimo nodo

        return clon;
    }

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
    }*/

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
