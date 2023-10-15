package CAP04;

import java.util.Scanner;

public class PruebaExamen2 {
    public static void main(String[] args) {

        System.out.print("Introduce el primer nombre: ");
        String nom1 = System.console().readLine();
        System.out.print("Introduce tus apellidos, " + nom1 + ": ");
        String ape1 = System.console().readLine();
        System.out.print("Introduce tu peso, " + nom1 + ": ");
        float peso1 = Float.parseFloat(System.console().readLine());
        System.out.print("Introduce tu estatura en cm, " + nom1 + ": ");
        float estatura1 = Float.parseFloat(System.console().readLine());

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el segundo nombre: ");
        String nom2 = sc.nextLine();
        System.out.print("Introduce tus apellidos, " + nom2 + ": ");
        String ape2 = sc.nextLine();
        System.out.print("Introduce tu peso, " + nom2 + ": ");
        float peso2 = sc.nextFloat();
        System.out.print("Introduce tu estatura en cm, " + nom2 + ": ");
        float estatura2 = sc.nextFloat();
        sc.close();
        float imc1 = (peso1 / (estatura1 * estatura1)) * 10000;
        float imc2 = (peso2 / (estatura2 * estatura2)) * 10000;

        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| \u001B[30m%-17s%-25s|%8s %8s %7s\u001B[0m |\n", "Nombre", "Apellidos", "Peso", "Altura",
                "IMC");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| \u001B[31m%-17s%-25s|%8.2f %8.2f %7.2f\u001B[0m |\n", nom1, ape1, peso1, estatura1 / 100,
                imc1);
        System.out.printf("| \u001B[36m%-17s%-25s|%8.2f %8.2f %7.2f\u001B[0m |\n", nom2, ape2, peso2, estatura2 / 100,
                imc2);
        System.out.println("------------------------------------------------------------------------");
    }
}
