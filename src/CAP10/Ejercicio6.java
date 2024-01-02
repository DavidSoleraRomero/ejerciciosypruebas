package CAP10;

import java.util.HashMap;

/* Implementa el control de acceso al área restringida de un programa. Se debe
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
de usuario con sus correspondientes contraseñas deben estar almacenados en
una estructura de la clase HashMap. */
public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("davidsolera", "12345678");
        usuarios.put("juangarcia", "aliqindoi");
        usuarios.put("lolitofdez", "fornite123!");
        String nombreUsuario = "";
        do {
            System.out.print("Introduce el nombre del usuario: ");
            nombreUsuario = System.console().readLine();
        } while (!usuarios.containsKey(nombreUsuario));
        boolean accede = false;
        String contrasena = "";
        short intentos = 1;
        do {
            System.out.print("\nIntroduce la contraseña (intento número " + intentos + "): ");
            contrasena = System.console().readLine();
            if (usuarios.get(nombreUsuario).equals(contrasena)) {
                System.out.println("\nUsuario validado...\nAccediendo al área restringida...");
                accede = true;
            } else {
                System.out.println("Contraseña incorrecta");
            }
            intentos++;
        } while (!accede & intentos < 4);
        if (!accede)
            System.out.println("\nLo sentimos, ha introducido mal la contraseña demasiadas veces");
    }

}
