package CAP07.UNIDIMENSIONAL;

public class Ejercicio19v2 {
    public static void main(String[] args) {
        try {

            int[] numeros = new int[12];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 201);
            }

            System.out.println("Array original: ");
            System.out.printf("%-9s", "Índice");
            for (int i = 0; i < 12; i++) {
                System.out.printf("%5d", i);
            }
            System.out.printf("\n%-9s ", "Contenido");
            for (int i : numeros) {
                System.out.printf("%4d ", i);
            }

            System.out.print("\n\n¿Qué número desea insertar?: ");
            int num = Integer.parseInt(System.console().readLine());
            System.out.print("¿En qué posición lo desea insertar?: ");
            int posicion = Integer.parseInt(System.console().readLine());

            for (int i = numeros.length - 1; i > posicion; i--) {
                numeros[i] = numeros[i - 1];
            }
            numeros[posicion] = num;

            System.out.println("\nArray modificado: ");
            System.out.printf("%-9s", "Índice");
            for (int i = 0; i < 12; i++) {
                System.out.printf("%5d", i);
            }
            System.out.printf("\n%-9s ", "Contenido");
            for (int i : numeros) {
                System.out.printf("%4d ", i);
            }

        } catch (Exception e) {
            System.out.println("Se produjo un error. Se esperaba un número.");
        }
    }
}
