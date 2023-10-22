package CAP06;

/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */
public class Ejercicio5 {
    public static void main(String[] args) {
        int min = 200;
        int max = 99;
        int media = 0;
        for (int i = 1; i <= 99; i++) {
            int num = (int) (Math.random() * 100 + 100);
            System.out.print(num + " ");
            if (num < min)
                min = num;
            if (num > max)
                max = num;
            media = media + num;
        }
        System.out.printf("\nLa media de los números da %.2f\n", (float) media / 100);
        System.out.printf("El nº más bajo ha sido %d\n", min);
        System.out.printf("El nº más alto ha sido %d", max);
    }
}
