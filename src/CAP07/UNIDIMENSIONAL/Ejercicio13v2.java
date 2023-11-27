package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que rellene un array de 100 elementos con números en-
teros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación,
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos. */
public class Ejercicio13v2 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[100];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            System.out.print("Array generado: ");
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 501);
                System.out.print(numeros[i] + " ");
                if (numeros[i] > max)
                    max = numeros[i];
                if (numeros[i] < min)
                    min = numeros[i];
            }
            System.out.print("\n¿Quieres ver el máximo o el mínimo? (1 | 2): ");
            int opcion = Integer.parseInt(System.console().readLine());
            if (opcion == 1 | opcion == 2) {
                System.out.print("Array con asteriscos: ");
                for (int i = 0; i < numeros.length; i++) {
                    if ((numeros[i] == max & opcion == 1) | (numeros[i] == min & opcion == 2)) {
                        System.out.printf("**%d** ", numeros[i]);
                    } else
                        System.out.print(numeros[i] + " ");
                }
            } else
                System.out.println("Introduzca una opción correcta");
        } catch (Exception e) {
            System.out.println("\nSe ha producido un error.");
        }
    }
}
