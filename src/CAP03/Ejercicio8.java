package CAP03;

import java.util.Scanner;

/* Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora. */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las horas empleadas esta semana:");
        int horasSemana = sc.nextInt();
        System.out.println("Esta semana te corresponden " + (horasSemana * 12) + " euros.");
        sc.close();
    }
}
