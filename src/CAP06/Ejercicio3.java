package CAP06;

/* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */
public class Ejercicio3 {
    public static void main(String[] args) {
        String nombreCarta = "";
        int cartas = (int) (Math.random() * 10 + 1);
        switch (cartas) {
            case 1:
                nombreCarta = "As";
                break;
            case 8:
                nombreCarta = "Sota";
                break;
            case 9:
                nombreCarta = "Caballo";
                break;
            case 10:
                nombreCarta = "Rey";
                break;
            default:
                nombreCarta = String.valueOf(cartas);
                break;
        }
        int opcion = (int) (Math.random() * 4 + 1);
        switch (opcion) {
            case 1:
                nombreCarta = nombreCarta + " de Oros";
                break;
            case 2:
                nombreCarta = nombreCarta + " de Copas";
                break;
            case 3:
                nombreCarta = nombreCarta + " de Espadas";
                break;
            case 4:
                nombreCarta = nombreCarta + " de Bastos";
                break;
        }
        System.out.printf("La carta ha sido %s", nombreCarta);
    }
}
