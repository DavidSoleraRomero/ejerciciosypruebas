package CAP08;

/* Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas. */
public class Ejercicio43 {
    public static void main(String[] args) {
        System.out.print("Altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        trianguloRelleno(altura, '*');
        System.out.println();
        trianguloRellenoD(altura, '*');
    }

    public static void trianguloRelleno(int altura, char c) {
        String caracter = String.valueOf(c);
        for (int i = 0; i < altura; i++) {
            System.out.print(" ".repeat(i));
            System.out.println(caracter.repeat(altura - i));
        }
    }

    public static void trianguloRellenoD(int altura, char c) {
        String caracter = String.valueOf(c);
        for (int i = 1; i <= altura; i++) {
            System.out.print(" ".repeat(altura - i));
            System.out.println(caracter.repeat(i));
        }
    }
}
