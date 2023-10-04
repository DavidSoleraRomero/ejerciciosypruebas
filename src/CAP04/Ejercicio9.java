package CAP04;

/* Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0). */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve una ecuación de segundo grado (ax2 + bx + c = 0)");
        System.out.print("Introduce el valor de A: ");
        float a = Float.parseFloat(System.console().readLine());
        System.out.print("Introduce el valor de B: ");
        float b = Float.parseFloat(System.console().readLine());
        System.out.print("Introduce el valor de C: ");
        float c = Float.parseFloat(System.console().readLine());
        double ecuacionpos = ((-b + Math.sqrt((b * b) - 4 * a * c) / 2));
        double ecuacionneg = ((-b - Math.sqrt((b * b) - 4 * a * c) / 2));
        System.out.println(ecuacionpos + " " + ecuacionneg);
    }
}
