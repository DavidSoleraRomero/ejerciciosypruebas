package CAP04;

import java.util.Scanner;

/* Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h. */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calcularemos cuántos minutos quedan hasta el fin de semana.\n");
        System.out.print("Introduzca un día de la semana entre LUNES a VIERNES: ");
        String dia = sc.nextLine();
        System.out.print("Introduce la hora actual: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos actuales: ");
        int minutos = sc.nextInt();
        int totalMinutos = ((24 * 60) * 4) + (15 * 60);
        sc.close();
        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.printf("Quedan %d minutos hasta el fin de semana.", totalMinutos - ((hora * 60) + minutos));
                break;
            case "martes":
                System.out.printf("Quedan %d minutos hasta el fin de semana.",
                        totalMinutos - ((24 * 60) + (hora * 60) + minutos));
                break;
            case "miercoles":
                System.out.printf("Quedan %d minutos hasta el fin de semana.",
                        totalMinutos - (((24 * 60) * 2) + (hora * 60) + minutos));
                break;
            case "jueves":
                System.out.printf("Quedan %d minutos hasta el fin de semana.",
                        totalMinutos - (((24 * 60) * 3) + (hora * 60) + minutos));
                break;
            case "viernes":
                System.out.printf("Quedan %d minutos hasta el fin de semana.",
                        totalMinutos - (((24 * 60) * 4) + (hora * 60) + minutos));
                break;
            default:
                System.out.println("Asegúrese de introducir de LUNES a VIERNES");
                break;
        }
    }
}
