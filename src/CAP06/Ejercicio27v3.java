package CAP06;

/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error. */
public class Ejercicio27v3 {
    public static void main(String[] args) {
        try {
            boolean juego = true;
            do {
                opciones();
                int opcion = Integer.parseInt(System.console().readLine());
                int num = (int) (Math.random() * 3 + 1);
                String opcionUsuario = piePapTij(opcion);
                String opcionMaquina = piePapTij(num);
                System.out.printf("\nEl usuario sacó %s\nLa máquina sacó %s\n", opcionUsuario, opcionMaquina);
                Thread.sleep(1250);
                if (compara(opcion, num) == 1) {
                    System.out.print("\n¡Felicidades jugador! Ganaste a la máquina");
                    juego = false;
                } else if (compara(opcion, num) == 3) {
                    System.out.print("\nLo sentimos jugador, has perdido contra la máquina");
                    juego = false;
                } else
                    System.out.println("\n¡EMPATE! ¡Volved a intentarlo!\n");
            } while (juego);
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }

    public static void opciones() {
        System.out.println("-- Opciones a elegir --");
        System.out.println("1. Piedra");
        System.out.println("2. Tijeras");
        System.out.println("3. Papel");
        System.out.print("Seleccione una opción: ");
    }

    public static String piePapTij(int num) {
        switch (num) {
            case 1:
                return "piedra";
            case 2:
                return "tijeras";
            default:
                return "papel";
        }
    }

    public static int compara(int i, int j) {
        switch (i) {
            case 1:
                if (j == 1)
                    return 2;
                else if (j == 2)
                    return 1;
                else
                    return 3;
            case 2:
                if (j == 1)
                    return 3;
                else if (j == 2)
                    return 2;
                else
                    return 1;
            default:
                if (j == 1)
                    return 1;
                else if (j == 2)
                    return 3;
                else
                    return 2;
        }
    }
}
