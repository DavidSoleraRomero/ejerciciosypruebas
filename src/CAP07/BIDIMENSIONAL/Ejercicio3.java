package CAP07.BIDIMENSIONAL;

/* Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999). */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = (int) (Math.random() * 900 + 100);
            }
        }
        System.out.print("       ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("   %s %d", "Columna", i);
        }
        System.out.printf("%8s", "Suma");
        System.out.print("\n***************************************************************************");
        int sumTotal = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nFila %d ", i);
            int suma = 0;
            for (int j = 0; j < 5; j++) {
                System.out.printf("%12d", numeros[i][j]);
                suma = suma + numeros[i][j];
            }
            System.out.printf("%8d", suma);
            sumTotal = sumTotal + suma;
        }
        System.out.print("\n***************************************************************************");
        System.out.printf("\n%-7s", "Suma");
        for (int j = 0; j < 5; j++) {
            int suma = 0;
            for (int i = 0; i < 4; i++) {
                suma = suma + numeros[i][j];
            }
            System.out.printf("%12d", suma);
        }
        System.out.printf("%8d", sumTotal);
    }
}
