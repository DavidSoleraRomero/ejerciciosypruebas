package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él. */
public class Ejercicio21 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 501);
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n\nArray cincuerizado:");
        for (int i = 0; i < numeros.length; i++) {
            do {
                if (numeros[i] % 5 == 0) {
                    System.out.print(numeros[i] + " ");
                    break;
                } else {
                    numeros[i] = numeros[i] + 1;
                }
            } while (true);
        }
    }
}
