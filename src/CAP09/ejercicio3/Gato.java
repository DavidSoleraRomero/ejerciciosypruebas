package CAP09.ejercicio3;

public class Gato extends Mamifero {

    public String raza;
    public String color;
    public int hermanos;

    public Gato(String raza, String color, int hermanos) {
        this.raza = raza;
        this.color = color;
        this.hermanos = hermanos;
    }

    public void arañar() {
        System.out.println("El gato está arañando");
    }

    public void afilarUñas() {
        System.out.println("Gato afilándose las uñas");
    }

    public void lamerse() {
        System.out.println("El gato se está lamiendo");
    }

    @Override
    public String toString() {
        return "Gato [raza=" + raza + ", color=" + color + ", hermanos=" + hermanos + "]";
    }

}
