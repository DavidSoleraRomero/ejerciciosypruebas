package CAP08;

/* Realiza un programa que pinte un triángulo relleno tal como se muestra en
los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
ya se realizó en el tema de bucles, ahora se trata de usar una función para
que la implementación sea más sencilla. Por ejemplo, se puede crear una
función linea(char caracter, int repeticiones) que pinte una línea con el carácter
especificado. */
public class Ejercicio41 {
    public static void main(String[] args) {
        System.out.print("Altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        trianguloRelleno(altura, '*');
    }

    public static void trianguloRelleno(int altura, char c) {
        String caracter = String.valueOf(c);
        for (int i = altura; i >= 1; i--) {
            System.out.println(caracter.repeat(i));
        }
    }
}
