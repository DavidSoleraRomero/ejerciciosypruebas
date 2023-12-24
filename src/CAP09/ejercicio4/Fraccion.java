package CAP09.ejercicio4;

public abstract class Fraccion {

    private static int denominador;
    private static int numerador;

    public static int getDenominador() {
        return denominador;
    }

    public static int getNumerador() {
        return numerador;
    }

    public static void setDenominador(int denominador) {
        Fraccion.denominador = denominador;
    }

    public static void setNumerador(int numerador) {
        Fraccion.numerador = numerador;
    }

    public static void invierte() {
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
    }

    public static void simplifica() {
        int minimo = Fraccion.minimo(numerador, denominador);
        int divisor = 0;
        for (int i = 1; i <= minimo / 2; i++) {
            if (denominador % i == 0 & numerador % i == 0)
                divisor = i;
        }
        if (divisor != 0) {
            numerador /= divisor;
            denominador /= divisor;
        }
    }

    public static int multiplica() {
        return numerador * denominador;
    }

    public static double divide() {
        return numerador / denominador;
    }

    public static int suma() {
        return numerador + denominador;
    }

    public static int resta() {
        return numerador - denominador;
    }

    public static int eleva() {
        return (int) Math.pow(numerador, denominador);
    }

    private static int minimo(int n, int x) {
        return (n < x) ? n : x;
    }

}
