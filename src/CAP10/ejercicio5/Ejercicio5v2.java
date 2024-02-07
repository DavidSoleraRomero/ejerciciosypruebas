package CAP10.ejercicio5;

/* Realiza de nuevo el ejercicio de la colección de coleccion pero utilizando esta vez
una lista para almacenar la información sobre los coleccion en lugar de un array
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista? */
public class Ejercicio5v2 {

    public static void main(String[] args) {
        int opcion;
        ColeccionDeDiscos discos = new ColeccionDeDiscos();
        do {
            opcion = MenuGestionDiscos.menuCompleto();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println(discos.listaAutoresYDiscos());
                    break;
                case 2: {
                    if (discos.autorExisteAlguno()) {
                        System.out.print("Introduce código del disco: ");
                        String codigo = System.console().readLine();
                        System.out.print("Introduce título del disco: ");
                        String titulo = System.console().readLine();
                        String autor;
                        do {
                            System.out.print("Introduce código del autor del disco: ");
                            autor = System.console().readLine();
                        } while (!discos.autorExiste(autor));
                        System.out.print("Introduce duración del disco: ");
                        int duracion = Integer.parseInt(System.console().readLine());
                        System.out.print("Introduce género del disco: ");
                        String genero = System.console().readLine();
                        discos.aniadeDiscoAlAutor(autor, new Disco(codigo, titulo, autor, duracion, genero));
                    } else {
                        System.out.println("No hay autores disponibles");
                    }
                }
                    break;
                case 3: {
                    if (discos.autorExisteAlguno() & discos.discoExisteAlguno()) {
                        System.out.print("Introduce código del disco: ");
                        String codDisco = System.console().readLine();
                        discos.modificaDisco(codDisco);
                    } else {
                        System.out.println("No hay discos / autores disponibles");
                    }
                }
                    break;
                case 4: {
                    if (discos.autorExisteAlguno() & discos.discoExisteAlguno()) {
                        System.out.print("Introduce ID del autor: ");
                        String autorId = System.console().readLine();
                        System.out.print("Introduce ID del disco: ");
                        String gruposId = System.console().readLine();
                        discos.eliminaDiscoDelAutor(autorId, gruposId);
                    } else {
                        System.out.println("No hay discos / autores disponibles");
                    }
                }

                    break;
                case 5:
                    System.out.print("Introduce nombre artístico del autor: ");
                    String autorArtístico = System.console().readLine();
                    System.out.print("Introduce nombre real del autor: ");
                    String autorReal = System.console().readLine();
                    System.out.print("Introduce su edad: ");
                    int edad = Integer.parseInt(System.console().readLine());
                    discos.aniadeAutor(
                            new Autor(String.valueOf(ColeccionDeDiscos.getCont()), autorReal, autorArtístico, edad));
                    break;
                case 6: {
                    System.out.print("Introduce ID del autor: ");
                    String id = System.console().readLine();
                    discos.eliminaAutor(id);
                }
                    break;
                case 7: {
                    System.out.print("Introduce ID del autor: ");
                    String id = System.console().readLine();
                    discos.modificaAutor(id);
                }
                    break;
                case 8:
                    System.out.println("Gracias por usarnos");
                    System.out.println("Cerrando la colección de discos...");
                    break;
                default:
                    System.out.println("Opción incorrecta introducida");
            }
            System.out.println();
        } while (opcion != 8);
    }

}
