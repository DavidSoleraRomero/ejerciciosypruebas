package CAP05;

import java.util.Scanner;

/* Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres. */
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura del 8 (mayor o igual que 5): ");
        int altura = sc.nextInt();
        if (altura >= 5) {
            for (int i = 1; i <= altura; i++) {
                for (int asteriscos = 1; asteriscos <= 6; asteriscos++) {
                    if (i == 1 | i == altura | i == (altura / 2) + 1) {
                        System.out.print("M");
                    } else {
                        if (asteriscos == 1 | asteriscos == 6) {
                            System.out.print("M");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("El número introducido es inferior a 5. Asegúrese de que sea mayor.");
        }
        sc.close();
    }
}
