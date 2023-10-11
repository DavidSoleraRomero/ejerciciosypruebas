package CAP05;

import java.util.Scanner;

/* Escribe un programa que calcule el factorial de un número entero leído por teclado. */
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nº para ver su factorial: ");
        long num = sc.nextLong();
        sc.close();
        long acum2 = 1;
        for (short i = 1; i <= num; i++) {
            long acum1 = acum2 * i;
            acum2 = acum1;
        }
        System.out.printf("%d! = %d", num, acum2);
    }
}
