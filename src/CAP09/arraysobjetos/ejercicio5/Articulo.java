package CAP09.arraysobjetos.ejercicio5;

public class Articulo {

    private static int cod = 1;

    private int codigo;
    private String descripcion;
    private int precioCompra;
    private int precioVenta;
    private int stock;

    public Articulo() {
    }

    public Articulo(String descripcion, int precioCompra, int precioVenta, int stock) {
        this.codigo = cod++;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public void reseteaArticulo() {
        this.codigo = 0;
        this.descripcion = null;
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.stock = 0;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static int getCod() {
        return cod;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Gestisimal [codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
                + ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
    }
}
