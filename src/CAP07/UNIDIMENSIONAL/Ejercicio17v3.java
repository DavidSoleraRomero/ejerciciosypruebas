package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la posición 0 del array. Por último, se mostrará el array rotado por pantalla. */
public class Ejercicio17v3 {
    public static void main(String[] args) {

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 101);
            System.out.printf("%d ", num[i]);
        }
        boolean dentro;
        int posicion = 0;
        do {
            System.out.print("\nIntroduce un número del array: ");
            int numero = Integer.parseInt(System.console().readLine());
            dentro = false;
            for (int i = 0; i < num.length; i++) {
                if (num[i] == numero) {
                    dentro = true;
                    posicion = i;
                }
            }
        } while (!dentro);
        int[] aux = new int[10];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = num[i];
        }
        int iteraciones = Math.abs(posicion - 9) + 1;
        for (int j = 0; j < iteraciones; j++) {
            int ultimo = aux[9];
            for (int i = 9; i > 0; i--) {
                aux[i] = aux[i - 1];
            }
            aux[0] = ultimo;
        }
        for (int i : aux) {
            System.out.printf("%d ", i);
        }

    }
}
