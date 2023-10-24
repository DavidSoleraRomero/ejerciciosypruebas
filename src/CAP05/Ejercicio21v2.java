package CAP05;

import java.util.Scanner;

/* Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo. */
public class Ejercicio21v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumTotal = 0, acum1 = 0;
        float acumImp = 0, acumImp1 = 0;
        boolean i = true;
        while (i) {
            System.out.print((acumTotal + 1) + ". Introduce un número: ");
            int num = sc.nextInt();
            if (num < 0)
                break;
            if (num % 2 == 0) { /* Número par más alto */
                if (num > acum1)
                    acum1 = num;
            }
            acumTotal++; /* Total de números introducidos */
            if (num % 2 != 0) { /* Media de número impar */
                acumImp++;
                acumImp1 = acumImp1 + num;
            }
        }
        sc.close();
        if (acumTotal != 0) {
            System.out.printf("El total de números introducidos es --> %d\n", acumTotal);
            System.out.printf("La media de los números impares es --> %.2f\n", ((acumImp1 + acum1) / (acumImp + 1)));
            System.out.printf("El número par más alto ha sido --> %d\n", acum1);
        }
    }
}
