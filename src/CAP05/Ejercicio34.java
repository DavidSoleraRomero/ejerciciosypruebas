package CAP05;

/* Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos. */
public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        long num = Long.parseLong(System.console().readLine());
        System.out.print("Introduce el segundo número: ");
        long num2 = Long.parseLong(System.console().readLine());
        long numLargo = num;
        long numLargo2 = num2;
        long largo = 0;
        while (true) {
            numLargo = numLargo / 10;
            largo++;
            if ((numLargo % 10 == 0) && ((numLargo / 10) % 10 == 0) && ((numLargo / 100) % 10 == 0)
                    && ((numLargo / 1000) % 10 == 0) && ((numLargo / 10000) % 10 == 0)) {
                break;
            }
        }
        long largo2 = 0;
        while (true) {
            numLargo2 = numLargo2 / 10;
            largo2++;
            if ((numLargo2 % 10 == 0) && ((numLargo2 / 10) % 10 == 0) && ((numLargo2 / 100) % 10 == 0)
                    && ((numLargo2 / 1000) % 10 == 0) && ((numLargo2 / 10000) % 10 == 0)) {
                break;
            }
        }
        String paresS = "";
        String imparesS = "";
        String restoS = "1";
        String comasS = "1";
        for (long i = 1; i <= largo; i++) {
            restoS = restoS + "0";
            if (i > 1) {
                comasS = comasS + "0";
            }
        }
        String restoS2 = "1";
        String comasS2 = "1";
        for (long i = 1; i <= largo2; i++) {
            restoS2 = restoS2 + "0";
            if (i > 1) {
                comasS2 = comasS2 + "0";
            }
        }
        long resto = Long.parseLong(restoS); /* resto se utiliza para ir sacando las cifras, trabaja con comas */
        long comas = Long.parseLong(comasS); // comas se encarga de eliminar las comas del número que resulta de resto
        long resto2 = Long.parseLong(restoS2);
        long comas2 = Long.parseLong(comasS2);
        for (long i = 1; i <= largo; i++) {
            long cifras = num % resto;
            if ((i < largo)) { /* Se usa comas a partir del segundo bucle */
                cifras = cifras / comas;
                comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
            }
            if (cifras % 2 == 0) {
                paresS = paresS + "" + cifras;
            } else {
                imparesS = imparesS + "" + cifras;
            }
            resto = resto / 10; /* Decrementamos resto para el siguiente bucle */
        }
        for (long i = 1; i <= largo2; i++) {
            long cifras = num2 % resto2;
            if ((i < largo2)) { /* Se usa comas a partir del segundo bucle */
                cifras = cifras / comas2;
                comas2 = comas2 / 10; /* Decrementamos comas para el siguiente bucle */
            }
            if (cifras % 2 == 0) {
                paresS = paresS + "" + cifras;
            } else {
                imparesS = imparesS + "" + cifras;
            }
            resto2 = resto2 / 10; /* Decrementamos resto para el siguiente bucle */
        }
        System.out.println("El número formado por dígitos pares: " + paresS);
        System.out.println("El número formado por dígitos impares: " + imparesS);
    }
}
