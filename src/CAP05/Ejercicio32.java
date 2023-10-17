package CAP05;

/* Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos. */
public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long num = Long.parseLong(System.console().readLine());
        long num2 = num;
        long largo = 0;
        while (num2 > 0) {
            num2 = num2 / 10;
            largo++;
        }
        long pares = 0;
        String paresS = "Dígitos pares:";
        String restoS = "1";
        String comasS = "1";
        for (long i = 1; i <= largo; i++) {
            restoS = restoS + "0";
            if (i > 1) {
                comasS = comasS + "0";
            }
        }
        long resto = Long.parseLong(restoS); /* resto se utiliza para ir sacando las cifras, trabaja con comas */
        long comas = Long.parseLong(comasS); // comas se encarga de eliminar las comas del número que resulta de resto
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
        } else {
            System.out.println("No has introducido ningún dígito par en el número.");
        }
    }
}
