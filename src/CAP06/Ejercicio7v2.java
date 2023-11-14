package CAP06;

/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas). */
public class Ejercicio7v2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%3s |", (i + "."));
            for (int j = 1; j <= 3; j++) {
                int opcion = (int) (Math.random() * 3);
                System.out.printf(" %s |", (opcion == 0) ? "X" : String.valueOf(opcion));
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 2; i++) {
            int num = (int) (Math.random() * 4);
            if (i == 1)
                System.out.print("Pleno al 15 - Local... " + ((num == 3) ? "M" : num));
            else
                System.out.println(" Visitante... " + ((num == 3) ? "M" : num));
        }
    }
}
