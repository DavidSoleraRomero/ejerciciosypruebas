package CAP06;

/* Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */
public class Ejercicio9v2 {
    public static void main(String[] args) {
        int contP = 0;
        int cont = 0;
        int num = 0;
        do {
            num = (int) (Math.random() * 101);
            if (num % 2 == 0) {
                contP++;
                System.out.print(num + " ");
            }
            cont++;
        } while (num != 24);
        System.out.printf("\nSe han generado %d números pares y %d números en total.", contP, cont);
    }
}
