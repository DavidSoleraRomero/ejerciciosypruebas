package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */
public class Ejercicio11v2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] aux = new int[10];
        System.out.printf("%-21s", "Array original --> ");
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-21s", "Valores --> ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 201);
            System.out.printf("%4d", numeros[i]);
        }
        System.out.printf("\n%-21s", "Array modificado --> ");
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-21s", "Valores --> ");
        int cont = 0;
        for (int i = 0; i < aux.length; i++) {
            if (esPrimo(numeros[i])) {
                aux[cont] = numeros[i];
                cont++;
            }
        }
        for (int i = 0; i < aux.length; i++) {
            if (!(esPrimo(numeros[i]))) {
                aux[cont] = numeros[i];
                cont++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%4d", aux[i]);
        }
    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i <= num / 2 & primo == true; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
