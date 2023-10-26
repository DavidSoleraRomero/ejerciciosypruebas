package CAP07;

/* Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas. */
public class Ejercicio4 {
    public static void main(String[] args) {
        long[] numero = new long[20];
        long[] cuadrado = new long[20];
        long[] cubo = new long[20];
        System.out.printf("%6s  %8s   %7s\n", "Número", "Cuadrado", "Cubo");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (long) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
            System.out.printf("%6d  %8d   %7d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }

}
