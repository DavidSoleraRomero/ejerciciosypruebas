package CAP09.ejercicio18;

public class Incidencia {

    private static int incidenciasTotales = 1;
    private static int incidenciasPendientes = 0;
    private int codigo;
    private int puesto;
    private String motivo;
    private String estado;

    public Incidencia(int puesto, String motivo) {
        this.codigo = incidenciasTotales++;
        this.puesto = puesto;
        this.motivo = motivo;
        this.estado = "Pendiente";
        incidenciasPendientes++;
    }

    public void resuelve(String solucion) {
        this.estado = "Resuelta - " + solucion;
        incidenciasPendientes--;
    }

    public static int getPendientes() {
        return incidenciasPendientes;
    }

    @Override
    public String toString() {
        return "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.motivo + " - " + this.estado;
    }

}
