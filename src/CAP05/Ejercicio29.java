package CAP05;

import java.util.Scanner;

/* Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma. */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que muestra números inferiores a un Nº y también no divisibles entre otro Nº");
        System.out.print("Introduce un número positivo alto: ");
        int num = sc.nextInt();
        System.out.print("Introduce el número por el que no se pueden dividir los nº inferiores: ");
        int division = sc.nextInt();
        String cumplen = "Los números inferiores que CUMPLEN la condición son:";
        String noCumplen = "Los números inferiores que NO cumplen la condición son:";
        int acum = 0, acum1 = 0;
        for (int i = (num - 1); i >= 1; i--) {
            if (i % division != 0) {
                cumplen = cumplen + " " + i;
                acum++;
            } else {
                noCumplen = noCumplen + " " + i;
                acum1++;
            }
        }
        if (acum == 0) {
            System.out.print("Ningún número cumple la condición.\n" + noCumplen);
        } else if (acum1 == 0) {
            System.out.print(cumplen);
        } else {
            System.out.print(cumplen + "\n" + noCumplen);
        }
        sc.close();
    }
}
