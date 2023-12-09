package CAP07.UNIDIMENSIONAL;

import java.util.Arrays;

/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado. */
public class Ejercicio14v3 {
    public static void main(String[] args) {
        try {
            String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
            String[] palabras = new String[8];
            for (int i = 0; i < palabras.length; i++) {
                System.out.print("Introduzca palabras (" + (i + 1) + "/8): ");
                palabras[i] = System.console().readLine();
            }
            int cont = 0;
            String[] aux = new String[8];
            for (int i = 0; i < aux.length; i++) {
                if (Arrays.asList(colores).contains(palabras[i])) {
                    aux[cont] = palabras[i];
                    cont++;
                }
            }
            for (int i = 0; i < aux.length; i++) {
                if (!(Arrays.asList(colores).contains(palabras[i]))) {
                    aux[cont] = palabras[i];
                    cont++;
                }
            }
            System.out.println();
            for (String i : aux) {
                System.out.printf("%s ", i);
            }
        } catch (Exception e) {
            System.out.println("\nError inesperado");
        }
    }
}
