package CAP07.BIDIMENSIONAL;

public class PruebaExamen {
    public static void main(String[] args) {
        try {
            boolean salir = false;
            int[][] numeros = new int[5][10];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    numeros[i][j] = (int) (Math.random() * 1001);
                }
            }
            do {
                Thread.sleep(1000);
                menu();
                int opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        pintaArrayHorizontal(numeros);
                        break;
                    case 2:
                        pintaArrayVertical(numeros);
                        break;
                    case 3:
                        pintaArrayInvertido(numeros);
                        break;
                    case 4:
                        int suma[][] = new int[5][10];
                        regeneraArray(suma, 1000);
                        pintaArraySumando(numeros, suma);
                        break;
                    case 5:
                        int multiplica[][] = new int[5][10];
                        regeneraArray(multiplica, 10);
                        pintaArrayMultiplicando(numeros, multiplica);
                        break;
                    case 6:
                        System.out.println("\nRegenerando array...");
                        regeneraArray(numeros, 1000);
                        break;
                    case 7:
                        System.out.println("\nInvirtiendo array...");
                        int aux[][] = invierteArray(numeros);
                        numeros = aux.clone();
                        break;
                    case 8:
                        salir = true;
                        System.out.println("\nGracias por utilizar el programa...\nSaliendo...");
                        break;
                    default:
                        System.out.println("\nIntroduzca una opción correcta, por favor");
                }
                Thread.sleep(2000);
            } while (!salir);
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }

    public static void pintaArrayHorizontal(int[][] array) {
        System.out.println("\nArray horizontal...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void pintaArraySumando(int[][] array1, int[][] array2) {
        System.out.println("\nArrays sumados...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ", (array1[i][j] + array2[i][j]));
            }
            System.out.println();
        }
    }

    public static void pintaArrayMultiplicando(int[][] array1, int[][] array2) {
        System.out.println("\nArrays multiplicados...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d ", (array1[i][j] * array2[i][j]));
            }
            System.out.println();
        }
    }

    public static void pintaArrayVertical(int[][] array) {
        System.out.println("\nArray vertical...");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d ", array[j][i]);
            }
            System.out.println();
        }
    }

    public static void pintaArrayInvertido(int[][] array) {
        for (int i = 0; i < 5; i++) {
            int cont = 9;
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ", array[i][cont--]);
            }
            System.out.println();
        }
    }

    public static void regeneraArray(int[][] array, int numMultiplica) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) (Math.random() * numMultiplica + 1);
            }
        }
    }

    public static int[][] invierteArray(int[][] array) {
        int[][] aux = new int[5][10];
        for (int i = 0; i < 5; i++) {
            int cont = 9;
            for (int j = 0; j < 10; j++) {
                aux[i][j] = array[i][cont--];
            }
        }
        return aux;
    }

    public static void menu() {
        System.out.println("\n¿Qué quieres realizar con el array?\nOpciones: ");
        System.out.println("1. Visualizarlo horizontalmente");
        System.out.println("2. Visualizarlo verticalmente");
        System.out.println("3. Visualizarlo invertido");
        System.out.println("4. Visualizarlo sumado con otro array generado aleatoriamente");
        System.out.println("5. Visualizarlo multiplicado con otro array generado aleatoriamente");
        System.out.println("6. Regenerar el array");
        System.out.println("7. Invertir el array");
        System.out.println("8. Salir del programa");
        System.out.print("Introduzca una opción: ");
    }
}
