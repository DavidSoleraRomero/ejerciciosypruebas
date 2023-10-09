package CAP05;

import java.util.Scanner;

/* Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
introducir por teclado. */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuántos números quieres ver de Fibonacci: ");
        int num = sc.nextInt();
        int actual = 0, futuro = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(actual + " ");
            futuro = futuro + actual;
            actual = futuro - actual;
        }
        sc.close();
    }
}
