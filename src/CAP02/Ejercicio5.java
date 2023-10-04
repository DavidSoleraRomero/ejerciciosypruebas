package CAP02;

/* Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable. */
public class Ejercicio5 {
    public static void main(String[] args) {
        double euros1, euros2, pesetas1, pesetas2;
        euros1 = 0.00601012;
        pesetas1 = 166.3860;
        euros2 = 4.5;
        pesetas2 = 1982;
        System.out.println(euros2 + " euros equivalen a " + (euros2 * pesetas1) + " pesetas.");
        System.out.printf(pesetas2 + " pesetas equivalen a %.4f euros.", (euros1 * pesetas2));
    }
}
