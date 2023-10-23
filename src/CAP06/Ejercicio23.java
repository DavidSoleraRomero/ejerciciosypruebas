package CAP06;

/* Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados. */
public class Ejercicio23 {
    public static void main(String[] args) {
        String cara = "";
        System.out.println("Lanzando los dados...\n");
        for (int i = 1; i <= 5; i++) {
            int caraN = (int) (Math.random() * 6 + 1);
            switch (caraN) {
                case 1:
                    cara = "As";
                    break;
                case 2:
                    cara = "K";
                    break;
                case 3:
                    cara = "Q";
                    break;
                case 4:
                    cara = "J";
                    break;
                case 5:
                    cara = "7";
                    break;
                case 6:
                    cara = "8";
                    break;
            }
            System.out.print(cara + " ");
        }
        System.out.println("\n");
    }
}
