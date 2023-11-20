package CAP06;

public class Ejercicio20v3 {
    public static final String AZUL = "\u001B[94m";
    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        try {
            System.out.print("Indique la capacidad de la cuba de agua: ");
            int capacidad = Integer.parseInt(System.console().readLine());
            if (capacidad > 2) {
                int agua = (int) (Math.random() * (capacidad + 1));
                System.out.println();
                for (int i = 1; i <= capacidad; i++) {
                    for (int j = 1; j <= 6; j++) {
                        if (j == 1 | j == 6) {
                            System.out.print(ROJO + "*" + RESET);
                        } else if (i > agua)
                            System.out.print(AZUL + "=" + RESET);
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.print(ROJO + "******\n" + RESET);
                System.out.println("\nLa cubeta tiene capacidad para albergar " + capacidad + " litros.");
                System.out.println("Contiene actualmente " + (capacidad - agua) + " litros de agua.");
            }
        } catch (Exception e) {
            System.out.println("Error inesperado.");
        }
    }
}
