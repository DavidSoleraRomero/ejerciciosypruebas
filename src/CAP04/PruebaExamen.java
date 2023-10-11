package CAP04;

import java.util.Scanner;

public class PruebaExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de la primera persona: ");
        String nom1 = sc.nextLine();
        System.out.print("Introduce los apellidos de " + nom1 + ": ");
        String ape1 = sc.nextLine();
        System.out.print("Introduce la edad de " + nom1 + ": ");
        int edad1 = sc.nextInt();
        System.out.print("Introduce la altura de " + nom1 + ": ");
        float altura1 = sc.nextFloat();
        System.out.print("Introduce el peso de " + nom1 + ": ");
        float peso1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Introduce el nombre de la segunda persona: ");
        String nom2 = sc.nextLine();
        System.out.print("Introduce los apellidos de " + nom2 + ": ");
        String ape2 = sc.nextLine();
        System.out.print("Introduce la edad de " + nom2 + ": ");
        int edad2 = sc.nextInt();
        System.out.print("Introduce la altura de " + nom2 + ": ");
        float altura2 = sc.nextFloat();
        System.out.print("Introduce el peso de " + nom2 + ": ");
        float peso2 = sc.nextFloat();

        float imc1 = (peso1 / (altura1 * altura1)) * 10000;
        float imc2 = (peso2 / (altura2 * altura2)) * 10000;

        System.out.printf("*************************************************************\n");
        System.out.printf("* %-10s %-18s %5s %7s %7s %5s *\n", "Nombre", "Apellidos", "Edad", "Altura", "Peso",
                "IMC");
        System.out.printf("*************************************************************\n");
        System.out.printf("* %-10s %-18s %5d %7.2f %7.2f %5.1f *\n", nom1, ape1, edad1, altura1 / 100, peso1, imc1);
        System.out.printf("* %-10s %-18s %5d %7.2f %7.2f %5.1f *\n", nom2, ape2, edad2, altura2 / 100, peso2, imc2);
        System.out.printf("*************************************************************");
        sc.close();
    }
}
