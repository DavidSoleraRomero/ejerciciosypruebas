package CAP06;

/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. */
public class Ejercicio12v2 {
    public static void main(String[] args) {
        int cont = 0;
        while (cont != Integer.MAX_VALUE) {
            System.out.print((char) ((Math.random() * 95 + 32)));
            cont++;
        }
    }
}
