package CAP03;

/* Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado. */
public class Ejercicio3 {
    public static void main(String[] args) {
        float euros1 = 0.00601012f;
        float pesetas1 = 166.3860f;
        System.out.println("Euros a pesetas:");
        float euros2 = Float.parseFloat(System.console().readLine());
        System.out.println("Pesetas a euros:");
        float pesetas2 = Float.parseFloat(System.console().readLine());
        System.out.println(euros2 + " euros en pesetas son " + (euros2 * pesetas1));
        System.out.println(pesetas2 + " pesetas en euros son " + (pesetas2 * euros1));
    }
}