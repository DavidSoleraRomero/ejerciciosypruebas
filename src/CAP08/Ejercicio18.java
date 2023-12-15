package CAP08;

/* Escribe un programa que pase de decimal a binario. */
public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.print("Introduce un número en decimal: ");
        int num = Integer.parseInt(System.console().readLine());
        pasaABinario(num);
    }

    public static void pasaABinario(int num) {
        System.out.printf("El número resultante en binario ha sido el %d",
                Integer.valueOf(Integer.toBinaryString(num)));
    }
}
