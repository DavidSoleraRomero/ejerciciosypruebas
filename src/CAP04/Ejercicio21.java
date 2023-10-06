package CAP04;

import java.util.Scanner;

/* Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior. */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del 1er examen: ");
        double primeraNota = sc.nextDouble();
        System.out.print("Introduce la nota del 2o examen: ");
        double segundaNota = sc.nextDouble();
        sc.nextLine();
        if ((primeraNota + segundaNota) / 2 >= 5) {
            System.out.printf("Estás aprobado con %.2f de media.", (primeraNota + segundaNota) / 2);
        } else {
            System.out.print("Estás suspenso, pero has hecho la recuperación.\n");
            System.out.print("¿Has salido APTO o NO APTO?\n");
            String apto = sc.nextLine();
            if (apto.toLowerCase().equals("apto")) {
                System.out.println("Felicidades, has conseguido recuperar con un 5.");
            } else {
                System.out.println("Lo sentimos, no has conseguido recuperar.");
            }
        }
        sc.close();
    }
}
