package CAP05;

public class Ejercicio43v6 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº para dividirlo en 2: ");
            long num = Long.parseLong(System.console().readLine());
            System.out.print("Introduce en qué posición quieres partirlo: ");
            long posicion = Long.parseLong(System.console().readLine());
            if (posicion > 0 & posicion < Funciones.largo(num)) {
                System.out.print("Parte 1 del nº: ");
                System.out.print(izquierda(num, posicion));
                System.out.print("\nParte 2 del nº: ");
                System.out.print(derecha(num, posicion));
            } else
                System.out.println("Introduce una posición razonable al largo del nº.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un Nº ENTERO.");
        }
    }

    public static long izquierda(long num, long posicion) {
        long izquierda = 0;
        long largo = Funciones.largo(num);
        for (int i = 1; i <= largo; i++) {
            long cifra = num % 10;
            num /= 10;
            if (i > largo - posicion + 1)
                izquierda = izquierda * 10 + cifra;
        }
        return Funciones.voltea(izquierda);
    }

    public static long derecha(long num, long posicion) {
        long derecha = 0;
        long largo = Funciones.largo(num);
        for (int i = 1; i <= largo; i++) {
            long cifra = num % 10;
            num /= 10;
            if (i <= largo - posicion + 1)
                derecha = derecha * 10 + cifra;
        }
        return Funciones.voltea(derecha);
    }
}
