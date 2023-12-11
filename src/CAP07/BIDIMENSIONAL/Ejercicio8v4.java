package CAP07.BIDIMENSIONAL;

import java.util.Arrays;

/* RECORDATORIO: En los BIDIMENSIONALES, la J equivale a la columna y la I equivale a la fila */
public class Ejercicio8v4 {
    public static void main(String[] args) {
        String[][] tablero = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = devuelveLetra((j + 1)) + (i + 1);
            }
        }
        boolean dentro = false;
        int[] poss = { -1, -1 };
        do {
            System.out.print("Introduce en qué posición está el alfil: ");
            String pos = System.console().readLine();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (pos.equals(tablero[i][j])) {
                        dentro = true;
                        poss[0] = i;
                        poss[1] = j;
                    }
                }
            }
        } while (!dentro);
        String movimientos = "";
        String[] superior = new String[14];
        int contSup = 0;
        String[] inferior = new String[14];
        int contInf = 0;
        for (int i = 1; i <= 7; i++) {
            if (poss[0] + i < 8 & poss[1] + i < 8) {
                movimientos = movimientos + tablero[poss[0] + i][poss[1] + i] + " ";
                superior[contSup++] = tablero[poss[0] + i][poss[1] + i];
            }
            if (((poss[0] + i) < 8) & ((poss[1] - i) > -1)) {
                movimientos = movimientos + tablero[poss[0] + i][poss[1] - i] + " ";
                superior[contSup++] = tablero[poss[0] + i][poss[1] - i];
            }
            if (poss[0] - i > -1 & poss[1] + i < 8) {
                movimientos = movimientos + tablero[poss[0] - i][poss[1] + i] + " ";
                inferior[contInf++] = tablero[poss[0] - i][poss[1] + i];
            }
            if (poss[0] - i > -1 & poss[1] - i > -1) {
                movimientos = movimientos + tablero[poss[0] - i][poss[1] - i] + " ";
                inferior[contInf++] = tablero[poss[0] - i][poss[1] - i];
            }
        }
        pintaTablero(poss, superior, inferior, tablero);
        System.out.printf("\nLos movimientos disponibles para esa posición son:\n%s", movimientos);
    }

    public static String devuelveLetra(int i) {
        switch (i) {
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

    public static void pintaTablero(int[] poss, String[] sup, String[] inf, String[][] tab) {
        System.out.printf("\u001B[1;30m %s\u001B[0m\n", "abcdefgh"); // Colorear encabezado en gris
        int cont = 1;
        for (int j = 0; j < 8; j++) {
            System.out.print("\u001B[1;30m" + cont + "\u001B[0m"); // Colorear números de fila en gris
            for (int i = 0; i < 8; i++) {
                if (i == poss[1] && j == poss[0])
                    System.out.print("\u001B[1;34m&\u001B[0m"); // Colorear & en azul
                else if (Arrays.asList(sup).contains(tab[j][i]) || Arrays.asList(inf).contains(tab[j][i]))
                    System.out.print("\u001B[1;31mX\u001B[0m"); // Colorear X en rojo
                else
                    System.out.print(" ");
            }
            System.out.println("\u001B[1;30m" + cont++ + "\u001B[0m");
        }
        System.out.printf("\u001B[1;30m %s\u001B[0m", "abcdefgh");
    }

    public static int[] sacaPosiciones(String pos, String[][] tablero) {
        int[] posiciones = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j].equals(pos)) {
                    posiciones[0] = i;
                    posiciones[1] = j;
                }
            }
        }
        return posiciones;
    }
}
