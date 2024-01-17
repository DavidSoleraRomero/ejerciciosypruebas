package CAP09.ejercicio1415;

public class FichaDomino {

    private int[] lados = new int[2];

    public FichaDomino(int l1, int l2) {
        this.lados[0] = l1;
        this.lados[1] = l2;
    }

    public int getLado0() {
        return lados[0];
    }

    public int getLado1() {
        return lados[1];
    }

    public String voltea() {
        int aux = this.lados[0];
        this.lados[0] = this.lados[1];
        this.lados[1] = aux;
        return this.toString();
    }

    public static boolean encajaDerecha(FichaDomino f1, FichaDomino f2) {
        return (f1.getLado1() == f2.getLado0()) ? true : false;
    }

    public boolean encaja(FichaDomino f) {
        if ((this.lados[0] == f.lados[0] | this.lados[0] == f.lados[1]) |
                (this.lados[1] == f.lados[0] | this.lados[1] == f.lados[1]))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "["
                + ((this.lados[0] != 0) ? this.lados[0] : " ")
                + "|" + ((this.lados[1] != 0) ? this.lados[1] : " ") + "]";
    }

}
