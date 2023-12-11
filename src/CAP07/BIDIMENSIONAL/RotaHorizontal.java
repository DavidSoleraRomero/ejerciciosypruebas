package CAP07.BIDIMENSIONAL;

public class RotaHorizontal {
    public static void main(String[] args) {
        int[][] numeros = new int[5][10];
        System.out.println("Array original...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                numeros[i][j] = (int) (Math.random() * 1001);
                System.out.printf("%4d ", numeros[i][j]);
            }
            System.out.println();
        }

    }
}
