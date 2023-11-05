package CAP05;

public class Ejercicio39v2 {
    public static void main(String[] args) {
        System.out.print("Introduce un nº entero positivo: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            if (num > 0) {
                System.out.println();
                long anterior = 1;
                for (int i = 1; i <= num; i++) {
                    anterior = anterior * i;
                    System.out.printf("%d! = %d\n", i, anterior);
                }
            } else
                System.out.println("Se esperaba un nº positivo");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
