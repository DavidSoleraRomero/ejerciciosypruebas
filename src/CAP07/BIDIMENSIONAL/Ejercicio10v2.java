package CAP07.BIDIMENSIONAL;

/* Realiza el juego de las tres en raya. */
public class Ejercicio10v2 {
    public static void main(String[] args) {
        String[][] tablero = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = " ";
            }
        }
        boolean ganador = false;
        do {
            pintaTablero(tablero);
            int x = -1;
            int y = -1;
            do {
                do {
                    System.out.print("Introduce la posición X donde quieres introducir tu X (0-2): ");
                    x = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduce la posición Y donde quieres introducir tu X (0-2): ");
                    y = Integer.parseInt(System.console().readLine());
                } while (x < 0 | x > 3 | y < 0 | y > 3);
                if (tablero[x][y].equals("X") | tablero[x][y].equals("Y"))
                    System.out.println("Posición ya ocupada. Inserte otra.");
            } while (tablero[x][y].equals("X") | tablero[x][y].equals("O"));
            tablero[x][y] = "X";
            if ((tablero[0][0].equals("X") & tablero[0][1].equals("X") & tablero[0][2].equals("X")) |
                    (tablero[1][0].equals("X") & tablero[1][1].equals("X") & tablero[1][2].equals("X")) |
                    (tablero[2][0].equals("X") & tablero[2][1].equals("X") & tablero[2][2].equals("X")) |
                    (tablero[0][0].equals("X") & tablero[1][0].equals("X") & tablero[2][0].equals("X")) |
                    (tablero[0][1].equals("X") & tablero[1][1].equals("X") & tablero[2][1].equals("X")) |
                    (tablero[0][2].equals("X") & tablero[1][2].equals("X") & tablero[2][2].equals("X")) |
                    (tablero[0][0].equals("X") & tablero[1][1].equals("X") & tablero[2][2].equals("X")) |
                    (tablero[2][0].equals("X") & tablero[1][1].equals("X") & tablero[0][2].equals("X"))) {
                System.out.println("\nFelicidades! Has ganado jugador!\n");
                break;
            }
            do {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
            } while (tablero[x][y].equals("X") | tablero[x][y].equals("O"));
            tablero[x][y] = "O";
            if (((tablero[0][0].equals("O") & tablero[0][1].equals("O") & tablero[0][2].equals("O")) |
                    (tablero[1][0].equals("O") & tablero[1][1].equals("O") & tablero[1][2].equals("O")) |
                    (tablero[2][0].equals("O") & tablero[2][1].equals("O") & tablero[2][2].equals("O")) |
                    (tablero[0][0].equals("O") & tablero[1][0].equals("O") & tablero[2][0].equals("O")) |
                    (tablero[0][1].equals("O") & tablero[1][1].equals("O") & tablero[2][1].equals("O")) |
                    (tablero[0][2].equals("O") & tablero[1][2].equals("O") & tablero[2][2].equals("O")) |
                    (tablero[0][0].equals("O") & tablero[1][1].equals("O") & tablero[2][2].equals("O")) |
                    (tablero[2][0].equals("O") & tablero[1][1].equals("O") & tablero[0][2].equals("O")))) {
                System.out.println("\nLo sentimos jugador, la máquina ha ganado\n");
                ganador = true;
            }
        } while (!ganador);
        pintaTablero(tablero);
    }

    public static void pintaTablero(String[][] tab) {
        int cont = 0;
        System.out.println(" 012 ");
        for (int i = 0; i < 3; i++) {
            System.out.print(cont);
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println(cont++);
        }
        System.out.println(" 012 ");
    }
}
