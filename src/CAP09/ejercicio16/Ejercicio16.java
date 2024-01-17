package CAP09.ejercicio16;

/* Crea las clases Punto y Linea. De un punto se tienen que saber sus coorde-
nadas x e y, mientras que una línea está definida por dos puntos. Define las
clases y los métodos necesarios para que el siguiente código muestre la salida
que se indica. */
public class Ejercicio16 {
    public static void main(String[] args) {
        Punto p1 = new Punto(4.21, 7.3);
        Punto p2 = new Punto(-2, 1.66);
        Linea l = new Linea(p1, p2);
        System.out.println("\n" + l);
    }
}
