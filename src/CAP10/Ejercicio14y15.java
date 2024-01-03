package CAP10;

import java.util.HashMap;
import java.util.Map;

/* Un supermercado de productos ecológicos nos ha pedido hacer un programa
para vender su mercancía. En esta primera versión del programa se tendrán
en cuenta los productos que se indican en la tabla junto con su precio. Los
productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
indicar el producto y el número de unidades que se compran, por ejemplo
“guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra
“fin. Suponemos que el usuario no va a intentar comprar un producto que
no existe. Utiliza un diccionario para almacenar los nombres y precios de los
productos y una o varias listas para almacenar la compra que realiza el usuario.
A continuación se muestra una tabla con los productos disponibles y sus
respectivos precios:

avena garbanzos tomate jengibre quinoa guisantes
2,21  2,39      1,59   3,13     4,50   1,60 */

/* Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: Si
algún producto se repite en diferentes líneas, se deben agrupar en una sola.
Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en
el extracto se debe mostrar que se han pedido 4 botes de tomate. Después de
teclear “fin”, el programa pide un código de descuento. Si el usuario introduce
el código “ECODTO”, se aplica un 10% de descuento en la compra. */
public class Ejercicio14y15 {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);
        int opcion;
        HashMap<Integer, HashMap<String, Integer>> comprasRealizadas = new HashMap<>();
        int nCompra = 1;
        do {
            System.out.println("\n1. Ver compras realizadas");
            System.out.println("2. Comprar productos");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            System.out.println();
            switch (opcion) {
                case 1:
                    if (comprasRealizadas.size() == 0) {
                        System.out.println("No has realizado ninguna compra aún");
                    } else {
                        System.out.println("¿Qué compra desea visualizar?");
                        for (Map.Entry compra : comprasRealizadas.entrySet()) {
                            System.out.println("Compra nº " + compra.getKey());
                        }
                        int visualizar = -1;
                        do {
                            System.out.print("Opción: ");
                            visualizar = Integer.parseInt(System.console().readLine());
                        } while (!comprasRealizadas.containsKey(visualizar));
                        System.out.printf("\n%-12s%-12s%-12s%-12s\n", "Producto", "Precio", "Cantidad", "Subtotal");
                        System.out.println("----------------------------------------------");
                        double total = 0;
                        for (Map.Entry compra : comprasRealizadas.get(visualizar).entrySet()) {
                            total += (productos.get(compra.getKey()) * (int) compra.getValue());
                            System.out.printf("%-12s%-12.2f%-12d%-12.2f\n",
                                    compra.getKey(), productos.get(compra.getKey()), compra.getValue(),
                                    (productos.get(compra.getKey()) * (int) compra.getValue()));
                        }
                        System.out.println("----------------------------------------------");
                        System.out.printf("TOTAL: %.2f\n", total);
                    }
                    break;
                case 2:
                    String producto;
                    comprasRealizadas.put(nCompra, new HashMap<>());
                    do {
                        System.out.print("\nIntroduce producto a comprar: ");
                        producto = System.console().readLine().toLowerCase();
                        if (producto.equals("fin"))
                            break;
                        System.out.print("Introduce cantidad a comprar: ");
                        int cantidad = Integer.parseInt(System.console().readLine());
                        if (productos.containsKey(producto))
                            if (comprasRealizadas.get(nCompra).containsKey(producto)) {
                                int cantidadYaComprada = comprasRealizadas.get(nCompra).get(producto);
                                comprasRealizadas.get(nCompra).put(producto, (cantidad + cantidadYaComprada));
                            } else
                                comprasRealizadas.get(nCompra).put(producto, cantidad);
                        else
                            System.out.println("\nLo siento pero no disponemos de ese producto");
                    } while (true);
                    nCompra++;
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }
}
