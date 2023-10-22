package CAP06;

/* Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n). */
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombreCarta = "";
        int cartas = (int) (Math.random() * 13 + 1);
        switch (cartas) {
            case 1:
                nombreCarta = "A";
                break;
            case 11:
                nombreCarta = "J";
                break;
            case 12:
                nombreCarta = "Q";
                break;
            case 13:
                nombreCarta = "K";
                break;
            default:
                nombreCarta = String.valueOf(cartas);
                break;
        }
        int opcion = (int) (Math.random() * 4 + 1);
        switch (opcion) {
            case 1:
                nombreCarta = nombreCarta + " de picas";
                break;
            case 2:
                nombreCarta = nombreCarta + " de corazones";
                break;
            case 3:
                nombreCarta = nombreCarta + " de diamantes";
                break;
            case 4:
                nombreCarta = nombreCarta + " de tréboles";
                break;
        }
        System.out.printf("La carta ha sido %s", nombreCarta);
    }
}
