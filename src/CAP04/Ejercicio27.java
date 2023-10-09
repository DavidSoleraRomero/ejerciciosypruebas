package CAP04;

import java.util.Scanner;

/* Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75. */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce qué sabor quieres: ");
        System.out.println("1. Manzana | 2. Fresa | 3. Chocolate");
        int sabor = sc.nextInt();
        System.out.println("¿Desea nata en la tarta?");
        System.out.println("1. Sí | 2. No");
        int nataT = sc.nextInt();
        float nataP = 2.50f;
        System.out.println("¿Desea la escritura del nombre?");
        System.out.println("1. Sí | 2. No");
        int nombreT = sc.nextInt();
        float nombreP = 2.75f;
        float precio = 0;
        float total;
        String tarta = "";
        switch (sabor) {
            case 1:
                precio = 18;
                tarta = "manzana";
                break;
            case 2:
                precio = 16;
                tarta = "fresa";
                break;
            case 3:
                System.out.println("La tarta es de...");
                System.out.println("1. Chocolate negro | 2. Chocolate blanco");
                int negroBlanco = sc.nextInt();
                if ((negroBlanco > 0) && (negroBlanco <= 2)) {
                    if (negroBlanco == 1) {
                        precio = 14;
                        tarta = "chocolate negro";
                    } else {
                        precio = 15;
                        tarta = "chocolate blanco";
                    }
                }
                break;
            default:
                System.out.println("Introduzca una tarta válida");
                break;
        }
        if ((nataT == 1) && (nombreT == 1)) {
            total = precio + nataP + nombreP;
        } else if ((nataT == 1) && !(nombreT == 1)) {
            total = precio + nataP;
            nombreP = 0;
        } else if (!(nataT == 1) && (nombreT == 1)) {
            total = precio + nombreP;
            nataP = 0;
        } else {
            total = precio;
            nataP = 0;
            nombreP = 0;
        }
        System.out.printf("%-9s%-17s %5.2f\n", "Tarta de", tarta, precio);
        System.out.printf("%-26s %5.2f\n", "Nata:", nataP);
        System.out.printf("%-26s %5.2f\n", "Escritura del nombre:", nombreP);
        System.out.printf("%-26s %5.2f", "TOTAL A PAGAR:", total);
        sc.close();
    }
}
