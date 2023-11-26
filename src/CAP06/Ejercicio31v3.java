package CAP06;

/* Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, debe seguir tirando. */
public class Ejercicio31v3 {
    public static void main(String[] args) {
        try {
            System.out.print("Dinero a apostar: ");
            int dinero = Integer.parseInt(System.console().readLine());
            if (dinero > 0) {
                boolean gana = true;
                int dado1 = (int) (Math.random() * 6 + 1);
                int dado2 = (int) (Math.random() * 6 + 1);
                int suma = dado1 + dado2;
                int num = suma;
                Thread.sleep(1000);
                System.out.println("Suma de los dados: " + suma);
                Thread.sleep(750);
                if (suma == 7 | suma == 11) {
                    System.out.print("Felicidades! Has ganado " + (dinero * 2) + " euros.\n");
                    gana = false;
                } else if (suma == 2 | suma == 3 | suma == 12) {
                    System.out.print("Lo sentimos jugador perdiste tus " + dinero + " euros.\n");
                    gana = false;
                } else {
                    System.out.println("Entrando en la segunda fase...");
                    System.out.printf("Tienes que sacar un %d para ganar.\n", suma);
                }
                int cont = 1;
                while (gana == true) {
                    dado1 = (int) (Math.random() * 6 + 1);
                    dado2 = (int) (Math.random() * 6 + 1);
                    suma = dado1 + dado2;
                    Thread.sleep(775);
                    System.out.printf("Suma de los dados tirada %d: %d\n", cont, suma);
                    Thread.sleep(800);
                    cont++;
                    if (suma == num) {
                        System.out.print("Felicidades jugador, ganaste! Sumaremos " + dinero + " euros a tu cuenta.");
                        gana = false;
                    } else if (suma == 7) {
                        System.out.print("Lo sentimos jugador... Has perdido tus " + dinero + " euros.");
                        gana = false;
                    }
                }
            } else
                System.out.println("Apueste algo, por favor");
        } catch (Exception e) {
            System.out.println("\nError, se esperaba un nº entero positivo.");
        }
    }
}
