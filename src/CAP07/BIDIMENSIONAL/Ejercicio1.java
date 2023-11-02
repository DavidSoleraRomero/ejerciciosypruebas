package CAP07.BIDIMENSIONAL;

/* Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura. */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][6];
        numeros[0][0] = 0;
        numeros[0][1] = 30;
        numeros[0][2] = 2;
        numeros[0][5] = 5;
        numeros[1][0] = 75;
        numeros[1][4] = 0;
        numeros[2][2] = -2;
        numeros[2][3] = 9;
        numeros[2][5] = 11;
        System.out.print("       ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("   %s %d", "Columna", i);
        }
        System.out.print("\n*******************************************************************************");
        for (int i = 0; i < 3; i++) {
            System.out.print("\nFila " + i + " ");
            for (int j = 0; j < 6; j++) {
                System.out.printf("  %10d", numeros[i][j]);
            }
        }
    }
}
