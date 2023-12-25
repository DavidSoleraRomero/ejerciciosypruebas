package CAP09.ejercicio12;

public class Revista extends Publicacion {

    private int numero;

    public Revista(String codigoISBN, String titulo, int anioPublicacion, int numero) {
        super(codigoISBN, titulo, anioPublicacion);
        this.numero = numero;
    }

}
