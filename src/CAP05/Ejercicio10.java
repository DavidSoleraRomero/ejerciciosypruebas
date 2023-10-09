package CAP05;

import java.util.Scanner;

/* Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo. */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        float acum1 = 0;
        int acum2 = 0;
        do {
            System.out.print("Introduce nº: ");
            int num = sc.nextInt();
            if (num < 0)
                break;
            else {
                acum1 = num + acum1;
                acum2++;
            }
        } while (i);
        System.out.printf("La media de los números da %.2f", (acum1 / acum2));
        sc.close();
    }
}
