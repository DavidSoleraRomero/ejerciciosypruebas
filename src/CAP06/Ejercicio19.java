package CAP06;

/* Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. */
public class Ejercicio19 {
    public static void main(String[] args) {
        int minImp = 202;
        int maxPar = -101;
        int media = 0;
        for (int i = 1; i <= 50; i++) {
            int num = (int) (Math.random() * 302 - 101);
            System.out.print(num + " ");
            if (num % 2 == 0 & num > maxPar)
                maxPar = num;
            if (num % 2 != 0 & num < minImp)
                minImp = num;
            media = media + num;
        }
        System.out.printf("\nLa media de los 50 números da %.2f\n", ((float) media / 50));
        System.out.printf("El máximo par es de %d\n", maxPar);
        System.out.printf("El mínimo impar es de %d", minImp);
    }
}
