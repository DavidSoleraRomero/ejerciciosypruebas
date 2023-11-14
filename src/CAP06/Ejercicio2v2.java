package CAP06;

/* Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n). */
public class Ejercicio2v2 {
    public static void main(String[] args) {
        int palo = (int) (Math.random() * 4 + 1);
        String carta = "";
        carta = (palo == 1) ? " de picas"
                : (palo == 2) ? " de corazones" : (palo == 3) ? " de diamantes" : " de tréboles";
        int cartaPalo = (int) (Math.random() * 13 + 1);
        carta = ((cartaPalo == 1) ? "A"
                : (cartaPalo == 11) ? "J"
                        : (cartaPalo == 12) ? "Q" : (cartaPalo == 13) ? "K" : String.valueOf(cartaPalo))
                + carta;
        System.out.println(carta);
    }
}
