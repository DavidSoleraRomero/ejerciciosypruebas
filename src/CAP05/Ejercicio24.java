package CAP05;

import java.util.Scanner;

/* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura: */
/* Para comprobar si van a salir dos dígitos sumamos el nº por el que comienza
con la altura que va a tener la pirámide */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nº con el que comenzará la pirámide: ");
        int num = sc.nextInt();
        int acum = num;
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int espacios = 1; espacios <= (altura - i); espacios++) {
                System.out.print(" ");
            }
            for (int numeros = 1; numeros <= (i * 2) - 1; numeros++) {
                if (numeros < ((i * 2) / 2)) {
                    System.out.print(num);
                    num++;
                } else {
                    System.out.print(num);
                    num--;
                }
            }
            num = acum;
            System.out.println("");
        }
        sc.close();
    }
}
