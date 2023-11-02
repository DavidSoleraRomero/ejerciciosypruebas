package CAP07.BIDIMENSIONAL;

/* Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */
public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            int[][] numeros = new int[6][10];
            int max = Integer.MIN_VALUE;
            String posMax = "";
            int min = Integer.MAX_VALUE;
            String posMin = "";
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    int num = (int) (Math.random() * 1001);
                    numeros[i][j] = num;
                    if (num > max) {
                        max = num;
                        posMax = "[" + i + "][" + j + "]";
                    }
                    if (num < min) {
                        min = num;
                        posMin = "[" + i + "][" + j + "]";
                    }
                }
            }
            System.out.print("Mostrando el array...\n");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(numeros[i][j] + " ");
                    Thread.sleep(50);
                }
            }
            System.out.printf("El número máximo es: %4d, en la posición %s del Array\n", max, posMax);
            System.out.printf("El número mínimo es: %4d, en la posición %s del Array", min, posMin);
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
