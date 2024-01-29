package CAP10;

import java.util.ArrayList;
/* Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna. */
import java.util.Collections;

/* Modifica el programa anterior de tal forma que las cartas se muestren orde-
nadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey. */
public class Ejercicio8y9v2 {
    public static void main(String[] args) {
        ArrayList<Cartav2> misCartas = new ArrayList<>();
        misCartas.add(new Cartav2());
        for (int i = 0; i < 9; i++) {
            Cartav2 cartaAux;
            do {
                cartaAux = new Cartav2();
            } while (contieneCarta(misCartas, cartaAux));
            misCartas.add(cartaAux);
        }
        System.out.println("\nBaraja original: ");
        for (Cartav2 carta : misCartas)
            System.out.println(carta);
        System.out.println("\nBaraja ordenada:");
        Collections.sort(misCartas);
        for (Cartav2 carta : misCartas)
            System.out.println(carta);
    }

    public static boolean contieneCarta(ArrayList<Cartav2> a, Cartav2 carta) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(carta))
                return true;
        }
        return false;
    }
}
