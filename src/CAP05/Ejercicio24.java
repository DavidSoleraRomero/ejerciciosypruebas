package CAP05;

import java.util.Scanner;

/* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura: */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nº con el que comenzará la pirámide: ");
        int num = sc.nextInt();
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int espacios = 1; espacios <= (altura - i); espacios++) {
                System.out.print(" ");
            }
            for (int numeros = 1; numeros <= (i * 2) - 1; numeros++) {
                System.out.print(num);
            }
            System.out.println("");
        }
        sc.close();
    }
}
