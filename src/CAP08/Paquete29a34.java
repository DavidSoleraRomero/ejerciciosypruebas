package CAP08;

public class Paquete29a34 {
    public static void main(String[] args) {
        int[][] miArray = generaArrayBiInt(10, 10, 1, 50);
        muestraBi(miArray);
        System.out.println();
        int[] fila2 = filaDeArrayBiInt(1, miArray);
        muestraUni(fila2);
        System.out.println();
        int[] columna2 = columnaDeArrayBiInt(1, miArray);
        muestraUni(columna2);
        System.out.println();
        int[] coordenadas = coordenadasEnArrayBiInt(10, miArray);
        System.out.printf("Las coordenadas del número 10 son --> [%d][%d]\n", coordenadas[0], coordenadas[1]);
        if (coordenadas[0] != -1)
            System.out.printf("\nEl número 10 %s\n\n", esPuntoDeSilla(10, miArray));
        int[] diag1 = diagonal("neso", miArray);
        int[] diag2 = diagonal("nose", miArray);
        muestraUni(diag1);
        System.out.println();
        muestraUni(diag2);
    }

    public static int[][] generaArrayBiInt(int x, int y, int min, int max) {
        int[][] aux = new int[x][y];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                aux[i][j] = aleatorio(min, max);
            }
        }
        return aux;
    }

    public static void muestraBi(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void muestraUni(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
        }
        System.out.println();
    }

    public static int[] filaDeArrayBiInt(int fila, int[][] array) {
        int[] filaI = new int[array.length];
        for (int i = 0; i < array[0].length; i++) {
            filaI[i] = array[fila][i];
        }
        return filaI;
    }

    public static int[] columnaDeArrayBiInt(int columna, int[][] array) {
        int[] columnaI = new int[array.length];
        for (int i = 0; i < array[0].length; i++) {
            columnaI[i] = array[i][columna];
        }
        return columnaI;
    }

    public static int[] diagonal(String direccion, int[][] array) {
        return (direccion.equals("nose")) ? sacaDiagonalNOSE(array) : sacaDiagonalNESO(array);
    }

    public static int[] sacaDiagonalNOSE(int[][] array) {
        int[] aux = new int[array[0].length];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = array[i][i];
        }
        return aux;
    }

    public static int[] sacaDiagonalNESO(int[][] array) {
        int[] aux = new int[array[0].length];
        int cont = aux.length - 1;
        for (int i = 0; i < aux.length; i++) {
            aux[i] = array[cont--][i];
        }
        return aux;
    }

    public static int[] coordenadasEnArrayBiInt(int num, int[][] array) {
        int[] coordenadas = { -1, -1 };
        for (int i = 0; i < array.length & coordenadas[0] == -1; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (num == array[i][j]) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                }
            }
        }
        return coordenadas;
    }

    public static String esPuntoDeSilla(int num, int[][] array) {
        int[] coordenadas = coordenadasEnArrayBiInt(num, array);
        int[] fila = filaDeArrayBiInt(coordenadas[0], array);
        int[] columna = columnaDeArrayBiInt(coordenadas[1], array);
        int[] minMax = { Integer.MAX_VALUE, Integer.MIN_VALUE };
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] < minMax[0])
                minMax[0] = fila[i];
        }
        for (int i = 0; i < columna.length; i++) {
            if (columna[i] > minMax[1])
                minMax[1] = columna[i];
        }
        return (num == minMax[0] & num == minMax[1]) ? "es punto de silla" : "no es punto de silla";
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
