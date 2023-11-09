package CAP05;

public class Ejercicio65v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la A (mayor o igual a 3): ");
            int altura = Integer.parseInt(System.console().readLine());
            System.out.printf("Introduce la ubicación del palito (entre %d y %d): ", 2, altura - 1);
            int palito = Integer.parseInt(System.console().readLine());
            if (altura >= 3 & palito >= 2 & palito < altura) {
                imprimeA(altura, palito);
            } else
                System.out.print("Introduza altura superior o igual a 3 y un palito mayor que 2 y menor que la altura");
        } catch (Exception e) {
            System.out.println("Error. Se esperaba un nº entero.");
        }
    }

    public static void imprimeA(int altura, int palito) {
        for (int i = 1; i <= altura; i++) {
            for (int esp = 1; esp <= altura - i; esp++) {
                System.out.print(" ");
            }
            for (int ast = 1; ast <= i * 2 - 1; ast++) {
                if (i == palito | ast == 1 | ast == i * 2 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
