package CAP07.BIDIMENSIONAL;

/* Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números. */
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
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
                    Thread.sleep(920);
                }
                System.out.printf("%8d", suma);
                sumTotal = sumTotal + suma;
                Thread.sleep(920);
            }
            System.out.print("\n***************************************************************************");
            System.out.printf("\n%-7s", "Suma");
            for (int j = 0; j < 5; j++) {
                int suma = 0;
                for (int i = 0; i < 4; i++) {
                    suma = suma + numeros[i][j];
                    Thread.sleep(500);
                }
                System.out.printf("%12d", suma);
            }
            System.out.printf("%8d", sumTotal);
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
