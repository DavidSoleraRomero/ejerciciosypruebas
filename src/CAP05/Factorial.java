package CAP05;

/* Sacamos el factorial de un nº con una función */
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Introduce un número para ver su factorial: ");
        long num = Integer.parseInt(System.console().readLine());
        if (num >= 1) {
            Funciones.Factorial(num);
            System.out.printf("El factorial de %d es %d", num, Funciones.sacaFactorial(num));
        } else if (num == 0) {
            System.out.println("0! = 1");
            System.out.println("El factorial de 0 es 1");
        } else {
            System.out.println("No puedo calcular el factorial de 0 ni de un número negativo.");
        }
    }
}
