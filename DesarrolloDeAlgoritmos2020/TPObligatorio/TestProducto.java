package TPObligatorio;

import java.util.Scanner;

public class TestProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] arreglo;
        boolean terminar = false, cargado = false;
        int cantProductos, opcion, prods, indice = 0;

        do {
            System.out.println("Ingrese la cantidad total de productos (No mas de 30): ");
            cantProductos = sc.nextInt();
        } while (cantProductos > 30);
        arreglo = new Producto[cantProductos];

        while (!terminar) {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    terminar = true;
                    break;
                case 1:
                    prods = definirCantProductos(arreglo, indice);
                    cargarDatos(arreglo, indice, prods);
                    indice += prods;
                    cargado = true;
                    break;
                case 2:
                    mostrarDatos(arreglo, indice, cargado);
                    break;
                case 3:
                    venderProducto(arreglo, indice, cargado);
                    break;
                case 4:
                    mostrarMarca(arreglo, indice, cargado);
                    break;
                case 5:
                    comprarProducto(arreglo, indice, cargado);
                    break;
                case 6:
                    verificarUnaOferta(arreglo, indice, cargado);
                    break;
                case 7:
                    listarOfertas(arreglo, indice, cargado);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        }
    }

    public static void menu() {
        System.out.println("Ingrese la opcion correspondiente: ");
        System.out.println("0: Terminar.");
        System.out.println("1: Cargar arreglo.");
        System.out.println("2: Mostrar todos los productos cargados.");
        System.out.println("3: Vender un producto dado.");
        System.out.println("4: Mostrar el nombre de todos los productos de una marca dada.");
        System.out.println("5: Adquirir un cierto producto.");
        System.out.println("6: Verificar si existe al menos un producto en oferta.");
        System.out.println("7: Listar los productos en oferta.");
    }

    public static int definirCantProductos(Producto[] a, int i) {
        Scanner sc = new Scanner(System.in);
        int cantProductos;

        do {
            System.out.println("Ingrese la cantidad de productos a cargar: ");
            cantProductos = sc.nextInt();
        } while ((cantProductos + i) > (a.length));

        return cantProductos;
    }

    public static void cargarDatos(Producto[] a, int i, int productos) {
        Scanner sc = new Scanner(System.in);
        Producto p;
        int codigo, cant;
        String nombre, marca;
        double precio;
        boolean valido = true;

        for (int j = i; j <= i + productos; j++) {
            do {
                System.out.println("Ingrese un codigo valido: ");
                codigo = sc.nextInt();
                if (j != 0) {
                    valido = verificarCodigo(a, codigo, j - 1);
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
            a[j] = p;
        }
    }

    public static boolean verificarCodigo(Producto[] a, int cod, int j) {
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

    public static void mostrarDatos(Producto[] a, int i, boolean cargado) {
        if (cargado) {
            for (int j = 0; j <= i; j++) {
                System.out.println(a[i].toString());
                System.out.println("-------------------------------------------");
            }
        } else {
            System.out.println("No hay productos cargados.");
        }
    }

    public static void venderProducto(Producto[] a, int i, boolean cargado) {
        Scanner sc = new Scanner(System.in);
        int cod, cant, j = 0;
        boolean encontrado = false, exito;
        Producto p;
        if (cargado) {
            System.out.println("Ingrese el codigo del producto a vender: ");
            cod = sc.nextInt();
            p = new Producto(cod);
            while (!encontrado && j <= i) {
                if (a[j].equals(p)) {
                    encontrado = true;
                } else {
                    j++;
                }
            }
            if (encontrado) {
                System.out.println("Ingrese la cantidad que desea vender: ");
                cant = sc.nextInt();
                exito = a[j].vender(cant);
                if (exito) {
                    System.out.println("Quedan " + a[j].getCantEnStock() + " productos disponibles.");
                } else {
                    System.out.println("¡ERROR! La cantidad ingresada no se encuentra disponible.");
                    System.out.println("Cantidad disponible: " + a[j].getCantEnStock());
                }
            }
        } else {
            System.out.println("No hay productos cargados.");
        }
    }

    public static void mostrarMarca(Producto[] a, int i, boolean cargado) {
        Scanner sc = new Scanner(System.in);
        String marca;
        if (cargado) {
            System.out.println("Ingrese la marca que desea mostrar: ");
            marca = sc.nextLine();
            for (int j = 0; j <= i; j++) {
                if (a[j].getMarca().equals(marca)) {
                    System.out.println(a[j].toString());
                }
            }
        } else {
            System.out.println("No hay productos cargados.");
        }
    }

    public static void comprarProducto(Producto[] a, int i, boolean cargado) {
        Scanner sc = new Scanner(System.in);
        Producto p;
        boolean encontrado = false;
        int k = 0, cant;
        int cod;
        if (cargado) {
            System.out.println("A continuacion se muestran los productos que necesitan mas stock: ");
            for (int j = 0; j <= i; j++) {
                System.out.println(a[j].hacerPedido());
            }

            System.out.println("Ingrese el codigo del producto a comprar: ");
            cod = sc.nextInt();
            p = new Producto(cod);
            while (!encontrado && k <= i) {
                if (a[k].equals(p)) {
                    encontrado = true;
                } else {
                    k++;
                }
            }
            if (encontrado) {
                System.out.println("Ingrese la cantidad que desea comprar: ");
                cant = sc.nextInt();
                a[k].actualizarStock(cant);
            }
        } else {
            System.out.println("No hay productos cargados.");
        }
    }

    public static void verificarUnaOferta(Producto[] a, int i, boolean cargado) {
        boolean encontrado = false;
        int j = 0;
        if (cargado) {
            while (!encontrado && j <= i) {
                if (a[j].getEnOferta()) {
                    System.out.println(a[j].toString());
                    encontrado = true;
                } else {
                    j++;
                }
            }
        } else {
            System.out.println("No hay productos cargados.");
        }
    }

    public static void listarOfertas(Producto[] a, int i, boolean cargado) {
        if (cargado) {
            for (int j = 0; j <= i; j++) {
                if (a[j].getEnOferta()) {
                    System.out.println(a[j].toString());
                }
            }
        } else {
            System.out.println("No hay productos cargados.");
        }
    }

}
