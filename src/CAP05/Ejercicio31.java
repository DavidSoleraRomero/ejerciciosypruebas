package CAP05;

/* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno. */
public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la L: ");
        int altura = Integer.parseInt(System.console().readLine());
        int horizontal = ((altura / 2) + 1) * 2;
        System.out.println();
        for (int i = 1; i <= altura; i++) {
            if (i != altura) {
                System.out.print("*");
            } else {
                for (int j = 1; j <= horizontal; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
