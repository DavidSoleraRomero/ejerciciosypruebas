package CAP10;

import java.util.ArrayList;
import java.util.Collections;

/* Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList. */
public class Ejercicio3v2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Número para posición [" + i + "/9]: ");
            numeros.add(Integer.parseInt(System.console().readLine()));
        }
        System.out.println("Lista introducida: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\nLista ordenada: ");
        Collections.sort(numeros);
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
