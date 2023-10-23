package CAP06;

/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error. */
public class Ejercicio27 {
    public static void main(String[] args) {
        try {
            boolean ganador = false;
            while (!ganador) {
                System.out.print("Introduce piedra, papel o tijeras para competir: ");
                String compite1 = System.console().readLine();
                int opcion = (int) (Math.random() * 3);
                String compite2 = "";
                switch (opcion) {
                    case 0:
                        compite2 = "piedra";
                        break;
                    case 1:
                        compite2 = "papel";
                        break;
                    case 2:
                        compite2 = "tijeras";
                        break;
                }
                System.out.print("Usuario: " + compite1 + " Máquina: " + compite2 + "\n");
                if (compite1.toLowerCase().equals("piedra")) {
                    if (compite2.equals("papel")) {
                        System.out.println("Lo sentimos usuario, has perdido");
                        ganador = true;
                    } else if (compite2.equals("tijeras")) {
                        System.out.println("Felicidades usuario, has ganado");
                        ganador = true;
                    } else {
                        System.out.println("Empate, volvemos a empezar.");
                    }
                } else if (compite1.toLowerCase().equals("papel")) {
                    if (compite2.equals("tijeras")) {
                        System.out.println("Lo sentimos usuario, has perdido");
                        ganador = true;
                    } else if (compite2.equals("piedra")) {
                        System.out.println("Felicidades usuario, has ganado");
                        ganador = true;
                    } else {
                        System.out.println("Empate, volvemos a empezar.");
                    }
                } else if (compite1.toLowerCase().equals("tijeras")) {
                    if (compite2.equals("piedra")) {
                        System.out.println("Lo sentimos usuario, has perdido");
                        ganador = true;
                    } else if (compite2.equals("papel")) {
                        System.out.println("Felicidades usuario, has ganado");
                        ganador = true;
                    } else {
                        System.out.println("Empate, volvemos a empezar.");
                    }
                } else {
                    System.out.println("Opción inválida introducida por el usuario");
                }
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
