package CAP09.ejercicio5;

import java.util.ArrayList;

public class Pizza2 {

    private String tamanio;
    private String tipo;
    private String estado;
    private static int numTotalPizzasPedidas;
    private static int numTotalPizzasServidas;
    private static ArrayList<String> pizzasDisponibles;
    private static ArrayList<String> tamaniosDisponibles;

    public Pizza2() throws Exception {
        throw new Exception("Utilice el constructor con parámetros");
    }

    public Pizza2(String tipo) {
        if (pizzasDisponibles.contains(tipo)) {
            this.tamanio = "mediana";
            this.tipo = tipo.toLowerCase();
            this.estado = "pendiente";
            numTotalPizzasPedidas++;
        } else {
            System.out.println("No disponemos de esa pizza");
        }
    }

    public Pizza2(String tamanio, String tipo) {
        if (pizzasDisponibles.contains(tipo) & tamaniosDisponibles.contains(tamanio)) {
            this.tamanio = tamanio.toLowerCase();
            this.tipo = tipo.toLowerCase();
            this.estado = "pendiente";
            numTotalPizzasPedidas++;
        } else {
            System.out.println("No disponemos de esa pizza / tamaño");
        }
    }

    public static void inicializaPizzas() {
        pizzasDisponibles = new ArrayList<>();
        pizzasDisponibles.add("margarita");
        pizzasDisponibles.add("cuatro quesos");
        pizzasDisponibles.add("funghi");
    }

    public static void inicializaTamanios() {
        tamaniosDisponibles = new ArrayList<>();
        tamaniosDisponibles.add("mediana");
        tamaniosDisponibles.add("familiar");
    }

    public static int getNumTotalPizzasPedidas() {
        return numTotalPizzasPedidas;
    }

    public static int getNumTotalPizzasServidas() {
        return numTotalPizzasServidas;
    }

    public void servir() {
        if (this.estado.equals("pendiente")) {
            this.estado = "servida";
            numTotalPizzasServidas++;
        } else {
            System.out.println("Esa pizza ya ha sido servida");
        }
    }

    @Override
    public String toString() {
        return "pizza " + this.tipo + " " + this.tamanio + ", " + this.estado;
    }

}
