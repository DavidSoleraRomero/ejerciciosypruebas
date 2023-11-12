package CAP05;

public class EjercicioCarta3 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un texto para encapsularlo en una carta: ");
            String texto = System.console().readLine();
            int largo = texto.length();
            int ancho = largo * 2 + 5;
            int alto = largo + 2;
            pintaAsteriscos(ancho);
            for (int i = 0; i < alto; i++) {
                System.out.print("*");
                for (int esp = 0; esp < i; esp++) {
                    System.out.print(" ");
                }
                for (int ast = 1; ast <= (alto - i) * 2 - 1; ast++) {
                    if (ast == 1 | ast == (alto - i) * 2 - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                if (i != 0)
                    System.out.printf("%-" + i + "s", " ");
                System.out.print("*");
                System.out.println();
            }
            System.out.printf("*%-" + (ancho - 2) + "s*\n", " ");
            int izq = ((alto * 2) - largo) / 2;
            int der = izq;
            if (largo % 2 == 0)
                izq--;
            System.out.printf("*%-" + izq + "s%s%" + der + "s*\n", " ", texto, " ");
            System.out.printf("*%-" + (ancho - 2) + "s*\n", " ");
            pintaAsteriscos(ancho);
        } catch (Exception e) {
            System.out.print("\nError inesperado");
        }
    }

    public static void pintaAsteriscos(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
