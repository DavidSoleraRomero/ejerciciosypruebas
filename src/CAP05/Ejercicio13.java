package CAP05;

import java.util.Scanner;

/* Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos. */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumPos = 0, acumNeg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Introduce el %do número: ", i);
            int num = sc.nextInt();
            if (num < 0) {
                acumNeg += 1;
            } else {
                acumPos += 1;
            }
        }
        System.out.println("Cantidad de números positivos introducidos: " + acumPos);
        System.out.println("Cantidad de números negativos introducidos: " + acumNeg);
        sc.close();
    }
}
