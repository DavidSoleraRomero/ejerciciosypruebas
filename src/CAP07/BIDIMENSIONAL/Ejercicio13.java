package CAP07.BIDIMENSIONAL;

/* Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente). */
public class Ejercicio13 {
    public static void main(String[] args) {
        String[] pais = { "España", "Rusia", "Japón", "Australia" };
        int[][] estaturas = new int[4][10];
        for (int i = 0; i < 4; i++) {
            int media = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < 10; j++) {
                estaturas[i][j] = (int) (Math.random() * 71 + 140);
                if (estaturas[i][j] < min)
                    min = estaturas[i][j];
                if (estaturas[i][j] > max)
                    max = estaturas[i][j];
                media = media + estaturas[i][j];
            }
            System.out.printf("%-9s --> | Estatura media: %d | Altura máxima: %d | Altura mínima: %d |\n",
                    pais[i], media / 10, max, min);
        }
    }
}
