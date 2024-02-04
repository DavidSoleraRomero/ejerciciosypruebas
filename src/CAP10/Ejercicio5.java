package CAP10;

import java.util.ArrayList;
import java.util.Scanner;

/* Realiza de nuevo el ejercicio de la colección de coleccion pero utilizando esta vez
una lista para almacenar la información sobre los coleccion en lugar de un array
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista? */
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Disco> coleccion = new ArrayList<>();
        coleccion.add(new Disco(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        coleccion.add(new Disco(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46));
        coleccion.add(new Disco(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
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
                            for (Disco d : coleccion)
                                if (!d.getCodigo().equals("LIBRE"))
                                    System.out.println(d);
                            break;
                        case 2:
                            System.out.print("Introduce el nombre del autor: ");
                            String autor = System.console().readLine().toLowerCase();
                            for (Disco d : coleccion)
                                if (d.getAutor().toLowerCase().equals(autor))
                                    System.out.println(d);
                            break;
                        case 3:
                            System.out.print("Mínimo del intervalo: ");
                            int min = Integer.parseInt(System.console().readLine());
                            System.out.print("Máximo del intervalo: ");
                            int max = Integer.parseInt(System.console().readLine());
                            for (Disco d : coleccion) {
                                if (d.getDuracion() >= min & d.getDuracion() <= max & !d.getCodigo().equals("LIBRE"))
                                    System.out.println(d);
                            }
                            break;
                        default:
                            System.out.println("Introduzca una opción correcta");
                    }
                    break;
                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");
                    System.out.println("Por favor, introduzca los datos del disco.");
                    repite = false;
                    do {
                        System.out.print("Código: ");
                        codigoIntroducido = s.nextLine();
                        for (int i = 0; i < coleccion.size(); i++) {
                            if (codigoIntroducido.equals(coleccion.get(i).getCodigo())) {
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
                    coleccion.add(new Disco(
                            codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
                            duracionIntroducida));
                    break;
                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");
                    int i = -1;
                    boolean sal = false;
                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = s.nextLine();
                    do {
                        i++;
                        if (i == coleccion.size()) {
                            sal = true;
                            break;
                        }
                        if (((coleccion.get(i).getCodigo()).equals(codigoIntroducido)))
                            break;
                    } while (!sal);
                    if (sal) {
                        System.out.println("Código incorrecto introducido");
                        break;
                    }
                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Código: " + coleccion.get(i).getCodigo());
                    do {
                        System.out.print("Código: ");
                        codigoIntroducido = s.nextLine();
                        for (int j = 0; j < coleccion.size(); j++) {
                            if (codigoIntroducido.equals(coleccion.get(j).getCodigo())) {
                                repite = true;
                                System.out.println("Introduce un código no repetido");
                                break;
                            }
                        }
                    } while (repite);
                    if (!codigoIntroducido.equals(""))
                        coleccion.get(i).setCodigo(codigoIntroducido);
                    System.out.println("Autor: " + coleccion.get(i).getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = s.nextLine();
                    if (!autorIntroducido.equals(""))
                        coleccion.get(i).setAutor(autorIntroducido);
                    System.out.println("Título: " + coleccion.get(i).getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = s.nextLine();
                    if (!tituloIntroducido.equals(""))
                        coleccion.get(i).setTitulo(tituloIntroducido);
                    System.out.println("Género: " + coleccion.get(i).getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = s.nextLine();
                    if (!generoIntroducido.equals(""))
                        coleccion.get(i).setGenero(generoIntroducido);
                    System.out.println("Duración: " + coleccion.get(i).getDuracion());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = s.nextLine();
                    if (!duracionIntroducidaString.equals(""))
                        coleccion.get(i).setDuracion(Integer.parseInt(duracionIntroducidaString));
                    break;
                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");
                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = s.nextLine();
                    i = -1;
                    do {
                        i++;
                        if (i == coleccion.size() - 1)
                            if (!((coleccion.get(i).getCodigo()).equals(codigoIntroducido)))
                                salir = true;
                    } while (!((coleccion.get(i).getCodigo()).equals(codigoIntroducido)) & !salir);
                    if (salir) {
                        System.out.println("Lo sentimos, pero no hemos encontrado el código");
                        break;
                    }
                    coleccion.get(i).setCodigo("LIBRE");
                    System.out.println("Album borrado.");
                    coleccion.remove(i);
                    break;
                default:
            }
        } while (opcion != 5);
        s.close();
    }

    public static void subMenu() {
        System.out.print("1. Completo\n2. Por autor\n3. Por duración\nOpción: ");
    }
}
