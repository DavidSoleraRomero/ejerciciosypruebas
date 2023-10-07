package CAP04;

/* Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados. */
public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.print("Introduce la base imponible: ");
        int baseImp = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = System.console().readLine();
        System.out.print("Introduce el código promocional (nopro, mitad, meno5, 5porc): ");
        String promo = System.console().readLine();

        float precioIva;
        float iva;
        String porcentaje;

        switch (tipoIva.toLowerCase()) {
            case "general":
                iva = 0.21f;
                precioIva = baseImp + (baseImp * iva);
                porcentaje = "(21%)";
                break;
            case "reducido":
                iva = 0.10f;
                precioIva = baseImp + (baseImp * iva);
                porcentaje = "(10%)";
                break;
            case "superreducido":
                iva = 0.04f;
                precioIva = baseImp + (baseImp * iva);
                porcentaje = "(4%)";
                break;
            default:
                iva = 1.21f;
                precioIva = baseImp * iva;
                porcentaje = "(21%)";
                break;
        }

        float precioPromo;
        float descPromo;
        String nomPromo;

        switch (promo) {
            case "nopro":
                precioPromo = precioIva;
                descPromo = -0;
                nomPromo = "(nopro)";
                break;
            case "mitad":
                precioPromo = precioIva - (precioIva / 2);
                descPromo = -(precioIva / 2);
                nomPromo = "(mitad)";
                break;
            case "meno5":
                precioPromo = precioIva - 5;
                descPromo = -5;
                nomPromo = "(meno5)";
                break;
            case "5porc":
                precioPromo = precioIva - (precioIva * 0.05f);
                descPromo = -(precioIva * 0.05f);
                nomPromo = "(5porc)";
                break;
            default:
                precioPromo = precioIva;
                descPromo = -0;
                nomPromo = "(nopro)";
                break;
        }

        System.out.printf("%-20s %6.2f\n", "Base imponible", (float) baseImp);
        System.out.printf("%-3s %-16s %6.2f\n", "IVA", porcentaje, ((float) (baseImp) * iva));
        System.out.printf("%-20s %6.2f\n", "Precio con IVA", precioIva);
        System.out.printf("%-11s %-8s %6.2f\n", "Cód. Promo.", nomPromo, descPromo);
        System.out.printf("%-20s %6.2f\n", "TOTAL", precioPromo);

    }
}
