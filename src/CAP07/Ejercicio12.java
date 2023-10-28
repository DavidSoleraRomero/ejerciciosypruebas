package CAP07;

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
        int primero = numeros[numeros.length - 1];
        int[] organiza = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            if (i == concluye)
                organiza[i] = numeros[inicial];
            else if (i == 0)
                organiza[i] = primero;
            else if (i == numeros.length - 1)
                organiza[i] = numeros[i - 1];
            else if (i > inicial & i < concluye)
                organiza[i] = numeros[i];
            else
                organiza[i] = numeros[i - 1];
        }
        System.out.println("Array modificado:");
        for (int i : organiza) {
            System.out.print(i + " ");
        }
    }
}
