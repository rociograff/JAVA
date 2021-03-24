/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final07082019;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */

/*
 Dados dos números N y B, tales que B < N, se puede hacer que N "explote" usando a B
como bomba. Cuando N explota se parte en dos números N1 = (N / B) y N2 = N - (N / B). Pero
B produce una reaccion en cadena: si N1 (y/o N2) es mayor que B, tambien explota y se parte
nuevamente en dos pedazos, segun el criterio anterior. Esto se repite hasta que todos
los pedazos resultantes a partir de N sean menores o iguales a B.
*/
public class Ej2 {
    
    public static void main(String[] args) {
        int n, b;
        
        System.out.println("Ingrese el numero n: ");
        n = TecladoIn.readLineInt();
        System.out.println("Ingrese el numero bomba b: ");
        b = TecladoIn.readLineInt();
        
        explotar(n, b);
    }
    
    public static void explotar (int n, int b) {
        int n1, n2;
        
        n1 = (n / b);
        n2 = n - (n / b);
        
        if (b < n1) {
            explotar(n1, b);
        }else {
            System.out.println(n1);
        }
        
        if (b < n2) {
            explotar(n2, b);
        }else {
            System.out.println(n2);
        }
    }
}
