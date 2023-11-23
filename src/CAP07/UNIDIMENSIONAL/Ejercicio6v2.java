package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array. */
public class Ejercicio6v2 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[15];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 1001);
            }
            int[] aux = new int[15];
            for (int i = 1; i < aux.length; i++) {
                aux[i] = numeros[(i - 1)];
            }
            aux[0] = numeros[(numeros.length - 1)];
            System.out.printf("\nArray original%-6s", "\nÍndice");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%-4s%2d", " ", i);
            }
            System.out.printf("\n%-6s", "Valor");
            for (int i : numeros) {
                Thread.sleep(200);
                System.out.printf("%6d", i);
            }
            Thread.sleep(2000);
            System.out.printf("\n\nArray modificado%-6s", "\nÍndice");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("%-4s%2d", " ", i);
            }
            System.out.printf("\n%-6s", "Valor");
            for (int i : aux) {
                Thread.sleep(200);
                System.out.printf("%6d", i);
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.print("\nSe ha producido un error");
        }
    }
}
