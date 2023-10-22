package CAP06;

/* Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.

b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).

c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.

d) La última nota de la melodía debe coincidir con la primera. */
public class Ejercicio15 {
    public static void main(String[] args) {
        int largo = 0;
        do {
            largo = (int) (Math.random() * 25 + 4);
        } while (largo % 4 != 0);
        String primUltim = "";
        for (int i = 1; i <= largo; i++) {
            int notas = (int) (Math.random() * 7 + 1);
            String melodia = "";
            switch (notas) {
                case 1:
                    melodia = "do";
                    break;
                case 2:
                    melodia = "re";
                    break;
                case 3:
                    melodia = "mi";
                    break;
                case 4:
                    melodia = "fa";
                    break;
                case 5:
                    melodia = "sol";
                    break;
                case 6:
                    melodia = "la";
                    break;
                case 7:
                    melodia = "si";
                    break;
            }
            if (i == 1) {
                primUltim = melodia;
                System.out.print(primUltim + " ");
            } else if (i == largo)
                System.out.print(primUltim + " ");
            else
                System.out.print(melodia + " ");
            if (i % 4 == 0 & i != largo)
                System.out.print("| ");
        }
        System.out.println("||");
    }
}