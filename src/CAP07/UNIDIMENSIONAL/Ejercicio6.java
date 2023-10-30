package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el nº " + i + ": ");
            int num = Integer.parseInt(System.console().readLine());
            numeros[i] = num;
        }
        System.out.println("\nArray original: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        int primero = numeros[numeros.length - 1];
        int siguiente = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            int anterior = siguiente;
            siguiente = numeros[i + 1];
            numeros[i + 1] = anterior;
        }
        numeros[0] = primero;
        System.out.println("\nArray invertido:");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}