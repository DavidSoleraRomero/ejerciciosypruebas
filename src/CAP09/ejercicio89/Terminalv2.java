package CAP09.ejercicio89;

public class Terminalv2 {

    private String numero;
    private int tiempoDeConversacion;
    private static int tiempoTotalDeConversacion;

    public Terminalv2() throws Exception {
        throw new Exception("Utilice el constructor con parámetros");
    }

    public Terminalv2(String numero) {
        this.numero = numero;
    }

    public static int getTiempoTotalDeConversacion() {
        return tiempoTotalDeConversacion;
    }

    public void llama(Terminalv2 t, int segundos) {
        this.tiempoDeConversacion += segundos;
        t.tiempoDeConversacion += segundos;
        tiempoTotalDeConversacion += segundos * 2;
    }

    @Override
    public String toString() {
        return "Nº " + this.numero + " - " + this.tiempoDeConversacion + "s de conversación";
    }

}
