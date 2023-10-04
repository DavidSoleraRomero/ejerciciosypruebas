import java.util.Scanner;
/* Programa probando múltiples cosas */

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número a sumar:");
        int i = sc.nextInt();
        System.out.println("Introduce el segundo número a sumar:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca un texto cualquiera:");
        String texto = sc.nextLine();
        System.out.println();
        System.out.println((i + a) + " <- La suma de " + i + " + " + a + " da ese resultado.");
        System.out.println(texto);
        System.out.print("Hola \n");
        System.out.println("Me llamo\t-> \t  David");

        sc.close();
    }
}
