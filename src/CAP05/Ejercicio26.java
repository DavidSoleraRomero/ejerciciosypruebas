package CAP05;

import java.util.Scanner;

/* Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. */
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        String longitud = num + "";
        int acum = 0;
        System.out.print("Introduce un dígito que puede estar (o no) dentro del nº anterior: ");
        int digito = sc.nextInt();
        double contieneUno;
        String contieneMas = "", posicion = "";
        int resto = (int) Math.pow(10, longitud.length()); /*
                                                            * resto se utiliza para ir sacando las cifras, trabaja con
                                                            * comas
                                                            */
        int comas = (int) Math.pow(10, longitud.length() - 1); /*
                                                                * comas se encarga de eliminar las comas del número que
                                                                * resulta de resto
                                                                */
        int pos = 1;
        for (int i = 1; i <= longitud.length(); i++) {
            int iultimaCifra = num % resto;
            if ((i < longitud.length())) { /* Se usa comas a partir del segundo bucle */
                iultimaCifra = iultimaCifra / comas;
                comas = comas / 10; /* Decrementamos comas para el siguiente bucle */
            }
            if (iultimaCifra == digito) { /* Comprueba con el dígito y */
                acum++; /* guarda la posición, las veces que ha repetido y más cosas */
                contieneUno = iultimaCifra;
                contieneMas = contieneMas + contieneUno;
                posicion = posicion + " " + pos;
            }
            resto = resto / 10; /* Decrementamos resto para el siguiente bucle */
            pos++;
        }
        if (acum == 1) { /* Comprobamos si es un nº repetido, varios o ninguno */
            System.out.println("Coincide un nº en la posición nº" + posicion);
        } else if (acum > 1) {
            System.out.println("Coincide más de un nº en las posiciones" + posicion);
        } else {
            System.out.println("No coincide ningún nº");
        }
        sc.close();
    }
}
