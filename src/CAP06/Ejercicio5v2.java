package CAP06;

/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */
public class Ejercicio5v2 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int media = 0;
        for (int i = 1; i <= 50; i++) {
            int num = (int) (Math.random() * 100 + 100);
            media = media + num;
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        System.out.printf(
                "Nº Máximo: %d\nNº Mínimo: %d\nMedia de todos los números: %.2f\nMedia del máx y el mín: %.2f",
                max, min, (float) media / 50, ((float) min + max) / 2);
    }
}