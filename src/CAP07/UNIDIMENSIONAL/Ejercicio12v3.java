package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7: */
public class Ejercicio12v3 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[10];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 101);
                System.out.printf("%d ", numeros[i]);
            }
            System.out.print("\nPosición inicial: ");
            int inicial = Integer.parseInt(System.console().readLine());
            System.out.print("Posición final: ");
            int acaba = Integer.parseInt(System.console().readLine());
            int[] aux = new int[10];
            int ultNum = numeros[aux.length - 1];
            for (int i = 1; i < aux.length; i++) {
                if (i <= inicial | i > acaba) {
                    aux[i] = numeros[i - 1];
                } else
                    aux[i] = numeros[i];
            }
            aux[acaba] = numeros[inicial];
            aux[0] = ultNum;
            for (int i : aux) {
                System.out.printf("%d ", i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
