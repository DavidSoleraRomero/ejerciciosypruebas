package CAP05;

public class Ejercicio55v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº para pasar el último dígito al primero: ");
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long ultimo = num % 10;
            num = num / 10;
            ultimo = ultimo * (long) (Math.pow(10, largo - 1)) + num;
            System.out.printf("El número generado ha sido el %d", ultimo);
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº.");
        }
    }
}
