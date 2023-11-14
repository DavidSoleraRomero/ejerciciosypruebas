package CAP06;

/* Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6. */
public class Ejercicio8v2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%3s |", (i + "."));
            for (int j = 1; j <= 3; j++) {
                int opcion = (int) (Math.random() * 6);
                switch (opcion) {
                    case 0, 1, 2:
                        opcion = 1;
                        break;
                    case 3, 4:
                        opcion = 0;
                        break;
                    case 5:
                        opcion = 2;
                        break;
                }
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
