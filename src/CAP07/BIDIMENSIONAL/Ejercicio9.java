package CAP07.BIDIMENSIONAL;

/* Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] matriz = new int[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = (int) (Math.random() * 101);
            }
        }
        pintaMatriz(matriz, "Array original: ");
        int primeraFila = 0;
        int ultimaFila = matriz.length - 1;
        for (int recorre = 1; recorre <= 6; recorre++) {
            int pIzq = matriz[primeraFila + 1][primeraFila];
            int sDer = matriz[primeraFila][ultimaFila];
            int tDer = matriz[ultimaFila - 1][ultimaFila];
            int cIzq = matriz[ultimaFila][primeraFila];
            int qIzq = matriz[ultimaFila][primeraFila + 1];
            int siguiente = matriz[ultimaFila][ultimaFila];
            int siguienteIzq = matriz[ultimaFila - 1][ultimaFila];
            for (int fila = 11; fila >= 0; fila--) {
                for (int columna = 11; columna >= 0; columna--) {
                    if (fila >= primeraFila & fila <= ultimaFila & columna == ultimaFila & fila - 1 >= primeraFila) {
                        matriz[fila][columna] = matriz[fila - 1][columna];
                    } else if (fila >= primeraFila & fila <= ultimaFila & columna == primeraFila) {
                        int anteriorIzq = siguienteIzq;
                        siguienteIzq = matriz[fila][columna];
                        matriz[fila][columna] = anteriorIzq;
                    } else if (fila == primeraFila & columna - 1 != -1) {
                        if (columna >= primeraFila & columna <= ultimaFila)
                            matriz[fila][columna] = matriz[fila][columna - 1];
                    } else if (fila == ultimaFila & (columna + 1 != 12)) {
                        if (columna >= primeraFila & columna <= ultimaFila) {
                            int anterior = siguiente;
                            siguiente = matriz[ultimaFila][columna];
                            matriz[fila][columna] = anterior;
                        }
                    }
                }
            }
            matriz[primeraFila][primeraFila] = pIzq;
            matriz[primeraFila + 1][ultimaFila] = sDer;
            matriz[ultimaFila][ultimaFila] = tDer;
            matriz[ultimaFila - 1][primeraFila] = cIzq;
            matriz[ultimaFila][primeraFila] = qIzq;
            primeraFila++;
            ultimaFila--;
        }
        System.out.printf("\n\n");
        pintaMatriz(matriz, "Array modificado:");
    }

    public static void pintaMatriz(int matriz[][], String texto) {
        System.out.print(texto);
        for (int i = 0; i < 12; i++) {
            System.out.printf("\n%-9s%2d:", "Posición", i);
            for (int j = 0; j < 12; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
        }
    }
}
