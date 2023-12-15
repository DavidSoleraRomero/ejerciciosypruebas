package CAP08;

/* Muestra los números primos que hay entre 1 y 1000. */
public class Ejercicio15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (Paquete1a14.esPrimo(i))
                System.out.printf("%d ", i);
        }
    }
}
