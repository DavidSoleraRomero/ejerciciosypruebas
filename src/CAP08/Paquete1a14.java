package CAP08;

public class Paquete1a14 {

    public static void main(String[] args) {
        System.out.println((esCapicua(1221) ? "Es capícua" : "No es capícua"));
        System.out.println(esPrimo(7) ? "Es primo" : "No es primo");
        System.out.printf("El siguiente primo de %d es %d\n", 71, siguientePrimo(71));
        System.out.printf("%d elevado a %d da %d\n", 2, 4, potencia(2, 4));
        System.out.printf("Posición %d del número %d es %d\n", 0, 51234, digitoN(51234, 0));
        System.out.printf("La primera posición de %d en %d es %d\n", 1, 56178, posicionDeDigito(56178, 1));
        System.out.printf("Quitamos la cantidad de nº (3) detrás de %d --> %d\n", 98725, quitaPorDetras(98725, 3));
        System.out.printf("Quitamos la cantidad de nº (2) delante de %d --> %d\n", 987257, quitaPorDelante(987257, 2));
        System.out.printf("Añadimos por detrás un nº a %d --> %d\n", 123456, pegaPorDetras(123456, 7));
        System.out.printf("Añadimos por delante un nº a %d --> %d\n", 123456, pegaPorDelante(123456, 7));
        int num = 4225422;
        int[] numeros = trozoDeNumero(num, 2);
        System.out.printf("%d se divide en: %d y %d\n", num, numeros[0], numeros[1]);
        System.out.printf("%d y %d componen %d\n", numeros[0], numeros[1], juntaNumeros(numeros));
    }

    public static int digitos(int num) {
        int digitos = 0;
        while (num > 0) {
            num = num / 10;
            digitos++;
        }
        return digitos;
    }

    public static int voltea(int num) {
        int volteado = 0;
        int digitos = digitos(num);
        for (int i = 1; i <= digitos; i++) {
            int cifra = num % 10;
            volteado = (volteado * 10) + cifra;
            num = num / 10;
        }
        return volteado;
    }

    public static boolean esCapicua(int num) {
        return (voltea(num) == num) ? true : false;
    }

    public static boolean esPrimo(int num) {
        if (num == 1)
            return true;
        boolean primo = true;
        for (int i = 2; i <= num / 2 & primo; i++) {
            if (num % i == 0)
                primo = false;
        }
        return primo;
    }

    public static int siguientePrimo(int num) {
        boolean primo = false;
        do {
            if (esPrimo(++num))
                primo = true;
        } while (!primo);
        return num;
    }

    public static int potencia(int num, int elevado) {
        int copiaNum = num;
        for (int i = 1; i < elevado; i++) {
            num = num * copiaNum;
        }
        return num;
    }

    public static int digitoN(int num, int pos) {
        int cifra = 0;
        num = voltea(num);
        for (int i = 0; i <= pos; i++) {
            cifra = num % 10;
            num /= 10;
        }
        if (num == 0)
            return -1;
        return cifra;
    }

    public static int posicionDeDigito(int num, int encuentra) {
        int posicion = -1;
        int cifra = 0;
        num = voltea(num);
        int largo = digitos(num);
        for (int i = 0; i < largo & posicion == -1; i++) {
            cifra = num % 10;
            num /= 10;
            if (cifra == encuentra)
                posicion = i;
        }
        return posicion;
    }

    public static int quitaPorDetras(int num, int quita) {
        return num / (int) (Math.pow(10, quita));
    }

    public static int quitaPorDelante(int num, int quita) {
        num = voltea(num);
        return voltea(num / (int) (Math.pow(10, quita)));
    }

    public static int pegaPorDetras(int num, int pega) {
        return (num * 10) + pega;
    }

    public static int pegaPorDelante(int num, int pega) {
        num = voltea(num);
        return voltea((num * 10) + pega);
    }

    public static int[] trozoDeNumero(int num, int pos) {
        int largo = digitos(num);
        int num1 = 0;
        int num2 = 0;
        int cifra = 0;
        num = voltea(num);
        for (int i = 0; i < largo; i++) {
            cifra = num % 10;
            num /= 10;
            if (i <= pos)
                num1 = num1 * 10 + cifra;
            else
                num2 = num2 * 10 + cifra;
        }
        int[] numeros = { num1, num2 };
        return numeros;
    }

    public static int juntaNumeros(int[] trozos) {
        int largoNum2 = digitos(trozos[1]);
        return (trozos[0]) * (int) (Math.pow(10, largoNum2)) + trozos[1];
    }

}
