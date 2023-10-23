package CAP06;

import CAP05.Funciones;

/* Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos. */
public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para elegir un dígito al azar: ");
        try {
            long num = Integer.parseInt(System.console().readLine());
            long largo = Funciones.largo(num);
            long copia = num;
            long posDigito = (long) (Math.random() * largo + 1);
            long acum = 1;
            while (copia > 0) {
                long cifra = copia % 10;
                if (acum == posDigito) {
                    System.out.printf("Sacamos el número %d", cifra);
                    break;
                }
                copia /= 10;
                acum++;
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }
}
