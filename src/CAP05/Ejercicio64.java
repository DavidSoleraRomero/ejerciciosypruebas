package CAP05;

/* Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracte-
res de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
orientación, los valores de anchura y altura se intercambian. El valor mínimo
de la altura o la anchura es 2. */
public class Ejercicio64 {
    public static void main(String[] args) {
        int decision;
        int altura = 3;
        int ancho = 6;
        do {
            pintaRectangulo(altura, ancho);
            menu();
            decision = Integer.parseInt(System.console().readLine());
            switch (decision) {
                case 1:
                    altura++;
                    ancho++;
                    break;
                case 2:
                    if (ancho != 2 & altura != 2) {
                        altura--;
                        ancho--;
                    } else
                        System.out.println("No puede tener una altura / anchura inferior a 2.");
                    break;
                case 3:
                    int c = altura;
                    altura = ancho;
                    ancho = c;
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Introduce un nº válido.");
                    break;
            }
        } while (decision != 4);
    }

    public static void menu() {
        System.out.println("1. Agrandarlo");
        System.out.println("2. Achicarlo");
        System.out.println("3. Cambiar la orientación");
        System.out.println("4. Salir");
        System.out.print("Indique qué quiere realizar con el rectángulo: ");
    }

    public static void pintaRectangulo(int altura, int ancho) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if (i == 1 | i == altura)
                    System.out.print("*");
                else if (j == 1 | j == ancho)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
