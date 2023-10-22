package CAP06;

/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */
public class Ejercicio9 {
    public static void main(String[] args) {
        int num = 0;
        int acumTotal = 0;
        int acumPares = 0;
        while (num != 24) {
            num = (int) (Math.random() * 101);
            if (num % 2 == 0) {
                System.out.print(num + " ");
                acumPares++;
            }
            acumTotal++;
        }
        System.out.printf("\nSe han generado %d números en total.", acumTotal);
        System.out.printf("\nSe han generado %d números pares.", acumPares);
    }
}
