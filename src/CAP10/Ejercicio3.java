package CAP10;

import java.util.ArrayList;
import java.util.Comparator;

/* Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList. */
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            System.out.print("Introduce número para la posición [" + i + "]: ");
            numero.add(Integer.parseInt(System.console().readLine()));
        }
        Comparator<Integer> comparadorAscendente = Comparator.naturalOrder();
        numero.sort(comparadorAscendente);
        for (Integer i : numero) {
            System.out.print(i + " ");
        }
    }
}
