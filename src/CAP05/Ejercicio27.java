package CAP05;

import java.util.Scanner;

/* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado. */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para ver cuántos múltiplos de 3 tiene detrás: ");
        int num = sc.nextInt();
        int acum = 0;
        int suma = 0;
        System.out.print("Son múltiplos de 3: ");
        for (int i = 3; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                acum++;
                suma = suma + i;
            }
        }
        if (acum != 0) {
            System.out.print("\n---------------------------------");
            System.out.printf("\nHay %d múltiplos de 3 entre 1 y %d\n", acum, num);
            System.out.printf("La suma de los múltiplos da %d", suma);
        } else {
            System.out.print("\nNO hay múltiplos entre los dos números");
        }
        sc.close();
    }
}
