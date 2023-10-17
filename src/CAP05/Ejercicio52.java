package CAP05;

/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual. */
public class Ejercicio52 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para pasar el primer número a ser el último: ");
        long num = Long.parseLong(System.console().readLine());
        long num2 = num;
        short largo = 0;
        long resto = 1;
        long comas = 1;
        while (num2 > 0) {
            num2 /= 10;
            largo++;
            resto = resto * 10;
            if (num2 == 0)
                comas = resto / 10;
        }
        String numCompleto = "";
        short guardaN = 0;
        for (short i = 1; i <= largo; i++) {
            long cifra = num % resto;
            if (i < largo) {
                cifra = cifra / comas;
                comas /= 10;
            }
            if (i == 1)
                guardaN = (short) cifra;
            else
                numCompleto = numCompleto + cifra;
            resto /= 10;
        }
        numCompleto = numCompleto + guardaN;
        System.out.printf("El número da como resultado %d", Long.parseLong(numCompleto));
    }
}