package matricesvero;

/**
 * @author usuario
 */
public class MatricesVero {

    
    public static void cargar(int[] argNumero){
        for(int i = 0; i < argNumero.length; i++){
            System.out.println("ingrese un numero para la pocision: "+i);
            int numero = teclado.Entero();
        }
    }
    
    public static void mostrar(int[] argNumero){
        for(int i = 0; i < argNumero.length; i++){
            System.out.print(argNumero[i]+",");
        }
    }
    
    public static int[] clon(int[] argNumero){
        int[] clon = new int[argNumero.length];
        
        for(int i = 0; i < argNumero.length; i++){
            clon[i] = argNumero[i];
        }
        return clon;
    }
    
    public static void modificado(int[] argNumero){
        for(int i = 0; i < argNumero.length; i++){
            argNumero[i] = argNumero[i]*2;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numero = {1,2,1,2,5,11,63};
        int[] numero2 = {1,2,1,2,5,11,63};
        int[] clon;
        
        mostrar(numero);
        System.out.println("\n");
        clon = clon(numero);
        mostrar(clon);
        System.out.println("\n");
        modificado(numero);
        mostrar(numero);
        System.out.println("\n");
        mostrar(clon);
    }
    
    
    
}
