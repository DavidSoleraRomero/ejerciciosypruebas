package CAP06;

/* Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados. */
public class Ejercicio23v2 {
    public static void main(String[] args) {
        System.out.println("Lanzando los dados...\n");
        for (int i = 1; i <= 5; i++) {
            System.out.print(caraDado((int) (Math.random() * 6 + 1)) + " ");
        }
        System.out.println("\n");
    }

    public static String caraDado(int num) {
        switch (num) {
            case 1:
                return "As";
            case 2:
                return "K";
            case 3:
                return "Q";
            case 4:
                return "J";
            case 5:
                return "7";
            default:
                return "8";
        }
    }
}
