package CAP05;

public class Ejercicio41v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº entero positivo: ");
            long num = Long.parseLong(System.console().readLine());
            long largo = sacaLargo(num);
            int pares = 0;
            int impares = 0;
            long copiaNum = num;
            for (int i = 1; i <= largo; i++) {
                long cifra = copiaNum % 10;
                copiaNum /= 10;
                if (cifra % 2 == 0)
                    pares++;
                else
                    impares++;
            }
            if (pares != 0 & impares != 0)
                System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares.", num, pares, impares);
            else if (pares == 0 & impares != 0)
                System.out.printf("El %d solo tiene %d dígitos impares.", num, impares);
            else
                System.out.printf("El %d solo tiene %d dígitos pares.", num, pares);
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }

    public static long sacaLargo(long num) {
        long largo = 0;
        while (num > 0) {
            num /= 10;
            largo++;
        }
        return largo;
    }
}
