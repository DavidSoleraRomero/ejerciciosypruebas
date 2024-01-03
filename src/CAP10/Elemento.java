package CAP10;

public class Elemento {

    private String nombreProducto;
    private double precio;
    private int cantidad;

    public Elemento(String nombreProducto, double precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return this.nombreProducto + " PVP: " + String.format("%.2f", this.precio) + " Unidades: " + this.cantidad
                + " Subtotal: "
                + String.format("%.2f", precio * cantidad);
    }

}
