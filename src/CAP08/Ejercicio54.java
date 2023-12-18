package CAP08;

/* Crea las funciones cuyas cabeceras se muestran a continuación, observa que
tienen el mismo nombre:
public static int ocurrencias(int digito, int n)
public static int ocurrencias(int digito, int[] a)
La función ocurrencias devuelve el número de veces que aparece un dígito
dentro de un número (primera función) o bien el número de veces que aparece
un dígito en una serie de números contenidos en un array (segunda función). */
public class Ejercicio54 {
    public static void main(String[] args) {
        System.out.printf("El digito %d aparece %d veces en %d\n", 3, ocurrencias(3, 345336383), 345336383);
        int[] a = { 1714, 1811, 91, 111 };
        System.out.printf("El dígito %d aparece %d veces en el array", 1, ocurrencias(1, a));
    }

    public static int ocurrencias(int digito, int n) {
        int largo = Paquete1a14.digitos(n);
        int cont = 0;
        for (int i = 1; i <= largo; i++) {
            int cifra = n % 10;
            n /= 10;
            if (cifra == digito)
                cont++;
        }
        return cont;
    }

    public static int ocurrencias(int digito, int[] a) {
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            int largo = Paquete1a14.digitos(a[i]);
            int copiaNum = a[i];
            for (int j = 1; j <= largo; j++) {
                int cifra = copiaNum % 10;
                copiaNum /= 10;
                if (cifra == digito)
                    cont++;
            }
        }
        return cont;
    }
}
