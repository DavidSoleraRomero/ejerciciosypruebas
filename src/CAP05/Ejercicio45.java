package CAP05;

import java.util.Scanner;

/* Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos. */
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long num = sc.nextLong();
        long num2 = num;
        int largo = 0;
        while (true) {
            num2 = num2 / 10;
            largo++;
            if ((num2 % 10 == 0) && ((num2 / 10) % 10 == 0) && ((num2 / 100) % 10 == 0)
                    && ((num2 / 1000) % 10 == 0) && ((num2 / 10000) % 10 == 0)) {
                break;
            }
        }
        System.out.print("¿En qué posición quieres reemplazar el número?: ");
        short posicion = sc.nextShort();
        System.out.print("¿Qué número quieres insertar?: ");
        short introduce = sc.nextShort();
        sc.close();
        if (posicion <= largo) {
            long resto = 1;
            long comas = 1;
            for (int i = 1; i <= largo; i++) {
                resto = resto * 10;
                if (i > 1) {
                    comas = comas * 10;
                }
            }
            String miNum = "";
            for (int i = 1; i <= largo; i++) {
                long cifra = num % resto;
                if (i < largo) {
                    cifra = cifra / comas;
                    comas = comas / 10;
                }
                if (i < posicion | i > posicion) {
                    miNum = miNum + cifra;
                } else {
                    miNum = miNum + introduce;
                }
                resto = resto / 10;

            }
            System.out.printf("El número resultante es %d", Long.parseLong(miNum));
        }
    }
}
