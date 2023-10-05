package CAP02;

/* Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable. */
public class Ejercicio6 {
    public static void main(String[] args) {
        double factura, iva, total;
        factura = 22.75;
        iva = 22.75 * 0.21;
        total = factura * 1.21;
        System.out.printf("%-15s   %5.2f\n", "Base imponible", factura);
        System.out.printf("%-15s   %5.2f\n", "IVA", iva);
        System.out.println("-----------------------");
        System.out.printf("%-15s   %5.2f", "Total", total);
    }
}
