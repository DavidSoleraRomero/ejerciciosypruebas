package CAP10;

import java.util.HashMap;

/* Implementa el control de acceso al área restringida de un programa. Se debe
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
de usuario con sus correspondientes contraseñas deben estar almacenados en
una estructura de la clase HashMap. */
public class Ejercicio6v2 {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("davidsolera", "123456789");
        users.put("nachito", "valorantplayer");
        users.put("eloyroblox", "yt123");
        users.put("eloyrobuxfree", "eloyjesucristo");
        String user = "";
        String passwd = "";
        boolean accede = false;
        for (int i = 2; i >= 0 & !accede; i--) {
            System.out.print("\nIntroduce un nombre de usuario: ");
            user = System.console().readLine();
            System.out.print("Introduce su contraseña: ");
            passwd = System.console().readLine();
            if (users.containsKey(user)) {
                if (users.get(user).equals(passwd))
                    accede = true;
            }
            if (!accede)
                System.out.println("\nHa introducido un parámetro incorrecto. Le quedan " + i + " intentos");
        }
        if (accede)
            System.out.println("\nHa accedido al área restringida");
        else
            System.out.println("\nLo siento, no tiene acceso al área restringida");

    }
}
