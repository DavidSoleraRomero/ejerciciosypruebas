package CAP05;

import java.util.Scanner;

/* Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos. */
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long num = sc.nextLong();
        sc.close();
        boolean contiene;
        String aparecen = "Los dígitos que aparecen son:";
        String noAparecen = "Los dígitos que no aparecen son:";
        // Bucle para comprobar los dígitos que aparecen y NO aparecen a la vez
        for (int i = 0; i <= 9; i++) {
            contiene = false;
            long copia = num;
            while (copia > 0) {
                if (copia % 10 == i) {
                    contiene = true;
                }
                copia = copia / 10;
            }
            if (contiene == true) {
                aparecen = aparecen + " " + i;
            } else {
                noAparecen = noAparecen + " " + i;
            }
        }
        // Salida de las cadenas de texto por pantalla
        System.out.println(aparecen);
        System.out.println(noAparecen);
    }
}