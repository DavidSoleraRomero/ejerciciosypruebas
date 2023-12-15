package CAP08;

/* Escribe un programa que pase de binario a decimal. */
public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.print("Introduce un número en binario: ");
        int num = Integer.parseInt(System.console().readLine());
        int largo = Paquete1a14.digitos(num);
        if (esBinario(num, largo)) {
            num = pasaADecimal(num, largo);
            System.out.printf("El número resultante en decimal ha sido el %d", num);
        } else {
            System.out.println("Introduzca un nº binario por favor");
        }
    }

    public static boolean esBinario(int num, int largo) {
        boolean binario = true;
        for (int i = 1; i <= largo & binario; i++) {
            if (num % 10 != 1 & num % 10 != 0)
                binario = false;
            num /= 10;
        }
        return binario;
    }

    public static int pasaADecimal(int num, int largo) {
        int numActual = 1;
        int nuevoNum = 0;
        for (int i = 1; i <= largo; i++) {
            if (num % 10 == 1)
                nuevoNum = nuevoNum + numActual;
            numActual *= 2;
            num /= 10;
        }
        return nuevoNum;
    }
}
