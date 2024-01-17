package CAP09.ejemploexamen1;

public class Heroe implements Movimientos {

    private String nombre;
    private int salud = 100;
    private int poderAtaque;

    public Heroe() throws Exception {
        throw new Exception("Haga uso del constructor con parámetros");
    }

    public Heroe(String nombre, int poderAtaque) {
        this.nombre = nombre;
        this.poderAtaque = poderAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public int getSalud() {
        return salud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Información del héroe\n=====================\nNombre: " + this.nombre + "\nSalud: " + this.salud
                + "\nPoder de ataque: " + this.poderAtaque + "\n";
    }

    @Override
    public void golpeBajo(Heroe h) {
        if (h.getSalud() > 0) {
            int danio = (int) (Math.random() * (poderAtaque * 2) + 1);
            System.out.println();
            System.out.print(this.getNombre() + " va a dar un golpe bajo, quitando " + danio + " de vida\n");
            h.setSalud(h.getSalud() - danio);
            vidaRestante(h);
        } else {
            System.out.println("Ese héroe ya ha caído");
        }
    }

    @Override
    public void espadazo(Heroe h) {
        if (h.getSalud() > 0) {
            int danio = (int) (Math.random() * (poderAtaque * 2 + 1) + 5);
            System.out.println();
            System.out.print(this.getNombre() + " va a dar un espadazo, quitando " + danio + " de vida\n");
            h.setSalud(h.getSalud() - danio);
            vidaRestante(h);
        } else {
            System.out.println("Ese héroe ya ha caído");
        }
    }

    @Override
    public void cubrirse(Heroe h) {
        if (this.salud < 100 & this.salud > 0) {
            int curacion;
            do {
                curacion = (int) (Math.random() * 3 + 1);
            } while (this.salud + curacion >= 100);
            System.out.println();
            System.out.print(getNombre() + " se cubre rápidamente para curarse " + curacion + " puntos de vida\n");
            this.setSalud(this.getSalud() + curacion);
            System.out.print("Vida actual de " + this.getNombre() + " = " + this.getSalud() + "\n");
        } else if (salud <= 0) {
            System.out.println("Ese héroe ya ha caído");
        } else {
            this.espadazo(h);
        }
    }

    private static void vidaRestante(Heroe h) {
        System.out.println("Vida restante de " + h.getNombre() + " = " + h.getSalud());
    }

}
