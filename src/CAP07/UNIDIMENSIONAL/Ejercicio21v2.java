package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él. */
public class Ejercicio21v2 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[15];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 501);
                while (numeros[i] % 5 != 0) {
                    numeros[i]++;
                }
            }
            System.out.printf("%-9s", "\nÍndice");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%5d", i);
            }
            System.out.printf("\n%-8s", "Valores");
            for (int i : numeros) {
                System.out.printf("%5d", i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
