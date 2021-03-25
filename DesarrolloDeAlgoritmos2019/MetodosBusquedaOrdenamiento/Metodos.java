/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.MetodosBusquedaOrdenamiento;

/**
 *
 * @author Rocio Graff
 */
public class Metodos {
    
    public static void seleccion (int[] a) {
        //Metodo de ordenamiento(fuerza bruta)
        
        int i, j, min, aux, n;
        
        n = a.length;
        
        for(i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            //Intercambiar a[i] y a[min]
            aux = a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }
    
    public static int busquedaSecuencial(int [] a, int n) {
        //Metodo de ordenamiento(fuerza bruta)
        //Retorna la posicion del elemento en el arreglo a, sino lo encuentra retorna -1
        
        int i, pos;
        boolean encontrado = false;
        
        i = 0;
        pos = -1;
        
        while(encontrado == false && i < a.length) {
            if(a[i] == n) {
                encontrado = true;
                pos = i;
            }else {
                i++;
            }
        }
        
        return pos;
    }
    
    public static void burbuja(int[] a) {
        //Metodo de ordenamiento (fuerza bruta)
        
        int i, j, aux, n;
        
        n = a.length;
        
        for (i = 0; i < n; i++) {
            for(j = 0; j < n - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    //Intercambiar a[j] y a[j+1]
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }
    
    public static void burbujaMejorado(int[] a) {
        //Metodo de ordenamiento (fuerza bruta)
        
        boolean sinCambio = false;
        int aux, j, i = 0, n;
        
        n = a.length;
        
        while (i < n && !sinCambio) {
            sinCambio = true;
            for(j = 0; j < n - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    //Intercambiar 
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    sinCambio = false;
                }
            }
            i++;
        }
    }
    
    public static void insercion (int[] a) {
        //Metodo de ordenamiento (disminuye y venceras)
        
        int i, j, aux, largo;
        
        largo = a.length;
        
        for(i = 1; i < largo; i++) {
            aux = a[i];
            j = i;
            while(j > 0 && aux < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }
    
    public static int busquedaBinaria (int[] a, int num) {
        //Metodo de ordenamiento (disminuye y venceras)
        
        int inicio, fin, resultado, medio;
        
        inicio = 0;
        fin = a.length - 1;
        resultado = - 1;
        
        while(inicio <= fin) {
            medio = (inicio + fin)/ 2;
            if(num == a[medio]) {
                resultado = medio;
                inicio = fin + 1;
            }else {
                if (num < a[medio]) {
                    fin = medio - 1;
                }else {
                    inicio = medio + 1;
                }
            }
        }
        
        return resultado;
    }
    
}
