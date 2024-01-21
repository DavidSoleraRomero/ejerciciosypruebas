package CAP09.ultimorepaso;

public class Articulo {

    private String codigo;
    private String desc;
    private int precioV;
    private int precioC;
    private int stock;

    public Articulo() throws Exception {
        throw new Exception("Haga uso del constructor con parámetros");
    }

    public Articulo(String codigo, String desc, int precioV, int precioC, int stock) {
        this.codigo = codigo;
        this.desc = desc;
        this.precioV = precioV;
        this.precioC = precioC;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrecioV() {
        return precioV;
    }

    public void setPrecioV(int precioV) {
        this.precioV = precioV;
    }

    public int getPrecioC() {
        return precioC;
    }

    public void setPrecioC(int precioC) {
        this.precioC = precioC;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo [codigo=" + codigo + ", desc=" + desc + ", precioV=" + precioV + ", precioC=" + precioC
                + ", stock=" + stock + "]";
    }

}
