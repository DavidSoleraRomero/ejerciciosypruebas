package CAP05;

import java.util.Scanner;

/* Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad. */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nº para ver si es primo: ");
        int num = sc.nextInt();
        boolean primo = true;
        int acum = 2;
        while (primo & acum <= (num / 2)) {
            if (num % acum == 0) {
                primo = false;
            } else {
                acum++;
            }
        }
        if (primo == true) {
            System.out.printf("El número %d ES primo.", num);
        } else {
            System.out.printf("El número %d NO es primo.", num);
        }
        sc.close();
    }
}
