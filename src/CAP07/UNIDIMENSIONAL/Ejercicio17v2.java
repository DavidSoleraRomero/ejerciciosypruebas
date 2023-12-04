package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la posición 0 del array. Por último, se mostrará el array rotado por pantalla. */
public class Ejercicio17v2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }
        boolean dentro = false;
        System.out.printf("%-7s", "Índice");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-7s", "Valores");
        for (int i : numeros) {
            System.out.printf("%4d", i);
        }
        int posicion = 0;
        do {
            System.out.print("\nIntroduce un número entre 0 y 100 que esté dentro del Array: ");
            int num = Integer.parseInt(System.console().readLine());
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == num) {
                    posicion = i;
                    dentro = true;
                    break;
                }
            }
            if (dentro == false)
                System.out.println("Ese número no se encuentra en el Array");
        } while (!dentro);
        int[] aux = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            aux[i] = numeros[i];
        }
        for (int i = 0; i < aux.length - posicion; i++) {
            int siguiente = aux[0];
            for (int j = 0; j < aux.length - 1; j++) {
                int anterior = siguiente;
                siguiente = aux[j + 1];
                aux[j + 1] = anterior;
            }
            aux[0] = numeros[9 - i];
        }
        aux[0] = numeros[posicion];
        System.out.printf("%-7s", "Índice");
        for (int i = 0; i < aux.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n%-7s", "Valores");
        for (int i : aux) {
            System.out.printf("%4d", i);
        }
    }
}
