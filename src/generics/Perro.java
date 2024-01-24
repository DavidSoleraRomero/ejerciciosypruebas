package generics;

public class Perro {

    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Perro: %s", nombre);
    }

}
