package CAP04;

import java.util.Scanner;

/* Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8). */
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el día de la semana en el que estamos: ");
        String dia = sc.nextLine();
        System.out.print("Introduzca cuántas personas van a ver la película: ");
        float personas = sc.nextInt();
        System.out.println("¿Tiene tarjeta CineCampa?");
        System.out.println("1. Sí | 2. No");
        float tarjeta = sc.nextInt();
        sc.close();
        String texto;
        if (tarjeta == 1) {
            tarjeta = 0.90f;
            texto = "Sí";
        } else {
            tarjeta = 1;
            texto = "No";
        }
        float precioBase = 8;
        float total;
        switch (dia.toLowerCase()) {
            case "lunes":
                total = (precioBase * personas) * tarjeta;
                break;
            case "martes":
                total = (precioBase * personas) * tarjeta;
                break;
            case "miercoles":
                precioBase = 5;
                total = (precioBase * personas) * tarjeta;
                break;
            case "jueves":
                if ((int) personas % 2 == 0) {
                    precioBase = 5.5f;
                    total = (precioBase * personas) * tarjeta;
                    precioBase = 8;
                } else {
                    precioBase = 5.5f;
                    total = (precioBase * (personas - 1));
                    total = (total + 8) * tarjeta;
                    precioBase = 8;
                }
                break;
            case "viernes":
                total = (precioBase * personas) * tarjeta;
                break;
            case "sabado":
                total = (precioBase * personas) * tarjeta;
                break;
            default:
                System.out.println("Introduzca un día válido, por favor");
                total = 0;
                break;
        }
        System.out.printf("%-17s %9s\n", "Día de la semana:", dia.toUpperCase());
        System.out.printf("%-17s %9.2f\n", "Precio base hoy:", precioBase);
        System.out.printf("%-17s %9d\n", "Total de personas", (int) personas);
        System.out.printf("%-17s %9s\n", "Tarjeta CineCampa", texto);
        System.out.printf("%-17s %9.2f\n", "TOTAL A PAGAR:", total);
    }
}
