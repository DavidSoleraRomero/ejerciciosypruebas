package CAP05;

import java.util.Scanner;

/* Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero. */
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte dia1 = 0;
        byte dia2 = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Introduce un día de la semana (1-7 o Lunes-Domingo): ");
            String dia = sc.nextLine();
            dia = dia.toLowerCase();
            int numDia = 0;
            switch (dia) {
                case "1", "lunes":
                    numDia = 1;
                    break;
                case "2", "martes":
                    numDia = 2;
                    break;
                case "3", "miercoles":
                    numDia = 3;
                    break;
                case "4", "jueves":
                    numDia = 4;
                    break;
                case "5", "viernes":
                    numDia = 5;
                    break;
                case "6", "sabado":
                    numDia = 6;
                    break;
                case "7", "domingo":
                    numDia = 7;
                    break;
                default:
                    System.out.println("Día inválido introducido (1-7 o Lunes-Domingo)");
                    numDia = 8;
                    break;
            }
            if (i == 1) {
                dia1 = (byte) numDia;
            } else {
                dia2 = (byte) numDia;
            }
        }
        if ((dia2 >= dia1) && (dia1 < 8 | dia2 < 8)) {
            System.out.print("Introduce la hora del primer día: ");
            int hora1 = sc.nextInt();
            System.out.print("Introduce la hora del segundo día: ");
            int hora2 = Integer.parseInt(System.console().readLine());
            sc.close();
            int horas = 0;
            for (int i = dia1; i <= dia2; i++) {
                if (i == dia2 - 1) {
                    horas = horas + ((24 - hora1) + hora2);
                    i++;
                } else if (dia1 == dia2) {
                    if (hora1 < hora2) {
                        horas = horas + (hora2 - hora1);
                    } else {
                        horas = 0;
                    }
                } else {
                    horas = horas + 24;
                }
            }
            if (horas != 0) {
                System.out.printf("Quedan %d horas hasta el día introducido.", horas);
            } else {
                System.out.println("Es la misma hora o inferior");
            }
        } else {
            System.out.println("El segundo día introducido no puede ser anterior al primero ni estar fuera del rango");
            System.out.println("Rango --> (1-7 o Lunes-Domingo)");
        }
    }
}
