package CAP06;

public class BarraCarga {
    public static void main(String[] args) {
        try {
            int longitud = 50 - 1;
            int espFinal = 48;
            System.out.print("[");
            for (int i = 1; i <= longitud; i++) {
                System.out.print("#");
                System.out.printf("%-" + espFinal + "s]", "");
                espFinal--;
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }

    public static void pinta(int i, int longitud) {
        System.out.print("\r\u001B[K");
    }
}
