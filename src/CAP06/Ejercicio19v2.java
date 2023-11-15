package CAP06;

/* Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. */
public class Ejercicio19v2 {
    public static void main(String[] args) {
        int maxP = Integer.MIN_VALUE;
        int minImp = Integer.MAX_VALUE;
        int media = 0;
        for (int i = 1; i <= 50; i++) {
            int num = (int) (Math.random() * 302 - 101);
            if (num % 2 == 0 & num > maxP)
                maxP = num;
            if (num % 2 != 0 & num < minImp)
                minImp = num;
            media = media + num;
            System.out.print(num + " ");
        }
        System.out.printf("\nNúmero par más alto: %d\nNúmero impar más bajo: %d\n", maxP, minImp);
        System.out.printf("Media de todos los números mostrados: %.2f", (float) media / 50);
    }
}
