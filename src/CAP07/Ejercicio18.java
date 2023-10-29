package CAP07;

/* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor... Cuando se acaben los menores o los mayores, se completará con los
números que queden. */
public class Ejercicio18 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            int num = (int) (Math.random() * 201);
            numeros[i] = num;
        }
        System.out.println("Array original: ");
        System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5, 6,
                7, 8, 9, "Contenido");
        for (int i : numeros) {
            System.out.printf("%4d ", i);
        }
        int[] alterna = new int[10];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int num1 = 0;
        int num2 = 0;
        do {
            boolean menor100 = false;
            boolean mayor100 = false;
            for (int i = cont1; i < numeros.length & menor100 == false; i++) {
                if (numeros[cont1] <= 100) {
                    menor100 = true;
                    num1 = numeros[cont1];
                }
                cont1++;
                if (menor100 == true)
                    break;
            }
            for (int i = cont2; i < numeros.length & mayor100 == false; i++) {
                if (numeros[cont2] > 100) {
                    mayor100 = true;
                    num2 = numeros[cont2];
                }
                cont2++;
                if (mayor100 == true)
                    break;
            }
            for (int i = cont3; i < numeros.length; i++) {
                if (menor100 == true & mayor100 == true) {
                    alterna[cont3] = num1;
                    alterna[cont3 + 1] = num2;
                    cont3 += 2;
                } else if (menor100 == true) {
                    alterna[cont3] = num1;
                    cont3++;
                } else {
                    alterna[cont3] = num2;
                    cont3++;
                }
                i = numeros.length;
            }
            if (cont3 == numeros.length)
                break;
        } while (true);
        System.out.println("\n\nArray modificado: ");
        System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5, 6,
                7, 8, 9, "Contenido");
        for (int i : alterna) {
            System.out.printf("%4d ", i);
        }
    }
}
