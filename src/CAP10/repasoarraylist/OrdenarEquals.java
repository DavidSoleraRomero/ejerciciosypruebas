package CAP10.repasoarraylist;

public class OrdenarEquals implements Comparable<OrdenarEquals> {

    private String nombre;
    private String apellido;
    private int edad;

    public OrdenarEquals(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(OrdenarEquals o) {
        if (this.nombre.equals(o.nombre))
            return this.apellido.compareTo(o.apellido);
        else
            return this.nombre.compareTo(o.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this ||
                this.nombre.equals(((OrdenarEquals) obj).nombre) &&
                        this.apellido.equals(((OrdenarEquals) obj).apellido) &&
                        this.edad == ((OrdenarEquals) obj).edad;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new OrdenarEquals(this.nombre, this.apellido, this.edad);
    }

    @Override
    public String toString() {
        return String.format("-".repeat(50) + "\n| Nombre: %s | Apellido: %s | Edad: %d |\n" + "-".repeat(50),
                this.nombre, this.apellido, this.edad);
    }

}
