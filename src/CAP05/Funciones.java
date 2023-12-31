package CAP05;

public class Funciones {

    /* Calcula el largo de un número */
    public static long largo(long num) {
        long largo = 0;
        while (num > 0) {
            num /= 10;
            largo++;
        }
        return largo;
    }

    /*
     * Las dos siguientes funciones trabajan en conjunto
     * Calculan la cantidad de 0 necesaria para sacar cifra a cifra
     * Desde el primer número hasta el último aprovechando el largo
     */
    public static long sacaResto(long largo) {
        long resto = 1;
        for (int i = 1; i <= largo; i++) {
            resto *= 10;
        }
        return resto;
    }

    public static long sacaComas(long largo) {
        long comas = 1;
        for (int i = 1; i <= largo; i++) {
            if (i > 1) {
                comas *= 10;
            }
        }
        return comas;
    }

    /* Saca factorial de un número */
    public static void Factorial(long num) {
        long acum = 0;
        long acum2 = 1;
        for (int i = 1; i <= num; i++) {
            acum = acum2 * i;
            System.out.printf("%d! = %d\n", i, acum);
            acum2 = acum;
        }
    }

    public static long sacaFactorial(long num) {
        long f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    /* Saca si es divisor o no de un número */
    public static boolean esDivisor(int num1, int num2) {
        return (num1 % num2) == 0;
    }

    /* Saca si es múltiplo o no de un número */
    public static boolean esMultiplo(int num1, int num2) {
        return (num1 % num2) == 0;
    }

    /* Comprueba si un número es primo */
    public static boolean esPrimo(int num) {
        boolean primo = true;
        int acum = 2;
        while (primo == true & acum <= num / 2) {
            if (num % acum == 0) {
                primo = false;
            }
            acum++;
        }
        return primo;
    }

    /* Saca los n primeros primos */
    public static void primerosPrimos(int n) {
        int cont = 1;
        int nums = 1;
        while (cont <= n) {
            if (esPrimo(nums)) {
                System.out.printf("%d. %d es primo.\n", cont, nums);
                cont++;
            }
            nums++;
        }
    }

    /* Llama a la entrada para un ENTERO */
    public static int entradaInt() {
        return Integer.parseInt(System.console().readLine());
    }

    /* Llama a la entrada para un STRING */
    public static String entradaString() {
        return System.console().readLine();
    }

    /* Voltea el número entregado como parámetro */
    public static long voltea(long num) {
        long nuevoNum = 0;
        long largo = Funciones.largo(num);
        for (int i = 1; i <= largo; i++) {
            long cifra = num % 10;
            num /= 10;
            nuevoNum = nuevoNum * 10 + cifra;
        }
        return nuevoNum;
    }

    /* Pinta espacios para una pirámide */
    public static void espacios(int altura, int i) {
        for (int j = 1; j <= altura - i; j++) {
            System.out.print(" ");
        }
    }

    /* Pinta asteriscos para una pirámide */
    public static void asteriscos(int i) {
        for (int j = 1; j <= i * 2 - 1; j++) {
            System.out.print("*");
        }
    }

    /* Pinta espacios para una pirámide invertida */
    public static void espaciosI(int i) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
    }

    /* Pinta asteriscos para una pirámide invertida */
    public static void asteriscosI(int altura, int i) {
        altura = altura - (i - 1);
        for (int j = 1; j <= altura * 2 - 1; j++) {
            System.out.print("*");
        }
    }

    /* Comprueba, entre 2 num, el más alto */
    public static int mayor(int num1, int num2) {
        return (num1 >= num2) ? num1 : num2;
    }
}
