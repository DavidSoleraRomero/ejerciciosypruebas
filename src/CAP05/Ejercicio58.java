package CAP05;

/* Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado. */
public class Ejercicio58 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para sacar la media de sus dígitos: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long copia = num;
            long acum = 0;
            for (int i = 1; i <= largo; i++) {
                long cifra = copia % 10;
                copia /= 10;
                acum = acum + cifra;
            }
            double media = (double) acum / (double) largo;
            System.out.printf("La media de todos los dígitos da como resultado %.2f", media);
        } catch (NumberFormatException e) {
            System.out.println("No se ha introducido un número.");
        } catch (Exception e) {
            System.out.println("Error inesperado.");
        }
    }
}