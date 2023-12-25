package CAP09.ejercicio16;

public class Linea {

    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Línea formada por los puntos " + p1.getCoordenadas() + " y " + p2.getCoordenadas();
    }

}
