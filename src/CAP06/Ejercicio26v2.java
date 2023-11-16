package CAP06;

/* Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta. */
public class Ejercicio26v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce alto de la tableta: ");
            int alto = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce ancho de la tableta: ");
            int ancho = Integer.parseInt(System.console().readLine());
            if (alto > 3 & ancho > 2) {
                int randomI = (int) (Math.random() * alto + 1);
                int randomJ;
                if (randomI == 1 | randomI == alto)
                    randomJ = (int) (Math.random() * ancho + 1);
                else {
                    randomJ = (int) (Math.random() * 2 + 1);
                    if (randomJ == 2)
                        randomJ = ancho;
                }
                for (int i = 1; i <= alto; i++) {
                    for (int j = 1; j <= ancho; j++) {
                        if (randomI != i | randomJ != j)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Alto mayor que 3 y ancho mayor que 2.");
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }
}
