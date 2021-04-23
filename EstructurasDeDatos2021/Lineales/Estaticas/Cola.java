package Lineales.Estaticas;

public class Cola {
    // Atributos
    private Object[] arreglo;
    private int frente;
    private int fin;
    private static final int TAMANIO = 10;

    // Constructor
    public Cola() {
        this.arreglo = new Object[this.TAMANIO];
        this.frente = 0;
        this.fin = 0;
    }

    // Modificadoras
    public boolean poner(Object elem) {
        boolean retorno = false;

        if (((this.fin + 1) % this.TAMANIO) != this.frente) {
            this.arreglo[fin] = elem;
            this.fin = (this.fin + 1) % this.TAMANIO;
            retorno = true;
        }

        return retorno;
    }

    public boolean sacar() {
        boolean exito = true;

        if (this.esVacia()) { // La cola esta vacia, reporta error
            exito = false;
        } else { // Al menos hay 1 elemento: avanza frente(de manera circular)
            this.arreglo[this.frente] = null; // Le asigno null para asegurarme que la cola no apunta a elementos innecesarios
            this.frente = (this.frente + 1) % this.TAMANIO; // Aumenta el frente con MOD TAMANIO para hacer la circularidad
        }

        return exito;
    }

    // Observadoras
    public boolean esVacia() {
        boolean retorno = false;

        if (this.frente == this.fin) {
            retorno = true;
        }

        return retorno;
    }

    public Object obtenerFrente() {
        //Devuelve el frente de la pila
        Object retorno;

        if (this.esVacia()) {
            retorno = null;
        } else {
            retorno = this.arreglo[frente];
        }

        return retorno;
    }

    // No Basicas
    public void vaciar() {
        this.fin = 0;
        this.frente = 0;
    }

    public Cola clone() {
        Cola clon = new Cola();
        int i = this.frente;
        
        while (i != this.fin) {//mientras que el frente no sea igual a fin
            clon.arreglo[i] = this.arreglo[i];// al clon en la pos i le asigno el valor de la original en la pos i
            i = (i + 1) % TAMANIO;// circularidad
        }
        clon.fin = this.fin;//Le asigno el fin de la original al clon
        clon.frente = this.frente;//Le asigno el frente de la original al clon
        return clon;
    }

    public String toString() {
        String retorno = "Cola vacia!";

        if (this.frente != this.fin) {
            retorno = "[";
            for (int i = this.frente; i != this.fin; i = (i + 1) % TAMANIO) {
                retorno += this.arreglo[i].toString();
                if ((i + 1) % TAMANIO != this.fin) {
                    retorno += ",";
                }
            }
            retorno += "]";
        }
        return retorno;
    }
}
