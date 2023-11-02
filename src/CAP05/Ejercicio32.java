package CAP05;

/* Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos. */
public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        try {
            long num = Long.parseLong(System.console().readLine());
            long largo = Funciones.largo(num);
            long pares = 0;
            String paresS = "Dígitos pares:";
            long resto = Funciones.sacaResto(largo);
            long comas = Funciones.sacaComas(largo);
            int acum = 0;
            for (long i = 1; i <= largo; i++) {
                long cifras = num % resto;
                if ((i < largo)) { /* Se usa comas a partir del segundo bucle */
                    cifras = cifras / comas;
                    comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
                }
                if (cifras % 2 == 0) {
                    paresS = paresS + " " + cifras;
                    pares = pares + cifras;
                    acum++;
                }
                resto = resto / 10; /* Decrementamos resto para el siguiente bucle */
            }
            if (acum != 0) {
                System.out.println(paresS);
                System.out.printf("Suma de los dígitos pares: %d", pares);
            } else
                System.out.println("No has introducido ningún dígito par en el número.");
        } catch (Exception e) {
            System.out.println("Se produjo un error. Se esperaba un nº.");
        }
    }
}
