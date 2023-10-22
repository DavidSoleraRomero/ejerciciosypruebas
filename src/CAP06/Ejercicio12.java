package CAP06;

/* Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. */
public class Ejercicio12 {
    public static void main(String[] args) {
        int acum = 0;
        while (true) {
            int ascii = (int) (Math.random() * 95 + 32);
            System.out.print((char) ascii);
            acum++;
            if (acum == 125000)
                break;
        }
    }
}
