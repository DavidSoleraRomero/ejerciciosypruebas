package CAP08;

/* Une y amplía los dos programas anteriores de tal forma que se permita
convertir un número entre cualquiera de las siguientes bases: decimal, binario,
hexadecimal y octal. */
public class Ejercicio19 {
    public static void main(String[] args) {
        int opcion = 0;
        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
        } while (opcion < 1 | opcion > 4);
        System.out.print("Introduce el nº a transformar: ");
        String num = System.console().readLine();
        int numDecimal = pasaDecimal(num, opcion);
        pasaBinario(numDecimal);
        pasaHexadecimal(numDecimal);
        pasaOctal(numDecimal);
    }

    public static void menu() {
        System.out.println("Indique a continuación qué número va a introducir: ");
        System.out.println("1. Decimal");
        System.out.println("2. Binario");
        System.out.println("3. Hexadecimal");
        System.out.println("4. Octal");
        System.out.print("Opción: ");
    }

    public static int pasaDecimal(String num, int modo) {
        int numero = 0;
        System.out.println();
        switch (modo) {
            case 1:
                numero = Integer.valueOf(num);
                System.out.printf("Decimal: %d\n", Integer.valueOf(num));
                break;
            case 2:
                numero = Integer.parseInt(String.valueOf(num), 2);
                System.out.printf("Decimal: %d\n", Integer.parseInt(String.valueOf(num), 2));
                break;
            case 3:
                numero = Integer.parseInt(String.valueOf(num), 16);
                System.out.printf("Decimal: %d\n", Integer.parseInt(String.valueOf(num), 16));
                break;
            case 4:
                numero = Integer.parseInt(String.valueOf(num), 8);
                System.out.printf("Decimal: %d\n", Integer.parseInt(String.valueOf(num), 8));
                break;
        }
        return numero;
    }

    public static void pasaBinario(int num) {
        System.out.printf("Binario: %s\n", Integer.toBinaryString(num));
    }

    public static void pasaHexadecimal(int num) {
        System.out.printf("Hexadecimal: %s\n", Integer.toHexString(num));
    }

    public static void pasaOctal(int num) {
        System.out.printf("Octal: %d\n", Integer.valueOf(Integer.toOctalString(num)));
    }
}
