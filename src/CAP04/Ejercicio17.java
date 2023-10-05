package CAP04;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para ver su última cifra: ");
        int num = sc.nextInt();
        System.out.printf("El último dígito es %d", num % 10);
        sc.close();
    }
}
