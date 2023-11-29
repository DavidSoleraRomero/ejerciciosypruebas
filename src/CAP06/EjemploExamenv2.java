package CAP06;

/* 40 cartas de la baraja española - 1 a 7 y Sota / Caballo / Rey 
 * 4 palos --> Oro - Copas - Espadas - Bastos */
public class EjemploExamenv2 {
    public static void main(String[] args) {
        try {
            System.out.println("Arrancando la baraja española...\nPulse ENTER para comenzar");
            System.console().readLine();
            System.out.print("Turno del jugador: \nIntroduzca su apuesta, por favor: ");
            int apuesta = Integer.parseInt(System.console().readLine());
            double sumaJug = 0;
            boolean jugGana = true;
            do {
                int numCarta = aleatorio(39);
                System.out.printf("Salió la carta %s\n", carta(numCarta));
                sumaJug = sumaJug + calculaSuma(numCarta);
                System.out.printf("La suma de tus cartas actualmente es de %.2f\n", sumaJug);
                if (sumaJug > 7.5) {
                    System.out.printf("Lo sentimos jugador, has perdido tu apuesta de %d euros", apuesta);
                    jugGana = false;
                    break;
                }
                if (sumaJug == 7.5) {
                    System.out.println("¡Genial! Has alcanzado 7.5\nVeamos si empatas a la máquina...");
                    break;
                } else {
                    int opcion;
                    do {
                        System.out.print("¿Desea continuar sumando y arriesgándose? (1.Sí 2.No): ");
                        opcion = Integer.parseInt(System.console().readLine());
                        if (opcion == 1) {
                            System.out.println("Continuando...");
                        } else if (opcion == 2) {
                            System.out.println("De acuerdo.");
                        } else
                            System.out.println("Por favor, introduce una opción correcta");
                    } while (opcion != 1 & opcion != 2);
                    if (opcion == 2)
                        break;
                }
            } while (jugGana);
            if (jugGana == true) {
                System.out.println("\nTurno de la máquina...");
                double sumaMaq = 0;
                boolean maqGana = true;
                while (maqGana & jugGana) {
                    int numCarta = aleatorio(39);
                    System.out.printf("La máquina ha sacado la carta %s\n", carta(numCarta));
                    sumaMaq = sumaMaq + calculaSuma(numCarta);
                    System.out.printf("La suma de sus cartas actualmente es de %.2f\n", sumaMaq);
                    if (sumaMaq > 7.5) {
                        System.out.printf("¡Felicidades jugador! Has ganado la partida. Ganas %d euros", (apuesta * 2));
                        maqGana = false;
                    }
                    if (sumaMaq == 7.5) {
                        if (sumaJug == 7.5) {
                            System.out.printf("Ha habido un empate. Recuperas tus %d euros.", apuesta);
                            break;
                        } else {
                            System.out.printf("Lo sentimos jugador, perdiste la apuesta de %d euros.", apuesta);
                            jugGana = false;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("\nError inesperado.");
        }
    }

    public static int aleatorio(int i) {
        return (int) (Math.random() * i);
    }

    public static double calculaSuma(int i) {
        i = i % 10;
        return (i == 0 | i == 7 | i == 8 | i == 9) ? 0.5 : i;
    }

    public static String carta(int i) {
        String acum = "";
        switch (i / 10) {
            case 1:
                acum = " de copas";
                break;
            case 2:
                acum = " de espadas";
                break;
            case 3:
                acum = " de bastos";
                break;
            default:
                acum = " de oro";
                break;
        }
        switch (i % 10) {
            case 8:
                return "Sota" + acum;
            case 9:
                return "Caballo" + acum;
            case 0:
                return "Rey" + acum;
            default:
                return (i % 10) + acum;
        }
    }
}
