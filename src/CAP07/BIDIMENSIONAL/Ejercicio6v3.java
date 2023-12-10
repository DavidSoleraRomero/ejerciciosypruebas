package CAP07.BIDIMENSIONAL;

/* Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */
public class Ejercicio6v3 {
    public static void main(String[] args) {
        try {
            int[][] nums = new int[6][10];
            int[] maxs = { Integer.MIN_VALUE, Integer.MIN_VALUE };
            int max = Integer.MIN_VALUE;
            int[] mins = { Integer.MAX_VALUE, Integer.MAX_VALUE };
            int min = Integer.MAX_VALUE;
            int cont = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    boolean repite = false;
                    do {
                        repite = false;
                        nums[i][j] = (int) (Math.random() * 1001);
                        for (int k = 0; k <= i; k++) {
                            for (int h = 0; h < ((k != i) ? 10 : j); h++) {
                                if (nums[k][h] == nums[i][j]) {
                                    repite = true;
                                }
                            }
                        }
                    } while (repite);
                    cont++;
                    if (nums[i][j] < min) {
                        min = nums[i][j];
                        mins[0] = i;
                        mins[1] = j;
                    }
                    if (nums[i][j] > max) {
                        max = nums[i][j];
                        maxs[0] = i;
                        maxs[1] = j;
                    }
                    System.out.printf("%d ", nums[i][j]);
                }
            }
            System.out.printf("\nPosición max: [%d][%d]\nPosición min: [%d][%d]", maxs[0], maxs[1], mins[0], mins[1]);
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
