package CAP06;

/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6. */
public class Ejercicio8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%3d. | ", i);
            for (int j = 1; j <= 3; j++) {
                int opcion = (int) (Math.random() * 6 + 1);
                String apuesta = "";
                switch (opcion) {
                    case 1:
                        apuesta = "1";
                        break;
                    case 2:
                        apuesta = "1";
                        break;
                    case 3:
                        apuesta = "1";
                        break;
                    case 4:
                        apuesta = "X";
                        break;
                    case 5:
                        apuesta = "X";
                        break;
                    case 6:
                        apuesta = "2";
                        break;
                }
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
