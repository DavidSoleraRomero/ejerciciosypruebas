package CAP09.ejemploconstructor;

public class EjemploConstructor {

    private String nombre;
    private int salario;

    public EjemploConstructor() throws Exception {
        throw new Exception("Haga uso del constructor con parámetros");
    }

    public EjemploConstructor(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
