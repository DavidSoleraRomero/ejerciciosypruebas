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
        switch (i) {
            case 1:
                for (int j = 0; j < a.length; j++) {
                    if (a[j] != null)
                        System.out.println(a[j]);
                    else
                        break;
                }
                break;
            case 2:

                break;
            case 3: {
                int posicion;
                do {
                    System.out.print("Introduce el código del artículo: ");
                    int codigo = Integer.parseInt(System.console().readLine());
                    posicion = devuelvePosicionEnArray(a, codigo);
                } while (posicion == -1);
                for (int j = posicion; j < a.length - 1; i++) {
                    a[j] = a[j + 1];
                }
            }
                break;
            case 4:

                break;
            case 5: {
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
                a[posicion].setStock(cantidad);
                break;
            }
            case 6:

                break;
            case 7:
                System.out.println("Gracias por utilizar GESTISIMAL...\nSaliendo...");
                break;
            default:
                System.out.println("Opción inválida introducida");
        }
    }

    private static int devuelvePosicionEnArray(Articulo[] a, int codigo) {
        for (int i = 0; i < a.length; i++) {
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
