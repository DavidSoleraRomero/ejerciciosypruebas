package CAP05;

public class Divisor {
    public static void main(String[] args) {
        System.out.print("Introduce un primer número: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un segundo número: ");
        int num2 = Integer.parseInt(System.console().readLine());
        boolean decision = Funciones.esDivisor(num1, num2);
        if (decision == true)
            System.out.printf("%d es divisor de %d", num1, num2);
        else
            System.out.printf("%d NO es divisor de %d", num1, num2);
    }
}
