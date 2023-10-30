package CAP05;

import java.util.Scanner;

/* Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int suma = 0;
        while ((suma <= 10000)) {
            System.out.print("Introduce un número para sumar: ");
            int num = sc.nextInt();
            suma = num + suma;
            cont++;
        }
        System.out.println("-------------------------------------");
        System.out.printf("%-27s %8d\n", "Suma de los números", suma);
        System.out.printf("%-27s %8d\n", "Contador de nº introducidos", cont);
        System.out.println("-------------------------------------");
        System.out.printf("%-27s %8.2f\n", "Media", ((float) suma / (float) cont));
        sc.close();
    }
}
