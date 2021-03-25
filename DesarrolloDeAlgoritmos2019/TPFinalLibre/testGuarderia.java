/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesarrolloDeAlgoritmos2019.TPFinalLibre;

import DesarrolloDeAlgoritmos2019.utiles.TecladoIn;

/**
 *
 * @author Rocio Graff
 */
public class testGuarderia {

    public static void menu() {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Ingrese la opcion corresponpiente");
        System.out.println("(0) Terminar.");
        System.out.println("(1) Ingresar un perro.");
        System.out.println("(2) Contar Labradores hembras que pasaron durante el verano.");
        System.out.println("(3) Listar perros que ingresaron en una determinada fecha.");
        System.out.println("(4) Listar todos los Ovejeros con estadia mayor a 20 dias.");
        System.out.println("(5) Dado un codigo, informar los datos del dueño.");
        System.out.println("(6) Mostrar el arreglo de perros.");
        System.out.println("(7) Ordenar el arreglo por nombre por Metodo Burbuja Mejorado.");
        System.out.println("(8) Ordenar el arreglo por fecha por Metodo Seleccion.");
        System.out.println("(9) Ordenar el arreglo por telefono del dueño por Metodo de Insercion.");
        System.out.println("(10) Ordenar el arreglo por cantidad de dias por Metodo Avanzado.");
        System.out.println("(11) Dado un telefono, mostrar los datos del perro por Busqueda Binaria.");
        System.out.println("(12) Contar la cantidad de perros de un determinado genero por Metodo Recursivo.");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        //Declaracion e Inicializacion de variables
        Perro[] perro;
        Fecha[] fecha;
        char genero;
        int opcion, longitud, posicion = 20, pos;
        boolean terminar = false, ordenado = false;
        String numero;

        longitud = cargarLongitudMaxima();

        fecha = new Fecha[longitud];      //Creacion y declaracion del arreglo fecha
        perro = new Perro[longitud];      //Creacion y declaracion del arreglo perro

        precargaArreglo(perro, fecha, longitud);  //Llamo al modulo con los datos predefinidos

        while (!terminar) {
            menu();     //Muestro las opciones del menu
            opcion = TecladoIn.readLineInt();   //Lee las opciones del menu

            switch (opcion) {
                case 0:                   //(0) Terminar
                    terminar = true;
                    break;
                case 1:                   //(1) Ingresar un perro
                    cargarPerros(perro, posicion);
                    ordenado = false;  //Cada que se ingrese un nuevo perro el arreglo no va a estar ordenado
                    break;
                case 2:                   //(2) Contar Labradores hembras que pasaron durante el verano
                    contarLabradoras(perro, posicion);
                    break;
                case 3:                   //(3) Listar perros que ingresaron en una determinada fecha
                    listarPorFecha(perro, fecha, posicion);
                    break;
                case 4:                   //(4) Listar todos los Ovejeros con estadia mayor a 20 dias
                    listarOvejeros(perro, posicion);
                    break;
                case 5:                   //(5) Dado un codigo, informar los datos del dueño
                    mostrarDuenios(perro, posicion);
                    break;
                case 6:                   //(6) Mostrar el arreglo de perros
                    listarDatos(perro, posicion);
                    break;
                case 7:                   //(7) Ordenar el arreglo por nombre por Metodo Burbuja Mejorado
                    ordenarNombres(perro, posicion);
                    listarDatos(perro, posicion);
                    break;
                case 8:                   //(8) Ordenar el arreglo por fecha por Metodo Seleccion
                    ordenarPorFecha(perro, posicion);
                    listarDatos(perro, posicion);
                    break;
                case 9:                   //(9) Ordenar el arreglo por telefono del dueño por Metodo de Insercion
                    ordenarPorTel(perro, posicion);
                    listarDatos(perro, posicion);
                    ordenado = true;   //Arreglo ordenado
                    break;
                case 10:                  //(10) Ordenar el arreglo por cantidad de dias por Metodo Avanzado
                    metodoQuickSort(perro, 0, posicion - 1);
                    listarDatos(perro, posicion);
                    break;
                case 11:                  //(11) Dado un telefono, mostrar los datos del perro por Busqueda Binaria
                    if (ordenado) {  //Si el arreglo esta ordenado mediante la opcion 9
                        System.out.println("Ingrese el numero de telefono que busca: ");
                        numero = TecladoIn.readLineWord();
                        pos = buscarNumTel(perro, posicion, numero);  //Invoco modulo para buscar un numero en especifico
                        if (pos != -1) {
                            System.out.println(perro[pos].toString());
                        } else {
                            System.out.println("El numero de telefono no se encuentra.");
                        }
                    } else {
                        System.out.println("Es necesario ordenar el arreglo. (Opcion 9)");
                    }
                    break;
                case 12:                  //(12) Contar la cantidad de perros de un determinado genero por Metodo Recursivo
                    System.out.println("Ingrese el genero que desea contar: ");
                    genero = TecladoIn.readLineNonwhiteChar();
                    System.out.println("Hay " + contarMismoGenero(perro, posicion - 1, genero) + " perros del mismo genero");
                    break;
            }
        }
    }

    public static void precargaArreglo(Perro[] perro, Fecha[] fecha, int longitud) {
        //Modulo con los datos de los perros predefinidos
        //Creacion del arreglo fecha con 20 datos predefinidos
        fecha[0] = new Fecha(13, 03, 2020);
        fecha[1] = new Fecha(06, 02, 2020);
        fecha[2] = new Fecha(10, 05, 2020);
        fecha[3] = new Fecha(15, 06, 2019);
        fecha[4] = new Fecha(20, 12, 2019);
        fecha[5] = new Fecha(01, 04, 2020);
        fecha[6] = new Fecha(30, 01, 2020);
        fecha[7] = new Fecha(04, 07, 2019);
        fecha[8] = new Fecha(23, 03, 2020);
        fecha[9] = new Fecha(16, 12, 2019);
        fecha[10] = new Fecha(23, 12, 2020);
        fecha[11] = new Fecha(02, 07, 2019);
        fecha[12] = new Fecha(28, 06, 2019);
        fecha[13] = new Fecha(26, 8, 2020);
        fecha[14] = new Fecha(02, 11, 2019);
        fecha[15] = new Fecha(11, 9, 2019);
        fecha[16] = new Fecha(02, 02, 2020);
        fecha[17] = new Fecha(05, 01, 2020);
        fecha[18] = new Fecha(9, 03, 2019);
        fecha[19] = new Fecha(07, 10, 2019);

        //Creacion del arreglo perro con 20 datos predefinidos
        perro[0] = new Perro(1234, "Tulia", 'h', "Labrador", fecha[0], 10, "Rocio Graff", "2996261033");
        perro[1] = new Perro(2569, "Pedro", 'm', "Ovejero", fecha[1], 25, "Matias Gonzales", "2994209087");
        perro[2] = new Perro(5920, "Brisa", 'h', "Caniche", fecha[2], 25, "Lucia Gomez", "2995697140");
        perro[3] = new Perro(8963, "Taison", 'm', "Bulldog", fecha[3], 3, "Luciano Perez", "2995105436");
        perro[4] = new Perro(3589, "Lola", 'h', "Golden Retrieve", fecha[4], 6, "Facundo Pereyra", "2994695084");
        perro[5] = new Perro(6314, "Pepe", 'm', "Pastor Aleman", fecha[5], 30, "Maria Lopez", "2996206533");
        perro[6] = new Perro(4710, "Nieve", 'h', "Husky Siberiano", fecha[6], 10, "Paula Sandoval", "2995803690");
        perro[7] = new Perro(7304, "Pocho", 'm', "Rotweiller", fecha[7], 14, "Rodolfo Jauregui", "2996479631");
        perro[8] = new Perro(9582, "Tania", 'h', "Doberman", fecha[8], 9, "Gustavo Martinez", "2994952014");
        perro[9] = new Perro(0420, "Pipo", 'm', "Beagle", fecha[9], 22, "Julia Locher", "2996526471");
        perro[10] = new Perro(6547, "Rosa", 'h', "Labrador", fecha[10], 5, "Erick Lopez", "2995709046");
        perro[11] = new Perro(1369, "Paco", 'm', "Ovejero", fecha[11], 30, "Ernesto Lopez", "2994601085");
        perro[12] = new Perro(0526, "Diana", 'h', "Delmon", fecha[12], 2, "Pedro Gonzalez", "2996703150");
        perro[13] = new Perro(2785, "Ciro", 'm', "Dalmata", fecha[13], 14, "Franco Gutierrez", "2995789410");
        perro[14] = new Perro(8741, "Mora", 'h', "Labrador", fecha[14], 20, "Veronica Pereira", "2996548365");
        perro[15] = new Perro(4162, "Roco", 'm', "Ovejero", fecha[15], 24, "Florencia Salatic", "2994538471");
        perro[16] = new Perro(2984, "Carin", 'h', "Labrador", fecha[16], 17, "Micaela Martinez", "2994617652");
        perro[17] = new Perro(5496, "Salem", 'm', "Doberman", fecha[17], 7, "Nicolas Benitez", "2995314695");
        perro[18] = new Perro(7365, "Bella", 'h', "Labrador", fecha[18], 16, "Lara Otero", "2994394716");
        perro[19] = new Perro(9173, "Kenai", 'm', "Ovejero", fecha[19], 26, "Jeremias Neguiman", "2995419673");
    }

    public static int cargarLongitudMaxima() {
        //Modulo para especificar la longitud del arreglo de perros
        int perrosACargar = 0;
        boolean cantValida = false;

        while (!cantValida) {
            System.out.println("Ingrese la cantidad total de perros que va a cargar (Deben ser mas de 20 perros)");
            perrosACargar = TecladoIn.readLineInt();

            if (perrosACargar > 20) {
                cantValida = true;
            }
        }
        return perrosACargar;
    }

    public static int cargarPerros(Perro[] perro, int pos) {
        //Modulo para especificar cuantos perros quiere agregar al arreglo
        int cargar, j;

        System.out.println("Ingrese la cantidad de perros que va a cargar");
        cargar = TecladoIn.readLineInt();

        j = pos + cargar;

        while (pos < j && pos < perro.length) {
            perro[pos] = cargarDatos(perro, pos);
            pos++;
        }
        return j;
    }

    public static Perro cargarDatos(Perro[] perro, int pos) {
        //Modulo para cargar los datos de cada perro al arreglo
        int codigo = 0, cantDias;
        String nombre, raza, nombreDuenio, telDuenio;
        boolean noEsValido = true;
        char genero;
        Perro p;
        Fecha fechaIngreso;

        while (noEsValido) {  //Repite hasta que el codigo ingresado sea valido
            codigo = cargarCodigo();
            noEsValido = verificarCodigo(perro, codigo, pos);  //Llamo el modulo que verifica si existe el codigo
        }
        System.out.println("Ingrese el nombre del perro: ");
        nombre = TecladoIn.readLine();
        genero = cargarGenero();         //Llamo el modulo para cargar el genero
        System.out.println("Ingrese la raza del perro: ");
        raza = TecladoIn.readLine();
        System.out.println("Ingrese la fecha de ingreso");
        fechaIngreso = cargarFecha();    //Llamo el modulo para cargar la fecha
        System.out.println("Ingrese la cantidad de dias que estuvo: ");
        cantDias = TecladoIn.readLineInt();
        System.out.println("Ingrese el nombre del dueño: ");
        nombreDuenio = TecladoIn.readLine();
        System.out.println("Ingrese el telefono del dueño: ");
        telDuenio = TecladoIn.readLine();

        p = new Perro(codigo, nombre, genero, raza, fechaIngreso, cantDias, nombreDuenio, telDuenio);

        return p;
    }

    public static int cargarCodigo() {
        //Modulo para cargar y verificar el codigo
        //Declaracion e inicializacion de variables
        boolean continuar = true;
        int codigo = 0;
        char opcion;

        while (continuar) {
            System.out.println("Ingrese el codigo del perro: ");
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
            }
        }
        return codigo;
    }

    public static boolean verificarCodigo(Perro[] perro, int cod, int pos) {
        //Modulo para verificar la validez del codigo ingresado anteriormente
        Perro p = new Perro(cod);
        boolean existe;
        int i = 0;

        while (!(perro[i].equals(p)) && (i < pos - 1)) {
            i++;
        }

        if (perro[i].equals(p)) {
            existe = true;
            System.out.println("El codigo ya fue ingresado.");
        } else {
            existe = false;
        }

        return existe;

    }

    public static char cargarGenero() {
        //Modulo para cargar el genero del perro
        boolean continuar = false;
        char genero = 0;

        while (!continuar) {
            System.out.println("Ingrese el genero del perro h/m: ");
            genero = TecladoIn.readLineNonwhiteChar();

            //Si es hembra o macho se corta la operacion
            if (genero == 'h' || genero == 'm') {
                continuar = true;
            }
        }
        return genero;
    }

    public static Fecha cargarFecha() {
        //Modulo para cargar las fechas de ingreso a la guarderia de cada perro 
        Fecha f, f1;
        int dia = 0, mes = 0, anio;
        boolean valido2 = false, valido1 = false;

        System.out.println("Ingrese el año de ingreso: ");
        anio = TecladoIn.readLineInt();
        f1 = new Fecha(anio);
        while (!valido1) {
            System.out.println("Ingrese el mes de ingreso: ");
            mes = TecladoIn.readLineInt();
            if (mes > 0 && mes <= 12) {
                valido1 = true;
            }
        }
        while (!valido2) {
            System.out.println("Ingrese el dia de ingreso: ");
            dia = TecladoIn.readLineInt();
            valido2 = verificarDia(anio, mes, dia, f1);   //Llamo al modulo para verificar si es año bisiesto
        }
        f = new Fecha(dia, mes, anio);

        return f;
    }

    public static boolean verificarDia(int anio, int mes, int dia, Fecha f1) {
        //Modulo para verificar los dias del mes de febrero y especificar si es un año bisiesto
        boolean retorno = false;

        if (mes == 2 && f1.esAnioBisiesto()) {  //Esta estructura if se encarga de verificar los dias de febrero, dependiendo de si es o no un año bisiesto
            if (dia > 0 && dia <= 29) {
                retorno = true;
            }
        } else if (mes == 2) {
            if (dia > 0 && dia <= 28) {
                retorno = true;
            }
        }
        //Se verifican los meses con 31 dias
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 0 && dia <= 31) {
                retorno = true;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {  //Se verifican los meses con 30 dias
            if (dia > 0 && dia <= 30) {
                retorno = true;
            }
        }
        return retorno;
    }

    public static void contarLabradoras(Perro[] perro, int pos) {
        //Modulo para contar los labradores que son hembras en el arreglo
        int contador = 0;
        Fecha fecha;
        String raza;
        char genero;

        for (int i = 0; i < pos; i++) {
            fecha = perro[i].getFechaIngreso();
            raza = perro[i].getRaza();
            genero = perro[i].getGenero();

            if ("Labrador".equalsIgnoreCase(raza) && genero == 'h' && esVerano(fecha)) {
                contador++;
            }
        }
        System.out.println("La cantidad de Labradoras es: " + contador);
    }

    public static boolean esVerano(Fecha f) {
        //Modulo para especificar el periodo de tiempo del verano
        boolean verano = false;
        int dia, mes;

        dia = f.getDia();
        mes = f.getMes();

        if ((mes == 12 && dia >= 22) || (mes >= 1 && mes <= 2) || (mes == 3 && dia <= 20)) {
            //Periodo de verano: 22 de diciembre a 20 de marzo
            verano = true;
        }
        return verano;
    }

    public static void listarPorFecha(Perro[] perro, Fecha[] fecha, int pos) {
        //Modulo para listar los perros que ingresaron en una fecha determinada
        Fecha f, f1;
        int dia, mes, anio;

        System.out.println("Ingrese la fecha que busca");
        System.out.println("Ingrese el dia: ");
        dia = TecladoIn.readLineInt();
        System.out.println("Ingrese el mes: ");
        mes = TecladoIn.readLineInt();
        System.out.println("Ingrese el año: ");
        anio = TecladoIn.readLineInt();
        f1 = new Fecha(dia, mes, anio);

        for (int i = 0; i < pos; i++) {
            f = perro[i].getFechaIngreso();
            if (f1.equals(f)) {
                System.out.println(perro[i].toString());
            } else {
                System.out.println("No se encuentra ningun perro con esas caracteristicas.");
            }
        }
    }

    public static void listarOvejeros(Perro[] perro, int pos) {
        //Modulo para listar los perros de raza ovejero que estuvieron mas de 20 dias en la guarderia
        String raza;
        int cantDias;

        for (int i = 0; i < pos; i++) {
            raza = perro[i].getRaza();
            cantDias = perro[i].getCantDias();

            if ("Ovejero".equalsIgnoreCase(raza) && cantDias > 20) {
                System.out.println(perro[i].toString());
            } else {
                System.out.println("No se encuentra ningun perro con esas caracteristicas.");
            }
        }
    }

    public static void mostrarDuenios(Perro[] perro, int pos) {
        //Modulo para mostrar los datos del dueño del perro, segun un codigo buscado
        int codigo, i = 0;
        String nombre, tel;
        boolean encontrado = false;

        System.out.println("Ingrese el codigo que busca: ");
        codigo = TecladoIn.readLineInt();

        while (!encontrado && i < pos) {
            if (perro[i].getCodigo() == codigo) {
                encontrado = true;
            }
            i++;
        }

        if (encontrado) {
            nombre = perro[i].getNombreDuenio();
            tel = perro[i].getTelDuenio();
            System.out.println("Nombre: " + nombre + " Telefono: " + tel);
        } else {
            System.out.println("No se encontro ningun perro con ese codigo.");
        }
    }

    public static void listarDatos(Perro[] perro, int pos) {
        //Modulo para motrar el listado de todos los datos
        for (int i = 0; i < pos; i++) {
            System.out.println(perro[i].toString());
        }
    }

    public static void ordenarNombres(Perro[] perro, int pos) {
        //Modulo para ordenar el arreglo por Nombres utilizando el Metodo Burbuja Mejorado
        //Declaracion e inicializacion de variables
        int i = 0, j;
        boolean sinCambio = false;
        Perro aux;

        while (i < pos && !sinCambio) {
            sinCambio = true;
            for (j = 0; j < pos - i - 1; j++) {
                if (perro[j].getNombre().compareTo(perro[j + 1].getNombre()) > 0) {  //Si la cedena 1 es mayor a la cadena 2 devuelve un numero positivo
                    aux = perro[j];
                    perro[j] = perro[j + 1];
                    perro[j + 1] = aux;
                    sinCambio = false;
                } else {
                }
            }
            i++;
        }
    }

    public static void ordenarPorFecha(Perro[] perro, int pos) {
        //Modulo para ordenar el arreglo por fechas utilizando el Metodo Seleccion
        //Declaracion de variables
        int i, j, min;
        Perro aux;
        Fecha f1, f2;

        for (i = 0; i < pos - 1; i++) {
            min = i;
            for (j = i + 1; j < pos; j++) {
                f1 = perro[j].getFechaIngreso();
                f2 = perro[min].getFechaIngreso();
                if (compararFecha(f1, f2)) {   //Llamo al modulo que verifica el orden
                    min = j;
                }
            }
            aux = perro[i];
            perro[i] = perro[min];
            perro[min] = aux;
        }
    }

    public static boolean compararFecha(Fecha f1, Fecha f2) {
        //Modulo para verificar el orden cronologico de las fechas f1 y f2
        boolean retorno = false;

        if (f1.getAnio() < f2.getAnio()) {
            retorno = true;
        } else {
            if (f1.getMes() < f2.getMes() && f1.getAnio() == f2.getAnio()) {
                retorno = true;
            } else {
                if (f1.getDia() < f2.getDia() && f1.getMes() == f2.getMes() && f1.getAnio() == f2.getAnio()) {
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    public static void ordenarPorTel(Perro[] perro, int pos) {
        //Modulo para ordenar el arreglo por telefonos con el Metodo Insercion
        //Declaracion de variables
        int i, j;
        Perro aux;

        for (i = 1; i < pos; i++) {
            aux = perro[i];
            j = i;

            while (j > 0 && aux.getTelDuenio().compareTo(perro[j - 1].getTelDuenio()) < 0) { //Si la cadena 1 es menor que la cadena 2 devuelve un numero negativo
                perro[j] = perro[j - 1];
                j--;
            }
            perro[j] = aux;
        }
    }

    private static void metodoQuickSort(Perro[] perro, int izq, int der) {
        //Modulo para ordenar el arreglo por la cantidad de dias que estuvo un perro por Metodo Quick Sort
        //Declaracion de variables
        Perro pivote = perro[izq]; //Tomamos el primer elemento como pivote
        int i = izq;    //i realiza la búsqueda de izquierda a derecha
        int j = der;    //j realiza la búsqueda de derecha a izquierda
        Perro aux;

        while (i < j) {            //Mientras no se crucen las búsquedas
            while (perro[i].getCantDias() <= pivote.getCantDias() && i < j) {
                i++;    //Busca un elemento mayor que pivote
            }
            while (perro[j].getCantDias() > pivote.getCantDias()) {
                j--;    //Busca elemento menor que pivote
            }
            if (i < j) {                 //Si no se han cruzado                      
                aux = perro[i];         //Los intercambia
                perro[i] = perro[j];
                perro[j] = aux;
            }
        }
        perro[izq] = perro[j]; // se coloca el pivote en su lugar de forma que tendremos
        perro[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            metodoQuickSort(perro, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            metodoQuickSort(perro, j + 1, der); // ordenamos subarray derecho
        }
    }

    public static int buscarNumTel(Perro[] perro, int pos, String num) {
        //Modulo para buscar un numero de telefono especifico en el arreglo por Metodo Busqueda Binaria
        //Metodo de ordenamiento (disminuye y venceras)
        int inicio, fin, resultado, medio;

        inicio = 0;
        fin = pos - 1;
        resultado = - 1;

        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (num.equals(perro[medio].getTelDuenio())) {  //Verifica la igualdad del numero ingresado con el numero de la posicion "medio"
                resultado = medio;
                inicio = fin + 1;
            } else {
                if (num.compareTo(perro[medio].getTelDuenio()) < 0) {  //Verifica el orden semantico de los numeros para buscar en la mitad que se encuentre el numero ingresado
                    fin = medio - 1;
                } else {
                    inicio = medio + 1;
                }
            }
        }
        return resultado;
    }

    public static int contarMismoGenero(Perro[] perro, int pos, char buscar) {
        //Modulo para contar cuantos perros del mismo genero se encuentran en el arreglo
        int contador = 0;

        if (pos == 0) {   //Recorro el arreglo de la ultima posicion hasta la primera, este es el caso base
            if (perro[pos].getGenero() == buscar) {
                contador = 1;
            }
        } else {  //Paso Recursivo
            if (perro[pos].getGenero() == buscar) {
                contador = 1 + contarMismoGenero(perro, pos - 1, buscar);
            } else {
                contador = contador + contarMismoGenero(perro, pos - 1, buscar);
            }
        }
        return contador;
    }
}
