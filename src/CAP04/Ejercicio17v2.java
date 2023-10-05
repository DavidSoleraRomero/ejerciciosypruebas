package CAP04;

import java.util.Scanner;

public class Ejercicio17v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para ver la última cifra: ");
        String num = sc.nextLine();
        System.out.printf("La última cifra de lo introducido es %s", num.charAt(num.length() - 1));

        sc.close();
    }
}
