package CAP08;

public class Paquete20a28 {
    public static void main(String[] args) {
        int[] miArray = generaArrayInt(10, 1, 50);
        muestraArray(miArray);
        System.out.printf("\nEl mínimo es %d\n", minimoArrayInt(miArray));
        System.out.printf("El máximo es %d\n", maximoArrayInt(miArray));
        System.out.printf("La media da %.2f\n", mediaArrayInt(miArray));
        System.out.printf("%s\n",
                (estaEnArrayInt(10, miArray)) ? "El número está en el array" : "El número no está en el array");
        System.out.printf("%s\n", "La posición del número está en la " + posicionEnArray(10, miArray));
        System.out.printf("%s\n", "Array volteado");
        miArray = volteaArrayInt(miArray);
        muestraArray(miArray);
        System.out.printf("%s\n", "Array rotado 2 posiciones derecha");
        rotaArrayDerechaInt(2, miArray);
        muestraArray(miArray);
        System.out.printf("%s\n", "Array rotado 2 posiciones izquierda");
        rotaArrayIzquierdaInt(2, miArray);
        muestraArray(miArray);
    }

    public static int[] generaArrayInt(int tamano, int min, int max) {
        int[] aux = new int[tamano];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = numAleatorio(min, max);
        }
        return aux;
    }

    public static int minimoArrayInt(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int maximoArrayInt(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static double mediaArrayInt(int[] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            media = media + array[i];
        }
        return media / array.length;
    }

    public static boolean estaEnArrayInt(int num, int[] array) {
        boolean dentro = false;
        for (int i = 0; i < array.length & !dentro; i++) {
            if (num == array[i])
                dentro = true;
        }
        return dentro;
    }

    public static int posicionEnArray(int num, int[] array) {
        int posicion = -1;
        for (int i = 0; i < array.length & posicion == -1; i++) {
            if (num == array[i])
                posicion = i;
        }
        return posicion;
    }

    public static int[] volteaArrayInt(int[] array) {
        int[] aux = new int[array.length];
        int ultimo = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[ultimo--];
        }
        return aux;
    }

    public static void rotaArrayDerechaInt(int num, int[] array) {
        for (int i = 1; i <= num; i++) {
            int ultimo = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = ultimo;
        }
    }

    public static void rotaArrayIzquierdaInt(int num, int[] array) {
        for (int i = 1; i <= num; i++) {
            int primero = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = primero;
        }
    }

    public static void muestraArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static int numAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
