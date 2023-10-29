package CAP07;

/* Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la posición 0 del array. Por último, se mostrará el array rotado por pantalla. */
public class Ejercicio17 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            int num = (int) (Math.random() * 101);
            numeros[i] = num;
        }
        System.out.println("Array inicial: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println();
        do {
            System.out.print("Introduce un número para ver si está dentro del array: ");
            int num = Integer.parseInt(System.console().readLine());
            for (int i : numeros) {
                if (i == num) {
                    while (num != numeros[0]) {
                        int ultimo = numeros[9];
                        int siguiente = numeros[0];
                        for (int j = 0; j < numeros.length - 1; j++) {
                            int anterior = siguiente;
                            siguiente = numeros[j + 1];
                            numeros[j + 1] = anterior;
                        }
                        numeros[0] = ultimo;
                    }
                    break;
                }
            }
            if (num == numeros[0])
                break;
        } while (true);
        System.out.println("Resultado del array: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}
