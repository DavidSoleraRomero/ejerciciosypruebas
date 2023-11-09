package CAP05;

public class Ejercicio69v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce altura de pirámide maya: ");
            int altura = Funciones.entradaInt();
            if (altura >= 3) {
                for (int i = 1; i <= altura; i++) {
                    for (int esp = 1; esp <= altura - i; esp++) {
                        System.out.print(" ");
                    }
                    for (int ast = 1; ast <= i * 2 + 4; ast++) {
                        if (i % 2 != 0 | ast <= i | ast > i + 4)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Se esperaba altura mayor o igual a 3");
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº entero.");
        }
    }
}
