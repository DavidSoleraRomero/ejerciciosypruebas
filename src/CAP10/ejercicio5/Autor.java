package CAP10.ejercicio5;

public class Autor {

    private String id;
    private String nombreReal;
    private String nombreArtistico;
    private int edad;

    public Autor(String id, String nombreReal, String nombreArtistico, int edad) {
        this.id = id;
        this.nombreReal = nombreReal;
        this.nombreArtistico = nombreArtistico;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nNombre real: %s\nNombre artístico: %s\nEdad: %d",
                this.id, this.nombreReal, this.nombreArtistico, this.edad);
    }

}
