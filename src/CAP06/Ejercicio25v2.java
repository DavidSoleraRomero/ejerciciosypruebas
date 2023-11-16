package CAP06;

/* Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]). */
public class Ejercicio25v2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int random = (int) ((Math.random() * 191) + 10);
            boolean primo = (primo(random));
            if (random % 5 == 0)
                System.out.printf("[%d] ", random);
            else if (primo == true)
                System.out.printf("#%d# ", random);
            else
                System.out.printf("%d ", random);
        }
    }

    public static boolean primo(int num) {
        int acum = 2;
        boolean primoE = true;
        while (primoE == true & acum <= num / 2) {
            if (num % acum == 0)
                primoE = false;
            acum++;
        }
        return primoE;
    }
}
