package CAP05;

public class Ejercicio32v2 {
    public static void main(String[] args) {
        System.out.print("Introduce un nº entero positivo: ");
        try {
            long numero = Long.parseLong(System.console().readLine());
            if (numero > 0) {
                String pares = "";
                long sumaPares = 0;
                while (numero > 0) {
                    long cifra = numero % 10;
                    if (cifra % 2 == 0) {
                        pares = cifra + " " + pares;
                        sumaPares = sumaPares + cifra;
                    }
                    numero /= 10;
                }
                if (sumaPares != 0) {
                    System.out.printf("Dígitos pares: %s\n", pares);
                    System.out.printf("Suma de los dígitos pares: %d", sumaPares);
                } else
                    System.out.println("No se han introducido dígitos pares.");
            } else
                System.out.println("El número introducido es menor o igual a 0. Introduce un positivo.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
