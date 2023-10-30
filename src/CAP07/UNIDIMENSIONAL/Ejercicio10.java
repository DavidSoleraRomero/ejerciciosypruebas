package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números organizado a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        System.out.println("Array original: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
            System.out.print(numeros[i] + " ");
        }
        int[] organizado = new int[20];
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                organizado[cont] = numeros[i];
                cont++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                organizado[cont] = numeros[i];
                cont++;
            }
        }
        System.out.println("\nArray organizado: ");
        for (int i : organizado) {
            System.out.print(i + " ");
        }
    }
}