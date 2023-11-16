package CAP06;

/* Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, debe seguir tirando. */
public class Ejercicio31v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Arrancando el juego C R A P S\n¿Qué cantidad de dinero desea apostar?: ");
            int apuesta = Integer.parseInt(System.console().readLine());
            System.out.println("---");
            int dado1 = (int) (Math.random() * 6 + 1);
            int dado2 = (int) (Math.random() * 6 + 1);
            int suma = dado1 + dado2;
            System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2 + "\nSuma: " + suma + "\n---");
            Thread.sleep(550);
            if (suma == 7 | suma == 11)
                System.out.printf("Felicidades, has ganado %d euros\n---", apuesta * 2);
            else if (suma == 2 | suma == 3 | suma == 12)
                System.out.printf("Lo sentimos, ha perdido su apuesta de %d\n---", apuesta);
            else {
                int numObtenido = suma;
                System.out.println("Entrando en la segunda etapa del juego... Obtuviste la suma de " + suma + "\n---");
                Thread.sleep(750);
                do {
                    dado1 = (int) (Math.random() * 6 + 1);
                    dado2 = (int) (Math.random() * 6 + 1);
                    suma = dado1 + dado2;
                    Thread.sleep(225);
                    System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2 + "\nSuma: " + suma + "\n---");
                    Thread.sleep(575);
                    if (suma == 7)
                        System.out.println("Lo sentimos, has perdido en la segunda etapa.");
                    else if (suma == numObtenido)
                        System.out.println("¡Enhorabuena jugador! Has ganado en la segunda etapa");
                } while (suma != 7 & suma != numObtenido);
                System.out.println("---");
            }
        } catch (Exception e) {
            System.out.print("\nSe ha producido un error inesperado.");
        }
    }
}
