package CAP06;

/* Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, debe seguir tirando. */
public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.println("Comenzando el juego C-R-A-P-S...");
        try {
            System.out.print("Introduce la cantidad de dinero que deseas apostar: ");
            int dinero = Integer.parseInt(System.console().readLine());
            boolean gana = true;
            int dado1 = (int) (Math.random() * 6 + 1);
            int dado2 = (int) (Math.random() * 6 + 1);
            int suma = dado1 + dado2;
            int segundaEtapa = suma;
            while (gana) {
                if (suma == 7 | suma == 11) {
                    System.out.println("¡Felicidades jugador! Has ganado. Suma de los dados: " + suma);
                    break;
                } else if (suma == 2 | suma == 3 | suma == 12) {
                    System.out.println("Lo sentimos jugador... Has perdido el dinero. Suma de los dados: " + suma);
                    gana = false;
                } else {
                    dado1 = (int) (Math.random() * 6 + 1);
                    dado2 = (int) (Math.random() * 6 + 1);
                    int suma2 = dado1 + dado2;
                    System.out.println("Continua el juego.");
                    System.out.println("Suma de los dados de la primera etapa: " + segundaEtapa);
                    System.out.println("Suma de los dados de la segunda etapa: " + suma2);
                    System.out.println("Presione ENTER para continuar.");
                    System.console().readLine();
                    if (segundaEtapa == suma2) {
                        System.out.println(
                                "¡Felicidades jugador! Has ganado en la segunda etapa. Suma de los dados: " + suma2);
                        break;
                    } else if (suma2 == 7) {
                        System.out.println(
                                "Lo sentimos jugador... Has perdido el dinero en la segunda etapa. Suma de los dados: "
                                        + suma2);
                        gana = false;
                    }
                }
            }
            if (gana)
                System.out.printf("Dinero total devuelto: %d", (dinero * 2));
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}