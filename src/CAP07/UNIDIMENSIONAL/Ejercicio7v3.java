package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */
public class Ejercicio7v3 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[100];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 21);
            }
            for (int i : numeros) {
                System.out.printf("%d ", i);
            }
            System.out.print("\nIntroduce un valor: ");
            int valor1 = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce otro valor: ");
            int valor2 = Integer.parseInt(System.console().readLine());
            for (int i : numeros) {
                if (i != valor1)
                    System.out.print(i + " ");
                else
                    System.out.print("\"" + valor2 + "\" ");
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
