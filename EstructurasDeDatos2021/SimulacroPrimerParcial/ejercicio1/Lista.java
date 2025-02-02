package SimulacroPrimerParcial.ejercicio1;

public class Lista {
    // Atributos
    private Nodo cabecera;
    private int longitud;

    // Constructor
    public Lista() {
        cabecera = null;
        longitud = 0;
    }

    /**
     * Inserta el elemento nuevo en la posicion pos detecta y reporta error posicion invalida.
     * 
     * @param nuevoElem
     * @param pos
     * @return boolean exito
     */
    public boolean insertar(Object nuevoElem, int pos) {
        boolean exito = true;

        if (pos < 1 || pos > this.longitud() + 1) {
            exito = false;
        } else {
            if (pos == 1) { // Crea un nuevo nodo y se enlaza a la cabecera
                this.cabecera = new Nodo(nuevoElem, this.cabecera);
            } else { // Avanza hasta el elemento en posicion pos-1
                Nodo aux = this.cabecera;
                int i = 1;
                while (i < pos - 1) {
                    aux = aux.getEnlace();
                    i++;
                }
                Nodo nuevo = new Nodo(nuevoElem, aux.getEnlace()); // crea el nodo y lo enlaza
                aux.setEnlace(nuevo);
            }
            this.longitud++;
        }
        return exito; // nunca hay error de lista llena, entonces devuelve true
    }

    /**
     * Metodo eliminar que dado un valor de tipo int recibido por parametro, busca
     * el elemento de dicha posicion en la estructura de tipo lista, y lo elimina de la misma
     * 
     * @param pos
     * @return boolean exito
     */
    public boolean eliminar(int pos) {
        boolean exito = true;
        if (pos < 1 || pos > this.longitud) {
            exito = false;
        } else {
            if (pos == 1) {
                this.cabecera = this.cabecera.getEnlace();
            } else {
                Nodo aux = this.cabecera;
                int i = 1;
                while (i < pos - 1) {
                    aux = aux.getEnlace();
                    i++;
                }
                aux.setEnlace(aux.getEnlace().getEnlace());
            }
            this.longitud--;
        }
        return exito;
    }

    /**
     * Metodo recuperar que dada una estructura de tipo Lista, busca el elemento que
     * se encuentra en la posicion indicada por el valor recibido por parametro.
     * Precondicion: La posicion es valida
     * 
     * @param pos
     * @return Object elem
     */
    public Object recuperar(int pos) {
        Object elem = null;
        boolean encontrado = false;
        int i = 1;
        Nodo aux = this.cabecera;

        while (!encontrado && aux != null) {
            if (i == pos) {
                elem = aux.getElem();
                encontrado = true;
            } else {
                i++;
                aux = aux.getEnlace();
            }
        }
        return elem;
    }

    /**
     * Metodo localizar que dada una estructura de tipo Lista, devuelve la posicion
     * en la que se encuentra la primera ocurrencia del elemento recibido por
     * parametro en dicha estructura.
     * 
     * @param elem
     * @return int pos //Retorna -1 si no se encontro el elemento.
     */
    public int localizar(Object elem) {
        int pos = -1, contador = 1;
        boolean encontrado = false;

        if (!this.esVacia()) {
            Nodo aux = this.cabecera;
            while (aux != null && encontrado == false) {
                // Aux es el que avanza hasta que finaliza el arreglo mientras que encontrado es la condicion de corte
                if (aux.getElem().equals(elem)) { // Si el elemento en la posicion es igual al ingresado, corto la iteracion y devuelvo la posicion
                    encontrado = true;
                    pos = contador;
                } else { // Sino, aumento el contador y a aux le asigno el siguiente enlace
                    aux = aux.getEnlace();
                    contador += 1;
                }
            }
        }
        return pos;
    }

    public int longitud() {
        // Metodo que determina la longitud de una estructura de tipo Lista y retorna dicho valor
        return this.longitud;
    }

    public boolean esVacia() {
        return this.cabecera == null;
    }

    public void vaciar() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public Lista clone() {
        // Metodo que dada una estructura de tipo Lista, la recorre y copia los elementos en otra estructura similar.
        Lista clon = new Lista();

        clon = cloneAux(clon, this.cabecera); // Invocacion de un metodo auxiliar recursivo privado
        clon.longitud = this.longitud; // A mi lista clon le asigno la longitud actual de mi Lista

        return clon; // Retorna una lista
    }

    /**
     * Metodo recursivo privado porque recibe el nodo de la clase misma, el cual no
     * puede ser conocido por el usuario. Se llama a sí mismo, con casos más
     * pequeños ya que en cada llamado utiliza el nodo siguiente con respecto al que
     * recibe por parametro. De esa forma, recorre toda la estructura hasta
     * encontrarse con que no tiene mas nodos cargados.
     * 
     * @param clon
     * @param aux
     * @return Lista clon
     */
    private Lista cloneAux(Lista clon, Nodo aux) {
        if (aux != null) {
            clon = cloneAux(clon, aux.getEnlace());
            // A la vuelta de la recursion va enlazando los nodos en la cabecera de mi Lista clon
            clon.cabecera = new Nodo(aux.getElem(), clon.cabecera);
        }
        return clon;
    }

    public String toString() {
        // Metodo que dada una estructura de tipo Lista, la recorre y almacena en una cadena de caracteres cada uno
        // de los elementos en caso de que tenga. Por ultimo, retorna una cadena de caracteres.
        String retorno = "Lista vacia!";
        if (this.cabecera != null) {
            retorno = "[";
            Nodo aux = this.cabecera; // Se ubica para recorrer la pila
            while (aux != null) {
                // Agrega el texto del elem y avanza
                retorno = retorno + aux.getElem().toString();
                if (aux.getEnlace() != null) {
                    retorno += ",";
                }
                aux = aux.getEnlace();
            }
            retorno += "]";
        }
        return retorno;
    }

    //Metodos simulacro de parcial
    public Lista obtenerMultiplos(int num) {  //1) a
        Lista listaMul = new Lista();
        Nodo aux = this.cabecera;
        Nodo auxNuevo = listaMul.cabecera;
        int pos = 1;

        while (aux != null) {
            if ((pos % num) == 0) {
                Nodo nuevo = new Nodo(aux.getElem(), null);
                if (listaMul.cabecera == null) {
                    //Primer caso
                    listaMul.cabecera = nuevo;
                    pos++;
                } else {
                    //Caso generico
                    auxNuevo.setEnlace(nuevo);
                }
            auxNuevo = auxNuevo.getEnlace();
            listaMul.longitud++;
            }
            aux = aux.getEnlace();
        }
        return listaMul;
    }

    public void eliminarApariciones(Object x) {  //1) b
        Nodo aux = this.cabecera;
        while (aux.getEnlace() != null) {
            if (this.cabecera.getElem().equals(x)) {
                this.cabecera = aux.getEnlace();
                aux = aux.getEnlace();
            } else if (aux.getEnlace().getElem().equals(x)) {
                aux.setEnlace(aux.getEnlace().getEnlace());
            } else {
                aux = aux.getEnlace();
            }
        }
        if (this.cabecera.getEnlace() == null) {
            if (this.cabecera.getElem().equals(x)) {
                this.cabecera = null;
            }
        }
    }
}
