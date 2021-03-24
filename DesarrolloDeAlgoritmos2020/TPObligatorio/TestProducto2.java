package TPObligatorio;
import java.util.Scanner;

public class TestProducto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] arreglo;
        int opcion = -1, cantProductos;
        char cargar = '\0';
        while (cargar != 'n' && cargar != 's') {
            System.out.println("¿Desea usar el arreglo ya cargado? (s/n)");
            cargar = sc.next().charAt(0);
        }

        if (cargar == 'n') {
            System.out.println("Ingrese la cantidad de productos arreglo cargar: ");
            cantProductos = sc.nextInt();
            arreglo = new Producto[cantProductos];
            cargarDatos(arreglo, cantProductos);
        } else {
            arreglo = new Producto[10];
            arregloPredefinido(arreglo);
        }

        do {
            menu();
            opcion = sc.nextInt();
            if (opcion != 0) {
                acciones(arreglo, opcion);
            }
        } while (opcion != 0);
    }

    public static void arregloPredefinido(Producto[] a) {
        //Modulo del arreglo predefinido con 10 productos
        a[0] = new Producto(13524, 32, "mayonesa", "Helmans", 21.5);
        a[1] = new Producto(65423, 74, "queso", "S&P", 126.87);
        a[2] = new Producto(78956, 41, "aceite", "Cocinero", 156);
        a[3] = new Producto(38529, 32, "jabon", "Dove", 41.54);
        a[4] = new Producto(31635, 8, "detergente", "Magistral", 43.64);
        a[5] = new Producto(54637, 5, "lavandina", "Clorox", 85.86);
        a[6] = new Producto(48296, 52, "tirabuzones", "Luchetti", 23.74);
        a[7] = new Producto(48674, 3, "lapicera", "BIC", 4.52);
        a[8] = new Producto(46852, 7, "te", "La Virginia", 56.41);
        a[9] = new Producto(71852, 0, "shampoo", "Suave", 78.29);
    }

    public static void cargarDatos(Producto[] a, int productos) {
        //Modulo para cargar los datos del arreglo Producto
        Scanner sc = new Scanner(System.in);
        Producto p;
        int codigo, cant;
        String nombre, marca;
        double precio;
        boolean valido = false;

        for (int i = 0; i < productos; i++) {
            do {
                System.out.println("Ingrese un codigo valido: ");
                codigo = sc.nextInt();
                if (i != 0) {
                    valido = verificarCodigo(a, codigo, i);
                }
                if (!valido) {
                    System.out.println("Este codigo ya esta asignado a otro producto.");
                }
            } while (!valido);
            System.out.println("Ingrese el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Ingrese la marca del prodcuto: ");
            marca = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad en stock del producto: ");
            cant = sc.nextInt();

            p = new Producto(codigo, cant, nombre, marca, precio);
            a[i] = p;
        }
    }

    public static boolean verificarCodigo(Producto[] a, int cod, int j) {
        //Modulo para verificar si el codigo se repite
        Producto p = new Producto(cod);
        boolean valido = true;
        int i = 0;
        while (valido && i <= j) {
            if (a[i].equals(p)) {
                valido = false;
            } else {
                i++;
            }
        }
        return valido;
    }

    public static void menu() {
        //Modulo menu con las consignas pedidas
        System.out.println("Ingrese la opción que desea realizar: ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("0: Salir.");
        System.out.println("1: Ordenar arreglo.");
        System.out.println("2: Contar, mediante un método recursivo, la cantidad de productos que tienen un stock menor que 10.");
        System.out.println("3: Encontrar, mediante un método recursivo, el producto de mayor precio.");
        System.out.println("4: Verificar si existe un producto con un codigo dado, mediante Busqueda Binaria.");
        System.out.println("5: Ordenar el arreglo segun su nombre, mediante un Metodo Avanzado.");
    }

    public static void acciones(Producto[] a, int op) {
        //Modulo de invocacion de las consignas pedidas
        Scanner sc = new Scanner(System.in);
        int menosADiez, codigoBuscado, posicionEncontrado;
        double mayorPrecio;

        switch (op) {
            case 1:               //(1) Ordenar arreglo.
                ordenarArreglo(a);
                break;
            case 2:               //(2) Contar, mediante un método recursivo, la cantidad de productos que tienen un stock menor que 10.
                menosADiez = contarProductos(a, 0, a.length - 1);
                System.out.println("Hay " + menosADiez + " productos con un stock menor a 10");
                break;
            case 3:               //(3) Encontrar, mediante un método recursivo, el producto de mayor precio.
                mayorPrecio = buscarMayorPrecio(a, 0, a.length - 1);
                System.out.println("El mayor precio es de: " + mayorPrecio);
                break;
            case 4:               //(4) Verificar si existe un producto con un codigo dado, mediante Busqueda Binaria.
                System.out.println("Ingrese el codigo que desea buscar: ");
                codigoBuscado = sc.nextInt();
                posicionEncontrado = buscarPorCodigo(a, codigoBuscado);
                if (posicionEncontrado != -1) {
                    System.out.println("El producto \n" + a[posicionEncontrado].toString()
                            + "se encuentra en la posicion " + posicionEncontrado);
                } else {
                    System.out.println("El codigo ingresado no se encuentra en el arreglo");
                }
                break;
            case 5:               //(5) Ordenar el arreglo segun su nombre, mediante un Metodo Avanzado.
                heapSort(a, a.length);
                System.out.println("Arreglo ordenado.");
                System.out.println("----------------------------------------");
                mostrarArreglo(a);
                System.out.println("----------------------------------------");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static void ordenarArreglo(Producto[] a) { 
        //Modulo con la accion de ordenar el arreglo eligiendo 3 metodos
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese el metodo de ordenamiento que desea utilizar: ");
            System.out.println("1: Burbuja Mejorado.");
            System.out.println("2: Seleccion.");
            System.out.println("3: Insercion.");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 3);

        switch (opcion) {
            case 1:
                burbujaMejorado(a);
                System.out.println("Arreglo ordenado.");
                System.out.println("----------------------------------------");
                mostrarArreglo(a);
                System.out.println("----------------------------------------");
                break;
            case 2:
                seleccion(a);
                System.out.println("Arreglo ordenado.");
                System.out.println("----------------------------------------");
                mostrarArreglo(a);
                System.out.println("----------------------------------------");
                break;
            case 3:
                insercion(a);
                System.out.println("Arreglo ordenado.");
                System.out.println("----------------------------------------");
                mostrarArreglo(a);
                System.out.println("----------------------------------------");
                break;
        }
    }

    public static void burbujaMejorado(Producto[] a) {
        //Modulo para ordenar el arreglo por codigos con el Metodo Burbuja Mejorado
        int i, n;
        boolean sinCambio = false;
        Producto aux;

        i = 0;
        n = a.length;

        while (i < n && !sinCambio) {
            sinCambio = true;

            for (int j = 0; j < n - i - 1; j++) {

                if (a[j].getCodigo() > a[j + 1].getCodigo()) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    sinCambio = false;
                }
            }
            i++;
        }
    }

    public static void seleccion(Producto[] a) {
        //Modulo para ordenar el arreglo por codigos por Metodo Seleccion
        int min;
        Producto aux;

        for (int i = 0; i < a.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j].getCodigo() < a[min].getCodigo()) {
                    min = j;
                }
            }
            aux = a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }

    public static void insercion(Producto[] a) {
        //Modulo para ordenar el arreglo por codigos con Metodo Insercion 
        Producto p;
        int j, aux, largo;
        largo = a.length;

        for (int i = 1; i < largo; i++) {
            p = a[i];
            aux = a[i].getCodigo();
            j = i;

            while (j > 0 && aux < a[j - 1].getCodigo()) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = p;
        }
    }

    public static int contarProductos(Producto[] a, int i, int n) {
        //Modulo para contar los productos con un stock menor a 10 de forma recursiva
        int retorno = 0;

        if (i == n) {
            if (a[i].getCantEnStock() < 10) {
                retorno = 1;
            }
        } else {
            if (a[i].getCantEnStock() < 10) {
                retorno = 1 + contarProductos(a, i + 1, n);
            } else {
                retorno = contarProductos(a, i + 1, n);
            }
        }
        return retorno;
    }

    public static double buscarMayorPrecio(Producto[] a, int i, int n) {
        //Modulo para buscar el mayor precio de los productos de forma recursiva
        double mayor, retorno;
        if (i == 0) {
            mayor = a[i].getPrecio();
            retorno = buscarMayorPrecio(a, i + 1, n);
            if (retorno >= mayor) {
                mayor = retorno;
            }
        } else if (i < n) {
            mayor = a[i].getPrecio();
            retorno = buscarMayorPrecio(a, i + 1, n);
            if (retorno >= mayor) {
                mayor = retorno;
            }
        } else {
            mayor = a[i].getPrecio();
        }
        return mayor;
    }

    public static int buscarPorCodigo(Producto[] a, int cod) {
        //Modulo para buscar un producto por su codigo mediante el Metodo de Busqueda Binaria
        int inicio, fin, resultado, medio;

        inicio = 0;
        fin = a.length - 1;
        resultado = -1;

        while (inicio <= fin) {
            medio = ((inicio + fin) / 2);
            inicio = fin + 1;

            if (cod == a[medio].getCodigo()) {
                resultado = medio;
            } else if (cod < a[medio].getCodigo()) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return resultado;
    }

    public static void heapSort(Producto[] a, int n) {
        //Modulo para ordenar el arreglo por Nombres mediante Metodo Avanzado Heap Sort
        Producto temp;
        for (int i = n / 2; i >= 0; i--) {
            hacerMonticulo(a, i, n - 1);
        }
        for (int i = n - 1; i >= 0; i--) {
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            hacerMonticulo(a, 0, i - 1);
        }
    }

    public static void hacerMonticulo(Producto[] a, int i, int fin) {
        int izq = 2 * i + 1;
        int der = izq + 1;
        int may;
        if (izq > fin) {
            return;
        }
        if (der > fin) {
            may = izq;
        } else {
            if (a[izq].getNombre().compareTo(a[der].getNombre()) > 0) {
                may = izq;
            } else {
                may = der;
            }
        }
        if (a[i].getNombre().compareTo(a[may].getNombre()) < 0) {
            Producto tmp = a[i];
            a[i] = a[may];
            a[may] = tmp;
            hacerMonticulo(a, may, fin);
        }
    }

    public static void mostrarArreglo(Producto[] a) {
        //Modulo para mostrar todos los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
            System.out.println("-------------------------");
        }
    }
}
