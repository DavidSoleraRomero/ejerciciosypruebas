package CAP04;

import java.util.Scanner;

/* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas. */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el alto de la bandera: ");
        int alto = sc.nextInt();
        System.out.print("Introduce el ancho de la bandera: ");
        int ancho = sc.nextInt();
        float precioBandera = ((float) alto * (float) ancho) / 100;
        System.out.print("¿Desea que tenga un escudo bordado?\n");
        System.out.println("1. Sí | 2. No");
        int escBord = sc.nextInt();
        float precioEscBord;
        if (escBord == 1) {
            precioEscBord = 2.50f;
        } else {
            precioEscBord = 0f;
        }
        float envio = 3.25f;
        float total = precioBandera + precioEscBord + envio;
        System.out.printf("%-21s %-5dcm2 %7.2f $\n", "Tamaño de la bandera:", (alto * ancho), precioBandera);
        System.out.printf("%-31s %6.2f $\n", "Escudo bordado:", precioEscBord);
        System.out.printf("%-31s %6.2f $\n", "Gastos de envío:", envio);
        System.out.printf("%-31s %6.2f $\n", "TOTAL:", total);
        sc.close();
    }
}
