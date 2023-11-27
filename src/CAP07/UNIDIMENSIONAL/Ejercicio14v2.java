package CAP07.UNIDIMENSIONAL;

/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado. */
public class Ejercicio14v2 {
    public static void main(String[] args) {
        try {
            String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
            String[] palabras = new String[8];
            String[] aux = new String[8];
            for (int i = 0; i < 8; i++) {
                System.out.printf("Introduce una palabra [%d / %d]: ", i, palabras.length - 1);
                palabras[i] = System.console().readLine();
            }
            System.out.printf("%-22s", "\nArray original --> ");
            for (String i : palabras) {
                System.out.printf("%10s", i);
            }
            int cont = 0;
            for (int i = 0; i < palabras.length; i++) {
                boolean encontrado = false;
                for (int j = 0; j < colores.length; j++) {
                    if (palabras[i].toLowerCase().equals(colores[j]))
                        encontrado = true;
                }
                if (encontrado == true) {
                    aux[cont] = palabras[i];
                    cont++;
                }
            }
            for (int i = 0; i < palabras.length; i++) {
                boolean encontrado = false;
                for (int j = 0; j < colores.length; j++) {
                    if (palabras[i].toLowerCase().equals(colores[j]))
                        encontrado = true;
                }
                if (encontrado == false) {
                    aux[cont] = palabras[i];
                    cont++;
                }
            }
            System.out.printf("%-22s", "\nArray modificado --> ");
            for (String i : aux) {
                System.out.printf("%10s", i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado.");
        }
    }
}
