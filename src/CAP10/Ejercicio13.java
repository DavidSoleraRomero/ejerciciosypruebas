package CAP10;

import java.util.ArrayList;

/* Modifica el programa Gestisimal realizado anteriormente añadiendo las si-
guientes mejoras:

• Utiliza una lista en lugar de un array para el almacenamiento de los datos.

• Comprueba la existencia del código en el alta, la baja y la modificación de
artículos para evitar errores.

• Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permi-
tirá hacer una venta de varios artículos y emitir la factura correspondiente.
Se debe preguntar por los códigos y las cantidades de cada artículo que
se quiere comprar. Aplica un 21% de IVA. */
public class Ejercicio13 {
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Articulo> misArticulos = new ArrayList<>();
        do {
            menu();
            int codigo;
            int pos;
            int stock;
            opcion = Integer.parseInt(System.console().readLine());
            System.out.println();
            switch (opcion) {
                case 1:
                    lista(misArticulos);
                    break;
                case 2:
                    alta(misArticulos);
                    break;
                case 3:
                    do {
                        System.out.print("Introduce el código a dar de baja: ");
                        codigo = Integer.parseInt(System.console().readLine());
                        pos = obtenPosicion(misArticulos, codigo);
                    } while (pos == -1);
                    baja(misArticulos, pos);
                    break;
                case 4:
                    do {
                        System.out.print("Introduce el código a modificar: ");
                        codigo = Integer.parseInt(System.console().readLine());
                        pos = obtenPosicion(misArticulos, codigo);
                    } while (pos == -1);
                    modifica(misArticulos, pos);
                    break;
                case 5:
                    System.out.print("Introduce el código para reponer stock: ");
                    codigo = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduce el stock a reponer: ");
                    stock = Integer.parseInt(System.console().readLine());
                    entrada(misArticulos, codigo, stock);
                    break;
                case 6:
                    System.out.print("Introduce el código para quitar stock: ");
                    codigo = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduce el stock a quitar: ");
                    stock = Integer.parseInt(System.console().readLine());
                    salida(misArticulos, codigo, stock);
                    break;
                case 7:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta introducida");
                    break;
            }
        } while (opcion != 7);
        System.out.println("\nGESTISIMAL - Siempre a su servicio");
    }

    public static void menu() {
        System.out.print(
                "\n1. Listado\n2. Alta\n3. Baja\n4. Modificación\n5. Entrada de mercancía\n6. Salida de mercancía\n7. Salir\nOpción: ");
    }

    public static void lista(ArrayList<Articulo> g) {
        for (int i = 0; i < g.size(); i++) {
            System.out.println(g.get(i));
        }
    }

    public static void alta(ArrayList<Articulo> g) {
        String desc;
        int pCom, pVen, stock;
        System.out.print("Descripción: ");
        desc = System.console().readLine();
        System.out.print("Precio compra: ");
        pCom = Integer.parseInt(System.console().readLine());
        System.out.print("Precio venta: ");
        pVen = Integer.parseInt(System.console().readLine());
        System.out.print("Stock disponible: ");
        stock = Integer.parseInt(System.console().readLine());
        g.add(new Articulo(desc, pCom, pVen, stock));
    }

    public static void baja(ArrayList<Articulo> g, int pos) {
        g.remove(pos);
    }

    public static void modifica(ArrayList<Articulo> g, int pos) {
        String desc;
        Articulo articuloActual;
        int pCom, pVen, stock;
        System.out.print("Descripción: ");
        desc = System.console().readLine();
        System.out.print("Precio compra: ");
        pCom = Integer.parseInt(System.console().readLine());
        System.out.print("Precio venta: ");
        pVen = Integer.parseInt(System.console().readLine());
        System.out.print("Stock disponible: ");
        stock = Integer.parseInt(System.console().readLine());
        articuloActual = g.get(pos);
        articuloActual.setDescripcion(desc);
        articuloActual.setPrecioCompra(pCom);
        articuloActual.setPrecioVenta(pVen);
        articuloActual.setStock(stock);
    }

    public static void entrada(ArrayList<Articulo> g, int cod, int stock) {
        int posicion = obtenPosicion(g, cod);
        if (posicion != -1)
            g.get(posicion).setStock(g.get(posicion).getStock() + stock);
        else
            System.out.println("Posición inválida");
    }

    public static void salida(ArrayList<Articulo> g, int cod, int stock) {
        int posicion = obtenPosicion(g, cod);
        if (posicion != -1)
            if (g.get(posicion).getStock() - stock >= 0)
                g.get(posicion).setStock(g.get(posicion).getStock() - stock);
            else
                System.out.println("Hay menos stock del solicitado");
        else
            System.out.println("Posición inválida");
    }

    public static int obtenPosicion(ArrayList<Articulo> g, int cod) {
        for (int i = 0; i < g.size(); i++) {
            if (g.get(i).getCodigo() == cod)
                return i;
        }
        return -1;
    }

}
