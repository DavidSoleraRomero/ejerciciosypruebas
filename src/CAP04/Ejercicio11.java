package CAP04;

/* Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche. */
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Programa para conocer cuántos segundos quedan hasta medianoche");
        System.out.println("Introduzca la parte de la hora (0 - 23)");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca la parte de los minutos (0 - 59)");
        int minutos = Integer.parseInt(System.console().readLine());
        if ((hora > 23) || (minutos > 59)) {
            System.out.println("Hora o minutos inválidos, reinicie el programa");
        } else {
            int medianoche = 86400;
            medianoche = medianoche - (hora * 60 * 60) - (minutos * 60);
            System.out.printf("Faltan %d segundos hasta medianoche", medianoche);
        }
    }
}
