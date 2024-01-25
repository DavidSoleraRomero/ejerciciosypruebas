package CAP10;

import java.util.ArrayList;

/* Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive. */
public class Ejercicio2v2 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        int tamanioAleatorio = (int) (Math.random() * 11 + 10);
        int suma;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tamanioAleatorio; i++) {
            numerosAleatorios.add((int) (Math.random() * 101));
        }
    }
}
