package CAP05;

public class Ejercicio43v2 {
    public static void main(String[] args) {
        System.out.printf("Introduce un nº: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            long largo = largo(num);
            System.out.print("Introduce en qué posición quieres partirlo: ");
            long partir = Long.parseLong(System.console().readLine());
            if (partir <= largo) {
                long resto = Funciones.sacaResto(largo);
                long comas = Funciones.sacaComas(largo);
                long num1 = 0;
                long num2 = 0;
                for (long i = 1; i <= largo; i++) {
                    long cifra = num % resto;
                    resto /= 10;
                    if (i < largo) {
                        cifra = cifra / comas;
                        comas /= 10;
                    }
                    if (i >= partir)
                        num2 = num2 * 10 + cifra;
                    else
                        num1 = num1 * 10 + cifra;
                }
                System.out.printf("Los números partidos son el %d y el %d", num1, num2);
            } else
                System.out.println("Parte por un número inferior o igual al largo.");
        } catch (Exception e) {
            System.out.println("Error. Se esperaba un nº.");
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
