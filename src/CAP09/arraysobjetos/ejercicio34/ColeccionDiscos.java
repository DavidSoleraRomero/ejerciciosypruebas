package CAP09.arraysobjetos.ejercicio34;

public class ColeccionDiscos {
    public static void main(String[] args) {
        int opcion = 0;
        Discov2[] coleccionDeDiscos = new Discov2[5];
        inicializaDiscos(coleccionDeDiscos);
        coleccionDeDiscos[0] = new Discov2("NPV1", "El Nano", "Nanos Power", "Pop", 33);
        coleccionDeDiscos[1] = new Discov2("NPV2", "El Nano", "Nanos Fontaneros", "Pop", 44);
        coleccionDeDiscos[2] = new Discov2("NPV3", "El Nano", "Nanos Informáticos", "Pop", 55);
        coleccionDeDiscos[3] = new Discov2("NPV4", "El Nano", "Nanos Flying", "Pop", 22);
        coleccionDeDiscos[4] = new Discov2("YHLQMDLG", "Bad Bunny", "Yo Hago Lo Que Me Da La Gana", "Reggaeton", 60);
        do {
            opcion = Discov2.menu();
            switch (opcion) {
                case 1:
                    if (coleccionDeDiscos[0].getAutor() == null) {
                        System.out.println("\nActualmente no hay discos para mostrar");
                    } else {
                        do {
                            System.out.println("\nOpciones de listado");
                            System.out.println("1. Por autor");
                            System.out.println("2. Por género");
                            System.out.println("3. Por duración");
                            System.out.println("4. Listado general");
                            System.out.print("Introduce opción: ");
                            opcion = Integer.parseInt(System.console().readLine());
                            switch (opcion) {
                                case 1:
                                    System.out.print("Introduce nombre del autor: ");
                                    String autor = System.console().readLine().toLowerCase();
                                    for (int i = 0; i < coleccionDeDiscos.length; i++) {
                                        if (coleccionDeDiscos[i].getAutor() != null)
                                            if (coleccionDeDiscos[i].getAutor().toLowerCase().equals(autor))
                                                System.out.println(coleccionDeDiscos[i]);
                                    }
                                    break;
                                case 2:
                                    System.out.print("Introduce género: ");
                                    String genero = System.console().readLine().toLowerCase();
                                    for (int i = 0; i < coleccionDeDiscos.length; i++) {
                                        if (coleccionDeDiscos[i].getAutor() != null)
                                            if (coleccionDeDiscos[i].getGenero().toLowerCase().equals(genero))
                                                System.out.println(coleccionDeDiscos[i]);
                                    }
                                    break;
                                case 3:
                                    System.out.print("Introduce duración mínima: ");
                                    int min = Integer.parseInt(System.console().readLine());
                                    System.out.print("Introduce duración máxima: ");
                                    int max = Integer.parseInt(System.console().readLine());
                                    for (int i = 0; i < coleccionDeDiscos.length; i++) {
                                        if (coleccionDeDiscos[i].getAutor() != null)
                                            if (coleccionDeDiscos[i].getDuracion() >= min
                                                    & coleccionDeDiscos[i].getDuracion() <= max)
                                                System.out.println(coleccionDeDiscos[i]);
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < coleccionDeDiscos.length; i++) {
                                        if (coleccionDeDiscos[i].getAutor() != null)
                                            System.out.println(coleccionDeDiscos[i]);
                                    }
                            }

                        } while (opcion != 1 & opcion != 2 & opcion != 3 & opcion != 4);
                    }
                    break;
                case 2: {
                    int j = -1;
                    for (int i = 0; i < coleccionDeDiscos.length; i++) {
                        if (coleccionDeDiscos[i].getAutor() == null) {
                            j = i;
                            break;
                        }
                    }
                    if (j != -1) {
                        String codigo;
                        boolean disponible;
                        do {
                            System.out.print("Introduce código disponible: ");
                            codigo = System.console().readLine();
                            disponible = compruebaCodigo(coleccionDeDiscos, codigo);
                        } while (!disponible);
                        System.out.print("Introduce autor: ");
                        String autor = System.console().readLine();
                        System.out.print("Introduce título: ");
                        String titulo = System.console().readLine();
                        System.out.print("Introduce género: ");
                        String genero = System.console().readLine();
                        System.out.print("Introduce duración: ");
                        int duracion = Integer.parseInt(System.console().readLine());
                        coleccionDeDiscos[j] = new Discov2(codigo, autor, titulo, genero, duracion);
                    } else
                        System.out.println("\nColección de discos llena.");
                }
                    break;
                case 3: {
                    if (coleccionDeDiscos[0].getAutor() != null) {
                        String codigo;
                        boolean disponible;
                        do {
                            System.out.print("Introduce código a cambiar: ");
                            codigo = System.console().readLine();
                            disponible = compruebaCodigo(coleccionDeDiscos, codigo);
                        } while (disponible);
                        int j = damePosicionCodigo(coleccionDeDiscos, codigo);
                        System.out.printf("Actual: %s\n", coleccionDeDiscos[j].getCodigo());
                        System.out.print("Introduce código nuevo: ");
                        codigo = System.console().readLine();
                        System.out.printf("Actual: %s\n", coleccionDeDiscos[j].getAutor());
                        System.out.print("Introduce autor: ");
                        String autor = System.console().readLine();
                        System.out.printf("Actual: %s\n", coleccionDeDiscos[j].getTitulo());
                        System.out.print("Introduce título: ");
                        String titulo = System.console().readLine();
                        System.out.printf("Actual: %s\n", coleccionDeDiscos[j].getGenero());
                        System.out.print("Introduce género: ");
                        String genero = System.console().readLine();
                        System.out.printf("Actual: %d\n", coleccionDeDiscos[j].getDuracion());
                        System.out.print("Introduce duración: ");
                        int duracion = Integer.parseInt(System.console().readLine());
                        coleccionDeDiscos[j] = new Discov2(codigo, autor, titulo, genero, duracion);
                    } else {
                        System.out.println("\nActualmente no hay discos para modificar");
                    }
                }
                    break;
                case 4: {
                    if (coleccionDeDiscos[0].getAutor() != null) {
                        String codigo;
                        boolean disponible;
                        do {
                            System.out.print("Introduce código correcto para borrar disco: ");
                            codigo = System.console().readLine();
                            disponible = compruebaCodigo(coleccionDeDiscos, codigo);
                        } while (disponible);
                        int posicion = damePosicionCodigo(coleccionDeDiscos, codigo);
                        for (int i = posicion; i < coleccionDeDiscos.length - 1; i++) {
                            coleccionDeDiscos[i] = coleccionDeDiscos[i + 1];
                        }
                        if (cantidadDeLleno(coleccionDeDiscos) == coleccionDeDiscos.length) {
                            coleccionDeDiscos[coleccionDeDiscos.length - 1] = new Discov2();
                        }
                    } else {
                        System.out.println("\nActualmente no hay discos para borrar.");
                    }
                }
                    break;
                case 5:
                    System.out.println("\nGracias por usar la colección de discos...\nSaliendo...");
                    break;
                default:
                    System.out.println("Opción inválida introducida");
            }
        } while (opcion != 5);

    }

    public static void inicializaDiscos(Discov2[] d) {
        for (int i = 0; i < d.length; i++) {
            d[i] = new Discov2();
        }
    }

    public static boolean compruebaCodigo(Discov2[] d, String codigo) {
        boolean disponible = true;
        for (int i = 0; i < d.length; i++) {
            if (d[i].getAutor() == null) {
                break;
            } else if (d[i].getCodigo().equals(codigo)) {
                disponible = false;
            }
        }
        return disponible;
    }

    public static int damePosicionCodigo(Discov2[] d, String codigo) {
        for (int i = 0; i < d.length; i++) {
            if (d[i].getCodigo().equals(codigo))
                return i;
        }
        return -1;
    }

    public static int cantidadDeLleno(Discov2[] d) {
        int cantidad = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i].getAutor() != null)
                cantidad++;
        }
        return cantidad;
    }
}
