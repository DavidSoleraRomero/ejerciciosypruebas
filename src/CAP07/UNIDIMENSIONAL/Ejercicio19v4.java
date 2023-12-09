package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que sea capaz de insertar un número en una posición concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá. */
public class Ejercicio19v4 {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        System.out.printf("%-8s", "Índice");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-8s", "Valores");
        for (int i = 0; i < 12; i++) {
            numeros[i] = (int) (Math.random() * 201);
            System.out.printf("%4d", numeros[i]);
        }
        System.out.print("\n\nNúmero a insertar: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.print("Posicón para insertar: ");
        int pos = Integer.parseInt(System.console().readLine());
        int[] aux = new int[12];
        for (int i = 0; i < aux.length; i++) {
            if (i > pos) {
                aux[i] = numeros[i - 1];
            } else
                aux[i] = numeros[i];
        }
        aux[pos] = num;
        System.out.printf("\n%-8s", "Índice");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-8s", "Valores");
        for (int i : aux) {
            System.out.printf("%4d", i);
        }
    }
}
