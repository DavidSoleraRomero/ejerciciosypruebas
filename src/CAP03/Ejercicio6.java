package CAP03;

import java.util.Scanner;

/* Escribe un programa que calcule el área de un triángulo. */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del triángulo:");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del triángulo:");
        int altura = sc.nextInt();
        System.out.println("La área del triángulo es --> " + ((base * altura) / 2));
        sc.close();
    }
}
