package CAP09.ejercicio6;

public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }

    public static void suma(Tiempo h1, Tiempo h2) {
        int hora = h1.horas + h2.horas;
        int min = h1.minutos + h2.minutos;
        int seg = h1.segundos + h2.segundos;
        while (seg >= 60) {
            seg -= 60;
            min++;
        }
        while (min >= 60) {
            min -= 60;
            hora++;
        }
        System.out.printf("%dh %dm %ds", hora, min, seg);
    }

    public static void resta(Tiempo h1, Tiempo h2) {
        int hora = h1.horas - h2.horas;
        int min = h1.minutos - h2.minutos;
        int seg = h1.segundos - h2.segundos;
        if (seg < 0) {
            seg += 60;
            min--;
        }
        if (min < 0) {
            min += 60;
            hora--;
        }
        System.out.printf("%dh %dm %ds", hora, min, seg);
    }
}
