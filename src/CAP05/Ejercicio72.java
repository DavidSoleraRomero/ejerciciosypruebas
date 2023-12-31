package CAP05;

/* Realizaré el ejercicio de doble pirámide, pero invertida */
public class Ejercicio72 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce la altura de la primera pirámide: ");
            int alt1 = Funciones.entradaInt();
            System.out.print("Introduce la altura de la segunda pirámide: ");
            int alt2 = Funciones.entradaInt();
            int mayor = Funciones.mayor(alt1, alt2);
            int cont = 1;
            for (int i = 1; i <= mayor; i++) {
                if (alt1 >= alt2) {
                    Funciones.espaciosI(i);
                    Funciones.asteriscosI(alt1, i);
                    if (i <= alt2) {
                        System.out.printf("%-" + i + "s", " ");
                        Funciones.espaciosI(cont);
                        Funciones.asteriscosI(alt2, cont);
                        cont++;
                    }
                } else {
                    if (i <= alt1) {
                        Funciones.espaciosI(cont);
                        Funciones.asteriscosI(alt1, cont);
                        cont++;
                        System.out.printf("%-" + i + "s", " ");
                    } else
                        System.out.printf("%-" + (alt1 * 2) + "s", " ");
                    Funciones.espaciosI(i);
                    Funciones.asteriscosI(alt2, i);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error, se esperaba un nº.");
        }
    }
}
