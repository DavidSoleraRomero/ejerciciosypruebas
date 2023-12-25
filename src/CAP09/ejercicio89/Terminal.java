package CAP09.ejercicio89;

public class Terminal {

    private String numero;
    private int segundos;

    public Terminal(String n) {
        this.numero = n;
        this.segundos = 0;
    }

    public void llama(Terminal t, int segundos) {
        this.segundos += segundos;
        t.segundos += segundos;
    }

    @Override
    public String toString() {
        return "Nº " + this.numero + " - " + this.segundos + "s de conversación";
    }

}
