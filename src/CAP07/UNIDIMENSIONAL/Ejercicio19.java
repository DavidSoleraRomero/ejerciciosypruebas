package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que sea capaz de insertar un número en una posición concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11) siempre se perderá. */
public class Ejercicio19 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[12];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 201);
            }
            System.out.println("Array original: ");
            System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5,
                    6, 7, 8, 9, 10, 11, "Contenido");
            for (int i : numeros) {
                System.out.printf("%4d ", i);
            }
            System.out.print("\n\n¿Qué número desea insertar?: ");
            int num = Integer.parseInt(System.console().readLine());
            System.out.print("¿En qué posición lo desea insertar?: ");
            int posicion = Integer.parseInt(System.console().readLine());
            int siguiente = numeros[posicion];
            numeros[posicion] = num;
            for (int i = posicion; i < numeros.length - 1; i++) {
                int anterior = siguiente;
                siguiente = numeros[i + 1];
                numeros[i + 1] = anterior;
            }
            System.out.println("\nArray modificado: ");
            System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5,
                    6, 7, 8, 9, 10, 11, "Contenido");
            for (int i : numeros) {
                System.out.printf("%4d ", i);
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un número.");
        }
    }
}
