package CAP05;

/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for. */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 5 de 0 a 100");
        for (int i = 5; i < 101; i += 5) {
            System.out.print(i + " ");
        }
    }
}
