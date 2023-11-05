package CAP05;

public class Ejercicio42v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº para ver si los 5 siguientes son primos: ");
            long num = Long.parseLong(System.console().readLine());
            for (int i = 1; i <= 5; i++) {
                boolean primo = true;
                num++;
                int acum = 2;
                while (primo == true & acum <= num / 2) {
                    if (num % acum == 0)
                        primo = false;
                    acum++;
                }
                if (primo == true)
                    System.out.printf("%d es primo\n", num);
                else
                    System.out.printf("%d NO es primo\n", num);
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
