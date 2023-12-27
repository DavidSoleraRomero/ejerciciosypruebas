package CAP09.arraysobjetos.ejercicio34;

import java.util.Scanner;

/* Modifica el programa “Colección de discos” como se indica a continuación:
HECHO - a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
posiciones del array, el programa muestre un mensaje de error. No se permitirá
introducir los datos de ningún disco hasta que no se borre alguno de la lista.
HECHO - b) Mejora la opción “Borrar” de tal forma que se verifique que el código
introducido por el usuario existe.
HECHO - c) Modifica el programa de tal forma que el código del disco sea único, es decir
que no se pueda repetir.
d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
listado completo, un listado por autor (todos los discos que ha publicado un
determinado autor), un listado por género (todos los discos de un género de-
terminado) y un listado de discos cuya duración esté en un rango determinado
por el usuario. */
public class Ejercicio4 {
    public static void main(String[] args) {
        // N determina el tamaño del array
        final int N = 4;

        // Crea el array de discos
        Disco[] discos = new Disco[N];

        // Crea todos los discos que van en cada una de las celdas del array
        for (int i = 0; i < N; i++) {
            discos[i] = new Disco();
        }

        // Carga varios discos
        discos[0] = new Disco(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

        int opcion;
        Scanner s = new Scanner(System.in);
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;

        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            boolean salir = false;
            boolean repite = false;

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");

                    subMenu();
                    int opc = Integer.parseInt(System.console().readLine());
                    switch (opc) {
                        case 1:
                            for (Disco d : discos) {
                                if (!d.getCodigo().equals("LIBRE")) {
                                    System.out.println(d);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Introduce el nombre del autor: ");
                            String autor = System.console().readLine().toLowerCase();
                            for (Disco d : discos) {
                                if (d.getAutor().toLowerCase().equals(autor)) {
                                    System.out.println(d);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Mínimo del intervalo: ");
                            int min = Integer.parseInt(System.console().readLine());
                            System.out.print("Máximo del intervalo: ");
                            int max = Integer.parseInt(System.console().readLine());
                            for (Disco d : discos) {
                                if (d.getDuracion() >= min & d.getDuracion() <= max & !d.getCodigo().equals("LIBRE")) {
                                    System.out.println(d);
                                }
                            }
                            break;
                        default:
                            System.out.println("Introduzca una opción correcta");
                    }

                    break;

                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");

                    // Busca la primera posición libre del array
                    int primeraLibre = -1;
                    do {
                        primeraLibre++;
                        if (primeraLibre == (N - 1))
                            if (!((discos[primeraLibre].getCodigo()).equals("LIBRE"))) {
                                salir = true;
                            }
                    } while (!((discos[primeraLibre].getCodigo()).equals("LIBRE")) & !salir);
                    if (salir) {
                        System.out.println("Lo sentimos, pero la colección está llena");
                        break;
                    }
                    System.out.println("Por favor, introduzca los datos del disco.");
                    repite = false;
                    do {
                        System.out.print("Código: ");
                        codigoIntroducido = s.nextLine();
                        for (int i = 0; i < N; i++) {
                            if (codigoIntroducido.equals(discos[i].getCodigo())) {
                                repite = true;
                                System.out.println("Introduce un código no repetido");
                                break;
                            }
                        }
                    } while (repite);
                    System.out.print("Autor: ");
                    autorIntroducido = s.nextLine();
                    System.out.print("Título: ");
                    tituloIntroducido = s.nextLine();
                    System.out.print("Género: ");
                    generoIntroducido = s.nextLine();
                    System.out.print("Duración: ");
                    duracionIntroducida = Integer.parseInt(s.nextLine());
                    discos[primeraLibre] = new Disco(
                            codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
                            duracionIntroducida);

                    break;

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");

                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = s.nextLine();

                    int i = -1;
                    do {
                        i++;
                    } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Código: " + discos[i].getCodigo());
                    do {
                        System.out.print("Código: ");
                        codigoIntroducido = s.nextLine();
                        for (int j = 0; j < N; j++) {
                            if (codigoIntroducido.equals(discos[i].getCodigo())) {
                                repite = true;
                                System.out.println("Introduce un código no repetido");
                                break;
                            }
                        }
                    } while (repite);
                    if (!codigoIntroducido.equals("")) {
                        discos[i].setCodigo(codigoIntroducido);
                    }

                    System.out.println("Autor: " + discos[i].getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = s.nextLine();
                    if (!autorIntroducido.equals("")) {
                        discos[i].setAutor(autorIntroducido);
                    }

                    System.out.println("Título: " + discos[i].getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = s.nextLine();
                    if (!tituloIntroducido.equals("")) {
                        discos[i].setTitulo(tituloIntroducido);
                    }

                    System.out.println("Género: " + discos[i].getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = s.nextLine();
                    if (!generoIntroducido.equals("")) {
                        discos[i].setGenero(generoIntroducido);
                    }

                    System.out.println("Duración: " + discos[i].getDuracion());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = s.nextLine();
                    if (!duracionIntroducidaString.equals("")) {
                        discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }

                    break;

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");

                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = s.nextLine();

                    i = -1;

                    do {
                        i++;
                        if (i == N - 1)
                            if (!((discos[i].getCodigo()).equals(codigoIntroducido))) {
                                salir = true;
                            }
                    } while (!((discos[i].getCodigo()).equals(codigoIntroducido)) & !salir);
                    if (salir) {
                        System.out.println("Lo sentimos, pero no hemos encontrado el código");
                        break;
                    }
                    discos[i].setCodigo("LIBRE");
                    System.out.println("Album borrado.");

                    break;

                default:

            } // switch
        } while (opcion != 5);
    }

    public static void subMenu() {
        System.out.print("1. Completo\n2. Por autor\n3. Por duración\nOpción: ");
    }
}
