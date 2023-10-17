package CAP05;

/* Realiza un conversor del sistema decimal al sistema de “palotes”. */
public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long num = Long.parseLong(System.console().readLine());
        long num2 = num;
        long largo = 0;
        while (num2 > 0) {
            num2 = num2 / 10;
            largo++;
        }
        String restoS = "1";
        System.out.printf("El número %d en decimal es el ", num);
        for (long i = 1; i <= largo; i++) {
            restoS = restoS + "0";
        }
        long resto = Long.parseLong(restoS); /* resto se utiliza para ir sacando las cifras, trabaja con comas */
        String comasS = "1";
        for (long i = 1; i <= largo - 1; i++) {
            comasS = comasS + "0";
        }
        long comas = Long.parseLong(comasS); // comas se encarga de eliminar las comas del número que resulta de resto
        for (long i = 1; i <= largo; i++) {
            long cifras = num % resto;
            if ((i < largo)) { /* Se usa comas a partir del segundo bucle */
                cifras = cifras / comas;
                comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
            }
            for (int j = 1; j <= cifras; j++) {
                System.out.print("| ");
            }
            if (i != largo) {
                System.out.print("- ");
            }
            resto = resto / 10; /* Decrementamos resto para el siguiente bucle */
        }
        System.out.println("en el sistema de palotes.");
    }
}
