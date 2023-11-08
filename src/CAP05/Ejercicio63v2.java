package CAP05;

public class Ejercicio63v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Altura de la 1ª pirámide: ");
            int alt1 = Funciones.entradaInt();
            System.out.print("Altura de la 2ª pirámide: ");
            int alt2 = Funciones.entradaInt();
            int mayor;
            if (alt1 >= alt2) /* Comrpueba pirámide más alta */
                mayor = alt1;
            else
                mayor = alt2;
            int aux = 1;
            for (int i = 1; i <= mayor; i++) {
                if (alt1 >= alt2) {
                    for (int esp1 = 1; esp1 <= mayor - i; esp1++) {
                        System.out.print(" ");
                    }
                    for (int ast1 = 1; ast1 <= i * 2 - 1; ast1++) {
                        System.out.print("*");
                    }
                    if (alt2 - 1 >= mayor - i) {
                        if (mayor - i != 0)
                            System.out.printf("%-" + (mayor + 1 - i) + "s", " ");
                        else
                            System.out.print(" ");
                        for (int esp2 = 1; esp2 <= alt2 - aux; esp2++) {
                            System.out.print(" ");
                        }
                        for (int ast2 = 1; ast2 <= aux * 2 - 1; ast2++) {
                            System.out.print("*");
                        }
                        aux++;
                    }
                } else {
                    if (alt1 - 1 >= mayor - i) {
                        for (int esp1 = 1; esp1 <= mayor - i; esp1++) {
                            System.out.print(" ");
                        }
                        for (int ast1 = 1; ast1 <= i * 2 - 1; ast1++) {
                            System.out.print("*");
                        }
                    }
                    if (alt1 - i != 0)
                        System.out.printf("%-" + (alt1 + 1 - i) + "s", " ");
                    else
                        System.out.print(" ");
                    for (int esp2 = 1; esp2 <= alt2 - aux; esp2++) {
                        System.out.print(" ");
                    }
                    for (int ast2 = 1; ast2 <= aux * 2 - 1; ast2++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº entero.");
        }
    }
}
