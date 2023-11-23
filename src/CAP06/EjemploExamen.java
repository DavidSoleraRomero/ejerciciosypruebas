package CAP06;

/* 40 cartas de la baraja española - 1 a 7 y Sota / Caballo / Rey 
 * 4 palos --> Oro - Copas - Espadas - Bastos */
public class EjemploExamen {
    public static void main(String[] args) {
        try {
            boolean jugGana = true;
            int carta = generaNum(40);
            double sumaJug = 0;
            System.out.print("Introduce la cantidad a apostar: ");
            int apuesta = Integer.parseInt(System.console().readLine());
            System.out.println("Arrancando el juego del 7.5 con la baraja española...");
            do {
                Thread.sleep(600);
                System.out.printf("\nJugador se te ha asignado la carta %s\n", generaCarta(carta));
                sumaJug = sumaJug + sumaNum(carta);
                Thread.sleep(450);
                System.out.printf("La suma de tus cartas actualmente es %.2f\n", sumaJug);
                if (sumaJug > 7.5) {
                    System.out.print("\nLo sentimos jugador, has perdido. Sumaste más de 7.5\n");
                    System.out.printf("Has perdido tu apuesta de %d euros", apuesta);
                    jugGana = false;
                    break;
                }
                if (sumaJug == 7.5) {
                    System.out.print("\n¡Enhorabuena jugador! Has sumado 7.5 ¡Turno de la máquina!");
                    break;
                }
                System.out.print("¿Desea seguir jugando? (1. Sí 2. No): ");
                int decision = Integer.parseInt(System.console().readLine());
                if (decision == 2)
                    break;
                carta = generaNum(40);
            } while (jugGana);
            double sumaMaq = 0;
            if (jugGana == true) {
                System.out.println("\nPreparando la máquina...");
                do {
                    carta = generaNum(40);
                    Thread.sleep(1025);
                    System.out.printf("\nSe le ha asignado a la máquina la carta %s\n", generaCarta(carta));
                    sumaMaq = sumaMaq + sumaNum(carta);
                    Thread.sleep(600);
                    System.out.printf("La suma de sus cartas actualmente es %.2f\n", sumaMaq);
                    if (sumaMaq > 7.5) {
                        System.out.print("\nLa máquina ha sumado más de 7.5 ¡Has ganado!\n");
                        System.out.printf("Has duplicado tu apuesta de %d euros, ¡enhorabuena!", apuesta);
                        break;
                    }
                    if (sumaMaq == 7.5) {
                        if (sumaJug != 7.5) {
                            System.out.println("\nLo sentimos jugador. Has perdido, la máquina sacó 7.5");
                            System.out.printf("Has perdido tu apuesta de %d euros", apuesta);
                            break;
                        } else {
                            System.out.println("\nHa habido un EMPATE. Habéis sacado 7.5 los dos. Vuelva a jugar");
                            System.out.printf("Mantienes tu apuesta de %d euros", apuesta);
                            break;
                        }
                    }
                } while (true);
            }
        } catch (Exception e) {
            System.out.print("\nError inesperado producido.");
        }
    }

    public static String generaCarta(int num) {
        int copa = num / 10;
        String carta = "";
        switch (copa) {
            case 0:
                carta = "oros";
                break;
            case 1:
                carta = "copas";
                break;
            case 2:
                carta = "espadas";
                break;
            default:
                carta = "bastos";
        }
        int cartaN = num % 10;
        switch (cartaN) {
            case 8:
                carta = "Sota de " + carta;
                break;
            case 9:
                carta = "Caballo de " + carta;
                break;
            case 0:
                carta = "Rey de " + carta;
                break;
            default:
                carta = String.valueOf(cartaN) + " de " + carta;
        }
        return carta;
    }

    public static int generaNum(int num) {
        return (int) (Math.random() * num);
    }

    public static double sumaNum(int num) {
        num = num % 10;
        return (num == 8 | num == 7 | num == 9 | num == 0) ? 0.5 : num;
    }
}