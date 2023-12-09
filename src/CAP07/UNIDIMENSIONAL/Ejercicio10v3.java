package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */
public class Ejercicio10v3 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[20];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 101);
                System.out.printf("%d ", numeros[i]);
            }
            int cont = 0;
            int[] aux = new int[20];
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
            System.out.println();
            for (int i : aux) {
                System.out.printf("%d ", i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
