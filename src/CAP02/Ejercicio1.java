package CAP02;

/* Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación. */
public class Ejercicio1 {
    public static void main(String[] args) {
        int x, y;
        x = 144;
        y = 999;
        System.out.println("Valor de x es " + x + " y el de y es " + y);
        System.out.println("Multiplicación de " + x + " por " + y + " = " + (x * y));
        System.out.println("Suma de " + x + " + " + y + " = " + (x + y));
        System.out.println("Resta de " + x + " - " + y + " = " + (x - y));
        System.out.println("La división de " + x + " entre " + y + " = " + ((double) x / (double) y));
    }
}
