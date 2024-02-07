package CAP10.ejercicio5;

public class Autor extends Persona {

    private String id;
    private String nombreArtistico;

    public Autor(String id, String nombreReal, String nombreArtistico, int edad) {
        super(nombreReal, edad);
        this.id = id;
        this.nombreArtistico = nombreArtistico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nNombre real: %s\nNombre artístico: %s\nEdad: %d\n\n",
                this.id, this.getNombreReal(), this.nombreArtistico, this.getEdad());
    }

}
