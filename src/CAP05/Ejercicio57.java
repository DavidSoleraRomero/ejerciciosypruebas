package CAP05;

/* Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. */
public class Ejercicio57 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura de la pirámide: ");
        try {
            int altura = Integer.parseInt(System.console().readLine());
            int j = 0;
            for (int i = altura; i >= 1; i--) {
                for (int espacios = 1; espacios <= j; espacios++) {
                    System.out.print(" ");
                }
                j++;
                for (int asteriscos = 1; asteriscos <= i; asteriscos++) {
                    if (i == altura)
                        System.out.print("*");
                    else if (asteriscos == 1 | asteriscos == i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Introduce un número.");
        }
    }
}
