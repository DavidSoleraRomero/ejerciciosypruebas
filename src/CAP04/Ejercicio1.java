package CAP04;

import java.util.Scanner;

/* Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día. */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana");
        System.out.print("Asegúrese de que no lleve tilde: ");
        String dia = sc.nextLine().toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("Tienes Programación a 1ª hora");
                break;
            case "martes":
                System.out.println("Tienes L.M. a 1ª hora");
                break;
            case "miercoles":
                System.out.println("Tienes L.M. a 1ª hora");
                break;
            case "jueves":
                System.out.println("Tienes Programación a 1ª hora");
                break;
            case "viernes":
                System.out.println("Tienes FOL a 1ª hora");
                break;
            default:
                System.out.println("Día inválido introducido");
        }
        sc.close();
    }
}
