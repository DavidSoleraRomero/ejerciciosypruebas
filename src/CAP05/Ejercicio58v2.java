package CAP05;

public class Ejercicio58v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº: ");
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long acum = 0;
            for (int i = 1; i <= largo; i++) {
                acum = acum + num % 10;
                num /= 10;
            }
            System.out.printf("La media de sus dígitos es de %.2f", (float) acum / largo);
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº entero.");
        }
    }
}
