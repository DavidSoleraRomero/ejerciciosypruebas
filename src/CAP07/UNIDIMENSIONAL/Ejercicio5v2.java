package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */
public class Ejercicio5v2 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[10];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Introduce nº para la posición " + i + ": ");
                numeros[i] = Integer.parseInt(System.console().readLine());
                if (numeros[i] < min)
                    min = numeros[i];
                if (numeros[i] > max)
                    max = numeros[i];
            }
            int contMax = 1;
            int contMin = 1;
            for (int i : numeros) {
                if (i == max & contMax == 1) {
                    System.out.print(i + " máximo\n");
                    contMax++;
                } else if (i == min & contMin == 1) {
                    System.out.print(i + " mínimo\n");
                    contMin++;
                } else
                    System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }
}
