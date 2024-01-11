package CAP09.ejercicio4;

public class Fraccionv2 {

    private static int numerador;
    private static int denominador;

    public Fraccionv2() throws Exception {
        throw new Exception("No es necesario crear una instancia");
    }

    public static int getNumerador() {
        return numerador;
    }

    public static int getDenominador() {
        return denominador;
    }

    public static void setNumerador(int num) {
        numerador = num;
    }

    public static void setDenominador(int den) {
        denominador = den;
    }

    public static void invierte() {
        int aux = numerador;
        numerador = denominador;
        denominador = aux;
    }

    public static void simplifica() {
        int numeroMenor = menor();
        int divisor = -1;
        for (int i = 1; i <= numeroMenor / 2; i++) {
            if (numerador % i == 0 & denominador % i == 0)
                divisor = i;
        }
        if (divisor != -1) {
            numerador = numerador / divisor;
            denominador = denominador / divisor;
        }
    }

    public static void multiplica() {
        System.out.printf("El resultado de %d por %d --> %d\n", numerador, denominador, (numerador * denominador));
    }

    public static void divide() {
        System.out.printf("El resultado de %d entre %d --> %.2f\n", numerador, denominador,
                ((double) numerador / denominador));
    }

    private static int menor() {
        return (numerador > denominador) ? denominador : numerador;
    }

}
