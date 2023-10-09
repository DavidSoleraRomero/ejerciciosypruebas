package CAP05;

/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while. */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 5 de 0 a 100");
        boolean i = true;
        int acum = 0;
        do {
            acum += 5;
            System.out.print(acum + " ");
            if (acum == 100) {
                i = false;
            }
        } while (i);
    }
}
