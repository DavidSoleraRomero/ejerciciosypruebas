package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */
public class Ejercicio7v2 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);
            System.out.print(numeros[i] + " ");
        }
        try {
            System.out.print("\n¿Qué número quieres sustituir? ");
            int num1 = Integer.parseInt(System.console().readLine());
            System.out.print("¿Por cuál lo quieres sustituir? ");
            int num2 = Integer.parseInt(System.console().readLine());
            for (int i : numeros) {
                if (i == num1)
                    System.out.print("\"" + num2 + "\" ");
                else
                    System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
