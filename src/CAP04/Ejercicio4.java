package CAP04;

/* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora. */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Introduce cuántas horas has trabajado esta semana: ");
        int horas = Integer.parseInt(System.console().readLine());
        if (horas <= 40) {
            System.out.println("No alcanzas las 41 horas, cobras normal");
            System.out.println("Vas a cobrar " + (horas * 12) + " euros.");
        } else {
            System.out.println("Alcanzas las 41 horas, cobras extra");
            int resto = (horas - 40) * 16;
            System.out.println("Vas a cobrar " + ((40 * 12) + resto));
        }
    }
}
