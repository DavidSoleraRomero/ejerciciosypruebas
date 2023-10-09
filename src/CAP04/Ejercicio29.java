package CAP04;

import java.util.Scanner;

/* Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente. */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué has desayunado? (Introduzca: palmera, donut o pitufo): ");
        String desayuno = sc.nextLine();
        desayuno = desayuno.toLowerCase();
        String pitufoCon = "";
        if (desayuno.equals("pitufo")) {
            System.out.print("¿Era con aceite o con tortilla? ");
            pitufoCon = sc.nextLine();
            pitufoCon = pitufoCon.toLowerCase();
        }
        System.out.print("¿Qué has bebido? (Introduzca: zumo o café): ");
        String bebida = sc.nextLine();
        float precio;
        float costeB = 0;
        float costeD = 0;
        if (bebida.equals("zumo")) {
            costeB = 1.50f;
            precio = costeB;
            bebida = "Zumo";
        } else {
            costeB = 1.20f;
            precio = costeB;
            bebida = "Café";
        }
        switch (desayuno) {
            case "palmera":
                costeD = 1.40f;
                precio = precio + costeD;
                desayuno = "Palmera";
                break;
            case "donut":
                costeD = 1;
                precio = precio + costeD;
                desayuno = "Donut";
                break;
            case "pitufo":
                if (pitufoCon.equals("aceite")) {
                    costeD = 1.20f;
                    precio = precio + costeD;
                    desayuno = "Pitufo con aceite";
                } else {
                    costeD = 1.60f;
                    precio = precio + costeD;
                    desayuno = "Pitufo con tortilla";
                }
                break;
            default:
                System.out.println("Opción inválida introducida,");
                break;
        }
        System.out.printf("%-21s %5.2f\n", desayuno, costeD);
        System.out.printf("%-21s %5.2f\n", bebida, costeB);
        System.out.printf("%-21s %5.2f", "Total desayuno:", precio);
        sc.close();
    }
}
