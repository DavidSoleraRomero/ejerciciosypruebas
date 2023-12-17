package CAP08;

/* Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas. */
public class Ejercicio42 {
    public static void main(String[] args) {
        System.out.print("Altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        trianguloSinRelleno(altura, '*');
    }

    public static void trianguloSinRelleno(int altura, char c) {
        String caracter = String.valueOf(c);
        System.out.println(caracter.repeat(altura));
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j == i | j == 1)
                    System.out.print(caracter);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
