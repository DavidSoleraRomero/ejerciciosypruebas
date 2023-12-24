package CAP09.ejercicio7;

public class ExpoCochesCampanillas extends Zona {

    private static int entradasVip = 25;
    private static int compraVenta = 200;

    public ExpoCochesCampanillas() {
        super(1000);
    }

    public int getCompraVenta() {
        return compraVenta;
    }

    public int getEntradaVip() {
        return entradasVip;
    }

}
