package CAP05;

/* Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos. */
public class Ejercicio67 {
    public static void main(String[] args) {
        System.out.print("Introduce el nº de escalones: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce la altura de cada escalón: ");
            int alturaEscalon = Integer.parseInt(System.console().readLine());
            int asteriscos = 4;
            for (int i = 1; i <= altura * alturaEscalon; i++) {
                for (int astericos = asteriscos; astericos >= 1; astericos--) {
                    System.out.print("*");
                }
                if (i % alturaEscalon == 0)
                    asteriscos += 4;
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}