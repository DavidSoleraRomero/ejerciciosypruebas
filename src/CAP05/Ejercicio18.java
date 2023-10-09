package CAP05;

import java.util.Scanner;

/* Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7. */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        if (num1 != num2) {
            System.out.printf("Números comprendidos entre %d y %d\n", num1, num2);
            for (int i = num1; i <= num2; i += 7) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Introduce dos números distintos por favor.");
        }
        sc.close();
    }
}
