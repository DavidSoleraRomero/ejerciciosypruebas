package CAP05;

import java.util.Scanner;

/* Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. */
public class Ejercicio44 {
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
        System.out.print("¿En qué posición quieres insertarlo?: ");
        short posicion = sc.nextShort();
        System.out.print("¿Qué número quieres introducir?: ");
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
                if (i < posicion | i > posicion) {
                    long cifra = num % resto;
                    if (i < largo) {
                        cifra = cifra / comas;
                        comas = comas / 10;
                    }
                    miNum = miNum + cifra;
                    resto = resto / 10;
                } else {
                    miNum = miNum + introduce;
                }
            }
            System.out.printf("El número resultante es %d", Long.parseLong(miNum));
        }
    }
}
