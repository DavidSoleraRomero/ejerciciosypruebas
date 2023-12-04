package CAP07.BIDIMENSIONAL;

/* Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8. */
public class Ejercicio8 {
    public static void main(String[] args) {
        String[][] tablero = new String[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = obtenLetra(j + 1) + (i + 1);
            }
        }
        System.out.print("Introduce la letra en la que se encuentra el alfil (columna): ");
        String letra = System.console().readLine();
        int letraN = obtenNumero(letra);
        System.out.print("Introduce la fila en la que se encuentra el alfil: ");
        int fila = Integer.parseInt(System.console().readLine());
        pintaTablero(tablero, fila, letraN);
        String movimiento = "";
        for (int i = 0; i < 7; i++) {
            if (fila + i >= 0 & letraN + i >= 0 & letraN + i < 8 & fila + i < 8) {
                movimiento = movimiento + tablero[fila + i][letraN + i] + " ";
            }
            if (fila + i >= 0 & letraN - 2 - i >= 0 & letraN - 2 - i < 8 & fila + i < 8) {
                movimiento = movimiento + tablero[fila + i][letraN - 2 - i] + " ";
            }
            if (fila - 2 - i >= 0 & letraN + i >= 0 & letraN + i < 8 & fila - 2 - i >= 0) {
                movimiento = movimiento + tablero[fila - 2 - i][letraN + i] + " ";
            }
            if (fila - 2 - i >= 0 & letraN - 2 - i >= 0 & letraN - 2 - i < 8 & fila - 2 - i >= 0) {
                movimiento = movimiento + tablero[fila - 2 - i][letraN - 2 - i] + " ";
            }
        }
        System.out.printf("Los movimientos que puede hacer son: \n%s", movimiento);
    }

    public static int obtenNumero(String posicion) {
        switch (posicion) {
            case "a":
                return 1;
            case "b":
                return 2;
            case "c":
                return 3;
            case "d":
                return 4;
            case "e":
                return 5;
            case "f":
                return 6;
            case "g":
                return 7;
            default:
                return 8;
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

    public static void pintaLetras() {
        System.out.print(" ");
        for (int i = 0; i < 8; i++) {
            System.out.print(obtenLetra(i + 1));
        }
        System.out.println();
    }

    public static void pintaTablero(String[][] tablero, int fila, int letra) {
        int relleno = 8;
        pintaLetras();
        for (int i = 7; i >= 0; i--) {
            System.out.print(relleno);
            for (int j = 0; j < 8; j++) {
                if (i == fila - 1 & j == letra - 1) {
                    System.out.print("&");
                } else
                    System.out.print(" ");
            }
            System.out.print(relleno);
            relleno--;
            System.out.println();
        }
        pintaLetras();
    }
}
