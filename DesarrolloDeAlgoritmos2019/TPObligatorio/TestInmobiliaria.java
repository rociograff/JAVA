
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPObligatorio;

import Utiles.TecladoIn;

/**
 *
 * @author Rocio.Graff
 */
public class TestInmobiliaria {

    public static void main(String[] args) {
        //Declaracion e inicializacion de variables
        Propiedad[] prop, arregloNuevo;
        int opcion, celdas;
        int posicion = 10;
        boolean terminar = false;
        boolean ordenado = false;

        prop = new Propiedad[posicion];  //Declaracion y creacion del arreglo de Propiedades
        //Creacion del arreglo Propiedad con 10 datos predefinidos
        prop[0] = new Propiedad(1265, 'c', "Av. Siempre Viva", 3, 't', 87, true, 12000);
        prop[1] = new Propiedad(6947, 'd', "Calle Falsa", 2, 'v', 50, true, 8000000);
        prop[2] = new Propiedad(3436, 'x', "Direccion Imaginaria", 5, 'a', 70, false, 28000);
        prop[3] = new Propiedad(5118, 'c', "Av. Alem", 8, 'v', 120, true, 150000);
        prop[4] = new Propiedad(9398, 'x', "Basavilbaso", 4, 'a', 25, false, 6000);
        prop[5] = new Propiedad(8772, 'd', "Panama", 1, 't', 40, false, 5500);
        prop[6] = new Propiedad(2222, 'd', "Italia", 2, 'a', 60, true, 7500);
        prop[7] = new Propiedad(4312, 'c', "Julio Dante Salto", 4, 'v', 130, false, 120000);
        prop[8] = new Propiedad(7234, 'x', "Hipolito Irigoyen", 2, 'v', 55, true, 130000);
        prop[9] = new Propiedad(0574, 'c', "Los Cerezos", 6, 'a', 150, false, 40000);

        while (!terminar) {
            menu();  //Muestro las opciones del menu

            opcion = TecladoIn.readInt();   //Lee las opciones del menu

            switch (opcion) {
                case 0:                        // (0) Terminar
                    terminar = true;
                    break;
                case 1:                        // (1) Cargar Datos
                    celdas = sumarCeldas();
                    arregloNuevo = new Propiedad[posicion + celdas];
                    agregarCeldas(prop, arregloNuevo, arregloNuevo.length - 1);
                    prop = arregloNuevo;
                    posicion = arregloNuevo.length;
                    ordenado = false;
                    break;
                case 2:                        // (2) Listar Datos
                    listarDatos(prop, posicion);
                    break;
                case 3:                        // (3) Verificar Casa
                    verificarCasa(prop, posicion);
                    break;
                case 4:                        // (4) Verificar Departamento
                    verificarDpto(prop, posicion);
                    break;
                case 5:                        // (5) Ordenar el arreglo de propiedades por precio
                    metodosOrdenamiento(prop);
                    listarDatos(prop, posicion);
                    ordenado = true;
                    break;
                case 6:                        // (6) Contar la cantidad de propiedades disponibles de N-cantidad de ambientes
                    propDisponibles(prop);
                    break;
                case 7:                        // (7) Encontrar la casa en alquiler disponible de superficie máxima
                    buscarMayor(prop, posicion - 1);
                    break;
                case 8:                        // (8) Buscar una propiedad con un precio dado
                    buscarCasa(prop, ordenado);
                    break;
                case 9:                        // (9) Ordenar el arreglo de propiedades por superficie
                    metodoQuickSort(prop, 0, posicion - 1);
                    listarDatos(prop, posicion);
                    break;
            }
        }
    }

    public static void menu() {
        //Modulo para mostrar las opciones del menu
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println(" ");
        System.out.println("(0) Finalizar.");
        System.out.println("(1) Cargar Datos.");
        System.out.println("(2) Listar Datos.");
        System.out.println("(3) Verificar Casa.");
        System.out.println("(4) Verificar Departamento.");
        System.out.println("(5) Ordenar el arreglo de propiedades por precio.");
        System.out.println("(6) Contar la cantidad de propiedades disponibles de N-cantidad de ambientes.");
        System.out.println("(7) Encontrar la casa en alquiler disponible de superficie máxima.");
        System.out.println("(8) Buscar una propiedad con un precio dado.");
        System.out.println("(9) Ordenar el arreglo de propiedades por superficie.");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public static int sumarCeldas() {
        //Solicita la cantidad de propiedades que quiere ingresar el usuario
        int celdas;
        System.out.println("Ingrese la cantidad de propiedades que va a agregar: ");
        celdas = TecladoIn.readLineInt();
        return celdas;
    }

    public static void agregarCeldas(Propiedad[] prop, Propiedad[] arregloNuevo, int longitud) {
        //De forma recursiva copia las referencias del arreglo original en el nuevo y cuando estan todas copiadas solicita la carga de datos
        Propiedad p;
        if (longitud == 0) {
            arregloNuevo[longitud] = prop[longitud];
        } else {
            agregarCeldas(prop, arregloNuevo, longitud - 1);
            if (prop.length <= longitud) {
                p = cargarDatos(longitud, arregloNuevo); //Llama al modulo que se encarga de cargar los datos
                arregloNuevo[longitud] = p; //Retorna la propiedad y se la asigna a la ultima posicion del arreglo
            } else {
                arregloNuevo[longitud] = prop[longitud];
            }
        }
    }

    public static Propiedad cargarDatos(int longitud, Propiedad[] arregloNuevo) {
        //Modulo para cargar todos los datos de las propiedades
        //Declaracion e inicializacion de variables
        boolean esValido = false;
        Propiedad p;
        int codigo = 0, cantAmbientes, superficie, precio;
        String direccion;
        char tipo, operacion;
        boolean disponibilidad;

        //Repite hasta que el codigo ingresado sea valido
        while (!esValido) {
            codigo = cargarCodigo();
            esValido = verificarCodigo(arregloNuevo, codigo, longitud - 1);//Llama al modulo que verifica la validez del codigo
        }
        tipo = cargarTipo();
        direccion = cargarDireccion();
        cantAmbientes = cargarCantAmbientes();
        operacion = cargarOperacion();
        superficie = cargarSuperficie();
        disponibilidad = cargarDisponibilidad();
        precio = cargarPrecio();

        p = new Propiedad(codigo, tipo, direccion, cantAmbientes, operacion, superficie, disponibilidad, precio);
        return p;
    }

    public static int cargarCodigo() {
        //Modulo para cargar y verificar el codigo
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        int codigo = 0;
        char opcion;

        while (continuar != false) {
            System.out.println("Ingrese el codigo: ");
            codigo = TecladoIn.readInt();
            System.out.println("¿El codigo que ingreso es correcto? s/n");  //Confirmacion de codigo
            opcion = TecladoIn.readLineNonwhiteChar();

            switch (opcion) {  //Si el codigo es correcto corta la operacion, caso contrario se vuelve a ingresar el codigo correcto
                case 's':
                    continuar = false;
                    break;
                case 'n':
                    continuar = true;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return codigo;
    }

    public static boolean verificarCodigo(Propiedad[] arregloNuevo, int cod, int pos) {
        //Modulo para verificar la validez del codigo ingresado anteriormente
        //Declaracion e inicializacion de variables
        Propiedad p = new Propiedad(cod);
        boolean existe = true;
        int i = 0;

        while (!(arregloNuevo[i].equals(p)) && i < pos - 1) {
            i++;
        }
        if (arregloNuevo[i].equals(p)) {
            existe = false;
            System.out.println("El codigo ya fue ingresado.");
        }
        return existe;
    }

    public static char cargarTipo() {
        //Modulo para cargar el tipo de vivienda
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        char tipo = 0;

        while (continuar != false) {
            System.out.println("Ingrese el tipo de vivienda c/d/x: ");
            tipo = TecladoIn.readLineNonwhiteChar();

            //Si es una casa o departamento o duplex se corta la operacion
            if (tipo == 'c' || tipo == 'd' || tipo == 'x') {
                continuar = false;
            }
        }
        return tipo;
    }

    public static String cargarDireccion() {
        //Modulo para cargar y verificar la direccion de la vivienda
        //Declaracion e inicializacion de variables
        String direccion = "";
        boolean continuar = true;
        char opcion;

        while (continuar != false) {
            System.out.println("Ingrese la direccion de la vivienda: ");
            direccion = TecladoIn.readLine();
            System.out.println("¿La direccion que ingreso es correcta? s/n");   //Confirmacion de direccion
            opcion = TecladoIn.readNonwhiteChar();

            switch (opcion) {   //Si la direccion es correcta se corta la operacion, caso contrario se vuelve a ingresar la direccion
                case 's':
                    continuar = false;
                    break;
                case 'n':
                    continuar = true;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return direccion;
    }

    public static int cargarCantAmbientes() {
        //Modulo para cargar y verificacion de la cantidad de ambientes
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        int cantAmbientes = 0;
        char opcion;

        while (continuar != false) {
            System.out.println("Ingrese la cantidad de ambientes: ");
            cantAmbientes = TecladoIn.readInt();
            System.out.println("¿La cantidad de ambientes es correcta? s/n");   //Confirmacion de la cantidad de ambientes
            opcion = TecladoIn.readNonwhiteChar();

            switch (opcion) {  //Si la cantidad es correcta se corta la operacion, caso contrario se vuelve a ingresar la cantidad correcta
                case 's':
                    continuar = false;
                    break;
                case 'n':
                    continuar = true;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return cantAmbientes;
    }

    public static char cargarOperacion() {
        //Modulo para cargar el tipo de operacion de la vivienda
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        char operacion = 0;

        while (continuar != false) {
            System.out.println("Ingrese el tipo de operacion v/a/t: ");
            operacion = TecladoIn.readNonwhiteChar();

            //Si la vivienda esta en venta o alquilada o en alquiler temporario se corta la operacion
            if (operacion == 'v' || operacion == 'a' || operacion == 't') {
                continuar = false;
            }
        }
        return operacion;
    }

    public static int cargarSuperficie() {
        //Modulo para cargar y verificar la superficie de la vivienda
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        char opcion;
        int superficie = 0;

        while (continuar != false) {
            System.out.println("Ingrese la superficie: ");
            superficie = TecladoIn.readInt();
            System.out.println("¿La superficie que ingreso es correcta? s/n");  //Confirmacion de la superficie
            opcion = TecladoIn.readNonwhiteChar();

            switch (opcion) {  //Si la superficie es correcta se corta la operacion, caso contrario se vuelve a ingresas la superficie correcta
                case 's':
                    continuar = false;
                    break;
                case 'n':
                    continuar = true;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return superficie;
    }

    public static boolean cargarDisponibilidad() {
        //Modulo para cargar la disponibilidad de una vivienda
        //Declaracion e inicializacion de varaibles
        boolean continuar = true;
        char disp;
        boolean disponibilidad = false;

        while (continuar != false) {
            System.out.println("Ingrese la disponibilidad de la vivienda d/o: ");
            disp = TecladoIn.readNonwhiteChar();

            //Si esta disponible devuelve true, caso contrario devuelve false
            switch (disp) {
                case 'd':
                    disponibilidad = true;
                    continuar = false;
                    break;
                case 'o':
                    disponibilidad = false;
                    continuar = false;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return disponibilidad;
    }

    public static int cargarPrecio() {
        //Modulo para cargar y verificar el precio de la vivienda
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        char opcion;
        int precio = 0;

        while (continuar != false) {
            System.out.println("Ingrese el precio de la vivienda: ");
            precio = TecladoIn.readInt();
            System.out.println("¿El precio que ingreso es correcto? s/n");   //Confirmacion del precio
            opcion = TecladoIn.readNonwhiteChar();

            switch (opcion) {  //Si el precio es correcto corta la operacion, caso contrario se vuelve a ingresar el precio correcto
                case 's':
                    continuar = false;
                    break;
                case 'n':
                    continuar = true;
                    break;
                default:
                    continuar = true;
                    break;
            }
        }
        return precio;
    }

    public static void listarDatos(Propiedad[] prop, int pos) {
        //Modulo para motrar el listado de todos los datos
        for (int i = 0; i < pos; i++) {
            System.out.println(prop[i].toString());
        }
    }

    public static void verificarCasa(Propiedad[] prop, int pos) {
        //Modulo para verificar si la vivienda es una casa
        //Declaracion e inicializacion de variables
        char tipo, op;
        int sup, contador = 0;
        boolean disp;

        for (int i = 0; i < pos; i++) {
            tipo = prop[i].getTipo();
            op = prop[i].getOperacion();
            sup = prop[i].getSuperficie();
            disp = prop[i].getDisponibilidad();

            if (tipo == 'c' && op == 'v' && sup > 100 && disp) {
                System.out.println(prop[i].toString());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay propiedades que cumplan con las caracteristicas buscadas.");
        }
    }

    public static void verificarDpto(Propiedad[] prop, int pos) {
        //Modulo para verificar si la vivienda es una departamento
        //Declaracion e inicializacion de variables
        char tipo, op;
        int cantAmbientes, precio, contador = 0;

        for (int i = 0; i < pos; i++) {
            tipo = prop[i].getTipo();
            op = prop[i].getOperacion();
            cantAmbientes = prop[i].getCantAmbientes();
            precio = prop[i].getPrecio();
            if (tipo == 'd' && op == 'a' && cantAmbientes == 1 && precio < 20000) {
                System.out.println(prop.toString());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay propiedades que cumplan con las caracteristicas buscadas.");
        }
    }

    public static void menuOrdenamiento() {
        //Modulo para mostrar las opciones de metodos de ordenacion
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println(" ");
        System.out.println("(1) Ordenar por Burbuja Mejorado.");
        System.out.println("(2) Ordenar por Metodo Seleccion.");
        System.out.println("(3) Ordenar por Metodo Insercion.");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------");
    }

    public static void metodosOrdenamiento(Propiedad[] prop) {
        //Modulo que recibe el arreglo de propiedades y muestra un menu con los metodos de ordenamiento disponibles
        int opcion;

        menuOrdenamiento();   //Invoco el modulo del menu de opcioones de ordenamiento

        opcion = TecladoIn.readLineInt();
        switch (opcion) {
            case 1:                      // (1) Ordenar por Burbuja Mejorado
                burbujaMejorado(prop);
                break;
            case 2:                      // (2) Ordenar por Metodo Seleccion
                seleccion(prop);
                break;
            case 3:                      // (3) Ordenar por Metodo Insercion
                insercion(prop);
                break;
        }
    }
 public static void burbujaMejorado(Propiedad[] prop) {
        //Declaracion e inicializacion de variables
        int i = 0, j;
        boolean sinCambio = false;
        Propiedad aux;

        while (i < prop.length && !sinCambio) {
            sinCambio = true;
            for (j = 0; j < prop.length - i - 1; j++) {
                if (prop[j].getPrecio() > prop[j + 1].getPrecio()) {
                    aux = prop[j];
                    prop[j] = prop[j + 1];
                    prop[j + 1] = aux;
                    sinCambio = false;
                }
            }
            i++;
        }
    }
    //Metodo por Burbuja Mejorado
   

    //Metodo por Seleccion
    public static void seleccion(Propiedad[] prop) {
        //Declaracion de variables
        int i, j, min;
        Propiedad aux;

        for (i = 0; i < prop.length - 1; i++) {
            min = i;
            for (j = i + 1; j < prop.length; j++) {
                if (prop[j].getPrecio() < prop[min].getPrecio()) {
                    min = j;
                }
            }
            aux = prop[i];
            prop[i] = prop[min];
            prop[min] = aux;
        }
    }

    //Metodo por Insercion
    public static void insercion(Propiedad[] prop) {
        //Declaracion de variables
        int i, j;
        Propiedad aux;

        for (i = 1; i < prop.length; i++) {
            aux = prop[i];
            j = i;

            while (j > 0 && aux.getPrecio() < prop[j - 1].getPrecio()) {
                prop[j] = prop[j - 1];
                j--;
            }
            prop[j] = aux;
        }
    }

    public static void propDisponibles(Propiedad[] prop) {
        //Solicito que se ingrese la cantidad de ambientes buscado y llamo al metodo recursivo contarProp
        int cantProp, cantAmbientes;

        System.out.println("Ingrese la cantidad de ambientes que desea buscar: ");
        cantAmbientes = TecladoIn.readInt();

        cantProp = contarProp(prop, prop.length - 1, cantAmbientes);     //Invoco el modulo recursivo

        System.out.println("Hay " + cantProp + " con " + cantAmbientes);
    }

    public static int contarProp(Propiedad[] prop, int n, int buscado) {
        //Modulo recursivo para contar la n-cantidad de propiedades
        int retorno = 0;

        //Recorro el arreglo recursivamente y aumento en 1 el retorno cada vez que la cantidad de ambientes es igual a la ingresada
        if (n == 0) {
            if (prop[n].getCantAmbientes() == buscado && prop[n].getDisponibilidad()) {
                retorno = 1;
            }
        } else {
            if (prop[n].getCantAmbientes() == buscado && prop[n].getDisponibilidad()) {
                retorno = 1 + contarProp(prop, n - 1, buscado);
            } else {
                retorno = contarProp(prop, n - 1, buscado);
            }
        }
        return retorno;
    }

    public static void buscarMayor(Propiedad[] prop, int longitud) {
        //Modulo para llamar el metodo recursivo buscarSupMax
        int pos;

        pos = buscarSupMax(prop, longitud - 1);   //Invoco el modulo recursivo

        if (pos != -1) {   //Verifica si la posicion retornada es -1 e imprime el cartel correspondiente
            System.out.println(prop[pos].toString());  //Muestra la propiedad con la mayor superficie
        } else {
            System.out.println("No existe una propiedad de esas caracteristicas.");
        }
    }

    public static int buscarSupMax(Propiedad[] prop, int longitud) {
        //Modulo recursivo para buscar la superficie maxima de propiedades con disponibilidad
        int pos = -1;

        if (longitud == 0) {
            if (prop[longitud].getDisponibilidad() && prop[longitud].getTipo() == 'c' && prop[longitud].getOperacion() == 'a') {
                pos = longitud;
            }
        } else {
            pos = buscarSupMax(prop, longitud - 1);
            if (pos == -1) {
                if (prop[longitud].getDisponibilidad() && prop[longitud].getTipo() == 'c' && prop[longitud].getOperacion() == 'a') {
                    pos = longitud;
                }
            } else {
                if (prop[longitud].getDisponibilidad() && prop[longitud].getTipo() == 'c' && prop[longitud].getOperacion() == 'a') {
                    if (prop[pos].getSuperficie() < prop[longitud].getSuperficie()) {
                        pos = longitud;
                    }
                }
            }
        }
        return pos;
    }

    public static void buscarCasa(Propiedad[] arreglo, boolean ordenado) {
        //En este modulo se realiza la busqueda de una propiedad con un precio ingresado
        int precioBuscado, pos;
        if (ordenado) { //Verifico que el arreglo haya sido ordenado previamente, y a continuar realizo la busqueda
            System.out.println("Ingrese el precio de la casa que busca: ");
            precioBuscado = TecladoIn.readLineInt();
            pos = busquedaBinaria(arreglo, precioBuscado);

            if (pos == -1) {//Verifico que la posicion sea diferente a -1 para imprimir la propiedad con el precio ingresado
                System.out.println("El precio ingresado no pertenece a ninguna propiedad.");
            } else {
                System.out.println(arreglo[pos].toString());
            }
        } else { //Si no esta ordenado imprime el cartel y vuelve al menu de opciones
            System.out.println("El arreglo no esta ordenado.");
            System.out.println("");
        }
    }

    //Realizo la busqueda binaria una vez se verifica que esta ordenado y se solicita el precio
    public static int busquedaBinaria(Propiedad[] prop, int precioBuscado) {
        int inicio, fin, pos, medio;

        inicio = 0;
        fin = prop.length - 1;
        pos = -1;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (precioBuscado == prop[medio].getPrecio()) {
                pos = medio;
                inicio = fin + 1;
            } else if (precioBuscado < prop[medio].getPrecio()) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return pos;
    }

    //Metodo avanzado por Quick Sort
    private static void metodoQuickSort(Propiedad[] prop, int izq, int der) {
        //Declaracion de variables
        Propiedad pivote = prop[izq]; //Tomamos el primer elemento como pivote
        int i = izq;    //i realiza la búsqueda de izquierda a derecha
        int j = der;    //j realiza la búsqueda de derecha a izquierda
        Propiedad aux;

        while (i < j) {            //Mientras no se crucen las búsquedas
            while (prop[i].getSuperficie() <= pivote.getSuperficie() && i < j) {
                i++;    //Busca un elemento mayor que pivote
            }
            while (prop[j].getSuperficie() > pivote.getSuperficie()) {
                j--;    //Busca elemento menor que pivote
            }
            if (i < j) {                 //Si no se han cruzado                      
                aux = prop[i];         //Los intercambia
                prop[i] = prop[j];
                prop[j] = aux;
            }
        }
        prop[izq] = prop[j]; // se coloca el pivote en su lugar de forma que tendremos
        prop[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            metodoQuickSort(prop, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            metodoQuickSort(prop, j + 1, der); // ordenamos subarray derecho
        }
    }
}
