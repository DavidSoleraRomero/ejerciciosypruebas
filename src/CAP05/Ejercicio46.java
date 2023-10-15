package CAP05;

import java.util.Scanner;

/* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error. */
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la anchura del rectángulo (mínimo 2): ");
        int anchura = sc.nextInt();
        System.out.print("Introduce la altura del rectángulo (mínimo 2): ");
        int altura = sc.nextInt();
        if (anchura >= 2 & altura >= 2) {
            for (int i = 1; i <= altura; i++) {
                for (int asteriscos = 1; asteriscos <= anchura * 2 - 1; asteriscos++) {
                    if (i == 1 | i == altura) {
                        if (asteriscos % 2 == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        if (asteriscos == 1 | asteriscos == anchura * 2 - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                }
                System.out.println();
            }
        } else {
            System.out.println("Lo siento, debe introducir la altura / anchura mínima ESPECIFICADA (2)");
        }
        sc.close();
    }
}
