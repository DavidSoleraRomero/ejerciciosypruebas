package CAP03;

import java.util.Scanner;

/* Realiza un conversor de Mb a Kb.
 * Realiza un conversor de Kb a Mb.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los MB a pasar a KB:");
        float mb = sc.nextInt();
        System.out.println("Introduce los KB a pasar a MB:");
        float kb = sc.nextInt();
        System.out.println(mb + " MB son " + (mb * 1000) + " KB");
        System.out.println(kb + " KB son " + (kb / 1000) + " MB");
        sc.close();
    }
}
