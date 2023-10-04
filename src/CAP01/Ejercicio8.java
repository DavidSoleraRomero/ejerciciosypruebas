package CAP01;

/* Igual que el programa anterior, pero esta vez la pirámide debe aparecer
invertida, con el vértice hacia abajo. */
public class Ejercicio8 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 9; i >= 1; i--) {

            for (int espacios = 1; espacios <= j; espacios++) {
                System.out.print(" ");

            }
            j = j + 1;

            for (int asteriscos = 1; asteriscos <= (i * 2 - 1); asteriscos++) {
                if (i == 9) {
                    System.out.print("*");
                } else {
                    if ((asteriscos == 1) || (asteriscos == (i * 2 - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}