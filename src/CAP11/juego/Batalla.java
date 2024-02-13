package CAP11.juego;

import java.util.ArrayList;

public class Batalla {

    private Jugador jugadorUno;
    private ArrayList<String> movimientosJugadorUno;

    private Jugador jugadorDos;
    private ArrayList<String> movimientosJugadorDos;

    private int rondasTotales;

    public Batalla(Jugador jugadorUno, ArrayList<String> movimientosJugadorUno, Jugador jugadorDos,
            ArrayList<String> movimientosJugadorDos, int rondasTotales) {
        this.jugadorUno = jugadorUno;
        this.movimientosJugadorUno = movimientosJugadorUno;
        this.jugadorDos = jugadorDos;
        this.movimientosJugadorDos = movimientosJugadorDos;
        this.rondasTotales = rondasTotales;
    }

    public Batalla(Jugador jugadorUno, Jugador jugadorDos, int rondasTotales) {
        this.jugadorUno = jugadorUno;
        this.movimientosJugadorUno = new ArrayList<>();
        this.jugadorDos = jugadorDos;
        this.movimientosJugadorDos = new ArrayList<>();
        this.rondasTotales = rondasTotales;
    }
    

}
