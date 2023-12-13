package CAP07.BIDIMENSIONAL;

public class PruebaExamen3 {
    public static void main(String[] args) {
        String[][] tablero = new String[11][11];
        inicializa(tablero);
        int x = 5;
        int y = 5;
        String modo = "M";
        boolean salir = false;
        boolean borra = false;
        int antX = x;
        int antY = y;
        String opcion = "M";
        do {
            pintaTablero(tablero, x, y, modo, borra, antX, antY);
            antX = x;
            antY = y;
            borra = false;
            menu();
            opcion = System.console().readLine().toUpperCase();
            switch (opcion) {
                case "A":
                    if (y - 1 != 0)
                        y--;
                    else
                        System.out.println("No puede moverse más hacia la izquierda");
                    break;
                case "D":
                    if (y + 1 != 10)
                        y++;
                    else
                        System.out.println("No puede moverse más hacia la derecha");
                    break;
                case "S":
                    if (x + 1 != 10)
                        x++;
                    else
                        System.out.println("No puede moverse más hacia abajo");
                    break;
                case "W":
                    if (x - 1 != 0)
                        x--;
                    else
                        System.out.println("No puede moverse más hacia arriba");
                    break;
                case "P":
                    modo = "P";
                    borra = true;
                    break;
                case "B":
                    modo = "B";
                    borra = true;
                    break;
                case "M":
                    modo = "M";
                    break;
                case "R":
                    borra = true;
                    tablero = rota(tablero);
                    break;
                case "E":
                    borra = true;
                    tablero = espejo(tablero);
                    break;
                case "L":
                    inicializa(tablero);
                    break;
                case "Q":
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    /* aux[columnas - 1 - j][i] = tablero[i][j]; /* Anti horario */
    /* aux[j][filas - 1 - i] = tablero[i][j]; /* Horario */

    public static void pintaTablero(String[][] tablero, int x, int y, String letra, boolean borra, int antX, int antY) {
        if (letra.equals("P") & !borra)
            tablero[antX][antY] = "x ";
        if (letra.equals("B") & !borra)
            tablero[antX][antY] = "  ";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == x & j == y)
                    System.out.printf("%s ", letra);
                else
                    System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public static void inicializa(String[][] tablero) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 | i == 10) {
                    tablero[i][j] = "* ";
                } else if (j == 0 | j == 10) {
                    tablero[i][j] = "* ";
                } else
                    tablero[i][j] = "  ";
            }
        }
    }

    public static String[][] rota(String[][] tablero) {
        int filas = tablero.length;
        int columnas = tablero[0].length;
        String[][] aux = new String[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux[columnas - 1 - j][i] = tablero[i][j]; /* Anti horario */
                /* aux[j][filas - 1 - i] = tablero[i][j]; /* Horario */
            }
        }
        return aux;
    }

    public static String[][] espejo(String[][] tablero) {
        String[][] aux = new String[11][11];
        for (int i = 0; i < 11; i++) {
            int cont = 10;
            for (int j = 0; j < 11; j++) {
                aux[i][j] = tablero[i][cont--];
            }
        }
        return aux;
    }

    public static void menu() {
        System.out.println("A. Izquierda");
        System.out.println("D. Derecha");
        System.out.println("S. Abajo");
        System.out.println("W. Arriba");
        System.out.println("P. Pintar");
        System.out.println("B. Borrar");
        System.out.println("M. Mover");
        System.out.println("R. Rotar en el sentido antihorario");
        System.out.println("E. Espejo horizontal");
        System.out.println("L. Limpiar tablero");
        System.out.println("Q. Salir");
        System.out.print("Opción: ");
    }
}
