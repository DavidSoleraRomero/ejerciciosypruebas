package CAP06;

/* Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta. */
public class Ejercicio26v3 {
    public static void main(String[] args) {
        try {
            System.out.print("Altura de la tableta: ");
            int altura = Integer.parseInt(System.console().readLine());
            System.out.print("Anchura de la tableta: ");
            int anchura = Integer.parseInt(System.console().readLine());
            if (altura > 3 & anchura >= 2) {
                int posI = (int) (Math.random() * altura + 1);
                int posJ = (posI == 1 | posI == altura) ? random(anchura) : random(2);
                posJ = ((posI != 1 & posI != altura) & posJ == 2) ? anchura : posJ;
                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= anchura; j++) {
                        if (i != posI | j != posJ)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else
                System.out.println("Introduce altura mayor que 3 y anchura superior a 1");
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }

    public static int random(int num) {
        return (int) (Math.random() * num + 1);
    }
}
