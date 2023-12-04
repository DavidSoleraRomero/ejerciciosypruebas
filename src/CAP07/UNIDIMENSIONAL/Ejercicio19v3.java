package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que sea capaz de insertar un número en una posición concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá. */
public class Ejercicio19v3 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[12];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 201);
            }
            System.out.printf("%-9s", "\nÍndice");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%5d", i);
            }
            System.out.printf("\n%-8s", "Valores");
            for (int i : numeros) {
                System.out.printf("%5d", i);
            }
            System.out.print("\n\n¿Qué número desea insertar?: ");
            int num = Integer.parseInt(System.console().readLine());
            System.out.print("¿Y en qué posición desea insertarlo?: ");
            int pos = Integer.parseInt(System.console().readLine());
            for (int i = numeros.length - 1; i > pos; i--) {
                numeros[i] = numeros[i - 1];
            }
            numeros[pos] = num;
            System.out.printf("%-9s", "\nÍndice");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%5d", i);
            }
            System.out.printf("\n%-8s", "Valores");
            for (int i : numeros) {
                System.out.printf("%5d", i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }
}
