package ecentro;

public interface GestionInterface {
    public void registroUsuario();

    public boolean compruebaUsuario();

    public String compruebaGrupo();

    public void aniadeGrupo();

    public void borraGrupo();

    public void listaAlumnos(String grupoExiste);

    public void listaAlumnosSinGrupo();

    public void borraAlumnosSinGrupo();

    public void listaGrupos();

    public void aniadeAlumno();

    public void aniadeAlumnoGrupo(String grupoExiste);

    public void borraAlumnoGrupo(String grupoExiste);
}
