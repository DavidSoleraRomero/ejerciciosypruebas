package CAP10;

public class Moneda {

    private int cantidad;
    private String valor;
    private String lado;

    public Moneda(int cantidad, String valor, String lado) {
        this.cantidad = cantidad;
        this.valor = valor;
        this.lado = lado;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getValor() {
        return valor;
    }

    public String getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return cantidad + " " + valor + " - " + lado;
    }

}
