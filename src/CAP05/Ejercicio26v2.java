package CAP05;

import java.util.Scanner;

/* Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. */
public class Ejercicio26v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        String longitud = num + "";
        int acum = 0;
        System.out.print("Introduce un dígito que puede estar (o no) dentro del nº anterior: ");
        int digito = sc.nextInt();
        int contieneUno;
        String contieneMas = "", posicion = "";
        int resto = 10, comas = 10, pos = longitud.length();
        for (int i = 1; i <= longitud.length(); i++) {
            int iultimaCifra = num % resto;
            if ((i > 1)) {
                iultimaCifra = iultimaCifra / comas;
                comas = comas * 10;
            }
            if (iultimaCifra == digito) {
                acum++;
                contieneUno = iultimaCifra;
                contieneMas = contieneMas + contieneUno;
                posicion = pos + " " + posicion;
            }
            resto = resto * 10;
            pos--;
        }
        if (acum == 1) {
            System.out.println("Coincide un nº en la posición nº " + posicion);
        } else if (acum > 1) {
            System.out.println("Coincide más de un nº en las posiciones " + posicion);
        } else {
            System.out.println("No coincide ningún nº");
        }
        sc.close();
    }
}
