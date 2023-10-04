package CAP04;

/* Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √2h siendo g = 9.81m/s
                                    g                 2 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura a la que está el objeto: ");
        float altura = Float.parseFloat(System.console().readLine());
        System.out.print("Introduce la gravedad: ");
        float g = Float.parseFloat(System.console().readLine());
        double tiempo = Math.sqrt((altura * 2) / g);
        System.out.printf("El resultado es %.3f", tiempo);
    }
}
