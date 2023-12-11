package CAP07.BIDIMENSIONAL;

/* Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */
public class Ejercicio12v2 {
    public static void main(String[] args) {
        try {
            int[][] nums = new int[9][9];
            int[] diagonal = new int[9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    nums[i][j] = (int) (Math.random() * 401 + 500);
                    System.out.printf("%d ", nums[i][j]);
                }
                System.out.println();
            }
            int fila = 8;
            int min = 1000;
            int max = 400;
            int media = 0;
            for (int i = 0; i < 9; i++) {
                diagonal[i] = nums[fila--][i];
                media = media + diagonal[i];
                if (diagonal[i] < min)
                    min = diagonal[i];
                if (diagonal[i] > max)
                    max = diagonal[i];
            }
            System.out.printf("\nLos valores en la diagonal son...\n");
            for (int i : diagonal) {
                System.out.printf("%d ", i);
            }
            System.out.printf("\nSu máximo es: %d\nSu mínimo es: %d\nSu media es: %.2f", max, min, (double) media / 9);
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
