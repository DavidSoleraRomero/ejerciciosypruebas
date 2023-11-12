package CAP05;

public class Ejercicio45v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un número: ");
            long num = Long.parseLong(System.console().readLine());
            System.out.print("Introduce qué dígito quieres insertar: ");
            long inserta = Long.parseLong(System.console().readLine());
            System.out.print("Introduce en qué posición quieres insertarlo: ");
            long posicion = Long.parseLong(System.console().readLine());
            if (posicion <= Funciones.largo(num)) {
                long numIzq = voltea(izq(num, posicion));
                long numDer = voltea(der(num, posicion));
                long nuevoNum = (((numIzq * 10) + inserta) * (long) Math.pow(10, Funciones.largo(numDer))) + numDer;
                System.out.printf("El resultado ha sido %d", nuevoNum);
            } else
                System.out.println("Introduce una posición inferior al largo del número.");
        } catch (Exception e) {
            System.out.println("Se esperaba un nº entero. Se ha producido un error.");
        }
    }

    public static long izq(long num, long posicion) {
        long largo = Funciones.largo(num);
        long izq = 0;
        for (int i = 1; i <= largo; i++) {
            long cifra = num % 10;
            num /= 10;
            if (i > (largo - posicion + 1))
                izq = izq * 10 + cifra;
        }
        return izq;
    }

    public static long der(long num, long posicion) {
        long largo = Funciones.largo(num);
        long der = 0;
        for (int i = 1; i <= largo; i++) {
            long cifra = num % 10;
            num /= 10;
            if (i < (largo - posicion + 1))
                der = der * 10 + cifra;
        }
        return der;
    }

    public static long voltea(long num) {
        long largo = Funciones.largo(num);
        long volteado = 0;
        for (int i = 1; i <= largo; i++) {
            long cifra = num % 10;
            num /= 10;
            volteado = volteado * 10 + cifra;
        }
        return volteado;
    }
}