package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes. */
public class Ejercicio16v2 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[20];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 401);
            }
            int opcion = 0;
            do {
                System.out.print("¿Quieres resaltar los múltiplos de 5 o de 7?\n");
                System.out.print("1. Múltiplos de 5\n2. Múltiplos de 7\nOpción: ");
                opcion = Integer.parseInt(System.console().readLine());
                if (opcion != 1 & opcion != 2)
                    System.out.println("Introduce una opción correcta, por favor.\n");
            } while (opcion != 1 & opcion != 2);
            if (opcion == 1)
                for (int i : numeros) {
                    if (i % 5 == 0 & i != 0)
                        System.out.printf("[*%d*] ", i);
                    else
                        System.out.print(i + " ");
                }
            else
                for (int i : numeros) {
                    if (i % 7 == 0 & i != 0)
                        System.out.printf("[$%d$] ", i);
                    else
                        System.out.print(i + " ");
                }
        } catch (Exception e) {
            System.out.print("\nError inesperado.");
        }
    }
}
