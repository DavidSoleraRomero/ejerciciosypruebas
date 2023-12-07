package CAP07.BIDIMENSIONAL;

/* Realiza el juego de las tres en raya. */
public class Ejercicio10 {
    public static void main(String[] args) {
        String[][] tablero = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = " ";
            }
        }
        boolean ganador = false;
        int cont = 1;
        pintaTablero(tablero);
        System.out.println("\n¿Quieres jugar con X o con O? (1 - X | 2 - O): ");
        int opcion = Integer.parseInt(System.console().readLine());
        String jug = "";
        String maq = "";
        if (opcion == 1) {
            jug = "X";
            maq = "O";
        } else {
            jug = "O";
            maq = "X";
        }
        do {
            int fila = 0;
            int columna = 0;
            boolean posicion = true;
            do {
                do {
                    System.out.print("\nIntroduce la fila en la que quieres insertar (1-3): ");
                    fila = Integer.parseInt(System.console().readLine());
                    System.out.print("Introduce la columna en la que quieres insertar (1-3): ");
                    columna = Integer.parseInt(System.console().readLine());
                } while ((fila < 1 | fila > 3 | columna < 1 | columna > 3));
                if (tablero[fila - 1][columna - 1].equals(" ")) {
                    tablero[fila - 1][columna - 1] = jug;
                    posicion = false;
                } else if (tablero[fila - 1][columna - 1].equals(maq)) {
                    System.out.println("\nLa máquina ya ha escrito en esa posición. Inténtelo en otra\n");
                } else if (tablero[fila - 1][columna - 1].equals(jug))
                    System.out.println("\nYa has escrito en esa posición. Inténtalo de nuevo.\n");
            } while (posicion == true);
            if ((tablero[0][0].equals(jug) & tablero[1][0].equals(jug) & tablero[2][0].equals(jug))
                    | (tablero[0][1].equals(jug) & tablero[1][1].equals(jug) & tablero[2][1].equals(jug))
                    | (tablero[0][2].equals(jug) & tablero[1][2].equals(jug) & tablero[2][2].equals(jug))
                    | (tablero[0][0].equals(jug) & tablero[0][1].equals(jug) & tablero[0][2].equals(jug))
                    | (tablero[1][0].equals(jug) & tablero[1][1].equals(jug) & tablero[1][2].equals(jug))
                    | (tablero[2][0].equals(jug) & tablero[2][1].equals(jug) & tablero[2][2].equals(jug))
                    | (tablero[0][0].equals(jug) & tablero[1][1].equals(jug) & tablero[2][2].equals(jug))
                    | (tablero[2][0].equals(jug) & tablero[1][1].equals(jug) & tablero[0][2].equals(jug))) {
                System.out.println("\n¡Felicidades jugador! Has ganado");
                ganador = true;
            }
            cont++;
            int filaMaq = 0;
            int columnaMaq = 0;
            posicion = true;
            if (!ganador & cont != 6)
                do {
                    filaMaq = (int) (Math.random() * 3);
                    columnaMaq = (int) (Math.random() * 3);
                    if (tablero[filaMaq][columnaMaq].equals(" ")) {
                        tablero[filaMaq][columnaMaq] = maq;
                        posicion = false;
                    }
                } while (posicion);
            if ((tablero[0][0].equals(maq) & tablero[1][0].equals(maq) & tablero[2][0].equals(maq))
                    | (tablero[0][1].equals(maq) & tablero[1][1].equals(maq) & tablero[2][1].equals(maq))
                    | (tablero[0][2].equals(maq) & tablero[1][2].equals(maq) & tablero[2][2].equals(maq))
                    | (tablero[0][0].equals(maq) & tablero[0][1].equals(maq) & tablero[0][2].equals(maq))
                    | (tablero[1][0].equals(maq) & tablero[1][1].equals(maq) & tablero[1][2].equals(maq))
                    | (tablero[2][0].equals(maq) & tablero[2][1].equals(maq) & tablero[2][2].equals(maq))
                    | (tablero[0][0].equals(maq) & tablero[1][1].equals(maq) & tablero[2][2].equals(maq))
                    | (tablero[2][0].equals(maq) & tablero[1][1].equals(maq) & tablero[0][2].equals(maq))) {
                System.out.println("\nLo sentimos jugador, has perdido");
                ganador = true;
            }
            pintaTablero(tablero);
        } while (!ganador & cont < 6);
        if (ganador == false)
            System.out.println("\nEmpate. Vuelva a jugar");
    }

    public static void pintaTablero(String tablero[][]) {
        System.out.printf("\nTablero:\n   123 \n%7s\n", "  -----");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d |", (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.printf("| %d\n", (i + 1));
        }
        System.out.printf("%7s\n %5d \n", "-----", 123);
    }
}
