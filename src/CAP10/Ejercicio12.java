package CAP10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Escribe un programa que genere una secuencia de 5 cartas de la baraja
española y que sume los puntos según el juego de la brisca. El valor de las
cartas se debe guardar en una estructura HashMap que debe contener parejas
(figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
el resto de cartas no vale nada. */
public class Ejercicio12 {
    public static void main(String[] args) {
        // Creamos 2 ArrayList -->
        // 1. Almacena Cartas
        ArrayList<Carta> cartas = new ArrayList<>();
        // 2. Almacena figuras de las cartas
        ArrayList<String> figura = new ArrayList<>();
        Carta cartaAux;
        String palo, carta;

        // Recorremos los ArrayList 5 veces para rellenarlos
        for (int i = 0; i < 5; i++) {
            // Comprobamos en el do while que no se repitan las cartas
            // Comprobamos en el do while que no se repitan las figuras tampoco
            do {
                int numNombreCarta = (int) (Math.random() * 10 + 1);
                carta = obtenerNombreCarta(numNombreCarta);
                int numPalo = (int) (Math.random() * 4);
                palo = obtenerPalo(numPalo);
                cartaAux = new Carta(palo, carta);
            } while (cartas.contains(cartaAux) | figura.contains(cartaAux.getCarta()));
            // Una vez sabemos que no se repiten (ha salido del do while)
            // procedemos a rellenar ambos ArrayList
            cartas.add(cartaAux);
            figura.add(cartaAux.getCarta());
        }

        // Rellenamos el HashMap sabiendo que tenemos 5 cartas diferentes en ArrayList
        // Aprovechamos para realizar la suma de todas las cartas en base a la brisca
        HashMap<String, Integer> cartasBrisca = new HashMap<>();
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            // Utiliza el método sacaValor que devuelve el nº con el valor de dicha carta
            cartasBrisca.put(cartas.get(i).getCarta(), sacaValor(cartas.get(i).getCarta()));
            suma += cartasBrisca.get(cartas.get(i).getCarta());
        }

        // Recorremos el HashMap y lo mostramos por pantalla
        System.out.println("\nTus cartas son:");
        for (Map.Entry miCarta : cartasBrisca.entrySet()) {
            System.out.print(miCarta.getKey() + " ");
        }
        System.out.println("\nLa suma que sale de tus cartas es de " + suma);

    }

    public static int sacaValor(String carta) {
        carta = carta.toLowerCase();
        switch (carta) {
            case "as":
                return 11;
            case "sota":
                return 2;
            case "caballo":
                return 3;
            case "rey":
                return 4;
            case "3":
                return 10;
            default:
                return 0;
        }
    }

    public static String obtenerNombreCarta(int numero) {
        String nombreCarta;
        switch (numero) {
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
                nombreCarta = String.valueOf(numero);
                break;
        }
        return nombreCarta;
    }

    public static String obtenerPalo(int numero) {
        String palo;
        switch (numero) {
            case 1:
                palo = "Oros";
                break;
            case 2:
                palo = "Copas";
                break;
            case 3:
                palo = "Espadas";
                break;
            default:
                palo = "Bastos";
                break;
        }
        return palo;
    }
}
