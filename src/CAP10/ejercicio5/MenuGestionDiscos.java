package CAP10.ejercicio5;

public class MenuGestionDiscos {

    public static int menuCompleto() {
        System.out.println();
        System.out.println("=====================");
        System.out.println("|COLECCIÓN DE DISCOS|");
        System.out.println("=====================");
        System.out.println("1. Listado de todos los discos");
        System.out.println("2. Nuevo disco de un autor");
        System.out.println("3. Modifica disco de un autor");
        System.out.println("4. Borrar disco");
        System.out.println("5. Añadir autor");
        System.out.println("6. Borrar autor");
        System.out.println("7. Modificar autor");
        System.out.println("8. Salir");
        System.out.print("Opción: ");
        return Integer.parseInt(System.console().readLine());
    }

    public static int menuSimple() {
        System.out.print("1. Listado");
        System.out.print("2. Añadir disco");
        System.out.print("3. Modificar disco");
        System.out.print("4. Borrar disco");
        System.out.print("5. Salir");
        System.out.print("Opción: ");
        return Integer.parseInt(System.console().readLine());
    }

}
