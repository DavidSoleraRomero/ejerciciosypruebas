package CAP08;

/* Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas. */
public class Ejercicio44 {
    public static void main(String[] args) {
        System.out.print("Altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        trianguloSinRelleno(altura, '*');
    }

    public static void trianguloSinRelleno(int altura, char c) {
        String caracter = String.valueOf(c);
        System.out.println(caracter.repeat(altura));
        int cont = 2;
        for (int i = 1; i < altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (j == cont | j == altura)
                    System.out.print(caracter);
                else
                    System.out.print(" ");
            }
            cont++;
            System.out.println();
        }
    }
}
