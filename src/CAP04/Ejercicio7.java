package CAP04;

/* Realiza un programa que calcule la media de tres notas */
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Vas a introducir 3 notas y calcularemos la media");
        System.out.print("Primera nota: ");
        float nota1 = Float.parseFloat(System.console().readLine());
        System.out.print("Segunda nota: ");
        float nota2 = Float.parseFloat(System.console().readLine());
        System.out.print("Tercera nota: ");
        float nota3 = Float.parseFloat(System.console().readLine());
        System.out.printf("La media de las 3 es de %.2f", ((nota1 + nota2 + nota3) / 3));
    }
}
