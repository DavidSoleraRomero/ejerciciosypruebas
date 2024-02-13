package CAP11.juego;

import CAP11.juego.utilidades.Aleatorio;

public interface GestorPasiva {

    public static void aplicaPasiva(Jugador j) {
        if (j.getPasiva().getNumPasiva() == 1) {
            j.setMana(j.getMana() + Aleatorio.random(1, 2));
            j.setVida(j.getVida() + Aleatorio.random(0, 4));
            j.setPuntosAtaque(j.getPuntosAtaque() + Aleatorio.random(0, 2));
        } else if (j.getPasiva().getNumPasiva() == 2) {
            j.setPuntosAtaque(j.getPuntosAtaque() + Aleatorio.random(2, 6));
        } else {
            j.setVida(j.getVida() + Aleatorio.random(2, 6));
        }
    }

}
