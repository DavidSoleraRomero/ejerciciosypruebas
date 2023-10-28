package CAP07;

/* Escribe un programa que rellene un array de 100 elementos con números en-
teros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación,
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos. */
public class Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Mostrando el array...");
        for (int i = 0; i < numeros.length; i++) {
            int num = (int) (Math.random() * 501);
            numeros[i] = num;
            if (num < min)
                min = num;
            if (num > max)
                max = num;
            System.out.print(num + " ");
        }
        System.out.print("\nQué quieres ver? 1. Mínimo 2. Máximo: ");
        int decision = Integer.parseInt(System.console().readLine());
        if (decision == 1 | decision == 2) {
            for (int i : numeros) {
                if (decision == 1 & i == min) {
                    System.out.print("**" + min + "** ");
                } else if (decision == 2 & i == max) {
                    System.out.print("**" + max + "** ");
                } else
                    System.out.print(i + " ");
            }
        } else
            System.out.println("Introduce la opción 1 o la 2. Otra de lo contrario es inválida.");
    }
}