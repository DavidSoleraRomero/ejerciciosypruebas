package CAP05;

import java.util.Scanner;

/* Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia. */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        float base = sc.nextLong();
        System.out.print("Introduzca el exponente (positivo): ");
        float exponente = sc.nextLong();
        System.out.printf("La potencia de %.0f elevado a %.0f da como resultado %.0f", base, exponente,
                Math.pow(base, exponente));
        sc.close();
    }
}
