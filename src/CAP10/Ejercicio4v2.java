package CAP10;

import java.util.ArrayList;
import java.util.Collections;

/* Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números. */
public class Ejercicio4v2 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.printf("Palabra para la posición [%d/9]: ", i);
            palabras.add(System.console().readLine());
        }
        System.out.println("Lista introducida: ");
        for (String s : palabras) {
            System.out.print(s + " ");
        }
        System.out.println("\nLista ordenada: ");
        Collections.sort(palabras);
        for (String s : palabras) {
            System.out.print(s + " ");
        }
    }
}
