package CAP04;

/* Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado. */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduce la hora actual");
        System.out.print("Hágalo sin minutos, por favor: ");
        int hora = Integer.parseInt(System.console().readLine());
        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días, son las " + hora);
        } else if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenas tardes, son las " + hora);
        } else {
            System.out.println("Buenas noches, son las " + hora);
        }
    }
}
