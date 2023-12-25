package CAP09.ejercicio10;

public class Ameba {

    /* Peso se mide en microgramos */
    private int peso;

    public Ameba() {
        peso = 3;
    }

    public void come(int cantidad) {
        if (cantidad <= 0)
            System.out.println("No puedo comer, no hay nada");
        else {
            this.peso += (cantidad - 1);
        }
    }

    public void come(Ameba a) {
        if (a.peso <= 0)
            System.out.println("Esa Ameba no puede comerse");
        else {
            this.peso += a.peso - 1;
            a.peso -= a.peso;
        }
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + this.peso + " microgramos.";
    }
}
