package CAP05;

/* Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while. */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Mostrando los números del 320 al 160");
        boolean i = true;
        int acum = 320;
        do {
            System.out.print(acum + " ");
            acum -= 20;
            if (acum == 140)
                i = false;
        } while (i);
    }
}
