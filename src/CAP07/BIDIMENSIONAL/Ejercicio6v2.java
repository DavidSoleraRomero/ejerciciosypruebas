package CAP07.BIDIMENSIONAL;

/* Modifica el programa anterior de tal forma que no se repita ningún número en el array. */
public class Ejercicio6v2 {
    public static void main(String[] args) {
        try {
            int[][] numeros = new int[6][10];
            int max = Integer.MIN_VALUE;
            String posMax = "";
            int min = Integer.MAX_VALUE;
            String posMin = "";
            boolean repite;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    do {
                        numeros[i][j] = (int) (Math.random() * 1001);
                        if (numeros[i][j] > max) {
                            max = numeros[i][j];
                            posMax = "[" + i + "][" + j + "]";
                        }
                        if (numeros[i][j] < min) {
                            min = numeros[i][j];
                            posMin = "[" + i + "][" + j + "]";
                        }
                        repite = false;
                        for (int k = 0; k < 10 * i + j; k++) {
                            if (numeros[i][j] == numeros[k / 10][k % 10])
                                repite = true;
                        }
                    } while (repite);
                }
            }
            System.out.print("Mostrando el array...\n");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(numeros[i][j] + " ");
                    Thread.sleep(50);
                }
            }
            System.out.printf("\nEl número máximo es: %4d, en la posición %s del Array\n", max, posMax);
            System.out.printf("El número mínimo es: %4d, en la posición %s del Array", min, posMin);
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
