package CAP05;

import java.util.Scanner;

/* Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir). */
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salida = true;
        long acum = 0;
        int cont = 0;
        long min = 999999999;
        long max = 0;
        while (salida) {
            System.out.print("Introduce números para sumarlos: ");
            long num = sc.nextLong();
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    i = (int) num;
                }
                if (i == num / 2) {
                    salida = false;
                }
            }
            if (salida == false) {
                break;
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            acum = num + acum;
            cont++;
        }
        System.out.printf("El número más pequeño es %d\n", min);
        System.out.printf("El número más grande es %d\n", max);
        System.out.printf("La media es de %.2f", ((float) acum / (float) cont));
        sc.close();
    }
}
