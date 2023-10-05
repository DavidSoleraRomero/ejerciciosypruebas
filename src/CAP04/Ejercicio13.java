package CAP04;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el tercer número: ");
        int num3 = Integer.parseInt(System.console().readLine());
        if (num1 > num2) {
            if (num2 > num3) {
                System.out.printf("%d %d %d", num1, num2, num3);
            } else if (num3 > num1) {
                System.out.printf("%d %d %d", num3, num1, num2);
            } else {
                System.out.printf("%d %d %d", num1, num3, num2);
            }
        } else {
            if (num2 > num1) {
                if (num1 > num3) {
                    System.out.printf("%d %d %d", num2, num1, num3);
                } else if (num3 > num2) {
                    System.out.printf("%d %d %d", num3, num2, num1);
                } else {
                    System.out.printf("%d %d %d", num2, num3, num1);
                }
            }
        }
    }
}
