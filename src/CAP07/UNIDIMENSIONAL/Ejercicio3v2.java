package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa. */
public class Ejercicio3v2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print("Número para la posición " + i + ": ");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}
