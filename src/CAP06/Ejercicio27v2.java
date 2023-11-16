package CAP06;

/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error. */
public class Ejercicio27v2 {
    public static void main(String[] args) {
        try {
            boolean ganador = false;
            do {
                System.out.print("Introduce una opción:\n1. Piedra\n2. Papel\n3. Tijera\n");
                int opcion = Integer.parseInt(System.console().readLine());
                String usuario = piePapTij(opcion);
                if (opcion >= 1 & opcion <= 3) {
                    System.out.println("Turno de la máquina");
                    int numMaq = (int) (Math.random() * 3 + 1);
                    String maquina = piePapTij(numMaq);
                    if (usuario.equals(maquina))
                        System.out.println("Empate ¡Intentémoslo de nuevo! Los dos sacásteis " + maquina);
                    else if (numMaq == 1) {
                        if (opcion == 2) {
                            System.out.println("Has ganado usuario, la máquina sacó " + maquina);
                            break;
                        } else if (opcion == 3) {
                            System.out.println("Has perdido usuario, la máquina sacó " + maquina);
                            ganador = true;
                        }
                    } else if (numMaq == 2) {
                        if (opcion == 1) {
                            System.out.println("Has perdido usuario, la máquina sacó " + maquina);
                            break;
                        } else if (opcion == 3) {
                            System.out.println("Has ganado usuario, la máquina sacó " + maquina);
                            ganador = true;
                        }
                    } else if (numMaq == 3) {
                        if (opcion == 1) {
                            System.out.println("Has ganado usuario, la máquina sacó " + maquina);
                            break;
                        } else if (opcion == 2) {
                            System.out.println("Has perdido usuario, la máquina sacó " + maquina);
                            ganador = true;
                        }
                    }
                } else
                    System.out.println("Intoduce una opción correcta");
            } while (ganador == false);
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }

    public static String piePapTij(int num) {
        switch (num) {
            case 1:
                return "piedra";
            case 2:
                return "papel";
            default:
                return "tijera";
        }
    }
}
