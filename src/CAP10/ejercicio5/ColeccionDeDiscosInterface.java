package CAP10.ejercicio5;

public interface ColeccionDeDiscosInterface {
    public String listaAutoresYDiscos();

    public void aniadeDiscoAlAutor(String autorId, Disco d);

    public void eliminaDiscoDelAutor(String autorId, String discoId);

    public void aniadeAutor(Autor a);

    public void modificaAutor(Autor a);

    public void modificaAutor(String id);

    public void eliminaAutor(Autor a);

    public void eliminaAutor(String id);

    public boolean autorExiste(Autor a);

    public boolean autorExiste(String id);

    public boolean discoExiste(String autorId, Disco d);

    public boolean discoExiste(String autorId, String idDisco);
}
