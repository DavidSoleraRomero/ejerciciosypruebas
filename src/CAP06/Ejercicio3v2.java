package CAP06;

/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */
public class Ejercicio3v2 {
    public static void main(String[] args) {
        int cartas = (int) (Math.random() * 10 + 1);
        String nombreCarta = "";
        nombreCarta = (cartas == 1) ? "As"
                : (cartas == 8) ? "Sota" : (cartas == 9) ? "Caballo" : (cartas == 10) ? "Rey" : String.valueOf(cartas);
        int palo = (int) (Math.random() * 4 + 1);
        nombreCarta = nombreCarta +
                ((palo == 1) ? " de Oros" : (palo == 2) ? " de Copas" : (palo == 3) ? " de Espadas" : " de Bastos");
        System.out.println(nombreCarta);
    }
}
