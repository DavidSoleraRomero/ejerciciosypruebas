package CAP06;

/* Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos. */
public class Ejercicio24v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un número: ");
            long num = Long.parseLong(System.console().readLine());
            long largo = largo(num);
            if (largo > 1) {
                long digito = (long) (Math.random() * largo + 1);
                long copiaNum = num;
                copiaNum = copiaNum % (long) (Math.pow(10, digito));
                copiaNum = copiaNum / (long) (Math.pow(10, (digito - 1)));
                System.out.printf("El dígito elegido de %d ha sido el %d", num, copiaNum);
            } else
                System.out.println("Introduce un largo superior a 1.");
        } catch (Exception e) {
            System.out.println("Error inesperado. Se esperaba un nº entero positivo.");
        }
    }

    public static long largo(long num) {
        long largo = 0;
        while (num > 0) {
            num /= 10;
            largo++;
        }
        return largo;
    }
}
