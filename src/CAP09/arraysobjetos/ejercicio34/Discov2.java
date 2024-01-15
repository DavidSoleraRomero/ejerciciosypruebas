package CAP09.arraysobjetos.ejercicio34;

public class Discov2 {

    private String codigo = null;
    private String autor = null;
    private String titulo = null;
    private String genero = null;
    private int duracion = 0;

    public Discov2() {

    }

    public Discov2(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public static int menu() {
        System.out.println("\nCOLECCIÓN DE DISCOS");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción: ");
        int opcion = Integer.parseInt(System.console().readLine());
        return opcion;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\n---------------------------------" +
                "\nCódigo: " + this.codigo +
                "\nAutor: " + this.autor +
                "\nTítulo: " + this.titulo +
                "\nGénero: " + this.genero +
                "\nDuración: " + this.duracion +
                "\n---------------------------------";
    }

}
