package CAP07.BIDIMENSIONAL;

/* RECORDATORIO: En los BIDIMENSIONALES, la J equivale a la columna y la I equivale a la fila */
public class Ejercicio8v3 {
    public static void main(String[] args) {
        try {
            String[][] tablero = new String[8][8];
            for (int fila = 0; fila < tablero.length; fila++) {
                for (int columna = 0; columna < tablero.length; columna++) {
                    /* Almacenamos adecuandamente en cada fila de la A a la H --> +1 por fila */
                    tablero[fila][columna] = obtenLetra(columna + 1) + (fila + 1);
                }
            }
            System.out.print("Introduce la posición donde quieres posicionar el alfil: ");
            String posicion = System.console().readLine();
            /* Array para almacenar Fila y Columna del alfil */
            int filaColumna[] = { -1, -1 };
            for (int fila = 0; fila < tablero.length; fila++) {
                for (int columna = 0; columna < tablero.length; columna++) {
                    if (tablero[fila][columna].equals(posicion)) {
                        /* Fila */
                        filaColumna[0] = fila;
                        /* Columna */
                        filaColumna[1] = columna;
                        /* Salir del bucle */
                        fila = 10;
                        break;
                    }
                }
            }
            /* Si encuentra la posición ejecuta el if */
            if (filaColumna[0] != 1) {
                pintaTablero(filaColumna[0], filaColumna[1]);
                String movimientos = "";
                for (int i = 0; i < 7; i++) {
                    String copiaMov = movimientos;
                    if (filaColumna[0] + i + 1 < 8 & filaColumna[1] - i - 1 >= 0)
                        movimientos = movimientos + tablero[filaColumna[0] + i + 1][filaColumna[1] - i - 1] + " ";
                    if (filaColumna[0] + i + 1 < 8 & filaColumna[1] + i + 1 < 8)
                        movimientos = movimientos + tablero[filaColumna[0] + i + 1][filaColumna[1] + i + 1] + " ";
                    if (filaColumna[0] - i - 1 >= 0 & filaColumna[1] - i - 1 >= 0)
                        movimientos = movimientos + tablero[filaColumna[0] - i - 1][filaColumna[1] - i - 1] + " ";
                    if (filaColumna[0] - i - 1 >= 0 & filaColumna[1] + i + 1 < 8)
                        movimientos = movimientos + tablero[filaColumna[0] - i - 1][filaColumna[1] + i + 1] + " ";
                    if (copiaMov.equals(movimientos))
                        break;
                }
                System.out.printf("Las posiciones disponibles para mover son estas:\n%s", movimientos);
            } else
                System.out.println("Lo sentimos, no hemos encontrado esa posición. Vuelva a intentarlo.");
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }

    /*
     * RECORDATORIO: En los BIDIMENSIONALES, la J equivale a la columna y la I
     * equivale a la fila
     */
    public static String obtenLetra(int fila) {
        switch (fila) {
            case 1:
                return "a";
            case 2:
                return "b";
            case 3:
                return "c";
            case 4:
                return "d";
            case 5:
                return "e";
            case 6:
                return "f";
            case 7:
                return "g";
            default:
                return "h";
        }
    }

    /*
     * RECORDATORIO: En los BIDIMENSIONALES, la J equivale a la columna y la I
     * equivale a la fila
     */
    public static void pintaTablero(int fila, int columna) {
        System.out.println("Pintando tablero...");
        int recuento = 1;
        pintaLetras();
        for (int i = 0; i < 8; i++) {
            System.out.print(recuento);
            for (int j = 0; j < 8; j++) {
                if (i == fila & j == columna)
                    System.out.print("&");
                else
                    System.out.print(" ");
            }
            System.out.println(recuento++);
        }
        pintaLetras();
    }

    /*
     * RECORDATORIO: En los BIDIMENSIONALES, la J equivale a la columna y la I
     * equivale a la fila
     */
    public static void pintaLetras() {
        System.out.print(" ");
        for (int i = 0; i < 8; i++) {
            System.out.print(obtenLetra(i + 1));
        }
        System.out.println();
    }
}
