package CAP05;

public class Ejercicio63v4 {
    public static void main(String[] args) {
        try {
            System.out.print("Altura primera pirámide: ");
            int alt1 = Funciones.entradaInt();
            System.out.print("Altura segunda pirámide: ");
            int alt2 = Funciones.entradaInt();
            int mayor = (alt1 >= alt2) ? alt1 : alt2;
            int aux = 1;
            for (int i = 1; i <= mayor; i++) {
                if (alt1 >= alt2) {
                    pintaEspacios(alt1, i);
                    pintaAsteriscos(i);
                    if (i > alt1 - alt2) {
                        if (alt1 - i != 0)
                            System.out.printf("%-" + (alt1 - i) + "s", " ");
                        System.out.print(" ");
                        pintaEspacios(alt2, aux);
                        pintaAsteriscos(aux);
                        aux++;
                    }
                } else {
                    if (i > alt2 - alt1) {
                        pintaEspacios(alt1, aux);
                        pintaAsteriscos(aux);
                        if (alt1 - aux != 0)
                            System.out.printf("%-" + (alt1 - aux) + "s", " ");
                        aux++;
                    } else
                        System.out.printf("%-" + (alt1 * 2 - 1) + "s", " ");
                    System.out.print(" ");
                    pintaEspacios(alt2, i);
                    pintaAsteriscos(i);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("\nError. Se esperaba un nº entero.");
        }
    }

    public static void pintaEspacios(int alt, int i) {
        for (int j = 1; j <= alt - i; j++) {
            System.out.print(" ");
        }
    }

    public static void pintaAsteriscos(int i) {
        for (int j = 1; j <= i * 2 - 1; j++) {
            System.out.print("*");
        }
    }
}
