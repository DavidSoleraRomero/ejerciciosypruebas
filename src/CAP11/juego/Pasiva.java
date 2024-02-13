package CAP11.juego;

public class Pasiva {

    private int numPasiva;

    public Pasiva(int numPasiva) {
        this.numPasiva = numPasiva;
    }

    public int getNumPasiva() {
        return numPasiva;
    }

    @Override
    public String toString() {
        return (numPasiva == 1) ? "Hechizo arcáico"
                : (numPasiva == 2) ? "Luchador innato"
                        : "Coraza inmortal";
    }

}
