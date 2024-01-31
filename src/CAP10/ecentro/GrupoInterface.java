package CAP10.ecentro;

import java.util.List;

public interface GrupoInterface {

    public List<Alumno> getAlumnos();

    public Alumno anadieAlumno(Alumno alum);

    public Alumno borraAlumno(Alumno alum);

}
