package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */
public class Ejercicio9v2 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[8];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 101);
                if (numeros[i] % 2 == 0)
                    System.out.printf("%3d \"par\"\n", numeros[i]);
                else
                    System.out.printf("%3d \"impar\"\n", numeros[i]);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }
}
