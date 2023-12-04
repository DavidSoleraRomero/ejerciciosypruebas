package CAP07.BIDIMENSIONAL;

public class Ejercicio8v2 {
    public static void main(String[] args) {
        try {
            String[][] tablero = new String[8][8];
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    tablero[i][j] = obtenLetra(i + 1) + (j + 1);
                }
            }
            System.out.print("Introduce la coordenada (a1 - h8) donde se encuentra el alfil: ");
            String coordenada = System.console().readLine();
            int[] xY = { -1, -1 };
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    if (coordenada.equals(tablero[i][j])) {
                        /* J es la columna, I es la fila */
                        xY[0] = j;
                        xY[1] = i;
                        i = 10;
                        break;
                    }
                }
            }
            if (xY[0] != -1) {
                pintaTablero(xY[0], xY[1]);
                String movimientos = "";
                /* Orden correcto --> xY[1](fila) xY[0](columna) */
                for (int i = 0; i < 7; i++) {
                    if (xY[1] + i + 1 >= 0 & xY[1] + i + 1 < 8 & xY[0] + i + 1 >= 0 & xY[0] + i + 1 < 8)
                        movimientos = movimientos + tablero[xY[1] + i + 1][xY[0] + i + 1] + " ";
                    if (xY[1] + i + 1 >= 0 & xY[1] + 1 + i < 8 & xY[0] - i - 1 >= 0 & xY[0] - i - 1 < 8)
                        movimientos = movimientos + tablero[xY[1] + i + 1][xY[0] - i - 1] + " ";
                    if (xY[1] - i - 1 >= 0 & xY[1] - i - 1 < 8 & xY[0] - i - 1 >= 0 & xY[0] - i - 1 < 8)
                        movimientos = movimientos + tablero[xY[1] - i - 1][xY[0] - i - 1] + " ";
                    if (xY[1] - i - 1 >= 0 & xY[1] - i - 1 < 8 & xY[0] + i + 1 >= 0 & xY[0] + i + 1 < 8)
                        movimientos = movimientos + tablero[xY[1] - i - 1][xY[0] + i + 1] + " ";
                }
                System.out.printf("Puedes mover el alfil a las posiciones:\n%s", movimientos);
            } else
                System.out.println("No hemos podido encontrar esa coordenada. Vuelve a intentarlo.");
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }

    public static String obtenLetra(int i) {
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

    public static void pintaTablero(int x, int y) {
        System.out.println("Pintando el tablero...");
        pintaLetras();
        int cont = 8;
        for (int i = 7; i >= 0; i--) {
            System.out.print(cont);
            for (int j = 7; j >= 0; j--) {
                /* J es la columna, I es la fila */
                if (i == x & j == 7 - y)
                    System.out.print("&");
                else
                    System.out.print(" ");
            }
            System.out.println(cont--);
        }
        pintaLetras();
    }

    public static void pintaLetras() {
        System.out.print(" ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(obtenLetra(i));
        }
        System.out.println();
    }
}
