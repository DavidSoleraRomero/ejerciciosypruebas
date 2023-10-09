package CAP05;

import java.util.Scanner;

/* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca. */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce con qué carácter quieres pintar a continuación: ");
        String caracter = sc.nextLine();
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int espacios = 1; espacios <= (altura - i); espacios++) {
                System.out.print(" ");
            }
            for (int simbolo = 1; simbolo <= (i * 2) - 1; simbolo++) {
                if (i == altura) {
                    System.out.print(caracter);
                } else if (simbolo == 1 | simbolo == (i * 2) - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
