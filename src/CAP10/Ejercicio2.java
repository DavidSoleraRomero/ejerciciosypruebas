package CAP10;

import java.util.ArrayList;

/* Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive. */
public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        int tamanio = aleatorio(10, 10);
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < tamanio; i++) {
            valores.add(aleatorio(100, 0));
            suma += valores.get(i);
            if (valores.get(i) > maximo)
                maximo = valores.get(i);
            if (valores.get(i) < minimo)
                minimo = valores.get(i);
        }
        System.out.printf("Tamaño ArrayList: %d\nSuma: %d\nMedia: %.2f\nMáximo: %d\nMínimo: %d",
                tamanio, suma, (suma / (double) tamanio), maximo, minimo);
    }

    public static int aleatorio(int numerosTotales, int min) {
        return (int) (Math.random() * (numerosTotales + 1) + min);
    }
}
