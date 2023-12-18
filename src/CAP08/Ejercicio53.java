package CAP08;

/* Implementa una función con nombre nEsimo que busque el número que hay
dentro de un array bidimensional en la posición n-ésima contando de izquierda
a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
es el 0. Si la posición donde se busca no existe en el array, la función debe
devolver -1. Se debe entregar tanto el código de la función como el código de
prueba que la usa. La cabecera de la función es la siguiente:
public static int nEsimo(int[][] n, int posicion) */
public class Ejercicio53 {
    public static void main(String[] args) {
        int[][] a = { { 35, 72, 24, 45, 42, 60 }, { 32, 42, 64, 23, 41, 39 }, { 98, 45, 94, 11, 18, 48 },
                { 12, 34, 56, 78, 90, 12 } };
        System.out.printf("\nEl método devuelve %d\n", nEsimo(a, 0));
        System.out.printf("El método devuelve %d\n", nEsimo(a, 2));
        System.out.printf("El método devuelve %d\n", nEsimo(a, 5));
        System.out.printf("El método devuelve %d\n", nEsimo(a, 6));
        System.out.printf("El método devuelve %d\n", nEsimo(a, 21));
        System.out.printf("El método devuelve %d\n", nEsimo(a, 23));
        System.out.printf("El método devuelve %d\n", nEsimo(a, 24));
        System.out.printf("El método devuelve %d\n", nEsimo(a, 100));
    }

    public static int nEsimo(int[][] n, int posicion) {
        int i = posicion / n[0].length;
        int j = posicion % n[0].length;
        if (i >= n.length | j >= n[0].length)
            return -1;
        return n[i][j];
    }
}
