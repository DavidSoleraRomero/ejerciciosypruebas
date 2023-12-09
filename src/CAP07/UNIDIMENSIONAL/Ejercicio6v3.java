package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array. */
public class Ejercicio6v3 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[15];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 1001);
            }
            for (int i : numeros) {
                System.out.printf("%d ", i);
            }
            int ultimo = numeros[numeros.length - 1];
            for (int i = numeros.length - 1; i > 0; i--) {
                numeros[i] = numeros[i - 1];
            }
            numeros[0] = ultimo;
            System.out.println();
            for (int i : numeros) {
                System.out.printf("%d ", i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }
}
