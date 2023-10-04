package CAP03;

import java.util.Scanner;

/* Escribe un programa que calcule el total de una factura 
a partir de la base imponible. */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu factura sin IVA:");
        int factura = sc.nextInt();
        System.out.println("El total que te da es de " + (factura * 1.21) + " euros.");
        sc.close();
    }
}
