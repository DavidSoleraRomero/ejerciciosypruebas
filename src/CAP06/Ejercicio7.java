package CAP06;

/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas). */
public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%3d. | ", i);
            for (int j = 1; j <= 3; j++) {
                int opcion = (int) (Math.random() * 3);
                String apuesta = "";
                if (opcion == 0)
                    apuesta = "X";
                else
                    apuesta = apuesta + opcion;
                System.out.print(apuesta + " | ");
            }
            System.out.println();
        }
        System.out.println();
        String goles = String.valueOf((int) (Math.random() * 4));
        System.out.print("Pleno al 15 - Local... ");
        if (goles.equals("3"))
            goles = "M";
        System.out.print(goles);
        goles = String.valueOf((int) (Math.random() * 4));
        System.out.print("  Visitante... ");
        if (goles.equals("3"))
            goles = "M";
        System.out.print(goles);
    }
}