package CAP09.ejercicio7;

public class ExpoCochesCampanillas extends Zona {

    private int entradasVip = 25;
    private int compraVenta = 200;

    public ExpoCochesCampanillas() {
        super(1000);
    }

    public int getCompraVenta() {
        return this.compraVenta;
    }

    public int getEntradaVip() {
        return this.entradasVip;
    }

    public void menu() {
        System.out.println("\n1. Mostrar número de entradas libres - S.P.");
        System.out.println("2. Mostrar número de entradas libres - C.V.");
        System.out.println("3. Mostrar número de entradas libres - S.V.");
        System.out.println("4. Vender entradas - S.P.");
        System.out.println("5. Vender entradas - C.V. ");
        System.out.println("6. Vender entradas - S.V.");
        System.out.println("7. Salir");
    }

    public void venderCompraVenta(int n) {
        if (this.getCompraVenta() == 0) {
            System.out.println("Se han agotado las entradas");
        } else if (n > this.getCompraVenta()) {
            System.out.println("Quedan menos entradas de las solicitadas - " + getCompraVenta());
        } else if (n <= getCompraVenta()) {
            compraVenta -= n;
            System.out.println("Aquí tiene sus " + n + " entradas. ¡Gracias!");
        }
    }

    public void venderVip(int n) {
        if (this.getEntradaVip() == 0) {
            System.out.println("Se han agotado las entradas");
        } else if (n > this.getEntradaVip()) {
            System.out.println("Quedan menos entradas de las solicitadas - " + getEntradaVip());
        } else if (n <= this.getEntradaVip()) {
            entradasVip -= n;
            System.out.println("Aquí tiene sus " + n + " entradas. ¡Gracias!");
        }
    }

    public void ejecutaOpcion(int i) {
        int num = 0;
        switch (i) {
            case 1:
                System.out.println(this.getEntradasPorVender());
                break;
            case 2:
                System.out.println(this.getCompraVenta());
                break;
            case 3:
                System.out.println(this.getEntradaVip());
                break;
            case 4:
                num = pideEntrada();
                this.vender(num);
                break;
            case 5:
                num = pideEntrada();
                this.venderCompraVenta(num);
                break;
            case 6:
                num = pideEntrada();
                this.venderVip(num);
                break;
            case 7:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    private int pideEntrada() {
        System.out.print("Número de entradas: ");
        int num = Integer.parseInt(System.console().readLine());
        return num;
    }

}
