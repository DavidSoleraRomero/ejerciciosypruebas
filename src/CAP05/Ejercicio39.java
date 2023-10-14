package CAP05;

/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial. */
public class Ejercicio39 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para ver su factorial: ");
        int factorial = Integer.parseInt(System.console().readLine());
        long acum = 0;
        long acum2 = 1;
        for (int i = 1; i <= factorial; i++) {
            acum = acum2 * i;
            System.out.printf("%d! = %d\n", i, acum);
            acum2 = acum;
        }
    }
}
