package CAP02;

/* Crea las variables nombre, direccion y telefono y asígnales los valores correspon-
dientes. Muestra los valores de esas variables por pantalla de tal forma que el
resultado del programa sea el mismo que en el ejercicio 2. */
public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre, direccion;
        int telefono = 699732474;
        nombre = "David Solera Romero";
        direccion = "C/ Carril del Castaño nº 24";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Vivo en " + direccion);
        System.out.println("Mi nº de teléfono es " + telefono);
    }
}
