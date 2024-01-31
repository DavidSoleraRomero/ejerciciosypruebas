package CAP10.ecentro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grupo implements Comparable<Grupo>, Identifier, GrupoInterface {

    private String id;
    private String nombre;

    private HashMap<String, Alumno> alumnos = new HashMap<>();

    @Override
    public List<Alumno> getAlumnos() {
        ArrayList<Alumno> aux = new ArrayList<>();
        for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
            aux.add(entry.getValue());
        }
        return aux;
    }

    @Override
    public Alumno anadieAlumno(Alumno alum) {
        return alumnos.put(alum.getId(), alum);
    }

    @Override
    public Alumno borraAlumno(Alumno alum) {
        return alumnos.remove(alum.getId());
    }

    public Grupo(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Identifier clone() {
        return (Identifier) new Grupo(this.id, this.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || this.id.equals(((Grupo) obj).id);
    }

    @Override
    public int compareTo(Grupo o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.id, this.nombre);
    }

}
