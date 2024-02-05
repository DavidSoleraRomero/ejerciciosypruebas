package CAP11.persona;

public class Persona {

    private String id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String serialize() {
        return String.format("%s;%s;%s;%d", this.id, this.nombre, this.apellidos, this.edad);
    }

    public static Persona deSerialize(String persona) throws Exception {
        String nombre, apellidos, id;
        int edad;
        String[] valores = persona.split(";");
        if (valores.length != 4) {
            throw new Exception("Se esperan 4 valores: \n| ID | NOMBRE | APELLIDOS | EDAD |");
        } else {
            id = valores[0];
            nombre = valores[1];
            apellidos = valores[2];
            edad = Integer.parseInt(valores[3]);
            return new Persona(id, nombre, apellidos, edad);
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %s%nNombre: %s%nApellidos: %s%nEdad: %d",
                this.id, this.nombre, this.apellidos, this.edad);
    }

}
