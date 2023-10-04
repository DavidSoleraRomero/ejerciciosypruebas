package CAP04;

import java.util.Scanner;

/* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0). */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vamos a resolver una ecuación de primer grado (ax + b = 0)");
        System.out.print("\nValor de a: ");
        float a = sc.nextInt();
        System.out.print("Valor de b: ");
        float b = sc.nextInt();
        System.out.println("x = " + (-b / a));
        sc.close();
    }
}
