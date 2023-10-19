package CAP05;

public class Primo {
    public static void main(String[] args) {
        System.out.print("Introduce un nº para ver si es primo: ");
        int num = Integer.parseInt(System.console().readLine());
        boolean primo = Funciones.esPrimo(num);
        if (primo == true)
            System.out.printf("%d es primo.\n", num);
        else
            System.out.printf("%d NO es primo\n", num);
        System.out.print("Introduce un nº para ver los n primo: ");
        int primos = Integer.parseInt(System.console().readLine());
        Funciones.primerosPrimos(primos);
    }
}
