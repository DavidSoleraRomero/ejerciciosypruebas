package CAP05;

import java.util.Scanner;

/* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado. */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para ver el cuadrado y el cubo de los 5 siguientes: ");
        int num = sc.nextInt();
        for (int i = num; i < (num + 5); i++) {
            System.out.printf("%-6s:%3d %-8s: %5d\t%-4s: %6d\n", "Número", i, "Cuadrado", (i * i), "Cubo",
                    (i * i * i));
        }
        sc.close();
    }
}
