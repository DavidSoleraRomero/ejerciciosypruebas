package CAP07.BIDIMENSIONAL;

/* Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */
public class Ejercicio11v2 {
    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        int[] alter = new int[10];
        int cont2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = (int) (Math.random() * 101 + 200);
                System.out.printf("%3d ", nums[i][j]);
            }
            System.out.print("\n");
            alter[i] = nums[i][cont2++];
        }
        System.out.println("\nDiagonales: ");
        for (int i : alter) {
            System.out.printf("%3d ", i);
        }
    }
}
