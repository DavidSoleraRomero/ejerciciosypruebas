package CAP08;

/* Realiza un programa que rellene un array con 10 números aleatorios com-
prendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
continuación, el programa indicará para cada uno de ellos si es un número
primo y/o un capicúa de la forma que muestra el ejemplo. */
public class Ejercicio51 {
    public static void main(String[] args) {
        int[] primosYCapicuas = rellenaYLeeArray();
        analizaArray(primosYCapicuas);
    }

    public static int[] rellenaYLeeArray() {
        int[] aux = new int[10];
        System.out.println("Array generado: ");
        for (int i = 0; i < aux.length; i++) {
            aux[i] = (int) (Math.random() * 99 + 2);
            System.out.printf("%d ", aux[i]);
        }
        System.out.println();
        return aux;
    }

    public static void analizaArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (Paquete1a14.esCapicua(a[i]) & Paquete1a14.esPrimo(a[i]))
                System.out.printf("El %-3d %s\n", a[i], primoCapicua(1));
            else if (Paquete1a14.esCapicua(a[i]) & (!Paquete1a14.esPrimo(a[i])))
                System.out.printf("El %-3d %s\n", a[i], primoCapicua(2));
            else if ((!Paquete1a14.esCapicua(a[i]) & (!Paquete1a14.esPrimo(a[i]))))
                System.out.printf("El %-3d %s\n", a[i], primoCapicua(3));
            else if ((!Paquete1a14.esCapicua(a[i])) & Paquete1a14.esPrimo(a[i]))
                System.out.printf("El %-3d %s\n", a[i], primoCapicua(4));
        }
    }

    public static String primoCapicua(int i) {
        switch (i) {
            case 1:
                return " es primo y es capicúa";
            case 2:
                return " no es primo y es capicúa";
            case 3:
                return " no es primo y no es capicúa";
            default:
                return " es primo y no es capicúa";
        }
    }
}
