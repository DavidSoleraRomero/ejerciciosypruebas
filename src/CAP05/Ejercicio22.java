package CAP05;

/* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. */
public class Ejercicio22 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("<-- Lista de números primos entre el 2 y el 100 -->");
        System.out.printf("---------------------------------------------------\n%d %d ", 2, 3);
        while (true & num <= 100) {
            int acum = 2;
            while (true & acum <= (num / 2)) {
                if (num % acum == 0) {
                    break;
                }
                if (acum == (num / 2)) {
                    System.out.print(num + " ");
                    break;
                }
                acum++;
            }
            num++;
        }
        System.out.printf("\n---------------------------------------------------");
    }
}