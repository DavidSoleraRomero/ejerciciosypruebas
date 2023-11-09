package CAP05;

public class Ejercicio70 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce una altura (mayor o igual a 4): ");
            int altura = Funciones.entradaInt();
            if (altura >= 4) {
                int pinta = altura;
                for (int i = 1; i <= altura; i++) {
                    for (int esp = 1; esp < i; esp++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= pinta; j++) {
                        System.out.print("*");
                    }
                    if (i > 1 & i != altura) {
                        System.out.println();
                        for (int esp = 1; esp < i; esp++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= pinta; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    pinta--;
                }
            } else
                System.out.println("Se esperaba una altura mayor o igual a 4");
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº entero.");
        }
    }
}
