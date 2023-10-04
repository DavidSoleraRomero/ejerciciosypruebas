package CAP03;

/* Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer número:");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el segundo número:");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + ((float) num1 / (float) num2));
    }
}
