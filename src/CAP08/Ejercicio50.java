package CAP08;

/* Define la función mezcla con la siguiente cabecera:
public static int[] mezcla(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es
el resultado de mezclar los números de ambos de forma alterna, se coge un
número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
longitudes diferentes; por tanto, si se terminan los números de un array se
terminan de coger todos los que quedan del otro. */
public class Ejercicio50 {
    public static void main(String[] args) {
        int[] a = { 8, 9, 0, 3 };
        int[] b = { 1 };
        int[] aux = mezcla(a, b);
        for (int i = 0; i < aux.length; i++) {
            System.out.printf("%d ", aux[i]);
        }
    }

    public static int[] mezcla(int[] a, int[] b) {
        int contA = 0;
        int contB = 0;

        int[] aux = new int[a.length + b.length];
        for (int i = 0; i < aux.length; i++) {
            if (contA < a.length & i % 2 == 0 | contB >= b.length)
                aux[i] = a[contA];
            if (contB < b.length & i % 2 != 0 | contA >= a.length)
                aux[i] = b[contB];
            if (contA < a.length & i % 2 == 0 | contB >= b.length)
                contA++;
            else if (contB < b.length & i % 2 != 0 | contA >= a.length)
                contB++;
        }
        return aux;
    }
}
