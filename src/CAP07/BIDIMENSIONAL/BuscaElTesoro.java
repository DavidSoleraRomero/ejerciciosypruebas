package CAP07.BIDIMENSIONAL;

public class BuscaElTesoro {
    public static final int VACIO = 0;
    public static final int MINA = 1;
    public static final int TESORO = 2;
    public static final int INTENTO = 3;

    public static int[][] creaCuadrante(int filas, int columnas) {
        return new int[filas][columnas];
    }

    public static void inicializa(int[][] cuadrante, int filas, int columnas) {
        for (int x = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
    }

    public static void dibujaCuadrante(int[][] cuadrante, int filas, int columnas, boolean resuelto) {
        String c = "";
        for (int x = filas - 1; x >= 0; x--) {
            System.out.print(x + "|");
            for (int y = 0; y < columnas; y++) {
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = " ";
                        break;
                    case MINA:
                        if (resuelto)
                            c = "* ";
                        else
                            c = "  ";
                        break;
                    case TESORO:
                        if (resuelto)
                            c = "$ ";
                        else
                            c = "  ";
                        break;
                    case INTENTO:
                        c = "X ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" --------\n  0 1 2 3\n");
    }

    public static int[] obtenerCoordenadaAleatorias(int filas, int columnas) {
        int[] coordenadas = new int[2];
        coordenadas[0] = (int) (Math.random() * filas);
        coordenadas[1] = (int) (Math.random() * columnas);
        return coordenadas;
    }

    public static void apuntaEnCuadrante(int valor, int[][] cuadrante, int posX, int posY) {
        cuadrante[posX][posY] = valor;
    }

    public static void main(String[] args) {
        // se definen constantes para representar el
        // contenido de las celdas
        int x;
        int y;

        int[][] cuadrante = creaCuadrante(5, 4);
        // inicializa el array
        inicializa(cuadrante, 5, 4);
        int mina[] = obtenerCoordenadaAleatorias(5, 4);
        apuntaEnCuadrante(MINA, cuadrante, mina[0], mina[1]);
        // coloca el tesoro
        int tesoro[];

        do {
            tesoro = obtenerCoordenadaAleatorias(5, 4);
        } while ((mina[0] == tesoro[0]) && (mina[1] == tesoro[1]));
        apuntaEnCuadrante(TESORO, cuadrante, tesoro[0], tesoro[1]);

        // juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        do {
            // pinta el cuadrante
            dibujaCuadrante(cuadrante, 5, 4, false);
            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            y = Integer.parseInt(System.console().readLine());
            // mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[x][y]) {
                case VACIO:
                    apuntaEnCuadrante(INTENTO, cuadrante, x, y);
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;
                default:
            }
        } while (!salir);
        // pinta el cuadrante
        dibujaCuadrante(cuadrante, 5, 4, true);
    }
}