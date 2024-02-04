package CAP10.ecentro;

public class Alumno implements Comparable<Alumno>, Identifier {

    private String id;
    private String name;
    private String lastnames;
    private String groupId;

    public Alumno(String id, String nombre, String apellidos, String grupo) {
        this.id = id;
        name = nombre;
        lastnames = apellidos;
        groupId = grupo;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getLastnames() {
        return lastnames;
    }

    public String getName() {
        return name;
    }

    @Override
    public Identifier clone() {
        return (Identifier) new Alumno(id, name, lastnames, groupId);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || this.id.equals(((Alumno) obj).id);
    }

    @Override
    public int compareTo(Alumno o) {
        if (this.lastnames.equals(o.lastnames))
            return this.name.compareTo(o.name);
        return this.lastnames.compareTo(o.lastnames);
    }

    @Override
    public String toString() {
        return String.format("%s: %s, %s (%s)", this.id, this.lastnames, this.name, this.groupId);
    }

}
