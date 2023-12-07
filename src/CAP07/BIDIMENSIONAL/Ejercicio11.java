package CAP07.BIDIMENSIONAL;

/* Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Posición " + i + ": ");
            for (int j = 0; j < 10; j++) {
                numeros[i][j] = (int) (Math.random() * 101 + 200);
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        int[] aux = new int[10];
        int columna = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int media = 0;
        for (int i = 0; i < aux.length; i++) {
            aux[i] = numeros[i][columna];
            media = media + aux[i];
            if (aux[i] < min)
                min = aux[i];
            if (aux[i] > max)
                max = aux[i];
            columna++;
        }
        System.out.println("\nLos números diagonales dan estos resultados:");
        System.out.printf("\nLa media da %.2f\nEl máximo es %d\nEl mínimo es %d\n\n", (float) media / 10, max, min);
    }
}
