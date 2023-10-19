package CAP05;

/* Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no. */
// Recorrer ambos números con un while usando un contador para cada uno de ellos
// Al terminar, comparar ambos contadores y el más grande gana.
public class Ejercicio62 {
    public static void main(String[] args) {
        System.out.print("Introduce un número aleatorio: ");
        long num = Long.parseLong(System.console().readLine());
        long copia = num;
        long bSuerte = 0;
        long mSuerte = 0;
        while (copia > 0) {
            long cifra = copia % 10;
            if (cifra == 3 | cifra == 7 | cifra == 8 | cifra == 9)
                bSuerte++;
            else
                mSuerte++;
            copia /= 10;
        }
        if (bSuerte == mSuerte)
            System.out.printf(
                    "Has introducido la misma cantidad de números de la mala y de la buena suerte. \nProbablemente NO es afortunado.");
        else if (bSuerte > mSuerte)
            System.out.printf("Has introducido un número afortunado, el %d", num);
        else
            System.out.printf("Has introducido un número NO afortunado, el %d", num);
    }
}