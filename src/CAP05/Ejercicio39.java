package CAP05;

/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial. */
public class Ejercicio39 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para ver su factorial: ");
        try {
            long factorial = Integer.parseInt(System.console().readLine());
            Funciones.Factorial(factorial);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
