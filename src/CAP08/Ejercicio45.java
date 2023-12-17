package CAP08;

/* Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3. */
public class Ejercicio45 {
    public static void main(String[] args) {
        System.out.print("Altura valle: ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura >= 3) {
            for (int i = 1; i <= altura; i++) {
                lineaPirIzq(altura, i);
                lineaPirDer(altura, i);
                System.out.println();
            }
        }
    }

    public static void lineaPirIzq(int altura, int i) {
        System.out.print("*".repeat(i));
        System.out.print(" ".repeat(altura - i));
    }

    public static void lineaPirDer(int altura, int i) {
        if (i != altura) {
            System.out.print(" ".repeat(altura - 1 - i));
            System.out.print("*".repeat(i));
        } else
            System.out.print("*".repeat(i - 1));
    }
}
