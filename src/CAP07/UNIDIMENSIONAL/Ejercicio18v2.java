package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor... Cuando se acaben los menores o los mayores, se completará con los
números que queden. */
public class Ejercicio18v2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
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
        int[] aux = new int[10];
        int cont = 0;
        int contMen = 0;
        int contMay = 0;
        do {
            boolean menor = false;
            boolean mayor = false;
            for (int i = contMen; i < numeros.length & menor == false; i++) {
                if (numeros[i] <= 100) {
                    aux[cont] = numeros[i];
                    cont++;
                    menor = true;
                }
                contMen++;
            }
            for (int i = contMay; i < numeros.length & mayor == false; i++) {
                if (numeros[i] > 100) {
                    aux[cont] = numeros[i];
                    cont++;
                    mayor = true;
                }
                contMay++;
            }
            if (cont == numeros.length)
                break;
        } while (true);
        System.out.printf("%-10s", "\n\nÍndice");
        for (int i = 0; i < aux.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.printf("\n%-8s", "Valores");
        for (int i : aux) {
            System.out.printf("%5d", i);
        }
    }
}
