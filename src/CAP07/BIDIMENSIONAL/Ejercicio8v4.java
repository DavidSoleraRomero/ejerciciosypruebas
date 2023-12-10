package CAP07.BIDIMENSIONAL;

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
        pintaTablero(poss);
        String movimientos = "";
        for (int i = 1; i <= 7; i++) {
            if (poss[0] + i < 8 & poss[1] + i < 8) {
                movimientos = movimientos + tablero[poss[0] + i][poss[1] + i] + " ";
            }
            if (((poss[0] + i) < 8) & ((poss[1] - i) > -1)) {
                movimientos = movimientos + tablero[poss[0] + i][poss[1] - i] + " ";
            }
            if (poss[0] - i > -1 & poss[1] + i < 8) {
                movimientos = movimientos + tablero[poss[0] - i][poss[1] + i] + " ";
            }
            if (poss[0] - i > -1 & poss[1] - i > -1) {
                movimientos = movimientos + tablero[poss[0] - i][poss[1] - i] + " ";
            }
        }
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

    public static void pintaTablero(int[] poss) {
        System.out.printf(" %s", "abcdefgh\n");
        int cont = 1;
        for (int j = 0; j < 8; j++) {
            System.out.print(cont);
            for (int i = 0; i < 8; i++) {
                if (i == poss[1] & j == poss[0])
                    System.out.print("&");
                else
                    System.out.print(" ");
            }
            System.out.println(cont++);
        }
        System.out.printf(" %s", "abcdefgh");
    }
}
