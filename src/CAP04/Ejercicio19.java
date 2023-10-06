package CAP04;

import java.util.Scanner;

/* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un número entero con entre 1 a 5 dígitos: ");
        int num = sc.nextInt();
        String digitos = "" + num;
        sc.close();
        if (!(digitos.length() > 5)) {
            System.out.printf("El número tiene %s cifras.", digitos.length());
        } else {
            System.out.println("Introduzca un número con entre 1 a 5 dígitos.");
        }

    }
}