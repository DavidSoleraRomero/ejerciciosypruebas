package CAP07.BIDIMENSIONAL;

public class Ejercicio9v2 {
    public static void main(String[] args) {
        int[][] matriz = new int[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = (int) (Math.random() * 101);
            }
        }
        pMatriz(matriz, "Array original:");
        int cont1 = 0;
        int cont2 = 11;
        int[][] aux = new int[12][12];
        do {
            int arIzq = matriz[cont1 + 1][cont1];
            int arDer = matriz[cont1][cont2];
            int abIzq = matriz[cont2][cont1];
            int abDer = matriz[cont2 - 1][cont2];
            for (int i = cont2; i >= cont1; i--) {
                for (int j = cont2; j >= cont1; j--) {
                    if (i == cont1 & j != 0) {
                        aux[i][j] = matriz[i][j - 1];
                    } else if (i == cont2 & j != 11) {
                        aux[i][j] = matriz[i][j + 1];
                    } else if (j == cont1) {
                        aux[i][j] = matriz[i + 1][j];
                    } else if (j == cont2) {
                        aux[i][j] = matriz[i - 1][j];
                    }
                }
            }
            aux[cont1][cont1] = arIzq;
            aux[cont1 + 1][cont2] = arDer;
            aux[cont2 - 1][cont1] = abIzq;
            aux[cont2][cont2] = abDer;
            cont1++;
            cont2--;
        } while (cont1 < cont2);
        pMatriz(aux, "Array rotado");
    }

    public static void pMatriz(int matriz[][], String texto) {
        System.out.printf("\n%s\n", texto);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
