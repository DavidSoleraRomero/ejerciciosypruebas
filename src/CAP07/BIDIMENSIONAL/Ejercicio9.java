package CAP07.BIDIMENSIONAL;

/* Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. */
public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            int[][] matriz = new int[12][12];
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    matriz[i][j] = (int) (Math.random() * 101);
                }
            }
            pintaMatriz(matriz);
            pendiente
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }

    public static void pintaMatriz(int matriz[][]) {
        System.out.print("Array original: ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("\n%-9s%2d:", "Posición", i);
            for (int j = 0; j < 12; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
        }
    }
}
