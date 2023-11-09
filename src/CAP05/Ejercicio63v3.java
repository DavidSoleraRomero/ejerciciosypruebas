package CAP05;

public class Ejercicio63v3 {
    public static void main(String[] args) {
        try {
            System.out.print("Altura de la 1ª pirámide: ");
            int alt1 = Funciones.entradaInt();
            System.out.print("Altura de la 2ª pirámide: ");
            int alt2 = Funciones.entradaInt();
            int mayor = Funciones.mayor(alt1, alt2); /* Comprueba pirámide más alta y la guarda */
            for (int i = 1; i <= mayor; i++) {
                if (alt1 >= alt2) {
                    Funciones.espacios(mayor, i); /* Pinta espacios 1ª */
                    Funciones.asteriscos(i); /* Pinta asteriscos 1ª */
                    if (alt2 - 1 >= mayor - i) {
                        if (mayor - i != 0)
                            System.out.printf("%-" + (mayor + 1 - i) + "s", " "); /* Espacios entre 1ª y 2ª */
                        else
                            System.out.print(" "); /* Espacio linea final */
                        Funciones.espacios(alt2, alt2 - alt1 + i); /* Pinta espacios 2ª */
                        Funciones.asteriscos(alt2 - alt1 + i); /* Pinta asteriscos 2ª */
                    }
                } else {
                    if (alt1 - 1 >= mayor - i) {
                        Funciones.espacios(alt1, alt1 - alt2 + i); /* Pinta espacios 1ª */
                        Funciones.asteriscos(alt1 - alt2 + i); /* Pinta asteriscos 1ª */
                        if (alt1 + 1 - (alt1 - alt2 + i) != 0)
                            System.out.printf("%-" + (alt1 + 1 - (alt1 - alt2 + i)) + "s", " "); /* Espacios 1ª - 2ª */
                        else
                            System.out.print(" "); /* Espacio linea final */
                    } else
                        System.out.printf("%-" + (alt1 * 2) + "s", " ");
                    Funciones.espacios(mayor, i); /* Pinta espacios 2ª */
                    Funciones.asteriscos(i); /* Pinta asteriscos 2ª */
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº entero.");
        }
    }
}