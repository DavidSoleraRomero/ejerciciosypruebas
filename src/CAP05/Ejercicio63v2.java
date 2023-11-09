package CAP05;

public class Ejercicio63v2 {
    public static void main(String[] args) {
        try {
            System.out.print("Altura de la 1ª pirámide: ");
            int alt1 = Funciones.entradaInt();
            System.out.print("Altura de la 2ª pirámide: ");
            int alt2 = Funciones.entradaInt();
            int mayor = Funciones.mayor(alt1, alt2); /* Comprueba pirámide más alta y la guarda */
            int aux = 1;
            for (int i = 1; i <= mayor; i++) {
                if (alt1 >= alt2) { /* 1ª pirámide más alta */
                    Funciones.espacios(mayor, i); /* Pinta espacios 1ª pirámide */
                    Funciones.asteriscos(i); /* Pinta asteriscos 1ª pirámide */
                    if (alt2 - 1 >= mayor - i) { /* Comprueba que hemos llegado a la 2ª pirámide */
                        if (mayor - i != 0)
                            System.out.printf("%-" + (mayor + 1 - i) + "s", " "); /* Pinta espacios entre 1ª y 2ª */
                        else
                            System.out.print(" "); /* Pinta espacio en la última linea entre pirámides */
                        for (int esp2 = 1; esp2 <= alt2 - aux; esp2++) { /* Pinta espacios 2ª pirámide */
                            System.out.print(" ");
                        }
                        for (int ast2 = 1; ast2 <= aux * 2 - 1; ast2++) { /* Pinta asteriscos 2ª pirámide */
                            System.out.print("*");
                        }
                        aux++;
                    }
                } else { /* 2ª pirámide más alta */
                    if (alt1 - 1 >= mayor - i) { /* Comprueba que hemos llegado a la 1ª pirámide */
                        for (int esp1 = 1; esp1 <= alt1 - aux; esp1++) { /* Pinta espacios 1ª pirámide */
                            System.out.print(" ");
                        }
                        for (int ast1 = 1; ast1 <= aux * 2 - 1; ast1++) { /* Pinta asteriscos 1ª pirámide */
                            System.out.print("*");
                        }
                        if (alt1 + 1 - aux != 0) /* Pinta espacios entre 1ª y 2ª */
                            System.out.printf("%-" + (alt1 + 1 - aux) + "s", " ");
                        else
                            System.out.print(" "); /* Pinta espacio en la última linea entre pirámides */
                        aux++;
                    } else /* Si no hemos llegado a la 1ª pirámide aún */
                        System.out.printf("%-" + (alt1 * 2) + "s", " "); /* Pinta todos espacios de la 1ª pirámide */
                    Funciones.espacios(mayor, i); /* Pinta espacios 2ª pirámide */
                    Funciones.asteriscos(i); /* Pinta asteriscos 2ª pirámide */
                }
                System.out.println(); /* Salto de línea */
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº entero.");
        }
    }
}
