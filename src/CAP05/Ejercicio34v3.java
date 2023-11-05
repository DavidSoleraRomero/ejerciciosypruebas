package CAP05;

public class Ejercicio34v3 {
    public static void main(String[] args) {
        try {
            System.out.print("Introduce un nº: ");
            long num1 = Long.parseLong(System.console().readLine());
            System.out.print("Introduce otro nº: ");
            long num2 = Long.parseLong(System.console().readLine());
            long largo1 = largo(num1);
            long largo2 = largo(num2);
            if (num1 > 0 & num2 > 0 & largo1 == largo2) {
                long resto1 = primeraCifra(num1);
                long comas1 = quitaComas(num1);
                long pares = 0;
                long impares = 0;
                for (int i = 1; i <= largo1; i++) {
                    long cifra1 = num1 % resto1;
                    if (i < largo1)
                        cifra1 = cifra1 / comas1;
                    if (cifra1 % 2 == 0)
                        pares = pares * 10 + cifra1;
                    else
                        impares = impares * 10 + cifra1;
                    long cifra2 = num2 % resto1;
                    resto1 /= 10;
                    if (i < largo2) {
                        cifra2 = cifra2 / comas1;
                        comas1 /= 10;
                    }
                    if (cifra2 % 2 == 0)
                        pares = pares * 10 + cifra2;
                    else
                        impares = impares * 10 + cifra2;
                }
                System.out.printf("El número formado por pares es el %d\n", pares);
                System.out.printf("El número formado por impares es el %d", impares);
            } else
                System.out.println("Se esperaban dos números positivos y de la misma longitud");
        } catch (Exception e) {
            System.out.println("Se ha producido un error. Se esperaba un nº.");
        }
    }

    public static long largo(long num) {
        long largo = 0;
        while (num > 0) {
            num /= 10;
            largo++;
        }
        return largo;
    }

    public static long primeraCifra(long num) {
        long resto = 1;
        while (num > 0) {
            num /= 10;
            resto *= 10;
        }
        return resto;
    }

    public static long quitaComas(long num) {
        long comas = 1;
        int acum = 0;
        while (num > 0) {
            num /= 10;
            if (acum > 0)
                comas *= 10;
            acum++;
        }
        return comas;
    }
}
