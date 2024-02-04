package CAP10.ecentro;

import java.util.List;

public class AppECentro {
    public static void main(String[] args) {
        Model grupos = new Model();
        Model alumnos = new Model();

        Alumno al = (Alumno) alumnos.add(new Alumno("", "Juan Antonio", "García Gómez", ""));
        Grupo gr = (Grupo) grupos.add(new Grupo("", "1º ESO A"));
        gr.anadieAlumno(al);
        List<Alumno> alumnosGrupo = gr.getAlumnos();
        System.out.println(alumnosGrupo.toString());
    }
}
