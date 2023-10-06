package CAP04;

import java.util.Scanner;

/* Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras. */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número con entre 1 a 5 cifras: ");
        int num = sc.nextInt();
        sc.close();
        String digitos = "" + num;

        if (!(digitos.length() > 5)) {
            if (digitos.length() == 1) {
                System.out.printf("El número %d es capicúa.", num);
            } else if (digitos.length() == 2) {
                if (digitos.charAt(0) == digitos.charAt(1)) {
                    System.out.printf("El número %d es capicúa.", num);
                } else {
                    System.out.printf("El número %d NO es capicúa.", num);
                }
            } else if (digitos.length() == 3) {
                if ((digitos.charAt(0) == digitos.charAt(2))) {
                    System.out.printf("El número %d es capicúa.", num);
                } else {
                    System.out.printf("El número %d NO es capicúa.", num);
                }
            } else if (digitos.length() == 4) {
                if ((digitos.charAt(0) == digitos.charAt(3)) && (digitos.charAt(1) == digitos.charAt(2))) {
                    System.out.printf("El número %d es capicúa.", num);
                } else {
                    System.out.printf("El número %d NO es capicúa.", num);
                }
            } else if (digitos.length() == 5) {
                if ((digitos.charAt(0) == digitos.charAt(4)) && (digitos.charAt(1) == digitos.charAt(3))) {
                    System.out.printf("El número %d es capicúa.", num);
                } else {
                    System.out.printf("El número %d NO es capicúa.", num);
                }
            }
        } else {
            System.out.println("Introduce un número con entre 1 a 5 cifras.");
        }
    }
}
