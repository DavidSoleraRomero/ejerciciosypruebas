package CAP03;

/* Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación. */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer número:");
        int primer = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el segundo número:");
        int segundo = Integer.parseInt(System.console().readLine());
        System.out.println("Su multiplicación da: " + (primer * segundo));
    }
}
