package CAP09.ejercicio12;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String codigoISBN, String titulo, int anioPublicacion) {
        super(codigoISBN, titulo, anioPublicacion);
        this.prestado = false;
    }

    @Override
    public void presta() {
        if (this.prestado)
            System.out.println("El libro ya está prestado");
        else
            this.prestado = true;
    }

    @Override
    public void devuelve() {
        if (this.prestado) {
            this.prestado = false;
        } else {
            System.out.println("El libro ya está disponible");
        }

    }

    @Override
    public boolean estaPrestado() {
        return (this.prestado) ? true : false;
    }

    @Override
    public String toString() {
        return super.toString() + ((this.prestado) ? " (prestado)" : " (no prestado)");
    }

}
