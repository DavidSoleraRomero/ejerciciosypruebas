package CAP08;

/* Define la función concatena con la siguiente cabecera:
public static int[] concatena(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es el
resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }. */
public class Ejercicio48 {
    public static void main(String[] args) {
        int[] a = { 8, 9, 0 };
        int[] b = { 1, 2, 3 };
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d ", b[i]);
        }
        System.out.println();
        int[] fusion = concatena(a, b);
        for (int i = 0; i < fusion.length; i++) {
            System.out.printf("%d ", fusion[i]);
        }
    }

    public static int[] concatena(int[] a, int[] b) {
        int[] aux = new int[a.length + b.length];
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            aux[cont++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            aux[cont++] = b[i];
        }
        return aux;
    }
}
