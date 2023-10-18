package CAP05;

/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual. */
public class Ejercicio55 {
    public static void main(String[] args) {
        System.out.print("Introduce un nº para pasar el último dígito a ser el primero: ");
        long num = Long.parseLong(System.console().readLine());
        long num2 = num;
        int largo = 0;
        while (num2 > 0) {
            num2 /= 10;
            largo++;
        }
        long resto = 1;
        long comas = 1;
        for (int i = 1; i <= largo; i++) {
            resto = resto * 10;
            if (i < largo)
                comas = comas * 10;
        }
        String numero = "";
        for (int j = 1; j <= largo; j++) {
            long cifra = num % resto;
            if (j < largo) {
                cifra = cifra / comas;
                comas /= 10;
            }
            resto /= 10;
            if (j == largo)
                numero = cifra + numero;
            else
                numero = numero + cifra;
        }
        System.out.printf("El número da como resultado %d", Long.parseLong(numero));
    }
}