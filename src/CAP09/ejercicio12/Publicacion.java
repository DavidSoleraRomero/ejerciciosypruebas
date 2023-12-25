package CAP09.ejercicio12;

public class Publicacion {

    private String codigoISBN;
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String codigoISBN, String titulo, int anioPublicacion) {
        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.codigoISBN + ", Título: " + this.titulo
                + ", Año de publicación: " + this.anioPublicacion;
    }

}
