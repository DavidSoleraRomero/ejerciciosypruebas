package CAP03;

import java.util.Scanner;
/* Escribe un programa que calcule el volumen de un cono según la fórmula V =   1 πr2h
                                                                                3 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura del cono:");
        int altura = sc.nextInt();
        System.out.println("Introduce el diámetro del cono:");
        int diametro = sc.nextInt();
        float radio = diametro / 2;
        float pi = 3.14f;
        System.out.println("El volumen es de " + ((pi * (radio * radio) * altura) / 3));
        sc.close();
    }
}
