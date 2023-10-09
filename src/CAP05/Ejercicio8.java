package CAP05;

import java.util.Scanner;

/* Muestra la tabla de multiplicar de un número introducido por teclado. */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nº para ver su tabla de multiplicar: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-3dx%3d = %3d\n", num, i, (num * i));
        }
        sc.close();
    }
}
