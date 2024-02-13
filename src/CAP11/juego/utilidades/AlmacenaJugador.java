package CAP11.juego.utilidades;

import CAP11.juego.Jugador;

public interface AlmacenaJugador {

    public String serializa();

    public static Jugador deserializa(String serializado) {
        String[] jugador = serializado.split(";");
        return new Jugador(jugador[0], Integer.parseInt(jugador[1]), Integer.parseInt(jugador[2]),
                Integer.parseInt(jugador[3]), Integer.parseInt(jugador[4]));
    }

}
