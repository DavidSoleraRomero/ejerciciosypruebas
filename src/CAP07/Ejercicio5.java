package CAP07;

/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el nº " + i + ": ");
            int num = Integer.parseInt(System.console().readLine());
            numeros[i] = num;
            if (numeros[i] < minimo)
                minimo = numeros[i];
            if (numeros[i] > maximo)
                maximo = numeros[i];
        }
        for (int i : numeros) {
            if (i == minimo)
                System.out.println(i + " MÍNIMO");
            else if (i == maximo)
                System.out.println(i + " MÁXIMO");
            else
                System.out.println(i);
        }
    }
}