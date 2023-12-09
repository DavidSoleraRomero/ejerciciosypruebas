package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */
public class Ejercicio11v3 {
    public static void main(String[] args) {
        int[] numPrim = new int[50];
        System.out.printf("%-8s", "Índice");
        for (int i = 0; i < numPrim.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-8s", "Valores");
        for (int i = 0; i < numPrim.length; i++) {
            numPrim[i] = (int) (Math.random() * 201);
            System.out.printf("%4d", numPrim[i]);
        }
        int cont = 0;
        int[] aux = new int[50];
        for (int i = 0; i < numPrim.length; i++) {
            if (esPrimo(numPrim[i])) {
                aux[cont] = numPrim[i];
                cont++;
            }
        }
        for (int i = 0; i < numPrim.length; i++) {
            if (!(esPrimo(numPrim[i]))) {
                aux[cont] = numPrim[i];
                cont++;
            }
        }
        System.out.printf("\n%-8s", "Índice");
        for (int i = 0; i < numPrim.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-8s", "Valores");
        for (int i : aux) {
            System.out.printf("%4d", i);
        }
    }

    public static boolean esPrimo(int i) {
        if (i == 1)
            return false;
        int cont = 2;
        boolean primo = true;
        do {
            if (i % cont == 0)
                primo = false;
            cont++;
        } while (primo & cont <= i / 2);
        return primo;
    }
}
