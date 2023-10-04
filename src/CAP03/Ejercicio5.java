package CAP03;

import java.util.Scanner;

/* Escribe un programa que calcule el área de un rectángulo. */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del rectángulo:");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del rectángulo:");
        int altura = sc.nextInt();
        System.out.println("La área del rectángulo es --> " + (base * altura));
        sc.close();
    }
}
