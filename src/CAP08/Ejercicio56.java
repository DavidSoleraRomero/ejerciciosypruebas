package CAP08;

/* Implementa una función con nombre corteza que sea capaz de extraer la capa
exterior de un array bidimensional. Esta capa se extrae en forma de array de
una dimensión. La extracción de números comienza en la esquina superior
izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
tanto el código de la función como el código de prueba que la usa. La cabecera
de la función es la siguiente:
public static int[] corteza(int[][] n) */
public class Ejercicio56 {
    public static void main(String[] args) {
        int[][] corteza = { { 45, 92, 14, 20, 25, 78 }, { 35, 72, 24, 45, 42, 60 }, { 32, 42, 64, 23, 41, 39 },
                { 98, 45, 94, 11, 18, 48 } };
        int[] periferia = corteza(corteza);
        for (int i = 0; i < periferia.length; i++) {
            System.out.printf("%d ", periferia[i]);
        }
    }

    public static int[] corteza(int[][] n) {
        int[] periferia = new int[n.length * 2 + n[0].length * 2 - 4];
        int cont = 0;
        for (int i = 0; i < n[0].length; i++) {
            periferia[cont++] = n[0][i];
        }
        for (int i = 1; i < n.length; i++) {
            periferia[cont++] = n[i][n[0].length - 1];
        }
        for (int i = n[0].length - 2; i >= 0; i--) {
            periferia[cont++] = n[n.length - 1][i];
        }
        for (int i = n.length - 2; i > 0; i--) {
            periferia[cont++] = n[i][0];
        }
        return periferia;
    }
}
