package CAP07.BIDIMENSIONAL;

/* Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */
public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] numeros = new int[9][9];
        System.out.println("Array original: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numeros[i][j] = (int) (Math.random() * 401 + 500);
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int media = 0;
        int fila = 8;
        int[] diagonal = new int[9];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = numeros[fila][i];
            if (diagonal[i] < min)
                min = diagonal[i];
            if (diagonal[i] > max)
                max = diagonal[i];
            media = media + diagonal[i];
            fila--;
        }
        System.out.println("\nLos números diagonales dan estos resultados:");
        System.out.printf("\nLa media da %.2f\nEl máximo es %d\nEl mínimo es %d\n\n", (float) media / 9, max, min);
    }
}
