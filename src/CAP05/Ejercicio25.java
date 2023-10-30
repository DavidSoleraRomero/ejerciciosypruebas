package CAP05;

/* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */
public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para verlo al revés: ");
        int num = Integer.parseInt(System.console().readLine());
        String longitud = num + "";
        int suma = 0;
        for (int i = 1; i <= longitud.length(); i++) {
            suma = suma * 10 + (num % 10);
            num /= 10;
        }
        System.out.print("El número al reves es " + suma);
    }
}
