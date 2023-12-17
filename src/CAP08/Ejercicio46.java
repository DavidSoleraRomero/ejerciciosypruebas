package CAP08;

/* Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3. */
public class Ejercicio46 {
    public static void main(String[] args) {
        System.out.print("Altura valle: ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura >= 3) {
            int cont1 = 1;
            int cont2 = altura;
            for (int i = 1; i <= altura; i++) {
                lineaPirIzq(altura, i, cont1++);
                lineaPirDer(altura, i, cont2--);
                System.out.println();
            }
        }
    }

    public static void lineaPirIzq(int altura, int i, int cont) {
        for (int j = 1; j <= cont; j++) {
            if (j == 1 | j == cont | i == altura)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print(" ".repeat(altura - i));
    }

    public static void lineaPirDer(int altura, int i, int cont) {
        for (int j = 2; j <= altura; j++) {
            if (j == cont | j == altura | i == altura)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }
}
