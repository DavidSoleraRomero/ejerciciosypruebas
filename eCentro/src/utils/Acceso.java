package utils;

public class Acceso {

    public static void menuUsuario() {
        System.out.println("\n1. Acceder");
        System.out.println("2. Registrar");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
    }

    public static void menuGestion() {
        System.out.println("\n1. Añadir grupo");
        System.out.println("2. Listar grupo");
        System.out.println("3. Consultar grupo");
        System.out.println("4. Borrar grupo");
        System.out.println("5. Añadir alumno");
        System.out.println("6. Listar alumnos");
        System.out.println("7. Borrar alumnos");
        System.out.println("8. Salir");
        System.out.print("Opción: ");
    }

    public static void menuListarGrupo() {
        System.out.println("\n1. Añadir alumno");
        System.out.println("2. Eliminar alumnos");
        System.out.println("3. Listar alumnos");
        System.out.println("4. Atrás");
        System.out.print("Opción: ");
    }

    public static String[] introduceEmailContrasena() {
        System.out.print("Introduce correo electrónico a registrar: ");
        String correo = System.console().readLine();
        System.out.print("Introduce la contraseña: ");
        String password = System.console().readLine();
        String[] credenciales = { correo, password };
        return credenciales;
    }

    public static String[] introduceNombreApellidos() {
        System.out.print("Introduce nombre: ");
        String nombre = System.console().readLine();
        System.out.print("Introduce apellidos: ");
        String apellidos = System.console().readLine();
        String[] info = { nombre, apellidos };
        return info;
    }

    public static String[] introduceInformacion() {
        System.out.print("Introduce tu nombre: ");
        String nombre = System.console().readLine();
        System.out.print("Introduce tus apellidos: ");
        String apellidos = System.console().readLine();
        String[] informacion = { nombre, apellidos };
        return informacion;
    }

}
