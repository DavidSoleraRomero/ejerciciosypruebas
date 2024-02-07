package CAP10.ejercicio5;

public class Persona {

    private String nombreReal;
    private int edad;

    public Persona(String nombreReal, int edad) {
        this.nombreReal = nombreReal;
        this.edad = edad;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
