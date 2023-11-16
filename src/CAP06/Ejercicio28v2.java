package CAP06;

/* Realiza un programa que sea capaz de recolocar los números de un array de
fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
del array. A continuación generará un array con ese tamaño con números
enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
irá colocando desde fuera hacia adentro los números de tal forma que el
primero se coloca en la primera posición, el segundo en la última, el tercero
en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
el array resultado. */
public class Ejercicio28v2 {
    public static void main(String[] args) {
        int[] numeros = new int[14];
        System.out.print("\nArray original  ");
        for (int i = 0; i <= 13; i++) {
            System.out.printf(" %10s", ("Columna " + i));
        }
        System.out.printf("\n%-16s", " ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 201);
            System.out.printf("%11d", numeros[i]);
        }
        int[] aux = new int[14];
        int cont = 0;
        int tnoc = 13;
        for (int i = 0; i < aux.length; i++) {
            if (i % 2 == 0) {
                aux[cont] = numeros[i];
                cont++;
            } else {
                aux[tnoc] = numeros[i];
                tnoc--;
            }
        }
        System.out.print("\n\nArray modificado");
        for (int i = 0; i <= 13; i++) {
            System.out.printf(" %10s", ("Columna " + i));
        }
        System.out.printf("%-21s", " ");
        for (int i : aux) {
            System.out.printf("%11d", i);
        }
        System.out.println("\n");
    }
}
