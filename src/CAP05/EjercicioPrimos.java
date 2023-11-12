package CAP05;

public class EjercicioPrimos {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un número: ");
            long num = Long.parseLong(System.console().readLine());
            System.out.print("Introduce cuántos números primos más quieres visualizar: ");
            int primosMas = Integer.parseInt(System.console().readLine());
            int acum = 1;
            boolean primo;
            int total = acum + primosMas;
            do {
                int divide = 2;
                primo = true;
                while (primo & divide <= num / 2) {
                    if (num % divide == 0)
                        primo = false;
                    divide++;
                }
                if (primo & num != 1) {
                    System.out.printf("%d. Número primo --> %d\n", acum, num);
                    acum++;
                }
                num++;
            } while (acum < total);
            if (primosMas == 0 & primo == false)
                System.out.print("El número introducido NO es primo.");
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error. Se esperaba un nº entero.");
        }
    }
}
