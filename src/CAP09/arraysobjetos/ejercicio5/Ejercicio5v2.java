package CAP09.arraysobjetos.ejercicio5;

public class Ejercicio5v2 {
    public static void main(String[] args) {
        int opcion = -1;
        Articulo[] gestisimal = new Articulo[50];
        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            ejecutaOpcion(opcion, gestisimal);
        } while (opcion != 7);
    }

    public static void menu() {
        System.out.print(
                "\n1. Listado\n2. Alta\n3. Baja\n4. Modificación\n5. Entrada de mercancía\n6. Salida de mercancía\n7. Salir\nOpción: ");
    }

    public static void ejecutaOpcion(int i, Articulo[] a) {
        System.out.println();
        int indiceAntual = devuelveIndiceActual(a);
        switch (i) {
            case 1:
                if (indiceAntual == 0)
                    System.out.println("No hay elementos en el almacén.");
                for (int j = 0; j < a.length; j++) {
                    if (a[j] != null)
                        System.out.println(a[j]);
                    else
                        break;
                }
                break;
            case 2: {
                System.out.print("Introduce descripción del artículo: ");
                String desc = System.console().readLine();
                System.out.print("Introduce precio compra del artículo: ");
                int precioC = Integer.parseInt(System.console().readLine());
                System.out.print("Introduce precio venta del artículo: ");
                int precioV = Integer.parseInt(System.console().readLine());
                int stock;
                do {
                    System.out.print("Introduce stock del artículo: ");
                    stock = Integer.parseInt(System.console().readLine());
                } while (stock <= 0);
                int indice = devuelveIndiceActual(a);
                a[indice] = new Articulo(desc, precioC, precioV, stock);
            }
                break;
            case 3: {
                if (indiceAntual != 0) {
                    int posicion;
                    do {
                        System.out.print("Introduce el código del artículo: ");
                        int codigo = Integer.parseInt(System.console().readLine());
                        posicion = devuelvePosicionEnArray(a, codigo);
                    } while (posicion == -1);
                    for (int j = posicion; j < a.length - 1; j++) {
                        a[j] = a[j + 1];
                    }
                } else
                    System.out.println("No hay articulos, no puedes dar de baja");
            }
                break;
            case 4: {
                if (indiceAntual != 0) {
                    int posicion;
                    do {
                        System.out.print("Introduce el código del artículo: ");
                        int codigo = Integer.parseInt(System.console().readLine());
                        posicion = devuelvePosicionEnArray(a, codigo);
                    } while (posicion == -1);
                    int indice = posicion;
                    System.out.print("Introduce nueva descripción del artículo: ");
                    String desc = System.console().readLine();
                    System.out.print("Introduce nuevo precio compra del artículo: ");
                    int precioC = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduce nuevo precio venta del artículo: ");
                    int precioV = Integer.parseInt(System.console().readLine());
                    int stock;
                    do {
                        System.out.print("Introduce stock del artículo: ");
                        stock = Integer.parseInt(System.console().readLine());
                    } while (stock <= 0);
                    a[indice] = new Articulo(desc, precioC, precioV, stock);
                } else
                    System.out.println("No hay articulos, no puedes modificar");
            }
                break;
            case 5: {
                if (indiceAntual != 0) {
                    int cantidad;
                    do {
                        System.out.print("Introduce la cantidad de mercancía que va a llegar: ");
                        cantidad = Integer.parseInt(System.console().readLine());
                    } while (cantidad <= 0);
                    int posicion;
                    do {
                        System.out.print("Introduce el código del artículo: ");
                        int codigo = Integer.parseInt(System.console().readLine());
                        posicion = devuelvePosicionEnArray(a, codigo);
                    } while (posicion == -1);
                    a[posicion].setStock(a[posicion].getStock() + cantidad);
                } else
                    System.out.println("No hay articulos, no puedes introducir mercancía");
                break;
            }
            case 6: {
                if (indiceAntual != 0) {
                    int cantidad;
                    do {
                        System.out.print("Introduce la cantidad de mercancía que va a salir: ");
                        cantidad = Integer.parseInt(System.console().readLine());
                    } while (cantidad <= 0);
                    int posicion;
                    do {
                        System.out.print("Introduce el código del artículo: ");
                        int codigo = Integer.parseInt(System.console().readLine());
                        posicion = devuelvePosicionEnArray(a, codigo);
                    } while (posicion == -1);
                    a[posicion].setStock(a[posicion].getStock() - cantidad);
                    break;
                } else
                    System.out.println("No hay articulos, no puedes sacar mercancia");
            }
            case 7:
                System.out.println("Gracias por utilizar GESTISIMAL...\nSaliendo...");
                break;
            default:
                System.out.println("Opción inválida introducida");
        }
    }

    private static int devuelvePosicionEnArray(Articulo[] a, int codigo) {
        int limite = devuelveIndiceActual(a);
        for (int i = 0; i < limite; i++) {
            if (a[i].getCodigo() == codigo)
                return i;
        }
        return -1;
    }

    private static int devuelveIndiceActual(Articulo[] a) {
        for (int j = 0; j < a.length; j++) {
            if (a[j] == null)
                return j;
        }
        return -1;
    }
}
