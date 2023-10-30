package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7: */
public class Ejercicio12 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[10];
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Introduce un número: ");
                int num = Integer.parseInt(System.console().readLine());
                numeros[i] = num;
            }
            System.out.print("Introduce la posición que quieres cambiar: ");
            int inicial = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce la posición en la que quieres insertarlo: ");
            int concluye = Integer.parseInt(System.console().readLine());
            if (inicial < concluye & inicial > 1 & inicial <= 9 & concluye > -1 & concluye <= 9) {
                int primero = numeros[numeros.length - 1];
                int[] organiza = new int[10];
                for (int i = 0; i < numeros.length; i++) {
                    if (i == concluye)
                        organiza[i] = numeros[inicial];
                    else if (i == 0)
                        organiza[i] = primero;
                    else if (i > inicial & i < concluye)
                        organiza[i] = numeros[i];
                    else
                        organiza[i] = numeros[i - 1];
                }
                System.out.println("Array original: ");
                System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5, 6,
                        7, 8, 9, "Contenido");
                for (int i : numeros) {
                    System.out.printf("%4d ", i);
                }
                System.out.println("\nArray organizado: ");
                System.out.printf("%-9s %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d\n%9s ", "Índice", 0, 1, 2, 3, 4, 5, 6,
                        7, 8, 9, "Contenido");
                for (int i : organiza) {
                    System.out.printf("%4d ", i);
                }
            } else
                System.out.println("Se esperaba un número >= 0 y <= 9. Inicial debe ser mayor que donde se inserta");
        } catch (Exception e) {
            System.out.println("Error. Se esperaba un número.");
        }
    }
}