package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7: */
public class Ejercicio12v2 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[10];
            System.out.printf("%-21s", "Array original --> ");
            for (int i = 0; i <= 9; i++) {
                System.out.printf("%4d", i);
            }
            System.out.printf("\n%-21s", "Valores --> ");
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 201);
                System.out.printf("%4d", numeros[i]);
            }
            System.out.print("\n\nIntroduce índice inicial: ");
            int inicial = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce índice final: ");
            int inicial2 = Integer.parseInt(System.console().readLine());
            if (inicial >= 0 & inicial <= 9 & inicial2 >= 0 & inicial2 <= 9 & inicial < inicial2) {
                int[] aux = new int[10];
                for (int i = 0; i < aux.length; i++) {
                    if (i == 0 & i < inicial)
                        aux[i] = numeros[numeros.length - 1];
                    else if (i > inicial2 | i <= inicial) {
                        aux[i] = numeros[i - 1];
                    } else
                        aux[i] = numeros[i];
                }
                aux[inicial2] = numeros[inicial];
                System.out.printf("\n%-21s", "Array modificado --> ");
                for (int i = 0; i <= 9; i++) {
                    System.out.printf("%4d", i);
                }
                System.out.printf("\n%-21s", "Valores --> ");
                for (int i : aux) {
                    System.out.printf("%4d", i);
                }
            } else
                System.out.println("Por favor, introduzca inicial inferior a final y ambos entre 0 y 9");
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
