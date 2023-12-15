package CAP08;

/* Muestra los números capicúa que hay entre 1 y 99999. */
public class Ejercicio16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99999; i++) {
            if (Paquete1a14.esCapicua(i))
                System.out.printf("%d ", i);
        }
    }
}
