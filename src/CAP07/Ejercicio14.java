package CAP07;

/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado. */
public class Ejercicio14 {
    public static void main(String[] args) {
        String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
        String[] palabras = new String[8];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Introduce la palabra que quieras: ");
            String palabra = System.console().readLine();
            palabras[i] = palabra;
        }
        System.out.println(
                "Array original:\n*********************************************************************************************************************");
        System.out.printf("* %-9s * %10s * %10s * %10s * %10s * %10s * %10s * %10s * %10s *\n* %-9s * ", "Índice", "0",
                "1", "2", "3", "4", "5", "6", "7", "Contenido");
        for (String i : palabras) {
            System.out.printf("%10s * ", i);
        }
        System.out.println(
                "\n*********************************************************************************************************************\n");
        System.out.println(
                "Array modificado:\n*********************************************************************************************************************");
        int cont = 0;
        String[] organiza = new String[8];
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < 9; j++) {
                if (palabras[i].equals(colores[j])) {
                    organiza[cont] = palabras[i];
                    cont++;
                }
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            boolean encuentra = false;
            for (int j = 0; j < colores.length; j++) {
                if (palabras[i].equals(colores[j]))
                    encuentra = true;
                if (j == (colores.length - 1) & encuentra == false) {
                    organiza[cont] = palabras[i];
                    cont++;
                }
            }
        }
        System.out.printf("* %-9s * %10s * %10s * %10s * %10s * %10s * %10s * %10s * %10s *\n* %-9s * ", "Índice",
                "0", "1", "2", "3", "4", "5", "6", "7", "Contenido");
        for (String i : organiza) {
            System.out.printf("%10s * ", i);
        }
        System.out.println(
                "\n*********************************************************************************************************************");
    }
}