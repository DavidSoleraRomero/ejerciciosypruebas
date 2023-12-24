package CAP09.ejercicio5;

public class Pizza {

    private String tamanio;
    private String estado;
    private String tipo;
    private static int numTotalPizzasPedidas = 0;
    private static int numTotalPizzasServidas = 0;

    public Pizza() {
        try {
            throw new Exception("Introduza qué tipo de pizza quiere");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Pizza(String tipo) {
        if (tipo.equals("margarita") | tipo.equals("cuatro quesos") | tipo.equals("funghi")) {
            this.estado = "pedida";
            this.tamanio = "mediana";
            this.tipo = tipo;
            numTotalPizzasPedidas++;
        } else {
            try {
                throw new Exception("Introduza una pizza del catálogo por favor");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public Pizza(String tamanio, String tipo) {
        if ((tipo.equals("margarita") | tipo.equals("cuatro quesos") | tipo.equals("funghi"))
                & (tamanio.equals("mediana") | tamanio.equals("familiar"))) {
            this.estado = "pedida";
            this.tamanio = tamanio;
            this.tipo = tipo;
            numTotalPizzasPedidas++;
        } else {
            try {
                throw new Exception("Introduza una pizza del catálogo por favor");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void servir() {
        if (estado.equals("pedida")) {
            estado = "servida";
            numTotalPizzasServidas++;
        } else
            System.out.println("Esa pizza ya se ha servido");
    }

    @Override
    public String toString() {
        return "Pizza [tamanio=" + tamanio + ", estado=" + estado + ", tipo=" + tipo + "]";
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public static int getNumTotalPizzasPedidas() {
        return numTotalPizzasPedidas;
    }

    public static int getNumTotalPizzasServidas() {
        return numTotalPizzasServidas;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
