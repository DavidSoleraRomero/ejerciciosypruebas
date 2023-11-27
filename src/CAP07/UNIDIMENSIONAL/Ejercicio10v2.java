package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */
public class Ejercicio10v2 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        System.out.print("Array original: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
            System.out.print(numeros[i] + " ");
        }
        int[] aux = new int[20];
        int cont = 0;
        for (int i = 0; i < aux.length; i++) {
            if (numeros[i] % 2 == 0) {
                aux[cont] = numeros[i];
                cont++;
            }
        }
        for (int i = 0; i < aux.length; i++) {
            if (numeros[i] % 2 != 0) {
                aux[cont] = numeros[i];
                cont++;
            }
        }
        System.out.print("\nArray modificado: ");
        for (int i : aux) {
            System.out.print(i + " ");
        }
    }
}
