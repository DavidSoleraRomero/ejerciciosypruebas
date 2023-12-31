package CAP07.BIDIMENSIONAL;

import CAP05.Funciones;

/* Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha. */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce número para la posición " + i + "-" + j + " : ");
                numeros[i][j] = Funciones.entradaInt();
            }
        }
        System.out.print("       ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("   %s %d", "Columna", i);
        }
        System.out.print("   Suma");
        System.out.print("\n**************************************************************************");
        int sumTotal = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nFila %d ", i);
            int suma = 0;
            for (int j = 0; j < 5; j++) {
                System.out.printf("%12d", numeros[i][j]);
                suma = suma + numeros[i][j];
            }
            System.out.printf("%7d", suma);
            sumTotal = sumTotal + suma;
        }
        System.out.print("\n**************************************************************************");
        System.out.printf("\n%-7s", "Suma");
        for (int j = 0; j < 5; j++) {
            int suma = 0;
            for (int i = 0; i < 4; i++) {
                suma = suma + numeros[i][j];
            }
            System.out.printf("%12d", suma);
        }
        System.out.printf("%7d", sumTotal);
    }
}
