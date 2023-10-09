package CAP05;

/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while. */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 5 de 0 a 100");
        boolean i = true;
        int acum = 5;
        while (i) {
            System.out.print(acum + " ");
            acum += 5;
            if (acum > 100) {
                i = false;
            }
        }
    }
}
