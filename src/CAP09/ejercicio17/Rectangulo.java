package CAP09.ejercicio17;

public class Rectangulo {

    private int base;
    private int altura;

    private static int rectangulosCreados;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String rectangulo = "";
        for (int i = 1; i <= this.altura; i++) {
            rectangulo = rectangulo + "*".repeat(base) + "\n";
        }
        return rectangulo;
    }

}
