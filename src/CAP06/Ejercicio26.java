package CAP06;

import java.util.Scanner;

/* Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta. */
public class Ejercicio26 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la anchura de la tableta: ");
            int anchura = sc.nextInt();
            System.out.print("Introduce la altura de la tableta: ");
            int altura = sc.nextInt();
            sc.close();
            int bocadoAlt = (int) (Math.random() * altura + 1);
            int bocadoAnch;
            /* Ubicación del bocado a los bordes */
            /* Si estamos en 1 o ultima. Bocado en cualquiera */
            if (bocadoAlt == 1 | bocadoAlt == altura)
                bocadoAnch = (int) (Math.random() * anchura + 1);
            /* Sino, i no es 1 ni ultima, solo bocado a los bordes */
            else {
                bocadoAnch = (int) (Math.random() * 2);
                if (bocadoAnch == 0)
                    bocadoAnch = anchura;
            }
            for (int i = 1; i <= altura; i++) {
                for (int pintar = 1; pintar <= anchura; pintar++) {
                    if (i == bocadoAlt & pintar == bocadoAnch)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
