package CAP07;

import CAP05.Funciones;

/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            int num = Integer.parseInt(System.console().readLine());
            numeros[i] = num;
        }
        int[] organizado = new int[10];
        int cont = 0;
        for (int i = 0; i < organizado.length; i++) {
            if (Funciones.esPrimo(numeros[i])) {
                organizado[cont] = numeros[i];
                cont++;
            }
        }
        for (int i = 0; i < organizado.length; i++) {
            if (!Funciones.esPrimo(numeros[i])) {
                organizado[cont] = numeros[i];
                cont++;
            }
        }
        System.out.println("Array original: ");
        System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                "Contenido");
        for (int i : numeros) {
            System.out.printf("%4d ", i);
        }
        System.out.println("\nArray organizado: ");
        System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                "Contenido");
        for (int i : organizado) {
            System.out.printf("%4d ", i);
        }
    }
}
