package CAP05;

/* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle while. */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Mostrando los números del 320 al 160");
        boolean i = true;
        int acum = 320;
        while (i) {
            System.out.print(acum + " ");
            acum -= 20;
            if (acum < 160)
                break;
        }
    }
}
