package CAP11.juego;

import CAP11.juego.utilidades.AlmacenaJugador;

public class Jugador implements AlmacenaJugador {

    private String nombre;
    private int vida;
    private Pasiva pasiva;
    private int puntosAtaque;
    private int mana;

    public Jugador(String nombre, int vida, int numPasiva, int puntosAtaque, int mana) {
        this.vida = vida;
        this.pasiva = new Pasiva(numPasiva);
        this.puntosAtaque = puntosAtaque;
        this.mana = mana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Pasiva getPasiva() {
        return pasiva;
    }

    public void setPasiva(Pasiva pasiva) {
        this.pasiva = pasiva;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String serializa() {
        return String.format("%s;%d;%d;%d;%d",
                this.nombre, this.vida, this.pasiva.getNumPasiva(), this.puntosAtaque, this.mana);
    }

    @Override
    public String toString() {
        String ret = String.format("Nombre: %s\nVida: %d\nPasiva: %s\nPuntos de ataque: %d\nManá: %d",
                this.nombre, this.vida, this.pasiva.toString(), this.puntosAtaque, this.mana);
        return ret;
    }

}
