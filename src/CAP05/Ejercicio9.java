package CAP05;

import java.util.Scanner;

/* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long). */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nº para ver cuántas cifras tiene: ");
        long num = sc.nextLong();
        boolean i = true;
        byte acum = 1;
        while (i) {
            if (num / 10 != 0) {
                num = num / 10;
                acum++;
            } else {
                i = false;
            }
        }
        System.out.printf("El número tiene %d cifras.", acum);
        sc.close();
    }
}
