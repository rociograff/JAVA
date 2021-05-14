package SimulacroPrimerParcial.ejercicio2;
import Lineales.Dinamicas.Lista;
import Lineales.Dinamicas.Cola;
import Lineales.Dinamicas.Pila;

public class TestCadenas {  //2) c
    public static Cola generar(Cola original) {
        Cola retorno = new Cola();
        Pila aux = new Pila();
        Lista listaAux = new Lista();
        int pos = 1;

        while (!original.esVacia()) {
            Object elem = (char) original.obtenerFrente();
            while (!original.esVacia() && !elem.equals('#')) {
                retorno.poner(elem);
                aux.apilar(elem);
                listaAux.insertar(elem, pos);
                pos++;
                original.sacar();
                if (!original.esVacia()) {
                    elem = (char) original.obtenerFrente();
                }
            }
            original.sacar();
            while (!aux.esVacia()) {
                retorno.poner(aux.obtenerTope());
                aux.desapilar();
            }
            pos = 1;
            while (!listaAux.esVacia()) {
                retorno.poner(listaAux.recuperar(pos));
                listaAux.eliminar(pos);
            }
            if (!original.esVacia()) {
                retorno.poner('#');
            }
        }
        return retorno;
    }
}
