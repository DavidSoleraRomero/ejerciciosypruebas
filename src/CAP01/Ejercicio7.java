package CAP01;

/* Igual que el programa anterior, pero esta vez la pirámide estará hueca (se debe
ver únicamente el contorno hecho con asteriscos). */
public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int espacios = 1; espacios <= (9 - i); espacios++) {
                System.out.print(" ");
            }
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