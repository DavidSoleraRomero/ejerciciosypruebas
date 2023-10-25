package CAP05;

import java.util.Scanner;

/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado. */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce con qué carácter quieres pintar a continuación: ");
        String caracter = "" + sc.nextLine().charAt(0);
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int espacios = 1; espacios <= (altura - i); espacios++) {
                System.out.print(" ");
            }
            for (int simbolo = 1; simbolo <= (i * 2) - 1; simbolo++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
        sc.close();
    }
}
