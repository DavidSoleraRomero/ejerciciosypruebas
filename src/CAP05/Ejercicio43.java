package CAP05;

/* Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena). */
public class Ejercicio43 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        long num = Long.parseLong(System.console().readLine());
        long num2 = num;
        int largo = 0;
        while (num2 > 0) {
            num2 = num2 / 10;
            largo++;
        }
        System.out.print("¿A partir de qué posición quieres partirlo?: ");
        long partir = Long.parseLong(System.console().readLine());
        if (partir <= largo & partir > 1 & largo >= 2) {
            long resto = 1;
            long comas = 1;
            for (int i = 1; i <= largo; i++) {
                resto = resto * 10;
                if (i > 1) {
                    comas = comas * 10;
                }
            }
            String primeraP = "";
            String segundaP = "";
            for (int i = 1; i <= largo; i++) {
                long cifra = num % resto;
                if (i < largo) {
                    cifra = cifra / comas;
                    comas = comas / 10;
                }
                if (i < partir) {
                    primeraP = primeraP + cifra;
                } else {
                    segundaP = segundaP + cifra;
                }
                resto = resto / 10;
            }
            long longPrimeraP = Long.parseLong(primeraP);
            long longSegundaP = Long.parseLong(segundaP);
            System.out.printf("La primera parte del número es %d\n", longPrimeraP);
            System.out.printf("La segunda parte del número es %d", longSegundaP);
        } else {
            System.out.println(
                    "Introduce un Nº para partir inferior (y mayor que 1) al largo del primer Nº introducido (mayor de 2 cifras)");
        }
    }
}