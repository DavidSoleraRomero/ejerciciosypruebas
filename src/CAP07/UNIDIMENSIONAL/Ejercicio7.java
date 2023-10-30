package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            int num = (int) (Math.random() * 21);
            numeros[i] = num;
            System.out.print(num + " ");
        }
        System.out.print("\nmIntroduce un nº de los anteriores: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce por qué nº quieres cambiarlo: ");
        int sustituye = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                numeros[i] = sustituye;
                System.out.print("\"" + sustituye + "\" ");
            } else
                System.out.print(numeros[i] + " ");
        }
    }
}
