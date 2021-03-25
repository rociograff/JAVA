package EstructurasDeDatos2021.Lineales.Estaticas;

public class Pila {
      // Constructor
      private static final int TAMANIO = 10;
      private Object[] arreglo;
      private int tope = -1;
  
      public Pila() {
          this.arreglo = new Object[TAMANIO];
          this.tope = -1;
      }
  
      // Modificadoras
      public boolean apilar(Object elem) {
          boolean exito;
  
          if (this.tope + 1 >= this.TAMANIO) {
              // Error pila llena
              exito = false;
          } else {
              // Pone el elemento en el tope de la pila e incrementa tope
              this.tope++;
              this.arreglo[tope] = elem;
              exito = true;
          }
          return exito;
      }
  
      public boolean desapilar() {
          boolean exito;
          if (esVacia())
              // Si esta vacia devuelve false
              exito = false;
          else {
              this.arreglo[tope] = null;
              tope--;
              exito = true;
          }
  
          return exito;
      }
  
      // Observadoras
      public boolean esVacia() {
          return (this.tope == -1);
      }
  
      public Object obtenerTope() {
          Object elemento;
          if (this.tope == -1) {
              elemento = null;
          } else {
              elemento = this.arreglo[tope];
          }
          return elemento;
      }
  
      // No basicas
      public void vaciar() {
          // Si el tope es igual a menos -1 termina
          if (this.tope != -1) {
              this.arreglo[tope] = null;
              this.tope--;
              vaciar();
          }
      }
  
      public Pila clone() {
          Pila pilaClon = new Pila();
          pilaClon.tope = this.tope;
  
          for (int i = 0; i <= this.tope; i++) {
              pilaClon.arreglo[i] = this.arreglo[i];
          }
          return pilaClon;
      }
  
      public String toString() {
          String cadena = "[";
          for (int i = 0; i <= this.tope; i++) {
              cadena += this.arreglo[i] + " , ";
          }
          cadena += "]";
          return cadena;
      }
}
