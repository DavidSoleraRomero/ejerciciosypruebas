package CAP10;

import java.util.ArrayList;
import java.util.Collections;

/* Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna. */

/* Modifica el programa anterior de tal forma que las cartas se muestren orde-
nadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey. */
public class Ejercicio8y9 {
    public static void main(String[] args) {
        ArrayList<Carta> miBaraja = new ArrayList<>();
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            String carta = "";
            String palo = "";
            Carta cartaAux;
            do {
                int numNombreCarta = (int) (Math.random() * 10 + 1);
                carta = obtenerNombreCarta(numNombreCarta);
                int numPalo = (int) (Math.random() * 4);
                palo = obtenerPalo(numPalo);
                cartaAux = new Carta(palo, carta);
            } while (miBaraja.contains(cartaAux));
            miBaraja.add(new Carta(palo, carta));
        }
        Collections.sort(miBaraja);
        for (Carta c : miBaraja) {
            System.out.println(c);
        }
    }

    public static String obtenerNombreCarta(int numero) {
        String nombreCarta;
        switch (numero) {
            case 1:
                nombreCarta = "As";
                break;
            case 8:
                nombreCarta = "Sota";
                break;
            case 9:
                nombreCarta = "Caballo";
                break;
            case 10:
                nombreCarta = "Rey";
                break;
            default:
                nombreCarta = String.valueOf(numero);
                break;
        }
        return nombreCarta;
    }

    public static String obtenerPalo(int numero) {
        String palo;
        switch (numero) {
            case 1:
                palo = "Oros";
                break;
            case 2:
                palo = "Copas";
                break;
            case 3:
                palo = "Espadas";
                break;
            default:
                palo = "Bastos";
                break;
        }
        return palo;
    }
}
