package CAP10;

import java.util.ArrayList;
import java.util.Comparator;

/* Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números. */
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            System.out.print("Introduce palabra para la posición [" + i + "]: ");
            palabras.add(System.console().readLine());
        }
        Comparator<String> comparadorAscendente = Comparator.naturalOrder();
        palabras.sort(comparadorAscendente);
        for (String i : palabras) {
            System.out.print(i + " ");
        }
    }
}
