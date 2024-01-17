package CAP09.ejemploexamen1;

public class Batalla {

    private Heroe primerHeroe;
    private Heroe segundoHeroe;
    private static int batallasConcebidas;

    public Batalla() throws Exception {
        throw new Exception("Haga uso del constructor con parámetros");
    }

    public Batalla(Heroe h1, Heroe h2) {
        primerHeroe = h1;
        segundoHeroe = h2;
    }

    public static int getBatallasConcebidas() {
        return batallasConcebidas;
    }

    public Heroe getPrimerHeroe() {
        return primerHeroe;
    }

    public Heroe getSegundoHeroe() {
        return segundoHeroe;
    }

    public void iniciarBatalla(Heroe h1, Heroe h2) {
        batallasConcebidas++;
    }

    public boolean ambosVivos(Heroe h1, Heroe h2) {
        return (h1.getSalud() > 0 & h2.getSalud() > 0) ? true : false;
    }

    public void pelea(Heroe h1, Heroe h2) {
        int ataque = (int) (Math.random() * 2);
        if (ataque == 0 & (h1.getSalud() > 0 & h2.getSalud() > 0)) {
            ataque(h1, h2);
        } else if (h1.getSalud() > 0 & h2.getSalud() > 0) {
            ataque(h2, h1);
        }
    }

    private void ataque(Heroe h1, Heroe h2) {
        int ataque = (int) (Math.random() * 3);
        switch (ataque) {
            case 0:
                h1.golpeBajo(h2);
                break;
            case 1:
                h1.espadazo(h2);
                break;
            case 2:
                h1.cubrirse(h2);
                break;
        }
    }

}
