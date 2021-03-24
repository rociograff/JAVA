/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursividadParaFinal;

/**
 *
 * @author Rocio Graff
 */

/*
Contar la cantidad de dígitos de un número entero positivo N. Realice la traza para N=32154.
 */
public class Ej1 {

    public static void main(String[] args) {
        int num = 32154;
        int contar;

        contar = contarNum(num);

        System.out.println(contar);
    }

    public static int contarNum(int num) {
        int cantD;

        if (num > 0 && num < 10) {
            cantD = 1;
        } else {
            cantD = contarNum(num / 10);
            cantD++;
        }

        return cantD;
    }

}
