package CAP05;

import java.util.Scanner;

/* Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo). */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = sc.nextInt();
        int acum = 0;
        if (num > 0) {
            for (int i = num; i < (num + 100); i++) {
                acum = acum + i;
            }
            System.out.printf("El número que resulta de sumar %d más los 100 siguientes es %d", num, acum);
        } else {
            System.out.println("Introduzca un número positivo por favor");
        }
        sc.close();
    }
}
