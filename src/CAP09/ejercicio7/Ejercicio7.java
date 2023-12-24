package CAP09.ejercicio7;

/* Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas dispo-
nibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
La clase Zona con sus atributos y métodos se muestra a continuación: */
public class Ejercicio7 {
    public static void main(String[] args) {
        ExpoCochesCampanillas expo1 = new ExpoCochesCampanillas();
        int opcion = 0;
        do {
            expo1.menu();
            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            expo1.ejecutaOpcion(opcion);
        } while (opcion != 7);
    }
}
