package CAP10.ejercicio5;

public class Disco {

    private String codigo;
    private String titulo;
    private String autor;
    private int duracion;
    private String genero;

    public Disco(String codigo, String titulo, String autor, int duracion, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String ret = "====================\n";
        ret += "Código: " + this.codigo + "\n";
        ret += "Título: " + this.titulo + "\n";
        ret += "Autor: " + this.autor + "\n";
        ret += "Duración: " + this.duracion + "\n";
        ret += "Género: " + this.genero + "\n";
        ret += "====================\n";
        return ret;
    }

}
