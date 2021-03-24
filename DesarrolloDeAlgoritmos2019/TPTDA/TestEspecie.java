/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocio Graff
 */
package TPTDA;
public class TestEspecie {

    public static void main(String[] args) {
        Especie especie1, especie2;
        boolean supera = false;
        int anio = 1;

        especie1 = new Especie();
        especie1.setNombre("Shinoceronte");
        especie1.setPoblacion(100);
        especie1.setTasaDeCrecimiento(15);

        especie2 = new Especie();
        especie2.setNombre("Dante");
        especie2.setPoblacion(10);
        especie2.setTasaDeCrecimiento(35);

        if (especie1.equals(especie2)) {
            System.out.println("Las especies son iguales ");
        } else {
            System.out.println("Las especies no son iguales ");
        }

        while (supera != true) {
            if ((especie1.poblacionProyectada(anio)) >= (especie2.poblacionProyectada(anio))) {
                System.out.println(especie1.poblacionProyectada(anio));
                System.out.println(especie2.poblacionProyectada(anio));
                System.out.println("");
                anio++;
            } else {
                System.out.println(especie1.poblacionProyectada(anio));
                System.out.println(especie2.poblacionProyectada(anio));
                supera = true;
            }
        }
        System.out.println("Los elefantes demoraron " + anio + " anios en superar a los rinocerontes");
    }
}
