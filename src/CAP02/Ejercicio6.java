package CAP02;

/* Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable. */
public class Ejercicio6 {
    public static void main(String[] args) {
        double factura, iva, total;
        factura = 1000;
        iva = 1.21;
        total = factura * iva;
        System.out.println(
                "La factura es de " + factura + " euros, y la factura total es de " + total + " euros, con IVA.");
    }
}
