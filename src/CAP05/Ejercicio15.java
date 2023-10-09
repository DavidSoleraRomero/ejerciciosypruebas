package CAP05;

/* Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25 */
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.print("Introduce una base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un exponente de referencia: ");
        int exponente = Integer.parseInt(System.console().readLine());
        int acum = 0;
        int acum2 = base;
        for (int i = 1; i < exponente + 1; i++) {
            if (i == 1) {
                acum = acum2 * 1;
            } else {
                acum = acum2 * base;
            }
            acum2 = acum;
            System.out.printf("%d elevado a %d = %d\n", base, i, acum);
        }
    }
}
