package CAP01;

/* Escribe un programa que pinte por pantalla una pirámide rellena a base de
asteriscos. La base de la pirámide debe estar formada por 9 asteriscos. */
public class Ejercicio6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int espacios = 1; espacios <= (9 - i); espacios++) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos <= (i * 2 - 1); asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}