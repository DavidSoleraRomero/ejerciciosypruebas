package CAP08;

/* Crea una función con la siguiente cabecera:

public static String convierteEnPalotes(int n)

Esta función convierte el número n al sistema de palotes y lo devuelve en una
cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
para comprobar que funciona bien. Desde la función no se debe mostrar nada
por pantalla, solo se debe usar print desde el programa principal. */
public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.println(convierteEnPalotes(470213));
    }

    public static String convierteEnPalotes(int n) {
        int largo = Paquete1a14.digitos(n);
        n = Paquete1a14.voltea(n);
        String palotes = "";
        for (int i = 1; i <= largo; i++) {
            int iteraciones = n % 10;
            n /= 10;
            for (int j = 1; j <= iteraciones; j++) {
                palotes = palotes + "| ";
            }
            if (i != largo)
                palotes = palotes + "- ";
        }
        return palotes;
    }
}
