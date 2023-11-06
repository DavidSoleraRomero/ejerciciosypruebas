package CAP05;

public class Ejercicio43v4 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un número: ");
            long numero = Long.parseLong(System.console().readLine());
            System.out.print("Introduce en qué posición quieres partirlo: ");
            long posicion = Long.parseLong(System.console().readLine());
            System.out.print("Parte 1: " + izquierda(numero, posicion) + " Parte 2: " + derecha(numero, posicion));
        } catch (Exception e) {
            System.out.println("Se esperaba un nº.");
        }
    }

    public static long largo(long num) {
        long largo = 0;
        while (num > 0) {
            num /= 10;
            largo++;
        }
        return largo;
    }

    public static long resto(long num) {
        long resto = 1;
        while (num > 0) {
            resto *= 10;
            num /= 10;
        }
        return resto;
    }

    public static long izquierda(long num, long posicion) {
        long resto = resto(num);
        long comas = resto / 10;
        long numIzq = 0;
        for (int i = 1; i < posicion; i++) {
            long cifra = num % resto;
            resto /= 10;
            cifra = cifra / comas;
            comas /= 10;
            numIzq = numIzq * 10 + cifra;
        }
        return numIzq;
    }

    public static long derecha(long num, long posicion) {
        long largo = largo(num);
        num = num % (long) Math.pow(10, largo - posicion + 1);
        String numDer = "";
        for (long i = posicion; i <= largo; i++) {
            long cifra = num % 10;
            num /= 10;
            numDer = cifra + "" + numDer;
        }
        return Long.parseLong(numDer);
    }
}
