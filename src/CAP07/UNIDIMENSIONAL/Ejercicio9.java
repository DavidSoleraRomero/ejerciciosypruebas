package CAP07.UNIDIMENSIONAL;

/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca el número para la posicion %d: ", i);
            int num = Integer.parseInt(System.console().readLine());
            numeros[i] = num;
        }
        for (int i : numeros) {
            if (i % 2 == 0)
                System.out.println(i + " --> PAR");
            else
                System.out.println(i + " --> IMPAR");
        }
    }
}
