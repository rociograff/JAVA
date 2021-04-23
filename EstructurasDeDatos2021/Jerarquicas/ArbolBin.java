package Jerarquicas;
import Lineales.Dinamicas.*;

public class ArbolBin {
    // Atributo
    private NodoArbol raiz;

    // Constructor
    public ArbolBin() {
        this.raiz = null;
    }

    public boolean insertar(Object elemNuevo, Object elemPadre, char lugar) {
        // Inserta elemNuevo como hijo del primer nodo encontrado en preorden
        // igual a elemPadre, como hijo izquierdo (I) o derecho (D), segun lo indique el parametro lugar
        boolean exito = true;

        if (this.raiz == null) {
            // si el arbol esta vacio, ponemos el elem nuevo en la raiz
            this.raiz = new NodoArbol(elemNuevo, null, null);
        } else {
            // si no esta vacio, se busca al padre
            NodoArbol nodoPadre = obtenerNodo(this.raiz, elemPadre);
            if (nodoPadre != null) {
                if (lugar == 'I' && nodoPadre.getIzquierdo() == null) {
                    // si el padre existe y no tiene HI se lo agrega
                    nodoPadre.setIzquierdo(new NodoArbol(elemNuevo, null, null));
                } else {
                    if (lugar == 'D' && nodoPadre.getDerecho() == null) {
                        // si el padre existe y no tiene HD se lo agrega
                        nodoPadre.setDerecho(new NodoArbol(elemNuevo, null, null));
                    } else {
                        // si el padre no existe o ya tiene ese hijo, da error
                        exito = false;
                    }
                }
            } else {
                exito = false;
            }
        }
        return exito;
    }

    private NodoArbol obtenerNodo(NodoArbol n, Object buscado) {
        // metodo privado que busca un elemento y devuelve el nodo que lo contiene. Si no se encuentra buscado devuelve null
        NodoArbol resultado = null;
        if (n != null) {
            if (n.getElem().equals(buscado)) {
                // si el buscado es n, lo devuelve
                resultado = n;
            } else {
                // no es el buscado: busca primero en el HI
                resultado = obtenerNodo(n.getIzquierdo(), buscado);
                // si no lo encuentra en el HI, busca en HD
                if (resultado == null) {
                    resultado = obtenerNodo(n.getDerecho(), buscado);
                }
            }
        }
        return resultado;
    }

    public boolean esVacio() {
        // Metodo que dada una estructura de tipo arbol binario, verifica si la misma posee elementos.
        return this.raiz == null; // Retorna un valor booleano.
    }

    public Object padre(Object buscado) {
        // Metodo que dado una estructura de tipo Arbol binario y un elemento de tipo Object que recibe por parametro,
        // verifica que posea elementos. Luego, busca el nodo padre llamando a un metodo auxiliar si fuese necesario.
        Object resultado = null; // En caso de que el elemento a buscar sea el elemento raiz retorna null

        if (this.raiz != null) {
            if (!this.raiz.getElem().equals(buscado)) { // Si el elemento buscado no está en la raíz lo busca
                resultado = padreAux(this.raiz, buscado);
            }
        }
        return resultado;
    }

    private Object padreAux(NodoArbol nodo, Object buscado) {
        // Metodo privado recursivo porque recibe un nodo de la estructura. Ademas recibe un elemento de tipo Object del cual
        // debe buscar su elemento padre en la estructura.
        Object resultado = null;
        NodoArbol nodoIzq, nodoDer;

        if (nodo != null) {
            nodoIzq = nodo.getIzquierdo();
            nodoDer = nodo.getDerecho();

            if (nodoIzq != null && nodoIzq.getElem().equals(buscado) || nodoDer != null && nodoDer.getElem().equals(buscado)) {
                // Si encontro el elemento buscado en el nodo hijo izquierdo o en el derecho, retorna el elemento padre
                resultado = nodo.getElem();
            } else {
                // Sino, busca por los hijos de la izquierda
                resultado = padreAux(nodoIzq, buscado);
                if (resultado == null) { // Si no tiene mas hijos izquierdos por recorrer, busca hacia la derecha
                    resultado = padreAux(nodoDer, buscado);
                }
            }
        }
        return resultado;
    }

    public int altura() {
        // Metodo que dada una estructura de tipo Arbol Binario, recorre la misma para determinar la altura del arbol.
        // Es decir la longitud del camino mas largo desde la raiz hasta una hoja.
        // Si el arbol esta vacio tiene altura -1, una hoja tiene altura 0.
        int resultado = -1;

        if (this.raiz != null) {
            resultado = alturaAux(this.raiz, -1);
        }
        return resultado;
    }

    private int alturaAux(NodoArbol nodo, int altura) {
        // Metodo privado recursivo que recibe por parametro un nodo de tipo NodoArbol junto a un valor de tipo int
        // que determina la altura de un arbol.
        int resultadoIzq, resultadoDer;

        if (nodo != null) {
            resultadoIzq = alturaAux(nodo.getIzquierdo(), altura) + 1;
            resultadoDer = alturaAux(nodo.getDerecho(), altura) + 1;

            if (resultadoIzq > resultadoDer) {
                altura = resultadoIzq;
            } else {
                altura = resultadoDer;
            }
        }
        return altura;
    }

    public int nivel(Object elem) {
        // Metodo que dada una estructura de tipo Arbol Binario, recibe por parametro un elemento de tipo Object
        // y busca en que nivel se encuentra. Invoca al metodo nivelAux.
        int resultado = -1;

        if (this.raiz != null) {
            resultado = nivelAux(this.raiz, elem, -1);
        }
        return resultado;
    }

    private int nivelAux(NodoArbol nodo, Object buscado, int nivel) {
        // Metodo privado recursivo que recibe un nodo de tipo NodoArbol junto a, un valor de tipo int con un elemento
        // de tipo Object. Se busca en la estructura este ultimo, en caso de hallarse se cuentan los niveles desde la raiz hasta dicho elemento.

        if (nodo != null) {
            if (nodo.getElem().equals(buscado)) {
                //si el buscado es n, lo devuelve
                nivel++;
            } else {
                nivel = nivelAux(nodo.getIzquierdo(), buscado, nivel);
                if (nivel != -1) {
                    nivel++;
                } else {
                    nivel = nivelAux(nodo.getDerecho(), buscado, nivel);
                    if (nivel != -1) {
                        nivel++;
                    }
                }
            }
        }
        return nivel;
    }

    public void vaciar() {
        this.raiz = null;
    }

    public ArbolBin clone() {
        // Metodo que dada una estructura de tipo Arbol binario, verifica si posee al menos un elemento e invoca al metodo cloneAux
        ArbolBin clone = new ArbolBin();
        if (!esVacio()) {
            NodoArbol aux2 = new NodoArbol(this.raiz.getElem(), null, null);
            clone.raiz = aux2;
            clonAux(this.raiz, aux2);
        }
        return clone;
    }

    private void clonAux(NodoArbol nodo, NodoArbol aux2) {
        // Metodo privado recursivo que dada una estructura de tipo Arbol Binario y un nodo de tipo NodoArbol
        // recibidos por parametro, hace una copia exacta de los elementos de un Arbol en el mencionado y lo retorna.
        if (nodo.getIzquierdo() != null) {
            aux2.setIzquierdo(new NodoArbol(nodo.getIzquierdo().getElem(), null, null));
            clonAux(nodo.getIzquierdo(), aux2.getIzquierdo());
        }
        if (nodo.getDerecho() != null) {
            aux2.setDerecho(new NodoArbol(nodo.getDerecho().getElem(), null, null));
            clonAux(nodo.getDerecho(), aux2.getDerecho());
        }
    }

    public String toString() {
        // Metodo que dada una estructura de tipo Arbol binario, la recorre y almacena en una cadena de caracteres
        // los elementos de los nodos. Al terminar retorna dicha cadena de caracteres.
        String cadena = "Arbol Binario vacio";

        if (this.raiz != null) {
            cadena = toStringAuxiliar(this.raiz, "");
        }

        return cadena;
    }

    private String toStringAuxiliar(NodoArbol nodo, String cadena) {
        // metodo recursivo privado porque su parametro es de tipo NodoArbol, que almacena en una cadena de caracteres
        // los nodos de una estructura de tipo Arbol binario. Hace un recorrido del tipo preorden, visitando primero
        // el nodo actual, seguido de su hijo izquierdo y por ultimo el hijo derecho.
        NodoArbol nodoIzq, nodoDer;

        if (nodo != null) {
            cadena = cadena + "\n" + nodo.getElem() + "\t";

            nodoIzq = nodo.getIzquierdo();
            nodoDer = nodo.getDerecho();
            // Primero inserto el elemento del nodo
            if (nodoIzq != null && nodoDer != null) { // nodos no nulos
                cadena = cadena + "HI: " + nodoIzq.getElem() + "\tHD: " + nodoDer.getElem();
            } else {
                if (nodoIzq != null) { // nudo izquierdo distinto a nulo
                    cadena = cadena + "HI: " + nodoIzq.getElem() + "\tHD: -";

                } else {
                    if (nodoDer != null) { // nodo derecho distinto a nulo
                        cadena = cadena + "HI: -" + "\tHD: " + nodoDer.getElem();
                    } else { // nodos nulos
                        cadena = cadena + "HI: -" + "\tHD: -";
                    }
                }
            }
            // Luego, recorro primero hacia la izquierda y despues hacia la izquierda
            cadena = toStringAuxiliar(nodoIzq, cadena);
            cadena = toStringAuxiliar(nodoDer, cadena);
        }
        return cadena;
    }

    public Lista listarPreorden() {
        Lista lis = new Lista();
        listarPreordenAux(this.raiz, lis);
        return lis;  // retorna una lista con los elementos del arbol en Preorden
    }

    private void listarPreordenAux(NodoArbol nodo, Lista lis) {
        // metodo recursivo privado porque su parametro es de tipo NodoArbol
        if (nodo != null) {
            // visita el elemento en el nodo
            lis.insertar(nodo.getElem(), lis.longitud() + 1); // (1)

            // recorre a sus hijos en preorden
            listarPreordenAux(nodo.getIzquierdo(), lis);
            listarPreordenAux(nodo.getDerecho(), lis);
        }
    }

    public Lista listarInorden() {
        Lista lis = new Lista();
        listarInordenAux(this.raiz, lis);
        return lis; // retorna una lista con los elementos del arbol en Inorden
    }

    private void listarInordenAux(NodoArbol nodo, Lista lis) {
        // metodo recursivo privado porque su parametro es de tipo NodoArbol
        if (nodo != null) {
            listarInordenAux(nodo.getIzquierdo(), lis);
            lis.insertar(nodo.getElem(), lis.longitud() + 1);
            listarInordenAux(nodo.getDerecho(), lis);
        }
    }

    public Lista listarPosorden() {
        Lista lis = new Lista();
        listarPosordenAux(this.raiz, lis);
        return lis;  // retorna una lista con los elementos del arbol en Inorden
    }

    private void listarPosordenAux(NodoArbol nodo, Lista lis) {
        // metodo recursivo privado porque su parametro es de tipo NodoArbol
        if (nodo != null) {
            listarPosordenAux(nodo.getIzquierdo(), lis);
            listarPosordenAux(nodo.getDerecho(), lis);
            lis.insertar(nodo.getElem(), lis.longitud() + 1);
        }
    }

    public Lista listarPorNiveles() {
        Lista lis = new Lista();

        if (this.raiz != null) {
            listarPorNivelesAux(this.raiz, lis);
        }
        return lis; // retorna una lista con los elementos del arbol en niveles
    }

    private void listarPorNivelesAux(NodoArbol nodo, Lista lis) {
        // Metodo privado iterativo porque recibe un nodo de tipo NodoArbol
        Cola q = new Cola();
        int i = 1;
        
        q.poner(nodo);

        while (!q.esVacia()) {
            nodo = (NodoArbol) q.obtenerFrente();
            q.sacar();

            lis.insertar(nodo.getElem(), i);
            i++;

            if (nodo.getIzquierdo() != null) {
                q.poner(nodo.getIzquierdo());
            }
            if (nodo.getDerecho() != null) {
                q.poner(nodo.getDerecho());
            }
        }
    }

    public Lista obtenerAncestros(Object elem) {
        // Metodo que verifica si la estructura de tipo Arbol binario posee al menos un elemento, e invoca al metodo obtenerAncestrosAux
        Lista lis = new Lista();

        if (this.raiz != null) {
            obtenerAncestrosAux(this.raiz, elem, lis);
        }
        return lis;
    }

    private void obtenerAncestrosAux(NodoArbol nodo, Object elem, Lista lis) {
        // Metodo privado recursivo que recibe un nodo de tipo arbol binario, junto a un elemento de tipo Object y
        // una lista. Recorre la estructura hasta encontrar el elemento que se busca y, cuando lo encuentra
        // llama al metodo obtenerAncestrosAuxiliar primero con el nodo izquierdo y despues el derecho
        if (nodo != null) {
            if (!nodo.getElem().equals(elem)) {
                lis.insertar(nodo.getElem(), lis.longitud() + 1);
                obtenerAncestrosAux(nodo.getIzquierdo(), elem, lis);
                obtenerAncestrosAux(nodo.getDerecho(), elem, lis);
            }
        }
    }

    public Lista obtenerDescendientes(Object elem) {
        // Metodo que verifica si la estructura de tipo Arbol binario posee al menos un elemento, e invoca al metodo obtenerAncestrosAux
        Lista lis = new Lista();

        if (this.raiz != null) {
            obtenerDescendientesAux(this.raiz, elem, lis);
        }
        return lis;
    }

    private void obtenerDescendientesAux(NodoArbol nodo, Object elem, Lista lis) {
        // Metodo privado recursivo que recibe un nodo de tipo arbol binario, junto a un elemento de tipo Object y
        // una lista. Recorre la estructura hasta encontrar el elemento que se busca y, cuando lo encuentra
        // llama al metodo obtenerAncestrosAuxiliar primero con el nodo izquierdo y despues el derecho
        if (nodo != null) {
            if (!nodo.getElem().equals(elem)) {
                lis.insertar(elem, lis.longitud() + 1);
                obtenerAncestrosAux(nodo.getIzquierdo(), elem, lis);
                obtenerAncestrosAux(nodo.getDerecho(), elem, lis);
            }
        }
    }

    public Lista frontera() {
        Lista lis = new Lista();
        if (this.raiz != null) {
            fronteraAux(this.raiz, lis);
        }
        return lis; // Retorna una lista con los nodos hojas del arbol
    }

    private void fronteraAux(NodoArbol nodo, Lista lis) {
        // Metodo recursivo privado porque recibe por parametro un nodo de tipo NodoArbol, ademas recibe una lista.
        // Recorre el arbol completo buscando los nodos hoja, y los inserta en la lista
        NodoArbol nodoIzq, nodoDer;

        if (nodo != null) {
            // Obtengo los nodos hijo izquierdo e hijo derecho de mi nodo actual
            nodoIzq = nodo.getIzquierdo();
            nodoDer = nodo.getDerecho();

            // Si los hijos izquierdo y derecho son nulos a la vez entonces mi nodo actual es un nodo hoja y lo visito
            if (nodoIzq == null && nodoDer == null) {
                lis.insertar(nodo.getElem(), lis.longitud() + 1);
            } else {
                // Sino busco primero por los hijos de la izquierda, y luego por la derecha
                fronteraAux(nodoIzq, lis);
                fronteraAux(nodoDer, lis);
            }
        }
    }
}
