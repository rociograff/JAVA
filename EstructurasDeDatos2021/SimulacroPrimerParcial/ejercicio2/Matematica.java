package SimulacroPrimerParcial.ejercicio2;

import Lineales.Dinamicas.Cola;
import Lineales.Dinamicas.Pila;

public class Matematica {  //2) d
    public boolean verificarBalanceo(Cola q1){
        boolean exito = false;
        char pA = '(';
        char pC = ')';
        char lA = '{';
        char lC = '}';
        char cA = '[';
        char cC = ']';
        char s;
        int cont1 = 0, cont2 = 0;
        Pila pila1 = new Pila();
        Pila pila2 = new Pila();
        //Clono la cola original para no romperla
        Cola clon = q1.clone();
        while (clon.obtenerFrente() != null){
            s = (char)clon.obtenerFrente();
            if (s==lA || s==pA || s==cA){
                pila1.apilar(s);
                cont1++;
            } else {
                if (s==lC || s==pC || s==cC){
                    pila2.apilar(s);
                    cont2++;
                }
            }
            clon.sacar();
        }
        if (cont1 == cont2) {
            while (!pila1.esVacia() && !exito){
                s = (char)pila1.obtenerTope();
                switch (s){
                    case '{': exito = (char)pila2.obtenerTope() == '}';break;
                    case '(': exito = (char)pila2.obtenerTope() == ')';break;
                    case '[': exito = (char)pila2.obtenerTope() == ']';break;
                }
                pila1.desapilar();
                pila2.desapilar();
            }
        }
        return exito;
     }
}
