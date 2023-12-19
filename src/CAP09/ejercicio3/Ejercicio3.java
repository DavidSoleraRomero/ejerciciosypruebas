package CAP09.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Animal an1 = new Animal();
        Ave av1 = new Ave();
        Canario ca1 = new Canario();
        Gato ga1 = new Gato();
        Lagarto la1 = new Lagarto();
        Mamifero ma1 = new Mamifero();
        Perro pe1 = new Perro();
        Pinguino pi1 = new Pinguino();

        an1.comunicarse();
        av1.ponerHuevos();
        ca1.pioPio();
        ga1.afilarUñas();
        la1.ocultarse();
        ma1.darALuz();
        pe1.darALuz();
        pi1.cantar();
    }
}
