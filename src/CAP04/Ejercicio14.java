package CAP04;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.printf("Introduce un número para ver si es par y divisible / 5: ");
        int num = Integer.parseInt(System.console().readLine());
        if (num % 10 == 5) {
            System.out.printf("El número %d es divisible entre 5", num);
        } else if ((num % 2 == 0) && (num % 10 == 0)) {
            System.out.printf("El número %d es par y divisible entre 5", num);
        } else if (num % 2 == 0) {
            System.out.printf("El número %d es par", num);
        } else {
            System.out.printf("El número %d es impar", num);
        }
    }
}
