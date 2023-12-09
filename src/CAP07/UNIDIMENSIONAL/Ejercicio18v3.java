package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor... Cuando se acaben los menores o los mayores, se completará con los
números que queden. */
public class Ejercicio18v3 {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = (int) (Math.random() * 201);
            System.out.printf("%d ", num[i]);
        }
        int[] aux = new int[10];
        int cont = 0;
        int cont1 = 0;
        int cont2 = 0;
        do {
            for (int i = cont1; i < 10; i++) {
                if (num[i] <= 100) {
                    aux[cont] = num[i];
                    cont++;
                    cont1++;
                    break;
                }
                cont1++;
            }
            for (int i = cont2; i < 10; i++) {
                if (num[i] > 100) {
                    aux[cont] = num[i];
                    cont++;
                    cont2++;
                    break;
                }
                cont2++;
            }
        } while (cont != 10);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", aux[i]);
        }
    }
}
