package CAP09.ultimorepaso;

public class Gestisimal {

    private static Articulo[] gestion = new Articulo[5];

    public static void main(String[] args) {
        int opcion;
        gestion[0] = new Articulo("YS123", "Pañuelos de plástico", 10, 5, 100);
        gestion[1] = new Articulo("KS234", "PlayStation5", 500, 450, 100);
        gestion[2] = new Articulo("LS345", "Pañuelos de papel", 12, 7, 120);
        gestion[3] = new Articulo("DS456", "Pantallas", 100, 57, 25);
        gestion[4] = new Articulo("ZS678", "PC Gaming", 1250, 1000, 5);
        do {
            menu();
            opcion = entradaInt();
            System.out.println();
            ejecutaOpcion(opcion);
        } while (opcion != 7);
    }

    public static void inicializaGestion() {
        for (int i = 0; i < gestion.length; i++) {
            gestion[i] = null;
        }
    }

    public static void menu() {
        System.out.println("\n1. Listar articulos");
        System.out.println("2. Insertar artículo");
        System.out.println("3. Modificar artículo");
        System.out.println("4. Borrar artículo");
        System.out.println("5. Importar mercancía");
        System.out.println("6. Exportar mercancía");
        System.out.print("7. Salir\nOpción: ");
    }

    public static int entradaInt() {
        return Integer.parseInt(System.console().readLine());
    }

    public static String entradaString() {
        return System.console().readLine();
    }

    public static void ejecutaOpcion(int opcion) {
        switch (opcion) {
            case 1:
                listaArticulos();
                break;
            case 2:
                insertaArticulo();
                break;
            case 3:
                modificaArticulo();
                break;
            case 4:
                borraArticulo();
                break;
            case 5:
                importaStock();
                break;
            case 6:
                exportaStock();
                break;
            case 7:
                System.out.println("\nGracias por hacer uso de GESTISIMAL...\nSaliendo...");
                break;
            default:
                System.out.println("Opción incorrecta introducida");
        }
    }

    private static void listaArticulos() {
        if (tieneContenido()) {
            for (int i = 0; i < gestion.length; i++) {
                if (gestion[i] != null)
                    System.out.println(gestion[i]);
            }
        } else {
            System.out.println("No se puede listar. No existen artículos");
        }
    }

    private static void insertaArticulo() {
        if (!estaLleno()) {
            String codigo;
            do {
                System.out.print("Introduce el código del artículo: ");
                codigo = entradaString();
            } while (estaDentro(codigo));
            System.out.print("Introduce descripción del artículo: ");
            String desc = entradaString();
            System.out.print("Introduce precio de venta: ");
            int precioV = entradaInt();
            System.out.print("Introduce precio de compra: ");
            int precioC = entradaInt();
            int stock;
            do {
                System.out.print("Introduce stock actual: ");
                stock = entradaInt();
            } while (stock <= 0);
            gestion[primeraPosicionLibre()] = new Articulo(codigo, desc, precioV, precioC, stock);
        } else {
            System.out.println("No se puede insertar. GESTISIMAL está completo");
        }
    }

    private static void modificaArticulo() {
        if (tieneContenido()) {
            String codigo;
            do {
                System.out.print("Introduce el código del artículo a modificar: ");
                codigo = entradaString();
            } while (!estaDentro(codigo));
            int pos = posicionDelCodigo(codigo);
            System.out.println("Descripción actual: " + gestion[pos].getDesc());
            System.out.print("Introduce descripción del artículo: ");
            String desc = entradaString();
            System.out.println("Precio de venta actual: " + gestion[pos].getPrecioV());
            System.out.print("Introduce precio de venta: ");
            int precioV = entradaInt();
            System.out.println("Precio de compra actual: " + gestion[pos].getPrecioC());
            System.out.print("Introduce precio de compra: ");
            int precioC = entradaInt();
            System.out.println("Stock actual: " + gestion[pos].getStock());
            int stock;
            do {
                System.out.print("Introduce stock nuevo: ");
                stock = entradaInt();
            } while (stock <= 0);
            gestion[pos] = new Articulo(codigo, desc, precioV, precioC, stock);
        } else {
            System.out.println("No se puede modificar. No existen artículos");
        }
    }

    private static void borraArticulo() {
        if (tieneContenido()) {
            String codigo;
            do {
                System.out.print("Introduce el código del artículo a borrar: ");
                codigo = entradaString();
            } while (!estaDentro(codigo));
            int pos = posicionDelCodigo(codigo);
            boolean eliminaUltimo = (primeraPosicionLibre() == -1) ? true : false;
            for (int i = pos; i < gestion.length - 1; i++) {
                gestion[i] = gestion[i + 1];
            }
            if (eliminaUltimo) {
                gestion[gestion.length - 1] = null;
            }
        } else {
            System.out.println("No se puede borrar. No existen artículos");
        }
    }

    private static void importaStock() {
        if (tieneContenido()) {
            String codigo;
            do {
                System.out.print("Introduce el código del artículo a importar: ");
                codigo = entradaString();
            } while (!estaDentro(codigo));
            int pos = posicionDelCodigo(codigo);
            int stock;
            do {
                System.out.print("Introduce stock importado: ");
                stock = entradaInt();
            } while (stock <= 0);
            gestion[pos].setStock(gestion[pos].getStock() + stock);
        } else {
            System.out.println("No se puede importar. No existen artículos");
        }
    }

    private static void exportaStock() {
        if (tieneContenido()) {
            String codigo;
            do {
                System.out.print("Introduce el código del artículo a exportar: ");
                codigo = entradaString();
            } while (!estaDentro(codigo));
            int pos = posicionDelCodigo(codigo);
            int stock;
            do {
                System.out.print("Introduce stock exportado: ");
                stock = entradaInt();
                if (gestion[pos].getStock() - stock < 0) {
                    System.out.println("Tienes menos stock del solicitado. Introduce otra cantidad.");
                }
            } while (stock <= 0 | gestion[pos].getStock() - stock < 0);
            gestion[pos].setStock(gestion[pos].getStock() - stock);
        } else {
            System.out.println("No se puede exportar. No existen artículos");
        }
    }

    private static boolean tieneContenido() {
        return (gestion[0] == null) ? false : true;
    }

    private static boolean estaLleno() {
        return (gestion[gestion.length - 1] == null) ? false : true;
    }

    private static boolean estaDentro(String codigo) {
        for (int i = 0; i < gestion.length; i++) {
            if (gestion[i] != null)
                if (codigo.equals(gestion[i].getCodigo()))
                    return true;
        }
        return false;
    }

    private static int primeraPosicionLibre() {
        for (int i = 0; i < gestion.length; i++) {
            if (gestion[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private static int posicionDelCodigo(String codigo) {
        for (int i = 0; i < gestion.length & gestion[i] != null; i++) {
            if (codigo.equals(gestion[i].getCodigo()))
                return i;
        }
        return -1;
    }

}
