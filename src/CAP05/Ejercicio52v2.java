package CAP05;

public class Ejercicio52v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº para pasar la primera posición a la última: ");
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long primerDigito = num / (long) (Math.pow(10, largo - 1));
            num = num % (long) (Math.pow(10, largo - 1));
            num = num * 10 + primerDigito;
            System.out.printf("El número resultante ha sido %d", num);
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
