package CAP09.arraysobjetos.ejercicio5;

/* Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
control de los artículos de un almacén. De cada artículo se debe saber el código,
la descripción, el precio de compra, el precio de venta y el stock (número de
unidades). El menú del programa debe tener, al menos, las siguientes opciones:

1. Listado
2. Alta
3. Baja
4. Modificación
5. Entrada de mercancía
6. Salida de mercancía
7. Salir

La entrada y salida de mercancía supone respectivamente el incremento y
decremento de stock de un determinado artículo. Hay que controlar que no
se pueda sacar más mercancía de la que hay en el almacén. */
public class Ejercicio5 {
    public static void main(String[] args) {
        int opcion = 0;
        Gestisimal[] gestionAlmacen = new Gestisimal[Gestisimal.nArray];
        int indice = 0;
        for (int i = 0; i < gestionAlmacen.length; i++) {
            gestionAlmacen[i] = new Gestisimal();
        }
        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            indice = ejecutaOpcion(opcion, gestionAlmacen, indice);
        } while (opcion != 7);
        System.out.println("\nGESTISIMAL - Siempre a su servicio");
    }

    public static void menu() {
        System.out.print(
                "\n1. Listado\n2. Alta\n3. Baja\n4. Modificación\n5. Entrada de mercancía\n6. Salida de mercancía\n7. Salir\nOpción: ");
    }

    public static int ejecutaOpcion(int i, Gestisimal[] g, int indice) {
        int cod = 0;
        int stock = 0;
        switch (i) {
            case 1:
                lista(g, indice);
                return indice;
            case 2:
                return alta(g, indice);
            case 3:
                System.out.print("Introduce código del artículo: ");
                cod = Integer.parseInt(System.console().readLine());
                return baja(g, indice, cod);
            case 4:
                System.out.print("Introduce código del artículo: ");
                cod = Integer.parseInt(System.console().readLine());
                modifica(g, cod);
                return indice;
            case 5:
                System.out.print("Introduce código del artículo: ");
                cod = Integer.parseInt(System.console().readLine());
                System.out.print("Introduce el stock a añadir: ");
                stock = Integer.parseInt(System.console().readLine());
                entrada(g, cod, stock);
                return indice;
            case 6:
                System.out.print("Introduce código del artículo: ");
                cod = Integer.parseInt(System.console().readLine());
                System.out.print("Introduce el stock a añadir: ");
                stock = Integer.parseInt(System.console().readLine());
                salida(g, cod, stock);
                return indice;
            default:
                System.out.println("Opción incorrecta introducida");
                return indice;
        }
    }

    public static void lista(Gestisimal[] g, int indice) {
        for (int i = 0; i < indice; i++) {
            System.out.println(g[i]);
        }
    }

    public static int alta(Gestisimal[] g, int indice) {
        System.out.println("Introduce descripción del producto: ");
        String desc = System.console().readLine();
        System.out.println("Introduce el precio de compra y luego el de venta, sin decimales: ");
        System.out.print("Precio compra: ");
        int pCom = Integer.parseInt(System.console().readLine());
        System.out.print("Precio venta: ");
        int pVen = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la cantidad disponible en stock: ");
        int stock = Integer.parseInt(System.console().readLine());
        g[indice++] = new Gestisimal(desc, pCom, pVen, stock);
        return indice;
    }

    public static int baja(Gestisimal[] g, int indice, int cod) {
        int posicion = devuelvePosicion(g, cod);
        if (posicion != -1) {
            if (posicion == indice - 1) {
                g[posicion].reseteaArticulo();
            } else {
                g[posicion].reseteaArticulo();
                for (int i = posicion; i < indice; i++) {
                    g[i] = g[i + 1];
                }
            }
            indice--;
        }
        return indice;
    }

    public static void modifica(Gestisimal[] g, int cod) {
        System.out.println("Introduzca nueva descripción: ");
        String desc = System.console().readLine();
        System.out.println("Introduce el precio de compra y luego el de venta, sin decimales: ");
        System.out.print("Precio compra: ");
        int pCom = Integer.parseInt(System.console().readLine());
        System.out.print("Precio venta: ");
        int pVen = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la cantidad disponible en stock: ");
        int stock = Integer.parseInt(System.console().readLine());
        int posicion = devuelvePosicion(g, cod);
        if (posicion != -1)
            g[posicion] = new Gestisimal(desc, pCom, pVen, stock);
    }

    public static void entrada(Gestisimal[] g, int cod, int stock) {
        int posicion = devuelvePosicion(g, cod);
        if (posicion != -1)
            g[posicion].setStock(g[posicion].getStock() + stock);

    }

    public static void salida(Gestisimal[] g, int cod, int stock) {
        int posicion = devuelvePosicion(g, cod);
        if (posicion != -1)
            g[posicion].setStock(g[posicion].getStock() - stock);
    }

    private static int devuelvePosicion(Gestisimal[] g, int cod) {
        int posicion = -1;
        for (int i = 0; i < g.length; i++) {
            if (g[i].getCodigo() == cod) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
}
