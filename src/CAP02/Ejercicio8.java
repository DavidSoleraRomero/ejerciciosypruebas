package CAP02;

/* Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatena-
ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado? */
public class Ejercicio8 {
    public static void main(String[] args) {
        char uno = 'D';
        char dos = 'A';
        char tres = 'V';
        char cuatro = 'I';
        char cinco = 'S';
        String concatena = uno + "" + dos + "" + tres + "" + cuatro + "" + cinco;
        System.out.println(concatena);
    } // Nos da el problema de que se transforma en int (debido al código ASCII)
} // Podemos solucionar el problem añadiendo comillas tras cada variable de tipo
  // char
