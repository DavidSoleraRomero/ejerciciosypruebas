package CAP11.juego.utilidades;

public class Aleatorio {

    public static int random(int min, int max) {
        return (int) (Math.random() * max + ((min == 0) ? 1 : min));
    }

}
