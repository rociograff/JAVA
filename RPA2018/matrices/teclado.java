package RPA2018.matrices;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class teclado {
//definimos las funciones del teclado
    public static int Entero(){
        //variables de retorno
        int entero;
        //creamos el teclado
        Scanner teclado = new Scanner(System.in);
        entero = teclado.nextInt();
        return entero;
    }
    public static double Double(){
        //variables de retorno
        double entero;
        //creamos el teclado
        Scanner teclado = new Scanner(System.in);
        entero = teclado.nextDouble();
        return entero;
    }
    public static float Float(){
        //variables de retorno
        float flotante;
        //creamos el teclado
        Scanner teclado = new Scanner(System.in);
        flotante = teclado.nextFloat();
        return flotante;
    }
    public static char Char(){
        //variables de retorno
        char caracter;
        //creamos el teclado
        Scanner teclado = new Scanner(System.in);
        caracter = teclado.next().charAt(0);
        return caracter;
    }
    public static String string(){
        //la variable a retornar
        String cadena;
        //cramos el teclado
        Scanner teclado = new Scanner(System.in);
        cadena = teclado.nextLine();
        return cadena;
    }
}
