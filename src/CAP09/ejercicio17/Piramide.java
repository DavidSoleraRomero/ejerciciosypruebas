package CAP09.ejercicio17;

public class Piramide {

    private int altura;

    private static int piramidesCreadas;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String piramide = "";
        for (int i = 1; i <= this.altura; i++) {
            piramide = piramide + " ".repeat(this.altura - i);
            piramide = piramide + "*".repeat(i * 2 - 1) + "\n";
        }
        return piramide;
    }

}
