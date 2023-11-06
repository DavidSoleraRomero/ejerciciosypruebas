package CAP05;

public class Ejercicio40v3 {
    public static void main(String[] args) {
        System.out.print("Introduce alt del rombo: ");
        int alt = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= alt; i++) {
            for (int j = 1; j <= alt; j++) {
                if (i <= (alt / 2 + 1) & (j == (alt / 2 + 1) - (i - 1) | j == (alt / 2 + 1) + (i - 1)))
                    System.out.print("*");
                else if (i > (alt / 2 + 1) & (j == (alt / 2 + 1) - (alt - i) | j == (alt / 2 + 1) + (alt - i)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
