package CAP05;

public class Ejercicio60v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de los calcetines (4 o superior): ");
            int altura = Integer.parseInt(System.console().readLine());
            if (altura >= 4) {
                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= 14; j++) {
                        if (i == altura | i == altura - 1) {
                            if (j != 7 & j != 8)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        } else {
                            if (j <= 3 | (j >= 9 & j <= 11))
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            } else
                System.out.println("Se esperaba un número igual o superior a 4");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
