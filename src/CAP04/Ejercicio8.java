package CAP04;

/* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente). */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Vas a introducir 3 notas y calcularemos la media");
        System.out.print("Primera nota: ");
        float nota1 = Float.parseFloat(System.console().readLine());
        System.out.print("Segunda nota: ");
        float nota2 = Float.parseFloat(System.console().readLine());
        System.out.print("Tercera nota: ");
        float nota3 = Float.parseFloat(System.console().readLine());
        float media = ((nota1 + nota2 + nota3) / 3);
        System.out.printf("La media de las 3 es de %.2f \n", media);
        if ((media >= 5) && (media < 6)) {
            System.out.println("Suficiente");
        } else if ((media >= 6) && (media <= 6.9)) {
            System.out.println("Bien");
        } else if ((media > 6.9) && (media <= 8.9)) {
            System.out.println("Notable");
        } else if (media > 8.9) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Insuficiente");
        }
    }
}
