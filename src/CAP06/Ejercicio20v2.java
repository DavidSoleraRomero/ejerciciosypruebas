package CAP06;

/* Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía. */
public class Ejercicio20v2 {
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
                            System.out.print("*");
                        } else if (i > agua)
                            System.out.print("=");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.print("******\n");
                System.out.println("\nLa cubeta tiene capacidad para albergar " + capacidad + " litros.");
                System.out.println("Contiene actualmente " + (capacidad - agua) + " litros de agua.");
            }
        } catch (Exception e) {
            System.out.println("Error inesperado.");
        }
    }
}
