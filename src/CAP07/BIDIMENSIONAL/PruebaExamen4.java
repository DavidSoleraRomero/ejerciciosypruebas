package CAP07.BIDIMENSIONAL;

public class PruebaExamen4 {
    public static void main(String[] args) {
        String[][] pintar = new String[11][11];
        inicializa(pintar);
        int x = 5;
        int y = 5;
        int antX = x;
        int antY = y;
        String modo = "M";
        boolean pinta = true;
        boolean salir = false;
        do {
            pintaTablero(pintar, modo, x, y, antX, antY, pinta);
            pinta = true;
            antX = x;
            antY = y;
            menu();
            String opcion = String.valueOf(System.console().readLine().charAt(0)).toUpperCase();
            System.out.println(opcion);
            if (opcion.equals("W")) {
                if (x - 1 != 0)
                    x--;
            } else if (opcion.equals("A")) {
                if (y - 1 != 0)
                    y--;
            } else if (opcion.equals("S")) {
                if (x + 1 != 10)
                    x++;
            } else if (opcion.equals("D")) {
                if (y + 1 != 10)
                    y++;
            } else if (opcion.equals("M")) {
                modo = "M";
            } else if (opcion.equals("P")) {
                pinta = false;
                modo = "P";
            } else if (opcion.equals("B")) {
                pinta = false;
                modo = "B";
            } else if (opcion.equals("E")) {
                pinta = false;
                pintar = espejo(pintar);
            } else if (opcion.equals("R")) {
                pinta = false;
                pintar = rotaAntihorario(pintar);
            } else if (opcion.equals("L")) {
                inicializa(pintar);
            } else if (opcion.equals("Q")) {
                salir = true;
            } else if (opcion.equals("T")) {
                pinta = false;
                pintar = rotaHorario(pintar);
            } else {
                pinta = false;
            }
        } while (!salir);
    }

    public static void pintaTablero(String[][] pintar, String modo, int x, int y, int antX, int antY, boolean pinta) {
        if (modo.equals("P") & pinta)
            pintar[antX][antY] = "x ";
        if (modo.equals("B") & pinta)
            pintar[antX][antY] = "  ";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == x & j == y)
                    System.out.printf("%s ", modo);
                else
                    System.out.print(pintar[i][j]);
            }
            System.out.println();
        }
    }

    public static void inicializa(String[][] pintar) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 | i == 10) {
                    pintar[i][j] = "* ";
                } else {
                    if (j == 0 | j == 10)
                        pintar[i][j] = "* ";
                    else
                        pintar[i][j] = "  ";
                }

            }
        }
    }

    public static String[][] espejo(String[][] pintar) {
        String[][] aux = new String[11][11];
        for (int i = 0; i < 11; i++) {
            int cont = 10;
            for (int j = 0; j < 11; j++) {
                aux[i][j] = pintar[i][cont--];
            }
        }
        return aux;
    }

    public static String[][] rotaAntihorario(String[][] pintar) {
        String[][] aux = new String[11][11];
        int columna = aux[0].length;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                aux[columna - 1 - j][i] = pintar[i][j];
            }
        }
        return aux;
    }

    public static String[][] rotaHorario(String[][] pintar) {
        String[][] aux = new String[11][11];
        int fila = aux.length;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                aux[j][fila - i - 1] = pintar[i][j];
            }
        }
        return aux;
    }

    public static void menu() {
        System.out.println("W. Arriba");
        System.out.println("A. Izquierda");
        System.out.println("S. Abajo");
        System.out.println("D. Derecha");
        System.out.println("M. Movimiento");
        System.out.println("P. Pintar");
        System.out.println("B. Borrar");
        System.out.println("E. Espejo");
        System.out.println("R. Rotar en sentido antihorario");
        System.out.println("T. Rotar en sentido horario");
        System.out.println("L. Limpiar tablero");
        System.out.println("Q. Salir");
        System.out.print("Opción: ");
    }
}
