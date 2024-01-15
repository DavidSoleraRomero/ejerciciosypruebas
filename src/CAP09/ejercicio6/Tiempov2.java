package CAP09.ejercicio6;

public class Tiempov2 {

    private int hora;
    private int minutos;
    private int segundos;

    public Tiempov2() throws Exception {
        throw new Exception("Utilice el constructor con parámetros");
    }

    public Tiempov2(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public static void suma(Tiempov2 t1, Tiempov2 t2) {
        int horas = t1.hora + t2.hora;
        int minutos = t1.minutos + t2.minutos;
        int segundos = t1.segundos + t2.segundos;
        if (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }
        if (minutos >= 60) {
            minutos -= 60;
            horas++;
        }
        if (horas >= 24) {
            horas -= 24;
        }
        Tiempov2 horaAux = new Tiempov2(horas, minutos, segundos);
        System.out.println(horaAux);
    }

    public static void resta(Tiempov2 t1, Tiempov2 t2) {
        int horas = t1.hora - t2.hora;
        int minutos = t1.minutos - t2.minutos;
        int segundos = t1.segundos - t2.segundos;
        if (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }
        if (segundos <= -60) {
            segundos += 60;
            minutos--;
        }
        if (minutos >= 60) {
            minutos -= 60;
            horas++;
        }
        if (minutos <= -60) {
            minutos += 60;
            horas--;
        }
        if (horas >= 24) {
            horas -= 24;
        }
        if (horas <= -24) {
            horas += 24;
        }
        Tiempov2 horaAux = new Tiempov2(horas, minutos, segundos);
        if (horas < 0 | minutos < 0 | segundos < 0) {
            System.out.println("-(" + horaAux + ")");
        } else {
            System.out.println(horaAux);
        }
    }

    @Override
    public String toString() {
        return Math.abs(this.hora) + "h " + Math.abs(this.minutos) + "m " + Math.abs(this.segundos) + "s";
    }

}
