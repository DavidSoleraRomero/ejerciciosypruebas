package CAP05;

/* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. */
public class Ejercicio41 {
    public static void main(String[] args) {
        System.out.print("Introduce un número y contaremos sus pares e impares: ");
        long num = Long.parseLong(System.console().readLine());
        long num2 = num;
        int largo = 0;
        while (true) {
            num2 = num2 / 10;
            largo++;
            if ((num2 % 10 == 0) && ((num2 / 10) % 10 == 0) && ((num2 / 100) % 10 == 0)
                    && ((num2 / 1000) % 10 == 0) && ((num2 / 10000) % 10 == 0)) {
                break;
            }
        }
        long resto = 1;
        long comas = 1;
        for (int i = 1; i <= largo; i++) {
            resto = resto * 10;
            if (i > 1) {
                comas = comas * 10;
            }
        }
        short pares = 0;
        short impares = 0;
        for (int i = 1; i <= largo; i++) {
            long cifra = num % resto;
            if (i < largo) {
                cifra = cifra / comas;
                comas = comas / 10;
            }
            if (cifra % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            resto = resto / 10;
        }
        if (pares == 0) {
            System.out.printf("El número solo tiene impares, siendo %d dígitos exactamente.", impares);
        } else if (impares == 0) {
            System.out.printf("El número solo tiene pares, siendo %d dígitos exactamente.", pares);
        } else {
            System.out.printf("El número tiene %d dígitos pares y %d dígitos impares.", pares, impares);
        }
    }
}
