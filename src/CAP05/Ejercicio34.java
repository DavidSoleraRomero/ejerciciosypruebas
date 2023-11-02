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
        long largo = Funciones.largo(num);
        long largo2 = Funciones.largo(num2);
        String paresS = "";
        String imparesS = "";
        long resto = Funciones.sacaResto(largo);
        long comas = Funciones.sacaComas(largo);
        long resto2 = Funciones.sacaResto(largo2);
        long comas2 = Funciones.sacaComas(largo2);
        for (long i = 1; i <= largo; i++) {
            long cifras = num % resto;
            if ((i < largo)) { /* Se usa comas a partir del segundo bucle */
                cifras = cifras / comas;
                comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
            }
            if (cifras % 2 == 0) {
                paresS = paresS + "" + cifras;
            } else
                imparesS = imparesS + "" + cifras;
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
            } else
                imparesS = imparesS + "" + cifras;
            resto2 = resto2 / 10; /* Decrementamos resto para el siguiente bucle */
        }
        System.out.println("El número formado por dígitos pares: " + paresS);
        System.out.println("El número formado por dígitos impares: " + imparesS);
    }
}