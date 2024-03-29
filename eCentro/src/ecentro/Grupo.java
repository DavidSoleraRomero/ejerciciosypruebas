package ecentro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Grupo implements Comparable<Grupo>, Identifier, GrupoInterface {

    private String id;
    private String nombre;

    private HashMap<String, Alumno> alumnos = new HashMap<String, Alumno>();

    public Grupo(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Identifier clone() {
        return (Identifier) new Grupo(id, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || this.id == ((Grupo) obj).id;
    }

    @Override
    public int compareTo(Grupo o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.id, this.nombre);
    }

    public boolean hayAlumnos() {
        return (alumnos.size() > 0) ? true : false;
    }

    @Override
    public List<Alumno> getAlumnos() {
        ArrayList<Alumno> losAlumnos = new ArrayList<Alumno>();
        for (Entry<String, Alumno> entry : alumnos.entrySet())
            losAlumnos.add(entry.getValue());
        return losAlumnos;
    }

    @Override
    public Alumno anadeAlumno(Alumno alum) {
        alum.setGrupoId(id);
        return alumnos.put(alum.getId(), alum);
    }

    @Override
    public Alumno borraAlumno(Alumno alum) {
        return alumnos.remove(alum.getId());
    }

    public void borraAlumno(String nombre, String apellidos) {
        apellidos = apellidos.toLowerCase();
        nombre = nombre.toLowerCase();
        for (Map.Entry<String, Alumno> alumno : alumnos.entrySet()) {
            if (alumno.getValue().getApellidos().toLowerCase().equals(apellidos)
                    & alumno.getValue().getNombre().toLowerCase().equals(nombre)) {
                alumno.getValue().setGrupoId("");
                alumnos.remove(alumno.getValue().getId());
                break;
            }
        }
    }

}
